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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

/** Generate embeddings for content pieces using the specified model. */
class InferenceEmbeddingsParams
private constructor(
    private val body: InferenceEmbeddingsBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of contents to generate embeddings for. Note that content can be multimodal. The
     * behavior depends on the model and provider. Some models may only support text.
     */
    fun contents(): List<InterleavedContent> = body.contents()

    /**
     * The identifier of the model to use. The model must be an embedding model registered with
     * Llama Stack and available via the /models endpoint.
     */
    fun modelId(): String = body.modelId()

    /**
     * List of contents to generate embeddings for. Note that content can be multimodal. The
     * behavior depends on the model and provider. Some models may only support text.
     */
    fun _contents(): JsonField<List<InterleavedContent>> = body._contents()

    /**
     * The identifier of the model to use. The model must be an embedding model registered with
     * Llama Stack and available via the /models endpoint.
     */
    fun _modelId(): JsonField<String> = body._modelId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): InferenceEmbeddingsBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InferenceEmbeddingsBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contents")
        @ExcludeMissing
        private val contents: JsonField<List<InterleavedContent>> = JsonMissing.of(),
        @JsonProperty("model_id")
        @ExcludeMissing
        private val modelId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        fun contents(): List<InterleavedContent> = contents.getRequired("contents")

        /**
         * The identifier of the model to use. The model must be an embedding model registered with
         * Llama Stack and available via the /models endpoint.
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        @JsonProperty("contents")
        @ExcludeMissing
        fun _contents(): JsonField<List<InterleavedContent>> = contents

        /**
         * The identifier of the model to use. The model must be an embedding model registered with
         * Llama Stack and available via the /models endpoint.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InferenceEmbeddingsBody = apply {
            if (validated) {
                return@apply
            }

            contents().forEach { it.validate() }
            modelId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InferenceEmbeddingsBody]. */
        class Builder internal constructor() {

            private var contents: JsonField<MutableList<InterleavedContent>>? = null
            private var modelId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inferenceEmbeddingsBody: InferenceEmbeddingsBody) = apply {
                contents = inferenceEmbeddingsBody.contents.map { it.toMutableList() }
                modelId = inferenceEmbeddingsBody.modelId
                additionalProperties = inferenceEmbeddingsBody.additionalProperties.toMutableMap()
            }

            /**
             * List of contents to generate embeddings for. Note that content can be multimodal. The
             * behavior depends on the model and provider. Some models may only support text.
             */
            fun contents(contents: List<InterleavedContent>) = contents(JsonField.of(contents))

            /**
             * List of contents to generate embeddings for. Note that content can be multimodal. The
             * behavior depends on the model and provider. Some models may only support text.
             */
            fun contents(contents: JsonField<List<InterleavedContent>>) = apply {
                this.contents = contents.map { it.toMutableList() }
            }

            /**
             * List of contents to generate embeddings for. Note that content can be multimodal. The
             * behavior depends on the model and provider. Some models may only support text.
             */
            fun addContent(content: InterleavedContent) = apply {
                contents =
                    (contents ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(content)
                    }
            }

            /**
             * List of contents to generate embeddings for. Note that content can be multimodal. The
             * behavior depends on the model and provider. Some models may only support text.
             */
            fun addContent(string: String) = addContent(InterleavedContent.ofString(string))

            /** A image content item */
            fun addContent(imageContentItem: InterleavedContent.ImageContentItem) =
                addContent(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun addContent(textContentItem: InterleavedContent.TextContentItem) =
                addContent(InterleavedContent.ofTextContentItem(textContentItem))

            /**
             * List of contents to generate embeddings for. Note that content can be multimodal. The
             * behavior depends on the model and provider. Some models may only support text.
             */
            fun addContentOfItems(items: List<InterleavedContentItem>) =
                addContent(InterleavedContent.ofItems(items))

            /**
             * The identifier of the model to use. The model must be an embedding model registered
             * with Llama Stack and available via the /models endpoint.
             */
            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * The identifier of the model to use. The model must be an embedding model registered
             * with Llama Stack and available via the /models endpoint.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

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

            fun build(): InferenceEmbeddingsBody =
                InferenceEmbeddingsBody(
                    checkRequired("contents", contents).map { it.toImmutable() },
                    checkRequired("modelId", modelId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferenceEmbeddingsBody && contents == other.contents && modelId == other.modelId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contents, modelId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InferenceEmbeddingsBody{contents=$contents, modelId=$modelId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: InferenceEmbeddingsBody.Builder = InferenceEmbeddingsBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inferenceEmbeddingsParams: InferenceEmbeddingsParams) = apply {
            body = inferenceEmbeddingsParams.body.toBuilder()
            additionalHeaders = inferenceEmbeddingsParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferenceEmbeddingsParams.additionalQueryParams.toBuilder()
        }

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        fun contents(contents: List<InterleavedContent>) = apply { body.contents(contents) }

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        fun contents(contents: JsonField<List<InterleavedContent>>) = apply {
            body.contents(contents)
        }

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        fun addContent(content: InterleavedContent) = apply { body.addContent(content) }

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        fun addContent(string: String) = apply { body.addContent(string) }

        /** A image content item */
        fun addContent(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addContent(imageContentItem)
        }

        /** A text content item */
        fun addContent(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addContent(textContentItem)
        }

        /**
         * List of contents to generate embeddings for. Note that content can be multimodal. The
         * behavior depends on the model and provider. Some models may only support text.
         */
        fun addContentOfItems(items: List<InterleavedContentItem>) = apply {
            body.addContentOfItems(items)
        }

        /**
         * The identifier of the model to use. The model must be an embedding model registered with
         * Llama Stack and available via the /models endpoint.
         */
        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        /**
         * The identifier of the model to use. The model must be an embedding model registered with
         * Llama Stack and available via the /models endpoint.
         */
        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

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

        fun build(): InferenceEmbeddingsParams =
            InferenceEmbeddingsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceEmbeddingsParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferenceEmbeddingsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
