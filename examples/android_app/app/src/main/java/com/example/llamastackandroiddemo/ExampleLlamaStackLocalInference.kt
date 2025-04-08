package com.example.llamastackandroiddemo

import android.content.Context
import android.net.Uri
import android.util.Log
import com.itextpdf.text.pdf.PdfReader
import com.itextpdf.text.pdf.parser.PdfTextExtractor
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.local.LlamaStackClientLocalClient
import com.llama.llamastack.core.JsonNumber
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentConfig
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentSessionCreateParams
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InterleavedContent
import com.llama.llamastack.models.SystemMessage
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolResponseMessage
import com.llama.llamastack.models.UserMessage
import com.llama.llamastack.services.blocking.agents.TurnService
import com.ml.shubham0204.sentence_embeddings.SentenceEmbedding
import kotlinx.coroutines.runBlocking
import kotlinx.datetime.Clock
import java.nio.charset.StandardCharsets
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.CompletableFuture

class ExampleLlamaStackLocalInference(
    val modelPath: String,
    val tokenizerPath: String,
    val temperature: Float,
    val useAgent: Boolean
) {

    var client: LlamaStackClientClient? = null
    private var response: String? = null
    private var tps: Float = 0.0f

    // Can modify chunk size (tokens) for RAG
    private var chunkSizeInWords: Long = 50

    private var sentenceEmbedding: SentenceEmbedding? = null

    fun getResponse(): String? {
        return response
    }

    fun getTps(): Float {
        return tps
    }

    init {
        val thread = Thread {
            try {
                Log.d("llama_stack","ExampleLlamaStackLocalInference init is called")
                client = LlamaStackClientLocalClient
                    .builder()
                    .modelPath(modelPath)
                    .tokenizerPath(tokenizerPath)
                    .temperature(temperature)
                    .useAgent(useAgent)
                    .build()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        thread.start();
    }

    fun updateModel(modelPath: String, tokenizerPath: String, temperature: Float, useAgent: Boolean) {
        val thread = Thread {
            try {
                AppLogging.getInstance().log("Updating local model to $modelPath")
                // For now, we just create a new client, but eventually, we don't want this, because dealloc of resetNative()
                // is not called here.
                // Need to de-alloc and call resetNative() from ET side
                client =  LlamaStackClientLocalClient
                    .builder()
                    .modelPath(modelPath)
                    .tokenizerPath(tokenizerPath)
                    .temperature(temperature)
                    .build()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        thread.start();
    }

    fun inferenceStartWithAgent(agentId: String, sessionId: String, turnService: TurnService, prompt: ArrayList<Message>, ctx: Context): String {
        val future = CompletableFuture<String>()
        val thread = Thread {
            try {
                val response = localAgentInference(agentId, sessionId, turnService, prompt, ctx)
                future.complete(response)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        thread.start();
        return future.get();
    }

    fun inferenceStartWithoutAgent(modelName: String, conversationHistory: ArrayList<Message>, systemPrompt:String, ctx: Context): String {
        val future = CompletableFuture<String>()
        var sysPrompt = systemPrompt
        if (sysPrompt == "") {
            sysPrompt = getSystemPromptForPotentialCustomToolCall()
        }
        val thread = Thread {
            try {
                val response = inferenceCall(modelName, conversationHistory, sysPrompt, ctx, true);
                future.complete(response)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        thread.start();
        return future.get();
    }

    private fun inferenceCall(modelName: String, conversationHistory: ArrayList<Message>, systemPrompt: String, ctx: Context, streaming: Boolean): String? {
        // Multi prompt/ chat history use case
        if (client == null) {
            AppLogging.getInstance().log("client is null for local inference");
            return "[ERROR] client is null for local inference"
        }
        AppLogging.getInstance().log("local inference with prompt=${conversationHistory.last().text}")
        val sequenceLength = ModelUtils.getSequenceLengthForConversationHistory(conversationHistory, systemPrompt)
        var response = ""
        if (streaming) {
            val result = client!!.inference().chatCompletionStreaming(
                InferenceChatCompletionParams.builder()
                    .modelId(modelName)
                    .putAdditionalQueryParam("seq_len", sequenceLength.toString())
                    .messages(
                        constructLSMessagesFromConversationHistoryAndSystemPrompt(conversationHistory, systemPrompt)
                    )
                    .build()
            )
            val callback = ctx as InferenceStreamingCallback
            result.use {
                result.asSequence().forEach {
                    val delta = it.event().delta()
                    if(delta.isToolCall()) {
                        val toolCall = delta.toolCall()?.toolCall()
                        if (toolCall != null) {
                            callback.onStreamReceived("\n" + functionDispatchWithoutAgent(listOf(toolCall.asToolCall()), ctx))
                        } else {
                            callback.onStreamReceived("\n" + "Empty tool call. File a bug")
                        }
                    }
                    if (it.event().stopReason().toString() != "end_of_turn") {
                        callback.onStreamReceived(
                            it.event().delta().text()?.text().toString())
                    } else {
                        // response is complete so stats like tps is available
                        tps = (it._additionalProperties()["tps"] as JsonNumber).value as Float
                        callback.onStatStreamReceived(tps)
                    }
                }
            }
        } else {
            val result = client!!.inference().chatCompletion(
                InferenceChatCompletionParams.builder()
                    .modelId(modelName)
                    .putAdditionalQueryParam("seq_len", sequenceLength.toString())
                    .messages(
                        constructLSMessagesFromConversationHistoryAndSystemPrompt(conversationHistory, systemPrompt)
                    )
                    .build()
            )
            response = result.completionMessage().content().string().toString();
            tps =
                (result._additionalProperties()["tps"] as JsonNumber).value as Float

            if (response == "") {
                //Empty content as Llama Stack is returning a tool call for non-streaming
                val toolCalls = result.completionMessage().toolCalls()
                if (toolCalls != null) {
                    return if (toolCalls.isNotEmpty()) {
                        functionDispatch(toolCalls, ctx)
                    } else {
                        "Empty tool calls and model response. File a bug"
                    }
                }
            }
        }
        return response;
    }

    fun createLocalAgent(modelName: String, modelPath: String, tokenizerPath: String, temperature: Double, userProvidedSystemPrompt: String, ctx: Context): Triple<String, String, TurnService> {
        val agentConfig = createLocalAgentConfig(modelName, modelPath, tokenizerPath, temperature, userProvidedSystemPrompt)
        val agentService = client!!.agents()
        val agentCreateResponse = agentService.create(
            AgentCreateParams.builder()
                .agentConfig(agentConfig)
                .build(),
        )

        val agentId = agentCreateResponse.agentId()
        val sessionService = agentService.session()
        val agentSessionCreateResponse = sessionService.create(
            AgentSessionCreateParams.builder()
                .agentId(agentId)
                .sessionName("test-session")
                .build()
        )

        val sessionId = agentSessionCreateResponse.sessionId()
        val turnService = agentService.turn()
        return Triple(agentId, sessionId, turnService)
    }

    private fun localAgentInference(agentId: String, sessionId: String, turnService: TurnService, conversationHistory: ArrayList<Message>, ctx: Context): String {
        val messagesAndDocuments: Pair<List<AgentTurnCreateParams.Message>, List<String>> = constructMessagesDocumentsForAgent(conversationHistory)

        var turnParams = AgentTurnCreateParams.builder()
            .agentId(agentId)
            .messages(messagesAndDocuments.first)
            .sessionId(sessionId)
        // Only set up RAG if documents are provided
        if (messagesAndDocuments.second.isNotEmpty()) {

            // create embedding of user prompt
            val sentenceEmbeddingModel = SentenceEmbeddingModel()
            val ragUserPromptEmbedded = sentenceEmbeddingModel.createEmbedding(
                conversationHistory.get(conversationHistory.size - 1).getText()
            )

            val text = readFileFromURI(Uri.parse(messagesAndDocuments.second[0]), ctx)
            val vectorDbId = runBlocking {
                storeAndEmbedDocument(
                    client,
                    sentenceEmbeddingModel,
                    text,
                    chunkSizeInWords
                )
            }
            turnParams.addToolgroup(
                AgentTurnCreateParams.Toolgroup.ofAgentToolGroupWithArgs(
                    AgentTurnCreateParams.Toolgroup.AgentToolGroupWithArgs.builder()
                        .name("builtin::rag/knowledge_search")
                        .args(
                            AgentTurnCreateParams.Toolgroup.AgentToolGroupWithArgs.Args.builder()
                                .putAdditionalProperty("vector_db_id", JsonValue.from(vectorDbId))
                                .putAdditionalProperty("ragUserPromptEmbedded", JsonValue.from(ragUserPromptEmbedded))
                                .putAdditionalProperty("maxNeighborCount", JsonValue.from(3))
                                .putAdditionalProperty("ragInstruction", JsonValue.from(localRagSystemPrompt()))
                                .build()
                        )
                        .build()
                )
            )
        }

        val agentTurnCreateResponseStream =
            turnService.createStreaming(turnParams.build())

        val callback = ctx as InferenceStreamingCallback
        agentTurnCreateResponseStream.use {
            agentTurnCreateResponseStream.asSequence().forEach {
                val agentResponsePayload = it.event().payload()
                when {
                    agentResponsePayload.isAgentTurnResponseTurnStart() -> {
                        // Handle Turn Start Payload
                    }
                    agentResponsePayload.isAgentTurnResponseStepStart() -> {
                        // Handle Step Start Payload
                    }
                    agentResponsePayload.isAgentTurnResponseStepProgress() -> {
                        // Handle Step Progress Payload
                        Log.d("response","cmodii app entered isAgentTurnResponseStepProgress")
                        val result = agentResponsePayload.agentTurnResponseStepProgress()?.delta()?.text()?.text()
                        if (result != null) {
                            callback.onStreamReceived(result.toString())
                        }
                    }
                    agentResponsePayload.isAgentTurnResponseStepComplete() -> {
                        // Handle Step Complete Payload
                        Log.d("response","cmodii app entered isAgentTurnResponseStepComplete")
                        val toolCalls = agentResponsePayload.agentTurnResponseStepComplete()?.stepDetails()?.asInferenceStep()?.modelResponse()?.toolCalls()
                        Log.d("response","cmodii app toolCall response: $toolCalls")
                        if (!toolCalls.isNullOrEmpty()) {
                            callback.onStreamReceived(functionDispatch(toolCalls, ctx))
                        } else {
                            tps =  (agentResponsePayload.agentTurnResponseStepComplete()
                                ?._additionalProperties()?.get("tps") as JsonNumber).value as Float
                            callback.onStatStreamReceived(tps)
                        }
                    }
                    agentResponsePayload.isAgentTurnResponseTurnComplete() -> {
                        // Handle Turn Complete Payload
                    }
                }
            }
        }
        return ""
    }

//    private suspend fun storeAndEmbedDocument(text: String, ctx: Context): String {
//        // Currently just supporting single documents
//        val document = Document.builder()
//            .documentId("1")
//            .content(text)
//            .metadata(Document.Metadata.builder().build())
//            .build()
//
//        val vectorDbId = UUID.randomUUID().toString()
//        // Create Vector DB
//        client!!.vectorDbs().register(
//            VectorDbRegisterParams.builder()
//                .vectorDbId(vectorDbId)
//                .embeddingModel("placeholder")
//                .build()
//        )
//
//        // unique to local
//        var tagToolParams = ToolRuntimeRagToolInsertParams.builder()
//            .vectorDbId(vectorDbId)
//            .chunkSizeInTokens(chunkSizeInWords)
//            .documents(listOf(document))
//            .build();
//        var ragtool = client!!.toolRuntime().ragTool() as RagToolServiceLocalImpl
//        var chunks = ragtool.createChunks(tagToolParams)
//
//        initializeSentenceEmbedding()
//
//        val embeddings = mutableListOf<FloatArray>()
//
//        for(chunk in chunks) {
//            embeddings.add(createEmbeddings(chunk))
//        }
//
//        // Add document content into vector DB (tokenizer, chunking, and insert)
//        ragtool.insert(
//            embeddings, chunks
//        )
//
//        return vectorDbId
//    }



    private fun createLocalAgentConfig(modelName: String, modelPath: String, tokenizerPath: String, temperature: Double, userProvidedSystemPrompt: String): AgentConfig {
        //Get the current time in ISO format and pass it to the model in system prompt as a reference. This is useful for any scheduling and vague timing reference from user prompt.
        val zdt = ZonedDateTime.ofInstant(Instant.parse(Clock.System.now().toString()), ZoneId.systemDefault())
        //This should be replaced with Agent getting date and time with search tool
        val formattedZdt = zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
        val clientTools = mutableListOf<ToolDef>()
        var instruction = userProvidedSystemPrompt
//        cmodiiiii get vectorDB creation from here:
//        if (vectorDbId.isNotEmpty()) {
//            // document is stored and ready for RAG
//            clientTools.add( ToolDef.builder()
//                .name("builtin::rag/knowledge_search")
//                .putAdditionalProperty("vector_db_ids", JsonValue.from(vectorDbId))
//                .build()
//            )
//            if (instruction == "") {
//                instruction = localRagSystemPrompt();
//            }
//        }

        // If no System prompt configured by the user, use default tool call system prompt.
        // TODO: In the future we can support tool builders from CustomTools.getCreateCalendarEventTool
        if (instruction == "") {
            instruction = getSystemPromptForPotentialCustomToolCall()
        }
        //Llama 1B/3B text model only support PYTHON_LIST at the moment. Whereas Vision instruction models only support JSON format.
        val toolPromptFormat = AgentConfig.ToolPromptFormat.PYTHON_LIST

        val agentConfig =
            AgentConfig.builder()
                .enableSessionPersistence(false)
                .instructions(instruction)
                .maxInferIters(100)
                .model(modelName)
                .toolChoice(AgentConfig.ToolChoice.AUTO)
                .toolPromptFormat(toolPromptFormat)
                .clientTools(
                    clientTools
                )
                .putAdditionalProperty("modelPath", JsonValue.from(modelPath))
                .putAdditionalProperty("tokenizerPath", JsonValue.from(tokenizerPath))
                .build()

        return agentConfig
    }

//    fun storeDocumentFromJava(fileName: String?, ctx: Context): String {
//        return runBlocking {
//            storeDocument(fileName, ctx)
//        }
//    }

//    private suspend fun storeDocument(fileName: String?, ctx: Context): String {
//        // Currently just supporting single documents
//        val text = readFile(fileName,ctx);
//        val document = Document.builder()
//            .documentId("1")
//            .content(text)
//            .metadata(Document.Metadata.builder().build())
//            .build()
//
//        val vectorDbId = UUID.randomUUID().toString()
//        // Create Vector DB
//        client!!.vectorDbs().register(
//            VectorDbRegisterParams.builder()
//                .vectorDbId(vectorDbId)
//                .embeddingModel("placeholder")
//                .build()
//        )
//
//        // unique to local
//        var tagToolParams = ToolRuntimeRagToolInsertParams.builder()
//            .vectorDbId(vectorDbId)
//            .chunkSizeInTokens(chunkSizeInWords)
//            .documents(listOf(document))
//            .build();
//        var ragtool = client!!.toolRuntime().ragTool() as RagToolServiceLocalImpl
//        var chunks = ragtool.createChunks(tagToolParams)
//
//        initializeSentenceEmbedding()
//
//        val embeddings = mutableListOf<FloatArray>()
//
//        for(chunk in chunks) {
//            embeddings.add(createEmbeddings(chunk))
//        }
//
//        // Add document content into vector DB (tokenizer, chunking, and insert)
//        ragtool.insert(
//            embeddings, chunks
//        )
//
//        return vectorDbId
//    }

//    private suspend fun initializeSentenceEmbedding() {
//        sentenceEmbedding = SentenceEmbedding()
//        val modelFile = File("/data/local/tmp/llama", "model-all-miniLM-L6-v2.onnx")
//        val tokenizerFile = File("/data/local/tmp/llama", "tokenizer-all-miniLM-L6-v2.json")
//        val tokenizerBytes = tokenizerFile.readBytes()
//
//        runBlocking(Dispatchers.IO) {
//            sentenceEmbedding!!.init(
//                modelFilepath = modelFile.absolutePath,
//                tokenizerBytes = tokenizerBytes,
//                useTokenTypeIds = true,
//                outputTensorName = "sentence_embedding",
//                useFP16 = false,
//                useXNNPack = false,
//                normalizeEmbeddings = true,
//            )
//        }
//    }
//
//    private suspend fun createEmbeddings(chunk: String): FloatArray = runBlocking(Dispatchers.Default) {
//        return@runBlocking sentenceEmbedding!!.encode(chunk)
//    }
//
//    fun createEmbeddingsFromJava(chunk: String): FloatArray {
//        return runBlocking {
//            createEmbeddings(chunk)
//        }
//    }

    private fun readFile(fileName: String?, context: Context): String {
        try {
            val inputStream = context.assets.open(fileName!!)
            if (fileName.substringAfterLast(".", "").equals("pdf")) {
                val pdfReader = PdfReader(inputStream)
                var text = ""
                for (i in 1..pdfReader.numberOfPages) {
                    text += "\n" + PdfTextExtractor.getTextFromPage(pdfReader,i)
                }
                return text;
            }
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            return String(buffer, StandardCharsets.UTF_8)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
            return ""
        }
    }

    private fun constructMessagesDocumentsForAgent(
        conversationHistory: ArrayList<Message>
    ): Pair<List<AgentTurnCreateParams.Message>, List<String>> {
        val messageList = ArrayList<AgentTurnCreateParams.Message>();
        val documentUriList = mutableListOf<String>()

        for (chat in conversationHistory) {
            var inferenceMessage: AgentTurnCreateParams.Message? = null

            if (chat.isSent) {
                if (chat.messageType == MessageType.DOCUMENT) {
                    documentUriList.add(chat.documentPath)
                    continue
                }

                // User Message
                inferenceMessage = AgentTurnCreateParams.Message.ofUser(
                    UserMessage.builder()
                        .content(InterleavedContent.ofString(chat.text))
                        .build()
                );
            } else {
                inferenceMessage = AgentTurnCreateParams.Message.ofToolResponse(
                    ToolResponseMessage.builder()
                        .callId("")
                        .content(InterleavedContent.ofString(chat.text))
                        .build()
                )
            }
            if(inferenceMessage != null){
                messageList.add(inferenceMessage)
            }

        }

        AppLogging.getInstance().log("conversation history length "  + messageList.size)
        return Pair(messageList, documentUriList)
    }



    private fun constructLSMessagesFromConversationHistoryAndSystemPrompt(
        conversationHistory: ArrayList<Message>,
        systemPrompt: String
    ):List<com.llama.llamastack.models.Message> {
        val messageList = ArrayList<com.llama.llamastack.models.Message>();
        // System prompt
        messageList.add(
            com.llama.llamastack.models.Message.ofSystem(
                SystemMessage.builder()
                    .content(InterleavedContent.ofString(systemPrompt))
                    .build()
            )
        )
        // User and assistant messages
        for (chat in conversationHistory) {
            var inferenceMessage: com.llama.llamastack.models.Message
            if (chat.isSent) {
                // User message
                inferenceMessage = com.llama.llamastack.models.Message.ofUser(
                    UserMessage.builder()
                        .content(InterleavedContent.ofString(chat.text))
                        .build()
                )
            } else {
                // Assistant message (aka previous prompt response)
                inferenceMessage = com.llama.llamastack.models.Message.ofCompletion(
                    com.llama.llamastack.models.CompletionMessage.builder()
                        .content(InterleavedContent.ofString(chat.text))
                        .stopReason(com.llama.llamastack.models.CompletionMessage.StopReason.END_OF_MESSAGE)
                        .toolCalls(emptyList())
                        .build()
                )
            }
            messageList.add(inferenceMessage)
        }
        AppLogging.getInstance().log("conversation history length "  + messageList.size)
        return messageList
    }

    private fun getSystemPromptForPotentialCustomToolCall(): String {
        //Get the current time in ISO format and pass it to the model in system prompt as a reference. This is useful for any scheduling and vague timing reference from user prompt.
        val zdt = ZonedDateTime.ofInstant(Instant.parse(Clock.System.now().toString()), ZoneId.systemDefault())
        val formattedZdt = zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
        val availableFunctions = AvailableFunctions.getInstance()
        val functionDefinitions = availableFunctions.values()
        return  """
                            Today Date: $formattedZdt
                    
                            Tool Instructions:
                            - When user is asking a question that requires your reasoning, do not use a function call or generate functions.
                            - Only function call if user's intention matches the function that you have access to.
                            - When looking for real time information use relevant functions if available.
                            - Ignore previous conversation history if you are making a tool call.

                                           
                            You have access to the following functions:
                            {$functionDefinitions}
                                      
                            If you decide to invoke any of the function(s), you MUST put it in the format of [func_name1(params_name1=params_value1, params_name2=params_value2...), func_name2(params)]\n
                            You SHOULD NOT include any other text in the response.
                    
                            Reminder:                          
                            - Function calls MUST follow the specified format
                            - Required parameters MUST be specified
                            - Only call one function at a time
                            - Put the entire function call reply on one line
                            - When returning a function call, don't add anything else to your response
                            - When scheduling the events, make sure you set the date and time right. Use step by step reasoning for date such as next Tuesday
                         """

    }

}