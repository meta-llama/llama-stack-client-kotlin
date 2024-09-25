// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

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
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class SyntheticDataGenerationGenerateParams
constructor(
    private val dialogs: List<Dialog>,
    private val filteringFunction: FilteringFunction,
    private val model: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun dialogs(): List<Dialog> = dialogs

    fun filteringFunction(): FilteringFunction = filteringFunction

    fun model(): String? = model

    internal fun getBody(): SyntheticDataGenerationGenerateBody {
        return SyntheticDataGenerationGenerateBody(
            dialogs,
            filteringFunction,
            model,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SyntheticDataGenerationGenerateBody.Builder::class)
    @NoAutoDetect
    class SyntheticDataGenerationGenerateBody
    internal constructor(
        private val dialogs: List<Dialog>?,
        private val filteringFunction: FilteringFunction?,
        private val model: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("dialogs") fun dialogs(): List<Dialog>? = dialogs

        @JsonProperty("filtering_function")
        fun filteringFunction(): FilteringFunction? = filteringFunction

        @JsonProperty("model") fun model(): String? = model

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SyntheticDataGenerationGenerateBody &&
                this.dialogs == other.dialogs &&
                this.filteringFunction == other.filteringFunction &&
                this.model == other.model &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        dialogs,
                        filteringFunction,
                        model,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SyntheticDataGenerationGenerateBody{dialogs=$dialogs, filteringFunction=$filteringFunction, model=$model, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var dialogs: List<Dialog>? = null
            private var filteringFunction: FilteringFunction? = null
            private var model: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                syntheticDataGenerationGenerateBody: SyntheticDataGenerationGenerateBody
            ) = apply {
                this.dialogs = syntheticDataGenerationGenerateBody.dialogs
                this.filteringFunction = syntheticDataGenerationGenerateBody.filteringFunction
                this.model = syntheticDataGenerationGenerateBody.model
                additionalProperties(syntheticDataGenerationGenerateBody.additionalProperties)
            }

            @JsonProperty("dialogs")
            fun dialogs(dialogs: List<Dialog>) = apply { this.dialogs = dialogs }

            @JsonProperty("filtering_function")
            fun filteringFunction(filteringFunction: FilteringFunction) = apply {
                this.filteringFunction = filteringFunction
            }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): SyntheticDataGenerationGenerateBody =
                SyntheticDataGenerationGenerateBody(
                    checkNotNull(dialogs) { "`dialogs` is required but was not set" }
                        .toUnmodifiable(),
                    checkNotNull(filteringFunction) {
                        "`filteringFunction` is required but was not set"
                    },
                    model,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SyntheticDataGenerationGenerateParams &&
            this.dialogs == other.dialogs &&
            this.filteringFunction == other.filteringFunction &&
            this.model == other.model &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            dialogs,
            filteringFunction,
            model,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SyntheticDataGenerationGenerateParams{dialogs=$dialogs, filteringFunction=$filteringFunction, model=$model, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var dialogs: MutableList<Dialog> = mutableListOf()
        private var filteringFunction: FilteringFunction? = null
        private var model: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            syntheticDataGenerationGenerateParams: SyntheticDataGenerationGenerateParams
        ) = apply {
            this.dialogs(syntheticDataGenerationGenerateParams.dialogs)
            this.filteringFunction = syntheticDataGenerationGenerateParams.filteringFunction
            this.model = syntheticDataGenerationGenerateParams.model
            additionalQueryParams(syntheticDataGenerationGenerateParams.additionalQueryParams)
            additionalHeaders(syntheticDataGenerationGenerateParams.additionalHeaders)
            additionalBodyProperties(syntheticDataGenerationGenerateParams.additionalBodyProperties)
        }

        fun dialogs(dialogs: List<Dialog>) = apply {
            this.dialogs.clear()
            this.dialogs.addAll(dialogs)
        }

        fun addDialog(dialog: Dialog) = apply { this.dialogs.add(dialog) }

        fun filteringFunction(filteringFunction: FilteringFunction) = apply {
            this.filteringFunction = filteringFunction
        }

        fun model(model: String) = apply { this.model = model }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SyntheticDataGenerationGenerateParams =
            SyntheticDataGenerationGenerateParams(
                checkNotNull(dialogs) { "`dialogs` is required but was not set" }.toUnmodifiable(),
                checkNotNull(filteringFunction) {
                    "`filteringFunction` is required but was not set"
                },
                model,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

        private var validated: Boolean = false

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

        fun validate(): Dialog = apply {
            if (!validated) {
                if (
                    userMessage == null &&
                        systemMessage == null &&
                        toolResponseMessage == null &&
                        completionMessage == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Dialog: $_json")
                }
                userMessage?.validate()
                systemMessage?.validate()
                toolResponseMessage?.validate()
                completionMessage?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dialog &&
                this.userMessage == other.userMessage &&
                this.systemMessage == other.systemMessage &&
                this.toolResponseMessage == other.toolResponseMessage &&
                this.completionMessage == other.completionMessage
        }

        override fun hashCode(): Int {
            return Objects.hash(
                userMessage,
                systemMessage,
                toolResponseMessage,
                completionMessage,
            )
        }

        override fun toString(): String {
            return when {
                userMessage != null -> "Dialog{userMessage=$userMessage}"
                systemMessage != null -> "Dialog{systemMessage=$systemMessage}"
                toolResponseMessage != null -> "Dialog{toolResponseMessage=$toolResponseMessage}"
                completionMessage != null -> "Dialog{completionMessage=$completionMessage}"
                _json != null -> "Dialog{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Dialog")
            }
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
    }

    class FilteringFunction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilteringFunction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val NONE = FilteringFunction(JsonField.of("none"))

            val RANDOM = FilteringFunction(JsonField.of("random"))

            val TOP_K = FilteringFunction(JsonField.of("top_k"))

            val TOP_P = FilteringFunction(JsonField.of("top_p"))

            val TOP_K_TOP_P = FilteringFunction(JsonField.of("top_k_top_p"))

            val SIGMOID = FilteringFunction(JsonField.of("sigmoid"))

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
    }
}
