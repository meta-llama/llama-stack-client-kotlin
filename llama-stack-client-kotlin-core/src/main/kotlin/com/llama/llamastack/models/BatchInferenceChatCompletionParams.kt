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
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class BatchInferenceChatCompletionParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: BatchInferenceChatCompletionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun messagesBatch(): List<List<MessagesBatch>> = body.messagesBatch()

    fun model(): String = body.model()

    fun logprobs(): Logprobs? = body.logprobs()

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

    fun _messagesBatch(): JsonField<List<List<MessagesBatch>>> = body._messagesBatch()

    fun _model(): JsonField<String> = body._model()

    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

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

    internal fun getBody(): BatchInferenceChatCompletionBody = body

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
    class BatchInferenceChatCompletionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("messages_batch")
        @ExcludeMissing
        private val messagesBatch: JsonField<List<List<MessagesBatch>>> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logprobs")
        @ExcludeMissing
        private val logprobs: JsonField<Logprobs> = JsonMissing.of(),
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

        fun messagesBatch(): List<List<MessagesBatch>> = messagesBatch.getRequired("messages_batch")

        fun model(): String = model.getRequired("model")

        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

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

        @JsonProperty("messages_batch")
        @ExcludeMissing
        fun _messagesBatch(): JsonField<List<List<MessagesBatch>>> = messagesBatch

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

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

        fun validate(): BatchInferenceChatCompletionBody = apply {
            if (validated) {
                return@apply
            }

            messagesBatch().forEach { it.forEach { it.validate() } }
            model()
            logprobs()?.validate()
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

            private var messagesBatch: JsonField<MutableList<List<MessagesBatch>>>? = null
            private var model: JsonField<String>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(batchInferenceChatCompletionBody: BatchInferenceChatCompletionBody) =
                apply {
                    messagesBatch =
                        batchInferenceChatCompletionBody.messagesBatch.map { it.toMutableList() }
                    model = batchInferenceChatCompletionBody.model
                    logprobs = batchInferenceChatCompletionBody.logprobs
                    samplingParams = batchInferenceChatCompletionBody.samplingParams
                    toolChoice = batchInferenceChatCompletionBody.toolChoice
                    toolPromptFormat = batchInferenceChatCompletionBody.toolPromptFormat
                    tools = batchInferenceChatCompletionBody.tools.map { it.toMutableList() }
                    additionalProperties =
                        batchInferenceChatCompletionBody.additionalProperties.toMutableMap()
                }

            fun messagesBatch(messagesBatch: List<List<MessagesBatch>>) =
                messagesBatch(JsonField.of(messagesBatch))

            fun messagesBatch(messagesBatch: JsonField<List<List<MessagesBatch>>>) = apply {
                this.messagesBatch = messagesBatch.map { it.toMutableList() }
            }

            fun addMessagesBatch(messagesBatch: List<MessagesBatch>) = apply {
                this.messagesBatch =
                    (this.messagesBatch ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(messagesBatch)
                    }
            }

            fun model(model: String) = model(JsonField.of(model))

            fun model(model: JsonField<String>) = apply { this.model = model }

            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

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

            fun build(): BatchInferenceChatCompletionBody =
                BatchInferenceChatCompletionBody(
                    checkNotNull(messagesBatch) { "`messagesBatch` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(model) { "`model` is required but was not set" },
                    logprobs,
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

            return /* spotless:off */ other is BatchInferenceChatCompletionBody && messagesBatch == other.messagesBatch && model == other.model && logprobs == other.logprobs && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messagesBatch, model, logprobs, samplingParams, toolChoice, toolPromptFormat, tools, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BatchInferenceChatCompletionBody{messagesBatch=$messagesBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: BatchInferenceChatCompletionBody.Builder =
            BatchInferenceChatCompletionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(batchInferenceChatCompletionParams: BatchInferenceChatCompletionParams) =
            apply {
                xLlamaStackClientVersion =
                    batchInferenceChatCompletionParams.xLlamaStackClientVersion
                xLlamaStackProviderData = batchInferenceChatCompletionParams.xLlamaStackProviderData
                body = batchInferenceChatCompletionParams.body.toBuilder()
                additionalHeaders = batchInferenceChatCompletionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    batchInferenceChatCompletionParams.additionalQueryParams.toBuilder()
            }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun messagesBatch(messagesBatch: List<List<MessagesBatch>>) = apply {
            body.messagesBatch(messagesBatch)
        }

        fun messagesBatch(messagesBatch: JsonField<List<List<MessagesBatch>>>) = apply {
            body.messagesBatch(messagesBatch)
        }

        fun addMessagesBatch(messagesBatch: List<MessagesBatch>) = apply {
            body.addMessagesBatch(messagesBatch)
        }

        fun model(model: String) = apply { body.model(model) }

        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

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

        fun build(): BatchInferenceChatCompletionParams =
            BatchInferenceChatCompletionParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = MessagesBatch.Deserializer::class)
    @JsonSerialize(using = MessagesBatch.Serializer::class)
    class MessagesBatch
    private constructor(
        private val userMessage: UserMessage? = null,
        private val systemMessage: SystemMessage? = null,
        private val toolResponseMessage: ToolResponseMessage? = null,
        private val completionMessage: CompletionMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun userMessage(): UserMessage? = userMessage

        fun systemMessage(): SystemMessage? = systemMessage

        fun toolResponseMessage(): ToolResponseMessage? = toolResponseMessage

        fun completionMessage(): CompletionMessage? = completionMessage

        fun isUserMessage(): Boolean = userMessage != null

        fun isSystemMessage(): Boolean = systemMessage != null

        fun isToolResponseMessage(): Boolean = toolResponseMessage != null

        fun isCompletionMessage(): Boolean = completionMessage != null

        fun asUserMessage(): UserMessage = userMessage.getOrThrow("userMessage")

        fun asSystemMessage(): SystemMessage = systemMessage.getOrThrow("systemMessage")

        fun asToolResponseMessage(): ToolResponseMessage =
            toolResponseMessage.getOrThrow("toolResponseMessage")

        fun asCompletionMessage(): CompletionMessage =
            completionMessage.getOrThrow("completionMessage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                userMessage != null -> visitor.visitUserMessage(userMessage)
                systemMessage != null -> visitor.visitSystemMessage(systemMessage)
                toolResponseMessage != null -> visitor.visitToolResponseMessage(toolResponseMessage)
                completionMessage != null -> visitor.visitCompletionMessage(completionMessage)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): MessagesBatch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUserMessage(userMessage: UserMessage) {
                        userMessage.validate()
                    }

                    override fun visitSystemMessage(systemMessage: SystemMessage) {
                        systemMessage.validate()
                    }

                    override fun visitToolResponseMessage(
                        toolResponseMessage: ToolResponseMessage
                    ) {
                        toolResponseMessage.validate()
                    }

                    override fun visitCompletionMessage(completionMessage: CompletionMessage) {
                        completionMessage.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MessagesBatch && userMessage == other.userMessage && systemMessage == other.systemMessage && toolResponseMessage == other.toolResponseMessage && completionMessage == other.completionMessage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(userMessage, systemMessage, toolResponseMessage, completionMessage) /* spotless:on */

        override fun toString(): String =
            when {
                userMessage != null -> "MessagesBatch{userMessage=$userMessage}"
                systemMessage != null -> "MessagesBatch{systemMessage=$systemMessage}"
                toolResponseMessage != null ->
                    "MessagesBatch{toolResponseMessage=$toolResponseMessage}"
                completionMessage != null -> "MessagesBatch{completionMessage=$completionMessage}"
                _json != null -> "MessagesBatch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MessagesBatch")
            }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = MessagesBatch(userMessage = userMessage)

            fun ofSystemMessage(systemMessage: SystemMessage) =
                MessagesBatch(systemMessage = systemMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                MessagesBatch(toolResponseMessage = toolResponseMessage)

            fun ofCompletionMessage(completionMessage: CompletionMessage) =
                MessagesBatch(completionMessage = completionMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitSystemMessage(systemMessage: SystemMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun visitCompletionMessage(completionMessage: CompletionMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown MessagesBatch: $json")
            }
        }

        class Deserializer : BaseDeserializer<MessagesBatch>(MessagesBatch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MessagesBatch {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(systemMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(toolResponseMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(completionMessage = it, _json = json)
                    }

                return MessagesBatch(_json = json)
            }
        }

        class Serializer : BaseSerializer<MessagesBatch>(MessagesBatch::class) {

            override fun serialize(
                value: MessagesBatch,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.userMessage != null -> generator.writeObject(value.userMessage)
                    value.systemMessage != null -> generator.writeObject(value.systemMessage)
                    value.toolResponseMessage != null ->
                        generator.writeObject(value.toolResponseMessage)
                    value.completionMessage != null ->
                        generator.writeObject(value.completionMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MessagesBatch")
                }
            }
        }

        @NoAutoDetect
        class CompletionMessage
        @JsonCreator
        private constructor(
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<InterleavedContent> = JsonMissing.of(),
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("stop_reason")
            @ExcludeMissing
            private val stopReason: JsonField<StopReason> = JsonMissing.of(),
            @JsonProperty("tool_calls")
            @ExcludeMissing
            private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun content(): InterleavedContent = content.getRequired("content")

            fun role(): Role = role.getRequired("role")

            fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

            fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

            @JsonProperty("content")
            @ExcludeMissing
            fun _content(): JsonField<InterleavedContent> = content

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("stop_reason")
            @ExcludeMissing
            fun _stopReason(): JsonField<StopReason> = stopReason

            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CompletionMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                role()
                stopReason()
                toolCalls().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<InterleavedContent>? = null
                private var role: JsonField<Role>? = null
                private var stopReason: JsonField<StopReason>? = null
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(completionMessage: CompletionMessage) = apply {
                    content = completionMessage.content
                    role = completionMessage.role
                    stopReason = completionMessage.stopReason
                    toolCalls = completionMessage.toolCalls.map { it.toMutableList() }
                    additionalProperties = completionMessage.additionalProperties.toMutableMap()
                }

                fun content(content: InterleavedContent) = content(JsonField.of(content))

                fun content(content: JsonField<InterleavedContent>) = apply {
                    this.content = content
                }

                fun content(string: String) = content(InterleavedContent.ofString(string))

                fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                    content(InterleavedContent.ofImageContentItem(imageContentItem))

                fun content(textContentItem: InterleavedContent.TextContentItem) =
                    content(InterleavedContent.ofTextContentItem(textContentItem))

                fun contentOfInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ) = content(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

                fun stopReason(stopReason: JsonField<StopReason>) = apply {
                    this.stopReason = stopReason
                }

                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                fun addToolCall(toolCall: ToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(toolCall)
                        }
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

                fun build(): CompletionMessage =
                    CompletionMessage(
                        checkNotNull(content) { "`content` is required but was not set" },
                        checkNotNull(role) { "`role` is required but was not set" },
                        checkNotNull(stopReason) { "`stopReason` is required but was not set" },
                        checkNotNull(toolCalls) { "`toolCalls` is required but was not set" }
                            .map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ASSISTANT = of("assistant")

                    fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    ASSISTANT,
                }

                enum class Value {
                    ASSISTANT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ASSISTANT -> Value.ASSISTANT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ASSISTANT -> Known.ASSISTANT
                        else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class StopReason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val END_OF_TURN = of("end_of_turn")

                    val END_OF_MESSAGE = of("end_of_message")

                    val OUT_OF_TOKENS = of("out_of_tokens")

                    fun of(value: String) = StopReason(JsonField.of(value))
                }

                enum class Known {
                    END_OF_TURN,
                    END_OF_MESSAGE,
                    OUT_OF_TOKENS,
                }

                enum class Value {
                    END_OF_TURN,
                    END_OF_MESSAGE,
                    OUT_OF_TOKENS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        END_OF_TURN -> Value.END_OF_TURN
                        END_OF_MESSAGE -> Value.END_OF_MESSAGE
                        OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        END_OF_TURN -> Known.END_OF_TURN
                        END_OF_MESSAGE -> Known.END_OF_MESSAGE
                        OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CompletionMessage && content == other.content && role == other.role && stopReason == other.stopReason && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, role, stopReason, toolCalls, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CompletionMessage{content=$content, role=$role, stopReason=$stopReason, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }
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
                    checkNotNull(toolName) { "`toolName` is required but was not set" },
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

        return /* spotless:off */ other is BatchInferenceChatCompletionParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BatchInferenceChatCompletionParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
