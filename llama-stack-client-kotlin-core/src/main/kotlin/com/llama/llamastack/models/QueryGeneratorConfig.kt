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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = QueryGeneratorConfig.Deserializer::class)
@JsonSerialize(using = QueryGeneratorConfig.Serializer::class)
class QueryGeneratorConfig
private constructor(
    private val defaultRag: DefaultRagQueryGeneratorConfig? = null,
    private val llmrag: LlmragQueryGeneratorConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun defaultRag(): DefaultRagQueryGeneratorConfig? = defaultRag

    fun llmrag(): LlmragQueryGeneratorConfig? = llmrag

    fun isDefaultRag(): Boolean = defaultRag != null

    fun isLlmrag(): Boolean = llmrag != null

    fun asDefaultRag(): DefaultRagQueryGeneratorConfig = defaultRag.getOrThrow("defaultRag")

    fun asLlmrag(): LlmragQueryGeneratorConfig = llmrag.getOrThrow("llmrag")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            defaultRag != null -> visitor.visitDefaultRag(defaultRag)
            llmrag != null -> visitor.visitLlmrag(llmrag)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): QueryGeneratorConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDefaultRag(defaultRag: DefaultRagQueryGeneratorConfig) {
                    defaultRag.validate()
                }

                override fun visitLlmrag(llmrag: LlmragQueryGeneratorConfig) {
                    llmrag.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryGeneratorConfig && defaultRag == other.defaultRag && llmrag == other.llmrag /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(defaultRag, llmrag) /* spotless:on */

    override fun toString(): String =
        when {
            defaultRag != null -> "QueryGeneratorConfig{defaultRag=$defaultRag}"
            llmrag != null -> "QueryGeneratorConfig{llmrag=$llmrag}"
            _json != null -> "QueryGeneratorConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
        }

    companion object {

        fun ofDefaultRag(defaultRag: DefaultRagQueryGeneratorConfig) =
            QueryGeneratorConfig(defaultRag = defaultRag)

        fun ofLlmrag(llmrag: LlmragQueryGeneratorConfig) = QueryGeneratorConfig(llmrag = llmrag)
    }

    interface Visitor<out T> {

        fun visitDefaultRag(defaultRag: DefaultRagQueryGeneratorConfig): T

        fun visitLlmrag(llmrag: LlmragQueryGeneratorConfig): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown QueryGeneratorConfig: $json")
        }
    }

    class Deserializer : BaseDeserializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): QueryGeneratorConfig {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "default" -> {
                    tryDeserialize(node, jacksonTypeRef<DefaultRagQueryGeneratorConfig>()) {
                            it.validate()
                        }
                        ?.let {
                            return QueryGeneratorConfig(defaultRag = it, _json = json)
                        }
                }
                "llm" -> {
                    tryDeserialize(node, jacksonTypeRef<LlmragQueryGeneratorConfig>()) {
                            it.validate()
                        }
                        ?.let {
                            return QueryGeneratorConfig(llmrag = it, _json = json)
                        }
                }
            }

            return QueryGeneratorConfig(_json = json)
        }
    }

    class Serializer : BaseSerializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

        override fun serialize(
            value: QueryGeneratorConfig,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.defaultRag != null -> generator.writeObject(value.defaultRag)
                value.llmrag != null -> generator.writeObject(value.llmrag)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
            }
        }
    }

    @NoAutoDetect
    class DefaultRagQueryGeneratorConfig
    @JsonCreator
    private constructor(
        @JsonProperty("separator")
        @ExcludeMissing
        private val separator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun separator(): String = separator.getRequired("separator")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("separator") @ExcludeMissing fun _separator(): JsonField<String> = separator

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DefaultRagQueryGeneratorConfig = apply {
            if (validated) {
                return@apply
            }

            separator()
            _type().let {
                if (it != JsonValue.from("default")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var separator: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("default")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(defaultRagQueryGeneratorConfig: DefaultRagQueryGeneratorConfig) =
                apply {
                    separator = defaultRagQueryGeneratorConfig.separator
                    type = defaultRagQueryGeneratorConfig.type
                    additionalProperties =
                        defaultRagQueryGeneratorConfig.additionalProperties.toMutableMap()
                }

            fun separator(separator: String) = separator(JsonField.of(separator))

            fun separator(separator: JsonField<String>) = apply { this.separator = separator }

            fun type(type: JsonValue) = apply { this.type = type }

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

            fun build(): DefaultRagQueryGeneratorConfig =
                DefaultRagQueryGeneratorConfig(
                    checkRequired("separator", separator),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DefaultRagQueryGeneratorConfig && separator == other.separator && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(separator, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DefaultRagQueryGeneratorConfig{separator=$separator, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LlmragQueryGeneratorConfig
    @JsonCreator
    private constructor(
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template")
        @ExcludeMissing
        private val template: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun model(): String = model.getRequired("model")

        fun template(): String = template.getRequired("template")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LlmragQueryGeneratorConfig = apply {
            if (validated) {
                return@apply
            }

            model()
            template()
            _type().let {
                if (it != JsonValue.from("llm")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var model: JsonField<String>? = null
            private var template: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("llm")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llmragQueryGeneratorConfig: LlmragQueryGeneratorConfig) = apply {
                model = llmragQueryGeneratorConfig.model
                template = llmragQueryGeneratorConfig.template
                type = llmragQueryGeneratorConfig.type
                additionalProperties =
                    llmragQueryGeneratorConfig.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            fun model(model: JsonField<String>) = apply { this.model = model }

            fun template(template: String) = template(JsonField.of(template))

            fun template(template: JsonField<String>) = apply { this.template = template }

            fun type(type: JsonValue) = apply { this.type = type }

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

            fun build(): LlmragQueryGeneratorConfig =
                LlmragQueryGeneratorConfig(
                    checkRequired("model", model),
                    checkRequired("template", template),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LlmragQueryGeneratorConfig && model == other.model && template == other.template && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(model, template, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmragQueryGeneratorConfig{model=$model, template=$template, type=$type, additionalProperties=$additionalProperties}"
    }
}
