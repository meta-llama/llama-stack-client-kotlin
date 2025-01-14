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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

/** Register a tool group */
class ToolgroupRegisterParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: ToolgroupRegisterBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun providerId(): String = body.providerId()

    fun toolgroupId(): String = body.toolgroupId()

    fun args(): Args? = body.args()

    fun mcpEndpoint(): Url? = body.mcpEndpoint()

    fun _providerId(): JsonField<String> = body._providerId()

    fun _toolgroupId(): JsonField<String> = body._toolgroupId()

    fun _args(): JsonField<Args> = body._args()

    fun _mcpEndpoint(): JsonField<Url> = body._mcpEndpoint()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): ToolgroupRegisterBody = body

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
    class ToolgroupRegisterBody
    @JsonCreator
    internal constructor(
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toolgroup_id")
        @ExcludeMissing
        private val toolgroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("args") @ExcludeMissing private val args: JsonField<Args> = JsonMissing.of(),
        @JsonProperty("mcp_endpoint")
        @ExcludeMissing
        private val mcpEndpoint: JsonField<Url> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun providerId(): String = providerId.getRequired("provider_id")

        fun toolgroupId(): String = toolgroupId.getRequired("toolgroup_id")

        fun args(): Args? = args.getNullable("args")

        fun mcpEndpoint(): Url? = mcpEndpoint.getNullable("mcp_endpoint")

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("toolgroup_id")
        @ExcludeMissing
        fun _toolgroupId(): JsonField<String> = toolgroupId

        @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

        @JsonProperty("mcp_endpoint")
        @ExcludeMissing
        fun _mcpEndpoint(): JsonField<Url> = mcpEndpoint

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ToolgroupRegisterBody = apply {
            if (validated) {
                return@apply
            }

            providerId()
            toolgroupId()
            args()?.validate()
            mcpEndpoint()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var providerId: JsonField<String>? = null
            private var toolgroupId: JsonField<String>? = null
            private var args: JsonField<Args> = JsonMissing.of()
            private var mcpEndpoint: JsonField<Url> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolgroupRegisterBody: ToolgroupRegisterBody) = apply {
                providerId = toolgroupRegisterBody.providerId
                toolgroupId = toolgroupRegisterBody.toolgroupId
                args = toolgroupRegisterBody.args
                mcpEndpoint = toolgroupRegisterBody.mcpEndpoint
                additionalProperties = toolgroupRegisterBody.additionalProperties.toMutableMap()
            }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun toolgroupId(toolgroupId: String) = toolgroupId(JsonField.of(toolgroupId))

            fun toolgroupId(toolgroupId: JsonField<String>) = apply {
                this.toolgroupId = toolgroupId
            }

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

            fun build(): ToolgroupRegisterBody =
                ToolgroupRegisterBody(
                    checkNotNull(providerId) { "`providerId` is required but was not set" },
                    checkNotNull(toolgroupId) { "`toolgroupId` is required but was not set" },
                    args,
                    mcpEndpoint,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolgroupRegisterBody && providerId == other.providerId && toolgroupId == other.toolgroupId && args == other.args && mcpEndpoint == other.mcpEndpoint && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(providerId, toolgroupId, args, mcpEndpoint, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolgroupRegisterBody{providerId=$providerId, toolgroupId=$toolgroupId, args=$args, mcpEndpoint=$mcpEndpoint, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: ToolgroupRegisterBody.Builder = ToolgroupRegisterBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(toolgroupRegisterParams: ToolgroupRegisterParams) = apply {
            xLlamaStackClientVersion = toolgroupRegisterParams.xLlamaStackClientVersion
            xLlamaStackProviderData = toolgroupRegisterParams.xLlamaStackProviderData
            body = toolgroupRegisterParams.body.toBuilder()
            additionalHeaders = toolgroupRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolgroupRegisterParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun toolgroupId(toolgroupId: String) = apply { body.toolgroupId(toolgroupId) }

        fun toolgroupId(toolgroupId: JsonField<String>) = apply { body.toolgroupId(toolgroupId) }

        fun args(args: Args) = apply { body.args(args) }

        fun args(args: JsonField<Args>) = apply { body.args(args) }

        fun mcpEndpoint(mcpEndpoint: Url) = apply { body.mcpEndpoint(mcpEndpoint) }

        fun mcpEndpoint(mcpEndpoint: JsonField<Url>) = apply { body.mcpEndpoint(mcpEndpoint) }

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

        fun build(): ToolgroupRegisterParams =
            ToolgroupRegisterParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is ToolgroupRegisterParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ToolgroupRegisterParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
