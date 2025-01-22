// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class ToolGroup
@JsonCreator
private constructor(
    @JsonProperty("identifier")
    @ExcludeMissing
    private val identifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    private val providerResourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("args") @ExcludeMissing private val args: JsonField<Args> = JsonMissing.of(),
    @JsonProperty("mcp_endpoint")
    @ExcludeMissing
    private val mcpEndpoint: JsonField<Url> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun identifier(): String = identifier.getRequired("identifier")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun type(): Type = type.getRequired("type")

    fun args(): Args? = args.getNullable("args")

    fun mcpEndpoint(): Url? = mcpEndpoint.getNullable("mcp_endpoint")

    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

    @JsonProperty("mcp_endpoint") @ExcludeMissing fun _mcpEndpoint(): JsonField<Url> = mcpEndpoint

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolGroup = apply {
        if (validated) {
            return@apply
        }

        identifier()
        providerId()
        providerResourceId()
        type()
        args()?.validate()
        mcpEndpoint()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var identifier: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var args: JsonField<Args> = JsonMissing.of()
        private var mcpEndpoint: JsonField<Url> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolGroup: ToolGroup) = apply {
            identifier = toolGroup.identifier
            providerId = toolGroup.providerId
            providerResourceId = toolGroup.providerResourceId
            type = toolGroup.type
            args = toolGroup.args
            mcpEndpoint = toolGroup.mcpEndpoint
            additionalProperties = toolGroup.additionalProperties.toMutableMap()
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun args(args: Args) = args(JsonField.of(args))

        fun args(args: JsonField<Args>) = apply { this.args = args }

        fun mcpEndpoint(mcpEndpoint: Url) = mcpEndpoint(JsonField.of(mcpEndpoint))

        fun mcpEndpoint(mcpEndpoint: JsonField<Url>) = apply { this.mcpEndpoint = mcpEndpoint }

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

        fun build(): ToolGroup =
            ToolGroup(
                checkRequired("identifier", identifier),
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
                checkRequired("type", type),
                args,
                mcpEndpoint,
                additionalProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val TOOL_GROUP = of("tool_group")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            TOOL_GROUP,
        }

        enum class Value {
            TOOL_GROUP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TOOL_GROUP -> Value.TOOL_GROUP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TOOL_GROUP -> Known.TOOL_GROUP
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

    @NoAutoDetect
    class Args
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Args = apply {
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

            internal fun from(args: Args) = apply {
                additionalProperties = args.additionalProperties.toMutableMap()
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

            fun build(): Args = Args(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Args && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Args{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolGroup && identifier == other.identifier && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && args == other.args && mcpEndpoint == other.mcpEndpoint && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(identifier, providerId, providerResourceId, type, args, mcpEndpoint, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolGroup{identifier=$identifier, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, args=$args, mcpEndpoint=$mcpEndpoint, additionalProperties=$additionalProperties}"
}
