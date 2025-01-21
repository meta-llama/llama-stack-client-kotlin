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

class SyntheticDataGenerationGenerateParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: SyntheticDataGenerationGenerateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun dialogs(): List<Dialog> = body.dialogs()

    fun filteringFunction(): FilteringFunction = body.filteringFunction()

    fun model(): String? = body.model()

    fun _dialogs(): JsonField<List<Dialog>> = body._dialogs()

    fun _filteringFunction(): JsonField<FilteringFunction> = body._filteringFunction()

    fun _model(): JsonField<String> = body._model()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): SyntheticDataGenerationGenerateBody = body

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
    class SyntheticDataGenerationGenerateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("dialogs")
        @ExcludeMissing
        private val dialogs: JsonField<List<Dialog>> = JsonMissing.of(),
        @JsonProperty("filtering_function")
        @ExcludeMissing
        private val filteringFunction: JsonField<FilteringFunction> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun dialogs(): List<Dialog> = dialogs.getRequired("dialogs")

        fun filteringFunction(): FilteringFunction =
            filteringFunction.getRequired("filtering_function")

        fun model(): String? = model.getNullable("model")

        @JsonProperty("dialogs") @ExcludeMissing fun _dialogs(): JsonField<List<Dialog>> = dialogs

        @JsonProperty("filtering_function")
        @ExcludeMissing
        fun _filteringFunction(): JsonField<FilteringFunction> = filteringFunction

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SyntheticDataGenerationGenerateBody = apply {
            if (validated) {
                return@apply
            }

            dialogs().forEach { it.validate() }
            filteringFunction()
            model()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var dialogs: JsonField<MutableList<Dialog>>? = null
            private var filteringFunction: JsonField<FilteringFunction>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                syntheticDataGenerationGenerateBody: SyntheticDataGenerationGenerateBody
            ) = apply {
                dialogs = syntheticDataGenerationGenerateBody.dialogs.map { it.toMutableList() }
                filteringFunction = syntheticDataGenerationGenerateBody.filteringFunction
                model = syntheticDataGenerationGenerateBody.model
                additionalProperties =
                    syntheticDataGenerationGenerateBody.additionalProperties.toMutableMap()
            }

            fun dialogs(dialogs: List<Dialog>) = dialogs(JsonField.of(dialogs))

            fun dialogs(dialogs: JsonField<List<Dialog>>) = apply {
                this.dialogs = dialogs.map { it.toMutableList() }
            }

            fun addDialog(dialog: Dialog) = apply {
                dialogs =
                    (dialogs ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(dialog)
                    }
            }

            fun addDialog(userMessage: UserMessage) = addDialog(Dialog.ofUserMessage(userMessage))

            fun addDialog(systemMessage: SystemMessage) =
                addDialog(Dialog.ofSystemMessage(systemMessage))

            fun addDialog(toolResponseMessage: ToolResponseMessage) =
                addDialog(Dialog.ofToolResponseMessage(toolResponseMessage))

            fun addDialog(completionMessage: Dialog.CompletionMessage) =
                addDialog(Dialog.ofCompletionMessage(completionMessage))

            fun filteringFunction(filteringFunction: FilteringFunction) =
                filteringFunction(JsonField.of(filteringFunction))

            fun filteringFunction(filteringFunction: JsonField<FilteringFunction>) = apply {
                this.filteringFunction = filteringFunction
            }

            fun model(model: String) = model(JsonField.of(model))

            fun model(model: JsonField<String>) = apply { this.model = model }

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

            fun build(): SyntheticDataGenerationGenerateBody =
                SyntheticDataGenerationGenerateBody(
                    checkNotNull(dialogs) { "`dialogs` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(filteringFunction) {
                        "`filteringFunction` is required but was not set"
                    },
                    model,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SyntheticDataGenerationGenerateBody && dialogs == other.dialogs && filteringFunction == other.filteringFunction && model == other.model && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dialogs, filteringFunction, model, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SyntheticDataGenerationGenerateBody{dialogs=$dialogs, filteringFunction=$filteringFunction, model=$model, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: SyntheticDataGenerationGenerateBody.Builder =
            SyntheticDataGenerationGenerateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            syntheticDataGenerationGenerateParams: SyntheticDataGenerationGenerateParams
        ) = apply {
            xLlamaStackClientVersion =
                syntheticDataGenerationGenerateParams.xLlamaStackClientVersion
            xLlamaStackProviderData = syntheticDataGenerationGenerateParams.xLlamaStackProviderData
            body = syntheticDataGenerationGenerateParams.body.toBuilder()
            additionalHeaders = syntheticDataGenerationGenerateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                syntheticDataGenerationGenerateParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun dialogs(dialogs: List<Dialog>) = apply { body.dialogs(dialogs) }

        fun dialogs(dialogs: JsonField<List<Dialog>>) = apply { body.dialogs(dialogs) }

        fun addDialog(dialog: Dialog) = apply { body.addDialog(dialog) }

        fun addDialog(userMessage: UserMessage) = apply { body.addDialog(userMessage) }

        fun addDialog(systemMessage: SystemMessage) = apply { body.addDialog(systemMessage) }

        fun addDialog(toolResponseMessage: ToolResponseMessage) = apply {
            body.addDialog(toolResponseMessage)
        }

        fun addDialog(completionMessage: Dialog.CompletionMessage) = apply {
            body.addDialog(completionMessage)
        }

        fun filteringFunction(filteringFunction: FilteringFunction) = apply {
            body.filteringFunction(filteringFunction)
        }

        fun filteringFunction(filteringFunction: JsonField<FilteringFunction>) = apply {
            body.filteringFunction(filteringFunction)
        }

        fun model(model: String) = apply { body.model(model) }

        fun model(model: JsonField<String>) = apply { body.model(model) }

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

        fun build(): SyntheticDataGenerationGenerateParams =
            SyntheticDataGenerationGenerateParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = Dialog.Deserializer::class)
    @JsonSerialize(using = Dialog.Serializer::class)
    class Dialog
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

        fun validate(): Dialog = apply {
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

            return /* spotless:off */ other is Dialog && userMessage == other.userMessage && systemMessage == other.systemMessage && toolResponseMessage == other.toolResponseMessage && completionMessage == other.completionMessage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(userMessage, systemMessage, toolResponseMessage, completionMessage) /* spotless:on */

        override fun toString(): String =
            when {
                userMessage != null -> "Dialog{userMessage=$userMessage}"
                systemMessage != null -> "Dialog{systemMessage=$systemMessage}"
                toolResponseMessage != null -> "Dialog{toolResponseMessage=$toolResponseMessage}"
                completionMessage != null -> "Dialog{completionMessage=$completionMessage}"
                _json != null -> "Dialog{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Dialog")
            }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = Dialog(userMessage = userMessage)

            fun ofSystemMessage(systemMessage: SystemMessage) =
                Dialog(systemMessage = systemMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                Dialog(toolResponseMessage = toolResponseMessage)

            fun ofCompletionMessage(completionMessage: CompletionMessage) =
                Dialog(completionMessage = completionMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitSystemMessage(systemMessage: SystemMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun visitCompletionMessage(completionMessage: CompletionMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Dialog: $json")
            }
        }

        class Deserializer : BaseDeserializer<Dialog>(Dialog::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Dialog {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(systemMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(toolResponseMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(completionMessage = it, _json = json)
                    }

                return Dialog(_json = json)
            }
        }

        class Serializer : BaseSerializer<Dialog>(Dialog::class) {

            override fun serialize(
                value: Dialog,
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
                    else -> throw IllegalStateException("Invalid Dialog")
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

    class FilteringFunction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val NONE = of("none")

            val RANDOM = of("random")

            val TOP_K = of("top_k")

            val TOP_P = of("top_p")

            val TOP_K_TOP_P = of("top_k_top_p")

            val SIGMOID = of("sigmoid")

            fun of(value: String) = FilteringFunction(JsonField.of(value))
        }

        enum class Known {
            NONE,
            RANDOM,
            TOP_K,
            TOP_P,
            TOP_K_TOP_P,
            SIGMOID,
        }

        enum class Value {
            NONE,
            RANDOM,
            TOP_K,
            TOP_P,
            TOP_K_TOP_P,
            SIGMOID,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NONE -> Value.NONE
                RANDOM -> Value.RANDOM
                TOP_K -> Value.TOP_K
                TOP_P -> Value.TOP_P
                TOP_K_TOP_P -> Value.TOP_K_TOP_P
                SIGMOID -> Value.SIGMOID
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NONE -> Known.NONE
                RANDOM -> Known.RANDOM
                TOP_K -> Known.TOP_K
                TOP_P -> Known.TOP_P
                TOP_K_TOP_P -> Known.TOP_K_TOP_P
                SIGMOID -> Known.SIGMOID
                else ->
                    throw LlamaStackClientInvalidDataException("Unknown FilteringFunction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FilteringFunction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SyntheticDataGenerationGenerateParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SyntheticDataGenerationGenerateParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
