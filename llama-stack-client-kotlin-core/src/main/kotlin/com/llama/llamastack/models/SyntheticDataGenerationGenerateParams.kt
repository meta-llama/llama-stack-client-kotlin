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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class SyntheticDataGenerationGenerateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dialogs(): List<Message> = body.dialogs()

    /**
     * The type of filtering function.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filteringFunction(): FilteringFunction = body.filteringFunction()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun model(): String? = body.model()

    /**
     * Returns the raw JSON value of [dialogs].
     *
     * Unlike [dialogs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dialogs(): JsonField<List<Message>> = body._dialogs()

    /**
     * Returns the raw JSON value of [filteringFunction].
     *
     * Unlike [filteringFunction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _filteringFunction(): JsonField<FilteringFunction> = body._filteringFunction()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

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
        @JsonProperty("dialogs")
        @ExcludeMissing
        private val dialogs: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("filtering_function")
        @ExcludeMissing
        private val filteringFunction: JsonField<FilteringFunction> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dialogs(): List<Message> = dialogs.getRequired("dialogs")

        /**
         * The type of filtering function.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun filteringFunction(): FilteringFunction =
            filteringFunction.getRequired("filtering_function")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun model(): String? = model.getNullable("model")

        /**
         * Returns the raw JSON value of [dialogs].
         *
         * Unlike [dialogs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dialogs") @ExcludeMissing fun _dialogs(): JsonField<List<Message>> = dialogs

        /**
         * Returns the raw JSON value of [filteringFunction].
         *
         * Unlike [filteringFunction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filtering_function")
        @ExcludeMissing
        fun _filteringFunction(): JsonField<FilteringFunction> = filteringFunction

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .dialogs()
             * .filteringFunction()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dialogs: JsonField<MutableList<Message>>? = null
            private var filteringFunction: JsonField<FilteringFunction>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                dialogs = body.dialogs.map { it.toMutableList() }
                filteringFunction = body.filteringFunction
                model = body.model
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun dialogs(dialogs: List<Message>) = dialogs(JsonField.of(dialogs))

            /**
             * Sets [Builder.dialogs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dialogs] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dialogs(dialogs: JsonField<List<Message>>) = apply {
                this.dialogs = dialogs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [dialogs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDialog(dialog: Message) = apply {
                dialogs =
                    (dialogs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dialogs", it).add(dialog)
                    }
            }

            /** Alias for calling [addDialog] with `Message.ofUser(user)`. */
            fun addDialog(user: UserMessage) = addDialog(Message.ofUser(user))

            /**
             * Alias for calling [addDialog] with the following:
             * ```kotlin
             * UserMessage.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserDialog(content: InterleavedContent) =
                addDialog(UserMessage.builder().content(content).build())

            /** Alias for calling [addUserDialog] with `InterleavedContent.ofString(string)`. */
            fun addUserDialog(string: String) = addUserDialog(InterleavedContent.ofString(string))

            /**
             * Alias for calling [addUserDialog] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun addUserDialog(imageContentItem: InterleavedContent.ImageContentItem) =
                addUserDialog(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [addUserDialog] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun addUserDialog(textContentItem: InterleavedContent.TextContentItem) =
                addUserDialog(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [addUserDialog] with `InterleavedContent.ofItems(items)`. */
            fun addUserDialogOfItems(items: List<InterleavedContentItem>) =
                addUserDialog(InterleavedContent.ofItems(items))

            /** Alias for calling [addDialog] with `Message.ofSystem(system)`. */
            fun addDialog(system: SystemMessage) = addDialog(Message.ofSystem(system))

            /**
             * Alias for calling [addDialog] with the following:
             * ```kotlin
             * SystemMessage.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemDialog(content: InterleavedContent) =
                addDialog(SystemMessage.builder().content(content).build())

            /** Alias for calling [addSystemDialog] with `InterleavedContent.ofString(string)`. */
            fun addSystemDialog(string: String) =
                addSystemDialog(InterleavedContent.ofString(string))

            /**
             * Alias for calling [addSystemDialog] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun addSystemDialog(imageContentItem: InterleavedContent.ImageContentItem) =
                addSystemDialog(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [addSystemDialog] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun addSystemDialog(textContentItem: InterleavedContent.TextContentItem) =
                addSystemDialog(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [addSystemDialog] with `InterleavedContent.ofItems(items)`. */
            fun addSystemDialogOfItems(items: List<InterleavedContentItem>) =
                addSystemDialog(InterleavedContent.ofItems(items))

            /** Alias for calling [addDialog] with `Message.ofToolResponse(toolResponse)`. */
            fun addDialog(toolResponse: ToolResponseMessage) =
                addDialog(Message.ofToolResponse(toolResponse))

            /** Alias for calling [addDialog] with `Message.ofCompletion(completion)`. */
            fun addDialog(completion: CompletionMessage) =
                addDialog(Message.ofCompletion(completion))

            /** The type of filtering function. */
            fun filteringFunction(filteringFunction: FilteringFunction) =
                filteringFunction(JsonField.of(filteringFunction))

            /**
             * Sets [Builder.filteringFunction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filteringFunction] with a well-typed
             * [FilteringFunction] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun filteringFunction(filteringFunction: JsonField<FilteringFunction>) = apply {
                this.filteringFunction = filteringFunction
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            fun build(): Body =
                Body(
                    checkRequired("dialogs", dialogs).map { it.toImmutable() },
                    checkRequired("filteringFunction", filteringFunction),
                    model,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && dialogs == other.dialogs && filteringFunction == other.filteringFunction && model == other.model && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dialogs, filteringFunction, model, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dialogs=$dialogs, filteringFunction=$filteringFunction, model=$model, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SyntheticDataGenerationGenerateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .dialogs()
         * .filteringFunction()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SyntheticDataGenerationGenerateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            syntheticDataGenerationGenerateParams: SyntheticDataGenerationGenerateParams
        ) = apply {
            body = syntheticDataGenerationGenerateParams.body.toBuilder()
            additionalHeaders = syntheticDataGenerationGenerateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                syntheticDataGenerationGenerateParams.additionalQueryParams.toBuilder()
        }

        fun dialogs(dialogs: List<Message>) = apply { body.dialogs(dialogs) }

        /**
         * Sets [Builder.dialogs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dialogs] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dialogs(dialogs: JsonField<List<Message>>) = apply { body.dialogs(dialogs) }

        /**
         * Adds a single [Message] to [dialogs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDialog(dialog: Message) = apply { body.addDialog(dialog) }

        /** Alias for calling [addDialog] with `Message.ofUser(user)`. */
        fun addDialog(user: UserMessage) = apply { body.addDialog(user) }

        /**
         * Alias for calling [addDialog] with the following:
         * ```kotlin
         * UserMessage.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserDialog(content: InterleavedContent) = apply { body.addUserDialog(content) }

        /** Alias for calling [addUserDialog] with `InterleavedContent.ofString(string)`. */
        fun addUserDialog(string: String) = apply { body.addUserDialog(string) }

        /**
         * Alias for calling [addUserDialog] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun addUserDialog(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addUserDialog(imageContentItem)
        }

        /**
         * Alias for calling [addUserDialog] with
         * `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun addUserDialog(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addUserDialog(textContentItem)
        }

        /** Alias for calling [addUserDialog] with `InterleavedContent.ofItems(items)`. */
        fun addUserDialogOfItems(items: List<InterleavedContentItem>) = apply {
            body.addUserDialogOfItems(items)
        }

        /** Alias for calling [addDialog] with `Message.ofSystem(system)`. */
        fun addDialog(system: SystemMessage) = apply { body.addDialog(system) }

        /**
         * Alias for calling [addDialog] with the following:
         * ```kotlin
         * SystemMessage.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemDialog(content: InterleavedContent) = apply { body.addSystemDialog(content) }

        /** Alias for calling [addSystemDialog] with `InterleavedContent.ofString(string)`. */
        fun addSystemDialog(string: String) = apply { body.addSystemDialog(string) }

        /**
         * Alias for calling [addSystemDialog] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun addSystemDialog(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addSystemDialog(imageContentItem)
        }

        /**
         * Alias for calling [addSystemDialog] with
         * `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun addSystemDialog(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addSystemDialog(textContentItem)
        }

        /** Alias for calling [addSystemDialog] with `InterleavedContent.ofItems(items)`. */
        fun addSystemDialogOfItems(items: List<InterleavedContentItem>) = apply {
            body.addSystemDialogOfItems(items)
        }

        /** Alias for calling [addDialog] with `Message.ofToolResponse(toolResponse)`. */
        fun addDialog(toolResponse: ToolResponseMessage) = apply { body.addDialog(toolResponse) }

        /** Alias for calling [addDialog] with `Message.ofCompletion(completion)`. */
        fun addDialog(completion: CompletionMessage) = apply { body.addDialog(completion) }

        /** The type of filtering function. */
        fun filteringFunction(filteringFunction: FilteringFunction) = apply {
            body.filteringFunction(filteringFunction)
        }

        /**
         * Sets [Builder.filteringFunction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filteringFunction] with a well-typed [FilteringFunction]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filteringFunction(filteringFunction: JsonField<FilteringFunction>) = apply {
            body.filteringFunction(filteringFunction)
        }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of filtering function. */
    class FilteringFunction @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val RANDOM = of("random")

            val TOP_K = of("top_k")

            val TOP_P = of("top_p")

            val TOP_K_TOP_P = of("top_k_top_p")

            val SIGMOID = of("sigmoid")

            fun of(value: String) = FilteringFunction(JsonField.of(value))
        }

        /** An enum containing [FilteringFunction]'s known values. */
        enum class Known {
            NONE,
            RANDOM,
            TOP_K,
            TOP_P,
            TOP_K_TOP_P,
            SIGMOID,
        }

        /**
         * An enum containing [FilteringFunction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilteringFunction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            RANDOM,
            TOP_K,
            TOP_P,
            TOP_K_TOP_P,
            SIGMOID,
            /**
             * An enum member indicating that [FilteringFunction] was instantiated with an unknown
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
                RANDOM -> Value.RANDOM
                TOP_K -> Value.TOP_K
                TOP_P -> Value.TOP_P
                TOP_K_TOP_P -> Value.TOP_K_TOP_P
                SIGMOID -> Value.SIGMOID
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
                RANDOM -> Known.RANDOM
                TOP_K -> Known.TOP_K
                TOP_P -> Known.TOP_P
                TOP_K_TOP_P -> Known.TOP_K_TOP_P
                SIGMOID -> Known.SIGMOID
                else ->
                    throw LlamaStackClientInvalidDataException("Unknown FilteringFunction: $value")
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

            return /* spotless:off */ other is FilteringFunction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SyntheticDataGenerationGenerateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SyntheticDataGenerationGenerateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
