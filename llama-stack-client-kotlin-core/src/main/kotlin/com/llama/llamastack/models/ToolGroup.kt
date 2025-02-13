// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
    @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
    @JsonProperty("args") @ExcludeMissing private val args: JsonField<Args> = JsonMissing.of(),
    @JsonProperty("mcp_endpoint")
    @ExcludeMissing
    private val mcpEndpoint: JsonField<McpEndpoint> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun identifier(): String = identifier.getRequired("identifier")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    fun args(): Args? = args.getNullable("args")

    fun mcpEndpoint(): McpEndpoint? = mcpEndpoint.getNullable("mcp_endpoint")

    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

    @JsonProperty("mcp_endpoint")
    @ExcludeMissing
    fun _mcpEndpoint(): JsonField<McpEndpoint> = mcpEndpoint

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
        _type().let {
            if (it != JsonValue.from("tool_group")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        args()?.validate()
        mcpEndpoint()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ToolGroup]. */
    class Builder internal constructor() {

        private var identifier: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("tool_group")
        private var args: JsonField<Args> = JsonMissing.of()
        private var mcpEndpoint: JsonField<McpEndpoint> = JsonMissing.of()
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

        fun type(type: JsonValue) = apply { this.type = type }

        fun args(args: Args) = args(JsonField.of(args))

        fun args(args: JsonField<Args>) = apply { this.args = args }

        fun mcpEndpoint(mcpEndpoint: McpEndpoint) = mcpEndpoint(JsonField.of(mcpEndpoint))

        fun mcpEndpoint(mcpEndpoint: JsonField<McpEndpoint>) = apply {
            this.mcpEndpoint = mcpEndpoint
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

        fun build(): ToolGroup =
            ToolGroup(
                checkRequired("identifier", identifier),
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
                type,
                args,
                mcpEndpoint,
                additionalProperties.toImmutable(),
            )
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

        /** A builder for [Args]. */
        class Builder internal constructor() {

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

    @NoAutoDetect
    class McpEndpoint
    @JsonCreator
    private constructor(
        @JsonProperty("uri") @ExcludeMissing private val uri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun uri(): String = uri.getRequired("uri")

        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): McpEndpoint = apply {
            if (validated) {
                return@apply
            }

            uri()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [McpEndpoint]. */
        class Builder internal constructor() {

            private var uri: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(mcpEndpoint: McpEndpoint) = apply {
                uri = mcpEndpoint.uri
                additionalProperties = mcpEndpoint.additionalProperties.toMutableMap()
            }

            fun uri(uri: String) = uri(JsonField.of(uri))

            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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

            fun build(): McpEndpoint =
                McpEndpoint(checkRequired("uri", uri), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is McpEndpoint && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(uri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "McpEndpoint{uri=$uri, additionalProperties=$additionalProperties}"
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
