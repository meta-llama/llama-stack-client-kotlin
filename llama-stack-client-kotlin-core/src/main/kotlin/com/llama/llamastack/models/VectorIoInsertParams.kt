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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class VectorIoInsertParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: VectorIoInsertBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun chunks(): List<Chunk> = body.chunks()

    fun vectorDbId(): String = body.vectorDbId()

    fun ttlSeconds(): Long? = body.ttlSeconds()

    fun _chunks(): JsonField<List<Chunk>> = body._chunks()

    fun _vectorDbId(): JsonField<String> = body._vectorDbId()

    fun _ttlSeconds(): JsonField<Long> = body._ttlSeconds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): VectorIoInsertBody = body

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
    class VectorIoInsertBody
    @JsonCreator
    internal constructor(
        @JsonProperty("chunks")
        @ExcludeMissing
        private val chunks: JsonField<List<Chunk>> = JsonMissing.of(),
        @JsonProperty("vector_db_id")
        @ExcludeMissing
        private val vectorDbId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ttl_seconds")
        @ExcludeMissing
        private val ttlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun chunks(): List<Chunk> = chunks.getRequired("chunks")

        fun vectorDbId(): String = vectorDbId.getRequired("vector_db_id")

        fun ttlSeconds(): Long? = ttlSeconds.getNullable("ttl_seconds")

        @JsonProperty("chunks") @ExcludeMissing fun _chunks(): JsonField<List<Chunk>> = chunks

        @JsonProperty("vector_db_id")
        @ExcludeMissing
        fun _vectorDbId(): JsonField<String> = vectorDbId

        @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VectorIoInsertBody = apply {
            if (validated) {
                return@apply
            }

            chunks().forEach { it.validate() }
            vectorDbId()
            ttlSeconds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var chunks: JsonField<MutableList<Chunk>>? = null
            private var vectorDbId: JsonField<String>? = null
            private var ttlSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(vectorIoInsertBody: VectorIoInsertBody) = apply {
                chunks = vectorIoInsertBody.chunks.map { it.toMutableList() }
                vectorDbId = vectorIoInsertBody.vectorDbId
                ttlSeconds = vectorIoInsertBody.ttlSeconds
                additionalProperties = vectorIoInsertBody.additionalProperties.toMutableMap()
            }

            fun chunks(chunks: List<Chunk>) = chunks(JsonField.of(chunks))

            fun chunks(chunks: JsonField<List<Chunk>>) = apply {
                this.chunks = chunks.map { it.toMutableList() }
            }

            fun addChunk(chunk: Chunk) = apply {
                chunks =
                    (chunks ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(chunk)
                    }
            }

            fun vectorDbId(vectorDbId: String) = vectorDbId(JsonField.of(vectorDbId))

            fun vectorDbId(vectorDbId: JsonField<String>) = apply { this.vectorDbId = vectorDbId }

            fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

            fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

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

            fun build(): VectorIoInsertBody =
                VectorIoInsertBody(
                    checkRequired("chunks", chunks).map { it.toImmutable() },
                    checkRequired("vectorDbId", vectorDbId),
                    ttlSeconds,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VectorIoInsertBody && chunks == other.chunks && vectorDbId == other.vectorDbId && ttlSeconds == other.ttlSeconds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(chunks, vectorDbId, ttlSeconds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VectorIoInsertBody{chunks=$chunks, vectorDbId=$vectorDbId, ttlSeconds=$ttlSeconds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: VectorIoInsertBody.Builder = VectorIoInsertBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(vectorIoInsertParams: VectorIoInsertParams) = apply {
            xLlamaStackClientVersion = vectorIoInsertParams.xLlamaStackClientVersion
            xLlamaStackProviderData = vectorIoInsertParams.xLlamaStackProviderData
            body = vectorIoInsertParams.body.toBuilder()
            additionalHeaders = vectorIoInsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = vectorIoInsertParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun chunks(chunks: List<Chunk>) = apply { body.chunks(chunks) }

        fun chunks(chunks: JsonField<List<Chunk>>) = apply { body.chunks(chunks) }

        fun addChunk(chunk: Chunk) = apply { body.addChunk(chunk) }

        fun vectorDbId(vectorDbId: String) = apply { body.vectorDbId(vectorDbId) }

        fun vectorDbId(vectorDbId: JsonField<String>) = apply { body.vectorDbId(vectorDbId) }

        fun ttlSeconds(ttlSeconds: Long) = apply { body.ttlSeconds(ttlSeconds) }

        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { body.ttlSeconds(ttlSeconds) }

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

        fun build(): VectorIoInsertParams =
            VectorIoInsertParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Chunk
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): InterleavedContent = content.getRequired("content")

        fun metadata(): Metadata = metadata.getRequired("metadata")

        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            metadata().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<InterleavedContent>? = null
            private var metadata: JsonField<Metadata>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chunk: Chunk) = apply {
                content = chunk.content
                metadata = chunk.metadata
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            fun content(content: InterleavedContent) = content(JsonField.of(content))

            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            fun content(string: String) = content(InterleavedContent.ofString(string))

            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun build(): Chunk =
                Chunk(
                    checkRequired("content", content),
                    checkRequired("metadata", metadata),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
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

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Chunk && content == other.content && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{content=$content, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorIoInsertParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VectorIoInsertParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
