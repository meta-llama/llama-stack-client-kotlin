// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class InferenceChatCompletionParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: InferenceChatCompletionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun messages(): List<Message> = body.messages()

    fun modelId(): String = body.modelId()

    fun logprobs(): Logprobs? = body.logprobs()

    fun responseFormat(): ResponseFormat? = body.responseFormat()

    fun samplingParams(): SamplingParams? = body.samplingParams()

    fun toolChoice(): ToolChoice? = body.toolChoice()

    /**
     * `json` -- Refers to the json format for calling tools. The json format takes the form like {
     * "type": "function", "function" : { "name": "function_name", "description":
     * "function_description", "parameters": {...} } }
     *
     * `function_tag` -- This is an example of how you could define your own user defined format for
     * making tool calls. The function_tag format looks like this,
     * <function=function_name>(parameters)</function>
     *
     * The detailed prompts for each of these formats are added to llama cli
     */
    fun toolPromptFormat(): ToolPromptFormat? = body.toolPromptFormat()

    fun tools(): List<Tool>? = body.tools()

    fun _messages(): JsonField<List<Message>> = body._messages()

    fun _modelId(): JsonField<String> = body._modelId()

    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    /**
     * `json` -- Refers to the json format for calling tools. The json format takes the form like {
     * "type": "function", "function" : { "name": "function_name", "description":
     * "function_description", "parameters": {...} } }
     *
     * `function_tag` -- This is an example of how you could define your own user defined format for
     * making tool calls. The function_tag format looks like this,
     * <function=function_name>(parameters)</function>
     *
     * The detailed prompts for each of these formats are added to llama cli
     */
    fun _toolPromptFormat(): JsonField<ToolPromptFormat> = body._toolPromptFormat()

    fun _tools(): JsonField<List<Tool>> = body._tools()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): InferenceChatCompletionBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InferenceChatCompletionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("messages")
        @ExcludeMissing
        private val messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("model_id")
        @ExcludeMissing
        private val modelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logprobs")
        @ExcludeMissing
        private val logprobs: JsonField<Logprobs> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        private val responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("sampling_params")
        @ExcludeMissing
        private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        private val toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        private val toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        private val tools: JsonField<List<Tool>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun messages(): List<Message> = messages.getRequired("messages")

        fun modelId(): String = modelId.getRequired("model_id")

        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /**
         * `json` -- Refers to the json format for calling tools. The json format takes the form
         * like { "type": "function", "function" : { "name": "function_name", "description":
         * "function_description", "parameters": {...} } }
         *
         * `function_tag` -- This is an example of how you could define your own user defined format
         * for making tool calls. The function_tag format looks like this,
         * <function=function_name>(parameters)</function>
         *
         * The detailed prompts for each of these formats are added to llama cli
         */
        fun toolPromptFormat(): ToolPromptFormat? =
            toolPromptFormat.getNullable("tool_prompt_format")

        fun tools(): List<Tool>? = tools.getNullable("tools")

        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /**
         * `json` -- Refers to the json format for calling tools. The json format takes the form
         * like { "type": "function", "function" : { "name": "function_name", "description":
         * "function_description", "parameters": {...} } }
         *
         * `function_tag` -- This is an example of how you could define your own user defined format
         * for making tool calls. The function_tag format looks like this,
         * <function=function_name>(parameters)</function>
         *
         * The detailed prompts for each of these formats are added to llama cli
         */
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        fun _toolPromptFormat(): JsonField<ToolPromptFormat> = toolPromptFormat

        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InferenceChatCompletionBody = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            modelId()
            logprobs()?.validate()
            responseFormat()?.validate()
            samplingParams()?.validate()
            toolChoice()
            toolPromptFormat()
            tools()?.forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var messages: JsonField<MutableList<Message>>? = null
            private var modelId: JsonField<String>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inferenceChatCompletionBody: InferenceChatCompletionBody) = apply {
                messages = inferenceChatCompletionBody.messages.map { it.toMutableList() }
                modelId = inferenceChatCompletionBody.modelId
                logprobs = inferenceChatCompletionBody.logprobs
                responseFormat = inferenceChatCompletionBody.responseFormat
                samplingParams = inferenceChatCompletionBody.samplingParams
                toolChoice = inferenceChatCompletionBody.toolChoice
                toolPromptFormat = inferenceChatCompletionBody.toolPromptFormat
                tools = inferenceChatCompletionBody.tools.map { it.toMutableList() }
                additionalProperties =
                    inferenceChatCompletionBody.additionalProperties.toMutableMap()
            }

            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(message)
                    }
            }

            fun addMessage(userMessage: UserMessage) =
                addMessage(Message.ofUserMessage(userMessage))

            fun addMessage(systemMessage: SystemMessage) =
                addMessage(Message.ofSystemMessage(systemMessage))

            fun addMessage(toolResponseMessage: ToolResponseMessage) =
                addMessage(Message.ofToolResponseMessage(toolResponseMessage))

            fun addMessage(completionMessage: CompletionMessage) =
                addMessage(Message.ofCompletionMessage(completionMessage))

            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            fun responseFormat(jsonSchema: ResponseFormat.JsonSchema) =
                responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

            fun responseFormat(grammar: ResponseFormat.Grammar) =
                responseFormat(ResponseFormat.ofGrammar(grammar))

            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                this.samplingParams = samplingParams
            }

            fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /**
             * `json` -- Refers to the json format for calling tools. The json format takes the form
             * like { "type": "function", "function" : { "name": "function_name", "description":
             * "function_description", "parameters": {...} } }
             *
             * `function_tag` -- This is an example of how you could define your own user defined
             * format for making tool calls. The function_tag format looks like this,
             * <function=function_name>(parameters)</function>
             *
             * The detailed prompts for each of these formats are added to llama cli
             */
            fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) =
                toolPromptFormat(JsonField.of(toolPromptFormat))

            /**
             * `json` -- Refers to the json format for calling tools. The json format takes the form
             * like { "type": "function", "function" : { "name": "function_name", "description":
             * "function_description", "parameters": {...} } }
             *
             * `function_tag` -- This is an example of how you could define your own user defined
             * format for making tool calls. The function_tag format looks like this,
             * <function=function_name>(parameters)</function>
             *
             * The detailed prompts for each of these formats are added to llama cli
             */
            fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
                this.toolPromptFormat = toolPromptFormat
            }

            fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

            fun tools(tools: JsonField<List<Tool>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            fun addTool(tool: Tool) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(tool)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): InferenceChatCompletionBody =
                InferenceChatCompletionBody(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("modelId", modelId),
                    logprobs,
                    responseFormat,
                    samplingParams,
                    toolChoice,
                    toolPromptFormat,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferenceChatCompletionBody && messages == other.messages && modelId == other.modelId && logprobs == other.logprobs && responseFormat == other.responseFormat && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messages, modelId, logprobs, responseFormat, samplingParams, toolChoice, toolPromptFormat, tools, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InferenceChatCompletionBody{messages=$messages, modelId=$modelId, logprobs=$logprobs, responseFormat=$responseFormat, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: InferenceChatCompletionBody.Builder =
            InferenceChatCompletionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inferenceChatCompletionParams: InferenceChatCompletionParams) = apply {
            xLlamaStackClientVersion = inferenceChatCompletionParams.xLlamaStackClientVersion
            xLlamaStackProviderData = inferenceChatCompletionParams.xLlamaStackProviderData
            body = inferenceChatCompletionParams.body.toBuilder()
            additionalHeaders = inferenceChatCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferenceChatCompletionParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        fun addMessage(message: Message) = apply { body.addMessage(message) }

        fun addMessage(userMessage: UserMessage) = apply { body.addMessage(userMessage) }

        fun addMessage(systemMessage: SystemMessage) = apply { body.addMessage(systemMessage) }

        fun addMessage(toolResponseMessage: ToolResponseMessage) = apply {
            body.addMessage(toolResponseMessage)
        }

        fun addMessage(completionMessage: CompletionMessage) = apply {
            body.addMessage(completionMessage)
        }

        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        fun responseFormat(jsonSchema: ResponseFormat.JsonSchema) = apply {
            body.responseFormat(jsonSchema)
        }

        fun responseFormat(grammar: ResponseFormat.Grammar) = apply { body.responseFormat(grammar) }

        fun samplingParams(samplingParams: SamplingParams) = apply {
            body.samplingParams(samplingParams)
        }

        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            body.samplingParams(samplingParams)
        }

        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /**
         * `json` -- Refers to the json format for calling tools. The json format takes the form
         * like { "type": "function", "function" : { "name": "function_name", "description":
         * "function_description", "parameters": {...} } }
         *
         * `function_tag` -- This is an example of how you could define your own user defined format
         * for making tool calls. The function_tag format looks like this,
         * <function=function_name>(parameters)</function>
         *
         * The detailed prompts for each of these formats are added to llama cli
         */
        fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) = apply {
            body.toolPromptFormat(toolPromptFormat)
        }

        /**
         * `json` -- Refers to the json format for calling tools. The json format takes the form
         * like { "type": "function", "function" : { "name": "function_name", "description":
         * "function_description", "parameters": {...} } }
         *
         * `function_tag` -- This is an example of how you could define your own user defined format
         * for making tool calls. The function_tag format looks like this,
         * <function=function_name>(parameters)</function>
         *
         * The detailed prompts for each of these formats are added to llama cli
         */
        fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
            body.toolPromptFormat(toolPromptFormat)
        }

        fun tools(tools: List<Tool>) = apply { body.tools(tools) }

        fun tools(tools: JsonField<List<Tool>>) = apply { body.tools(tools) }

        fun addTool(tool: Tool) = apply { body.addTool(tool) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): InferenceChatCompletionParams =
            InferenceChatCompletionParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Logprobs
    @JsonCreator
    private constructor(
        @JsonProperty("top_k") @ExcludeMissing private val topK: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun topK(): Long? = topK.getNullable("top_k")

        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Logprobs = apply {
            if (validated) {
                return@apply
            }

            topK()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var topK: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobs: Logprobs) = apply {
                topK = logprobs.topK
                additionalProperties = logprobs.additionalProperties.toMutableMap()
            }

            fun topK(topK: Long) = topK(JsonField.of(topK))

            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Logprobs && topK == other.topK && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(topK, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val jsonSchema: JsonSchema? = null,
        private val grammar: Grammar? = null,
        private val _json: JsonValue? = null,
    ) {

        fun jsonSchema(): JsonSchema? = jsonSchema

        fun grammar(): Grammar? = grammar

        fun isJsonSchema(): Boolean = jsonSchema != null

        fun isGrammar(): Boolean = grammar != null

        fun asJsonSchema(): JsonSchema = jsonSchema.getOrThrow("jsonSchema")

        fun asGrammar(): Grammar = grammar.getOrThrow("grammar")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
                grammar != null -> visitor.visitGrammar(grammar)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonSchema(jsonSchema: JsonSchema) {
                        jsonSchema.validate()
                    }

                    override fun visitGrammar(grammar: Grammar) {
                        grammar.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFormat && jsonSchema == other.jsonSchema && grammar == other.grammar /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonSchema, grammar) /* spotless:on */

        override fun toString(): String =
            when {
                jsonSchema != null -> "ResponseFormat{jsonSchema=$jsonSchema}"
                grammar != null -> "ResponseFormat{grammar=$grammar}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }

        companion object {

            fun ofJsonSchema(jsonSchema: JsonSchema) = ResponseFormat(jsonSchema = jsonSchema)

            fun ofGrammar(grammar: Grammar) = ResponseFormat(grammar = grammar)
        }

        interface Visitor<out T> {

            fun visitJsonSchema(jsonSchema: JsonSchema): T

            fun visitGrammar(grammar: Grammar): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "json_schema" -> {
                        tryDeserialize(node, jacksonTypeRef<JsonSchema>()) { it.validate() }
                            ?.let {
                                return ResponseFormat(jsonSchema = it, _json = json)
                            }
                    }
                    "grammar" -> {
                        tryDeserialize(node, jacksonTypeRef<Grammar>()) { it.validate() }
                            ?.let {
                                return ResponseFormat(grammar = it, _json = json)
                            }
                    }
                }

                return ResponseFormat(_json = json)
            }
        }

        class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                    value.grammar != null -> generator.writeObject(value.grammar)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }

        @NoAutoDetect
        class JsonSchema
        @JsonCreator
        private constructor(
            @JsonProperty("json_schema")
            @ExcludeMissing
            private val jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("json_schema")
            @ExcludeMissing
            fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): JsonSchema = apply {
                if (validated) {
                    return@apply
                }

                jsonSchema().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var jsonSchema: JsonField<JsonSchema>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(jsonSchema: JsonSchema) = apply {
                    this.jsonSchema = jsonSchema.jsonSchema
                    type = jsonSchema.type
                    additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                }

                fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                    this.jsonSchema = jsonSchema
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): JsonSchema =
                    JsonSchema(
                        checkRequired("jsonSchema", jsonSchema),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class JsonSchema
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): JsonSchema = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(jsonSchema: JsonSchema) = apply {
                        additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): JsonSchema = JsonSchema(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is JsonSchema && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "JsonSchema{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val JSON_SCHEMA = of("json_schema")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    JSON_SCHEMA,
                }

                enum class Value {
                    JSON_SCHEMA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        JSON_SCHEMA -> Value.JSON_SCHEMA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        JSON_SCHEMA -> Known.JSON_SCHEMA
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is JsonSchema && jsonSchema == other.jsonSchema && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(jsonSchema, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JsonSchema{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Grammar
        @JsonCreator
        private constructor(
            @JsonProperty("bnf") @ExcludeMissing private val bnf: JsonField<Bnf> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun bnf(): Bnf = bnf.getRequired("bnf")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bnf") @ExcludeMissing fun _bnf(): JsonField<Bnf> = bnf

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Grammar = apply {
                if (validated) {
                    return@apply
                }

                bnf().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bnf: JsonField<Bnf>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(grammar: Grammar) = apply {
                    bnf = grammar.bnf
                    type = grammar.type
                    additionalProperties = grammar.additionalProperties.toMutableMap()
                }

                fun bnf(bnf: Bnf) = bnf(JsonField.of(bnf))

                fun bnf(bnf: JsonField<Bnf>) = apply { this.bnf = bnf }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Grammar =
                    Grammar(
                        checkRequired("bnf", bnf),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Bnf
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Bnf = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bnf: Bnf) = apply {
                        additionalProperties = bnf.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Bnf = Bnf(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Bnf && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Bnf{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val GRAMMAR = of("grammar")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GRAMMAR,
                }

                enum class Value {
                    GRAMMAR,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GRAMMAR -> Value.GRAMMAR
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GRAMMAR -> Known.GRAMMAR
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Grammar && bnf == other.bnf && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bnf, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Grammar{bnf=$bnf, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class ToolChoice
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUTO = of("auto")

            val REQUIRED = of("required")

            fun of(value: String) = ToolChoice(JsonField.of(value))
        }

        enum class Known {
            AUTO,
            REQUIRED,
        }

        enum class Value {
            AUTO,
            REQUIRED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                REQUIRED -> Value.REQUIRED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                REQUIRED -> Known.REQUIRED
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolChoice: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolChoice && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * `json` -- Refers to the json format for calling tools. The json format takes the form like {
     * "type": "function", "function" : { "name": "function_name", "description":
     * "function_description", "parameters": {...} } }
     *
     * `function_tag` -- This is an example of how you could define your own user defined format for
     * making tool calls. The function_tag format looks like this,
     * <function=function_name>(parameters)</function>
     *
     * The detailed prompts for each of these formats are added to llama cli
     */
    class ToolPromptFormat
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val JSON = of("json")

            val FUNCTION_TAG = of("function_tag")

            val PYTHON_LIST = of("python_list")

            fun of(value: String) = ToolPromptFormat(JsonField.of(value))
        }

        enum class Known {
            JSON,
            FUNCTION_TAG,
            PYTHON_LIST,
        }

        enum class Value {
            JSON,
            FUNCTION_TAG,
            PYTHON_LIST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                JSON -> Value.JSON
                FUNCTION_TAG -> Value.FUNCTION_TAG
                PYTHON_LIST -> Value.PYTHON_LIST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                JSON -> Known.JSON
                FUNCTION_TAG -> Known.FUNCTION_TAG
                PYTHON_LIST -> Known.PYTHON_LIST
                else ->
                    throw LlamaStackClientInvalidDataException("Unknown ToolPromptFormat: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolPromptFormat && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Tool
    @JsonCreator
    private constructor(
        @JsonProperty("tool_name")
        @ExcludeMissing
        private val toolName: JsonField<ToolName> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        private val parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun toolName(): ToolName = toolName.getRequired("tool_name")

        fun description(): String? = description.getNullable("description")

        fun parameters(): Parameters? = parameters.getNullable("parameters")

        @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<ToolName> = toolName

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tool = apply {
            if (validated) {
                return@apply
            }

            toolName()
            description()
            parameters()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var toolName: JsonField<ToolName>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tool: Tool) = apply {
                toolName = tool.toolName
                description = tool.description
                parameters = tool.parameters
                additionalProperties = tool.additionalProperties.toMutableMap()
            }

            fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

            fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

            fun toolName(value: String) = apply { toolName(ToolName.of(value)) }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Tool =
                Tool(
                    checkRequired("toolName", toolName),
                    description,
                    parameters,
                    additionalProperties.toImmutable(),
                )
        }

        class ToolName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BRAVE_SEARCH = of("brave_search")

                val WOLFRAM_ALPHA = of("wolfram_alpha")

                val PHOTOGEN = of("photogen")

                val CODE_INTERPRETER = of("code_interpreter")

                fun of(value: String) = ToolName(JsonField.of(value))
            }

            enum class Known {
                BRAVE_SEARCH,
                WOLFRAM_ALPHA,
                PHOTOGEN,
                CODE_INTERPRETER,
            }

            enum class Value {
                BRAVE_SEARCH,
                WOLFRAM_ALPHA,
                PHOTOGEN,
                CODE_INTERPRETER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BRAVE_SEARCH -> Value.BRAVE_SEARCH
                    WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                    PHOTOGEN -> Value.PHOTOGEN
                    CODE_INTERPRETER -> Value.CODE_INTERPRETER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BRAVE_SEARCH -> Known.BRAVE_SEARCH
                    WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                    PHOTOGEN -> Known.PHOTOGEN
                    CODE_INTERPRETER -> Known.CODE_INTERPRETER
                    else -> throw LlamaStackClientInvalidDataException("Unknown ToolName: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolName && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Parameters
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parameters: Parameters) = apply {
                    additionalProperties = parameters.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Parameters = Parameters(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tool && toolName == other.toolName && description == other.description && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(toolName, description, parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tool{toolName=$toolName, description=$description, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceChatCompletionParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferenceChatCompletionParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
