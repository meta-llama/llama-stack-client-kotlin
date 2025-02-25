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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** Generate embeddings for content pieces using the specified model. */
class InferenceEmbeddingsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of contents to generate embeddings for. Each content can be a string or an
     * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model and
     * provider. Some models may only support text.
     */
    fun contents(): Contents = body.contents()

    /**
     * The identifier of the model to use. The model must be an embedding model registered with
     * Llama Stack and available via the /models endpoint.
     */
    fun modelId(): String = body.modelId()

    /** (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka models. */
    fun outputDimension(): Long? = body.outputDimension()

    /**
     * (Optional) How is the embedding being used? This is only supported by asymmetric embedding
     * models.
     */
    fun taskType(): TaskType? = body.taskType()

    /**
     * (Optional) Config for how to truncate text for embedding when text is longer than the model's
     * max sequence length.
     */
    fun textTruncation(): TextTruncation? = body.textTruncation()

    /**
     * List of contents to generate embeddings for. Each content can be a string or an
     * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model and
     * provider. Some models may only support text.
     */
    fun _contents(): JsonField<Contents> = body._contents()

    /**
     * The identifier of the model to use. The model must be an embedding model registered with
     * Llama Stack and available via the /models endpoint.
     */
    fun _modelId(): JsonField<String> = body._modelId()

    /** (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka models. */
    fun _outputDimension(): JsonField<Long> = body._outputDimension()

    /**
     * (Optional) How is the embedding being used? This is only supported by asymmetric embedding
     * models.
     */
    fun _taskType(): JsonField<TaskType> = body._taskType()

    /**
     * (Optional) Config for how to truncate text for embedding when text is longer than the model's
     * max sequence length.
     */
    fun _textTruncation(): JsonField<TextTruncation> = body._textTruncation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("contents")
        @ExcludeMissing
        private val contents: JsonField<Contents> = JsonMissing.of(),
        @JsonProperty("model_id")
        @ExcludeMissing
        private val modelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output_dimension")
        @ExcludeMissing
        private val outputDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("task_type")
        @ExcludeMissing
        private val taskType: JsonField<TaskType> = JsonMissing.of(),
        @JsonProperty("text_truncation")
        @ExcludeMissing
        private val textTruncation: JsonField<TextTruncation> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of contents to generate embeddings for. Each content can be a string or an
         * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model
         * and provider. Some models may only support text.
         */
        fun contents(): Contents = contents.getRequired("contents")

        /**
         * The identifier of the model to use. The model must be an embedding model registered with
         * Llama Stack and available via the /models endpoint.
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /**
         * (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka models.
         */
        fun outputDimension(): Long? = outputDimension.getNullable("output_dimension")

        /**
         * (Optional) How is the embedding being used? This is only supported by asymmetric
         * embedding models.
         */
        fun taskType(): TaskType? = taskType.getNullable("task_type")

        /**
         * (Optional) Config for how to truncate text for embedding when text is longer than the
         * model's max sequence length.
         */
        fun textTruncation(): TextTruncation? = textTruncation.getNullable("text_truncation")

        /**
         * List of contents to generate embeddings for. Each content can be a string or an
         * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model
         * and provider. Some models may only support text.
         */
        @JsonProperty("contents") @ExcludeMissing fun _contents(): JsonField<Contents> = contents

        /**
         * The identifier of the model to use. The model must be an embedding model registered with
         * Llama Stack and available via the /models endpoint.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        /**
         * (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka models.
         */
        @JsonProperty("output_dimension")
        @ExcludeMissing
        fun _outputDimension(): JsonField<Long> = outputDimension

        /**
         * (Optional) How is the embedding being used? This is only supported by asymmetric
         * embedding models.
         */
        @JsonProperty("task_type") @ExcludeMissing fun _taskType(): JsonField<TaskType> = taskType

        /**
         * (Optional) Config for how to truncate text for embedding when text is longer than the
         * model's max sequence length.
         */
        @JsonProperty("text_truncation")
        @ExcludeMissing
        fun _textTruncation(): JsonField<TextTruncation> = textTruncation

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contents().validate()
            modelId()
            outputDimension()
            taskType()
            textTruncation()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contents: JsonField<Contents>? = null
            private var modelId: JsonField<String>? = null
            private var outputDimension: JsonField<Long> = JsonMissing.of()
            private var taskType: JsonField<TaskType> = JsonMissing.of()
            private var textTruncation: JsonField<TextTruncation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                contents = body.contents
                modelId = body.modelId
                outputDimension = body.outputDimension
                taskType = body.taskType
                textTruncation = body.textTruncation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * List of contents to generate embeddings for. Each content can be a string or an
             * InterleavedContentItem (and hence can be multimodal). The behavior depends on the
             * model and provider. Some models may only support text.
             */
            fun contents(contents: Contents) = contents(JsonField.of(contents))

            /**
             * List of contents to generate embeddings for. Each content can be a string or an
             * InterleavedContentItem (and hence can be multimodal). The behavior depends on the
             * model and provider. Some models may only support text.
             */
            fun contents(contents: JsonField<Contents>) = apply { this.contents = contents }

            /**
             * List of contents to generate embeddings for. Each content can be a string or an
             * InterleavedContentItem (and hence can be multimodal). The behavior depends on the
             * model and provider. Some models may only support text.
             */
            fun contentsOfStrings(strings: List<String>) = contents(Contents.ofStrings(strings))

            /**
             * List of contents to generate embeddings for. Each content can be a string or an
             * InterleavedContentItem (and hence can be multimodal). The behavior depends on the
             * model and provider. Some models may only support text.
             */
            fun contentsOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = contents(Contents.ofInterleavedContentItems(interleavedContentItems))

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

            /**
             * (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka
             * models.
             */
            fun outputDimension(outputDimension: Long) =
                outputDimension(JsonField.of(outputDimension))

            /**
             * (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka
             * models.
             */
            fun outputDimension(outputDimension: JsonField<Long>) = apply {
                this.outputDimension = outputDimension
            }

            /**
             * (Optional) How is the embedding being used? This is only supported by asymmetric
             * embedding models.
             */
            fun taskType(taskType: TaskType) = taskType(JsonField.of(taskType))

            /**
             * (Optional) How is the embedding being used? This is only supported by asymmetric
             * embedding models.
             */
            fun taskType(taskType: JsonField<TaskType>) = apply { this.taskType = taskType }

            /**
             * (Optional) Config for how to truncate text for embedding when text is longer than the
             * model's max sequence length.
             */
            fun textTruncation(textTruncation: TextTruncation) =
                textTruncation(JsonField.of(textTruncation))

            /**
             * (Optional) Config for how to truncate text for embedding when text is longer than the
             * model's max sequence length.
             */
            fun textTruncation(textTruncation: JsonField<TextTruncation>) = apply {
                this.textTruncation = textTruncation
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

            fun build(): Body =
                Body(
                    checkRequired("contents", contents),
                    checkRequired("modelId", modelId),
                    outputDimension,
                    taskType,
                    textTruncation,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && contents == other.contents && modelId == other.modelId && outputDimension == other.outputDimension && taskType == other.taskType && textTruncation == other.textTruncation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contents, modelId, outputDimension, taskType, textTruncation, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contents=$contents, modelId=$modelId, outputDimension=$outputDimension, taskType=$taskType, textTruncation=$textTruncation, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inferenceEmbeddingsParams: InferenceEmbeddingsParams) = apply {
            body = inferenceEmbeddingsParams.body.toBuilder()
            additionalHeaders = inferenceEmbeddingsParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferenceEmbeddingsParams.additionalQueryParams.toBuilder()
        }

        /**
         * List of contents to generate embeddings for. Each content can be a string or an
         * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model
         * and provider. Some models may only support text.
         */
        fun contents(contents: Contents) = apply { body.contents(contents) }

        /**
         * List of contents to generate embeddings for. Each content can be a string or an
         * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model
         * and provider. Some models may only support text.
         */
        fun contents(contents: JsonField<Contents>) = apply { body.contents(contents) }

        /**
         * List of contents to generate embeddings for. Each content can be a string or an
         * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model
         * and provider. Some models may only support text.
         */
        fun contentsOfStrings(strings: List<String>) = apply { body.contentsOfStrings(strings) }

        /**
         * List of contents to generate embeddings for. Each content can be a string or an
         * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model
         * and provider. Some models may only support text.
         */
        fun contentsOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = apply { body.contentsOfInterleavedContentItems(interleavedContentItems) }

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

        /**
         * (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka models.
         */
        fun outputDimension(outputDimension: Long) = apply { body.outputDimension(outputDimension) }

        /**
         * (Optional) Output dimensionality for the embeddings. Only supported by Matryoshka models.
         */
        fun outputDimension(outputDimension: JsonField<Long>) = apply {
            body.outputDimension(outputDimension)
        }

        /**
         * (Optional) How is the embedding being used? This is only supported by asymmetric
         * embedding models.
         */
        fun taskType(taskType: TaskType) = apply { body.taskType(taskType) }

        /**
         * (Optional) How is the embedding being used? This is only supported by asymmetric
         * embedding models.
         */
        fun taskType(taskType: JsonField<TaskType>) = apply { body.taskType(taskType) }

        /**
         * (Optional) Config for how to truncate text for embedding when text is longer than the
         * model's max sequence length.
         */
        fun textTruncation(textTruncation: TextTruncation) = apply {
            body.textTruncation(textTruncation)
        }

        /**
         * (Optional) Config for how to truncate text for embedding when text is longer than the
         * model's max sequence length.
         */
        fun textTruncation(textTruncation: JsonField<TextTruncation>) = apply {
            body.textTruncation(textTruncation)
        }

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

    /**
     * List of contents to generate embeddings for. Each content can be a string or an
     * InterleavedContentItem (and hence can be multimodal). The behavior depends on the model and
     * provider. Some models may only support text.
     */
    @JsonDeserialize(using = Contents.Deserializer::class)
    @JsonSerialize(using = Contents.Serializer::class)
    class Contents
    private constructor(
        private val strings: List<String>? = null,
        private val interleavedContentItems: List<InterleavedContentItem>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun strings(): List<String>? = strings

        fun interleavedContentItems(): List<InterleavedContentItem>? = interleavedContentItems

        fun isStrings(): Boolean = strings != null

        fun isInterleavedContentItems(): Boolean = interleavedContentItems != null

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asInterleavedContentItems(): List<InterleavedContentItem> =
            interleavedContentItems.getOrThrow("interleavedContentItems")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                strings != null -> visitor.visitStrings(strings)
                interleavedContentItems != null ->
                    visitor.visitInterleavedContentItems(interleavedContentItems)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Contents = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitStrings(strings: List<String>) {}

                    override fun visitInterleavedContentItems(
                        interleavedContentItems: List<InterleavedContentItem>
                    ) {
                        interleavedContentItems.forEach { it.validate() }
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Contents && strings == other.strings && interleavedContentItems == other.interleavedContentItems /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(strings, interleavedContentItems) /* spotless:on */

        override fun toString(): String =
            when {
                strings != null -> "Contents{strings=$strings}"
                interleavedContentItems != null ->
                    "Contents{interleavedContentItems=$interleavedContentItems}"
                _json != null -> "Contents{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Contents")
            }

        companion object {

            fun ofStrings(strings: List<String>) = Contents(strings = strings)

            fun ofInterleavedContentItems(interleavedContentItems: List<InterleavedContentItem>) =
                Contents(interleavedContentItems = interleavedContentItems)
        }

        /**
         * An interface that defines how to map each variant of [Contents] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitStrings(strings: List<String>): T

            fun visitInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ): T

            /**
             * Maps an unknown variant of [Contents] to a value of type [T].
             *
             * An instance of [Contents] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Contents: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Contents>(Contents::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Contents {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Contents(strings = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<InterleavedContentItem>>()) {
                        it.forEach { it.validate() }
                    }
                    ?.let {
                        return Contents(interleavedContentItems = it, _json = json)
                    }

                return Contents(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Contents>(Contents::class) {

            override fun serialize(
                value: Contents,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.strings != null -> generator.writeObject(value.strings)
                    value.interleavedContentItems != null ->
                        generator.writeObject(value.interleavedContentItems)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Contents")
                }
            }
        }
    }

    /**
     * (Optional) How is the embedding being used? This is only supported by asymmetric embedding
     * models.
     */
    class TaskType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val QUERY = of("query")

            val DOCUMENT = of("document")

            fun of(value: String) = TaskType(JsonField.of(value))
        }

        /** An enum containing [TaskType]'s known values. */
        enum class Known {
            QUERY,
            DOCUMENT,
        }

        /**
         * An enum containing [TaskType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaskType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUERY,
            DOCUMENT,
            /** An enum member indicating that [TaskType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                QUERY -> Value.QUERY
                DOCUMENT -> Value.DOCUMENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                QUERY -> Known.QUERY
                DOCUMENT -> Known.DOCUMENT
                else -> throw LlamaStackClientInvalidDataException("Unknown TaskType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaskType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * (Optional) Config for how to truncate text for embedding when text is longer than the model's
     * max sequence length.
     */
    class TextTruncation @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val NONE = of("none")

            val START = of("start")

            val END = of("end")

            fun of(value: String) = TextTruncation(JsonField.of(value))
        }

        /** An enum containing [TextTruncation]'s known values. */
        enum class Known {
            NONE,
            START,
            END,
        }

        /**
         * An enum containing [TextTruncation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TextTruncation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            START,
            END,
            /**
             * An enum member indicating that [TextTruncation] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NONE -> Value.NONE
                START -> Value.START
                END -> Value.END
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                NONE -> Known.NONE
                START -> Known.START
                END -> Known.END
                else -> throw LlamaStackClientInvalidDataException("Unknown TextTruncation: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TextTruncation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
