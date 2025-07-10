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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.allMaxBy
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create a new OpenAI response. */
class ResponseCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Input message(s) to create the response.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun input(): Input = body.input()

    /**
     * The underlying LLM used for completions.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun instructions(): String? = body.instructions()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxInferIters(): Long? = body.maxInferIters()

    /**
     * (Optional) if specified, the new response will be a continuation of the previous response.
     * This can be used to easily fork-off new responses from existing responses.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun previousResponseId(): String? = body.previousResponseId()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun store(): Boolean? = body.store()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun temperature(): Double? = body.temperature()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun text(): Text? = body.text()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tools(): List<Tool>? = body.tools()

    /**
     * Returns the raw JSON value of [input].
     *
     * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _input(): JsonField<Input> = body._input()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [maxInferIters].
     *
     * Unlike [maxInferIters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxInferIters(): JsonField<Long> = body._maxInferIters()

    /**
     * Returns the raw JSON value of [previousResponseId].
     *
     * Unlike [previousResponseId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _previousResponseId(): JsonField<String> = body._previousResponseId()

    /**
     * Returns the raw JSON value of [store].
     *
     * Unlike [store], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _store(): JsonField<Boolean> = body._store()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<Text> = body._text()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<Tool>> = body._tools()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResponseCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .input()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ResponseCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(responseCreateParams: ResponseCreateParams) = apply {
            body = responseCreateParams.body.toBuilder()
            additionalHeaders = responseCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = responseCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [input]
         * - [model]
         * - [instructions]
         * - [maxInferIters]
         * - [previousResponseId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Input message(s) to create the response. */
        fun input(input: Input) = apply { body.input(input) }

        /**
         * Sets [Builder.input] to an arbitrary JSON value.
         *
         * You should usually call [Builder.input] with a well-typed [Input] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun input(input: JsonField<Input>) = apply { body.input(input) }

        /** Alias for calling [input] with `Input.ofString(string)`. */
        fun input(string: String) = apply { body.input(string) }

        /** Alias for calling [input] with `Input.ofOpenAIResponseInputs(openaiResponseInputs)`. */
        fun inputOfOpenAIResponseInputs(openaiResponseInputs: List<Input.OpenAIResponseInput>) =
            apply {
                body.inputOfOpenAIResponseInputs(openaiResponseInputs)
            }

        /** The underlying LLM used for completions. */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        fun maxInferIters(maxInferIters: Long) = apply { body.maxInferIters(maxInferIters) }

        /**
         * Sets [Builder.maxInferIters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxInferIters] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxInferIters(maxInferIters: JsonField<Long>) = apply {
            body.maxInferIters(maxInferIters)
        }

        /**
         * (Optional) if specified, the new response will be a continuation of the previous
         * response. This can be used to easily fork-off new responses from existing responses.
         */
        fun previousResponseId(previousResponseId: String) = apply {
            body.previousResponseId(previousResponseId)
        }

        /**
         * Sets [Builder.previousResponseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousResponseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousResponseId(previousResponseId: JsonField<String>) = apply {
            body.previousResponseId(previousResponseId)
        }

        fun store(store: Boolean) = apply { body.store(store) }

        /**
         * Sets [Builder.store] to an arbitrary JSON value.
         *
         * You should usually call [Builder.store] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun store(store: JsonField<Boolean>) = apply { body.store(store) }

        fun temperature(temperature: Double) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        fun text(text: Text) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Text] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Text>) = apply { body.text(text) }

        fun tools(tools: List<Tool>) = apply { body.tools(tools) }

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply { body.tools(tools) }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: Tool) = apply { body.addTool(tool) }

        /**
         * Alias for calling [addTool] with
         * `Tool.ofOpenAIResponseInputToolWebSearch(openaiResponseInputToolWebSearch)`.
         */
        fun addTool(openaiResponseInputToolWebSearch: Tool.OpenAIResponseInputToolWebSearch) =
            apply {
                body.addTool(openaiResponseInputToolWebSearch)
            }

        /** Alias for calling [addTool] with `Tool.ofFileSearch(fileSearch)`. */
        fun addTool(fileSearch: Tool.FileSearch) = apply { body.addTool(fileSearch) }

        /**
         * Alias for calling [addTool] with the following:
         * ```kotlin
         * Tool.FileSearch.builder()
         *     .vectorStoreIds(vectorStoreIds)
         *     .build()
         * ```
         */
        fun addFileSearchTool(vectorStoreIds: List<String>) = apply {
            body.addFileSearchTool(vectorStoreIds)
        }

        /** Alias for calling [addTool] with `Tool.ofFunction(function)`. */
        fun addTool(function: Tool.Function) = apply { body.addTool(function) }

        /**
         * Alias for calling [addTool] with the following:
         * ```kotlin
         * Tool.Function.builder()
         *     .name(name)
         *     .build()
         * ```
         */
        fun addFunctionTool(name: String) = apply { body.addFunctionTool(name) }

        /** Alias for calling [addTool] with `Tool.ofMcp(mcp)`. */
        fun addTool(mcp: Tool.Mcp) = apply { body.addTool(mcp) }

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

        /**
         * Returns an immutable instance of [ResponseCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .input()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResponseCreateParams =
            ResponseCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val input: JsonField<Input>,
        private val model: JsonField<String>,
        private val instructions: JsonField<String>,
        private val maxInferIters: JsonField<Long>,
        private val previousResponseId: JsonField<String>,
        private val store: JsonField<Boolean>,
        private val temperature: JsonField<Double>,
        private val text: JsonField<Text>,
        private val tools: JsonField<List<Tool>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input") @ExcludeMissing input: JsonField<Input> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_infer_iters")
            @ExcludeMissing
            maxInferIters: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous_response_id")
            @ExcludeMissing
            previousResponseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("store") @ExcludeMissing store: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<Text> = JsonMissing.of(),
            @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
        ) : this(
            input,
            model,
            instructions,
            maxInferIters,
            previousResponseId,
            store,
            temperature,
            text,
            tools,
            mutableMapOf(),
        )

        /**
         * Input message(s) to create the response.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun input(): Input = input.getRequired("input")

        /**
         * The underlying LLM used for completions.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun instructions(): String? = instructions.getNullable("instructions")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxInferIters(): Long? = maxInferIters.getNullable("max_infer_iters")

        /**
         * (Optional) if specified, the new response will be a continuation of the previous
         * response. This can be used to easily fork-off new responses from existing responses.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun previousResponseId(): String? = previousResponseId.getNullable("previous_response_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun store(): Boolean? = store.getNullable("store")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun temperature(): Double? = temperature.getNullable("temperature")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun text(): Text? = text.getNullable("text")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tools(): List<Tool>? = tools.getNullable("tools")

        /**
         * Returns the raw JSON value of [input].
         *
         * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [maxInferIters].
         *
         * Unlike [maxInferIters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_infer_iters")
        @ExcludeMissing
        fun _maxInferIters(): JsonField<Long> = maxInferIters

        /**
         * Returns the raw JSON value of [previousResponseId].
         *
         * Unlike [previousResponseId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("previous_response_id")
        @ExcludeMissing
        fun _previousResponseId(): JsonField<String> = previousResponseId

        /**
         * Returns the raw JSON value of [store].
         *
         * Unlike [store], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("store") @ExcludeMissing fun _store(): JsonField<Boolean> = store

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Text> = text

        /**
         * Returns the raw JSON value of [tools].
         *
         * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .input()
             * .model()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var input: JsonField<Input>? = null
            private var model: JsonField<String>? = null
            private var instructions: JsonField<String> = JsonMissing.of()
            private var maxInferIters: JsonField<Long> = JsonMissing.of()
            private var previousResponseId: JsonField<String> = JsonMissing.of()
            private var store: JsonField<Boolean> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var text: JsonField<Text> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                input = body.input
                model = body.model
                instructions = body.instructions
                maxInferIters = body.maxInferIters
                previousResponseId = body.previousResponseId
                store = body.store
                temperature = body.temperature
                text = body.text
                tools = body.tools.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Input message(s) to create the response. */
            fun input(input: Input) = input(JsonField.of(input))

            /**
             * Sets [Builder.input] to an arbitrary JSON value.
             *
             * You should usually call [Builder.input] with a well-typed [Input] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun input(input: JsonField<Input>) = apply { this.input = input }

            /** Alias for calling [input] with `Input.ofString(string)`. */
            fun input(string: String) = input(Input.ofString(string))

            /**
             * Alias for calling [input] with `Input.ofOpenAIResponseInputs(openaiResponseInputs)`.
             */
            fun inputOfOpenAIResponseInputs(openaiResponseInputs: List<Input.OpenAIResponseInput>) =
                input(Input.ofOpenAIResponseInputs(openaiResponseInputs))

            /** The underlying LLM used for completions. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            fun maxInferIters(maxInferIters: Long) = maxInferIters(JsonField.of(maxInferIters))

            /**
             * Sets [Builder.maxInferIters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxInferIters] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxInferIters(maxInferIters: JsonField<Long>) = apply {
                this.maxInferIters = maxInferIters
            }

            /**
             * (Optional) if specified, the new response will be a continuation of the previous
             * response. This can be used to easily fork-off new responses from existing responses.
             */
            fun previousResponseId(previousResponseId: String) =
                previousResponseId(JsonField.of(previousResponseId))

            /**
             * Sets [Builder.previousResponseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousResponseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousResponseId(previousResponseId: JsonField<String>) = apply {
                this.previousResponseId = previousResponseId
            }

            fun store(store: Boolean) = store(JsonField.of(store))

            /**
             * Sets [Builder.store] to an arbitrary JSON value.
             *
             * You should usually call [Builder.store] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun store(store: JsonField<Boolean>) = apply { this.store = store }

            fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Double>) = apply {
                this.temperature = temperature
            }

            fun text(text: Text) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [Text] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<Text>) = apply { this.text = text }

            fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tools(tools: JsonField<List<Tool>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tool] to [tools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTool(tool: Tool) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
                    }
            }

            /**
             * Alias for calling [addTool] with
             * `Tool.ofOpenAIResponseInputToolWebSearch(openaiResponseInputToolWebSearch)`.
             */
            fun addTool(openaiResponseInputToolWebSearch: Tool.OpenAIResponseInputToolWebSearch) =
                addTool(Tool.ofOpenAIResponseInputToolWebSearch(openaiResponseInputToolWebSearch))

            /** Alias for calling [addTool] with `Tool.ofFileSearch(fileSearch)`. */
            fun addTool(fileSearch: Tool.FileSearch) = addTool(Tool.ofFileSearch(fileSearch))

            /**
             * Alias for calling [addTool] with the following:
             * ```kotlin
             * Tool.FileSearch.builder()
             *     .vectorStoreIds(vectorStoreIds)
             *     .build()
             * ```
             */
            fun addFileSearchTool(vectorStoreIds: List<String>) =
                addTool(Tool.FileSearch.builder().vectorStoreIds(vectorStoreIds).build())

            /** Alias for calling [addTool] with `Tool.ofFunction(function)`. */
            fun addTool(function: Tool.Function) = addTool(Tool.ofFunction(function))

            /**
             * Alias for calling [addTool] with the following:
             * ```kotlin
             * Tool.Function.builder()
             *     .name(name)
             *     .build()
             * ```
             */
            fun addFunctionTool(name: String) = addTool(Tool.Function.builder().name(name).build())

            /** Alias for calling [addTool] with `Tool.ofMcp(mcp)`. */
            fun addTool(mcp: Tool.Mcp) = addTool(Tool.ofMcp(mcp))

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .input()
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("input", input),
                    checkRequired("model", model),
                    instructions,
                    maxInferIters,
                    previousResponseId,
                    store,
                    temperature,
                    text,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            input().validate()
            model()
            instructions()
            maxInferIters()
            previousResponseId()
            store()
            temperature()
            text()?.validate()
            tools()?.forEach { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (input.asKnown()?.validity() ?: 0) +
                (if (model.asKnown() == null) 0 else 1) +
                (if (instructions.asKnown() == null) 0 else 1) +
                (if (maxInferIters.asKnown() == null) 0 else 1) +
                (if (previousResponseId.asKnown() == null) 0 else 1) +
                (if (store.asKnown() == null) 0 else 1) +
                (if (temperature.asKnown() == null) 0 else 1) +
                (text.asKnown()?.validity() ?: 0) +
                (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && input == other.input && model == other.model && instructions == other.instructions && maxInferIters == other.maxInferIters && previousResponseId == other.previousResponseId && store == other.store && temperature == other.temperature && text == other.text && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(input, model, instructions, maxInferIters, previousResponseId, store, temperature, text, tools, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{input=$input, model=$model, instructions=$instructions, maxInferIters=$maxInferIters, previousResponseId=$previousResponseId, store=$store, temperature=$temperature, text=$text, tools=$tools, additionalProperties=$additionalProperties}"
    }

    /** Input message(s) to create the response. */
    @JsonDeserialize(using = Input.Deserializer::class)
    @JsonSerialize(using = Input.Serializer::class)
    class Input
    private constructor(
        private val string: String? = null,
        private val openaiResponseInputs: List<OpenAIResponseInput>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun openaiResponseInputs(): List<OpenAIResponseInput>? = openaiResponseInputs

        fun isString(): Boolean = string != null

        fun isOpenAIResponseInputs(): Boolean = openaiResponseInputs != null

        fun asString(): String = string.getOrThrow("string")

        fun asOpenAIResponseInputs(): List<OpenAIResponseInput> =
            openaiResponseInputs.getOrThrow("openaiResponseInputs")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                openaiResponseInputs != null ->
                    visitor.visitOpenAIResponseInputs(openaiResponseInputs)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitOpenAIResponseInputs(
                        openaiResponseInputs: List<OpenAIResponseInput>
                    ) {
                        openaiResponseInputs.forEach { it.validate() }
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitOpenAIResponseInputs(
                        openaiResponseInputs: List<OpenAIResponseInput>
                    ) = openaiResponseInputs.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Input && string == other.string && openaiResponseInputs == other.openaiResponseInputs /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiResponseInputs) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Input{string=$string}"
                openaiResponseInputs != null -> "Input{openaiResponseInputs=$openaiResponseInputs}"
                _json != null -> "Input{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Input")
            }

        companion object {

            fun ofString(string: String) = Input(string = string)

            fun ofOpenAIResponseInputs(openaiResponseInputs: List<OpenAIResponseInput>) =
                Input(openaiResponseInputs = openaiResponseInputs)
        }

        /** An interface that defines how to map each variant of [Input] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitOpenAIResponseInputs(openaiResponseInputs: List<OpenAIResponseInput>): T

            /**
             * Maps an unknown variant of [Input] to a value of type [T].
             *
             * An instance of [Input] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Input: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Input>(Input::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Input {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Input(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<OpenAIResponseInput>>())?.let {
                                Input(openaiResponseInputs = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Input(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Input>(Input::class) {

            override fun serialize(
                value: Input,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.openaiResponseInputs != null ->
                        generator.writeObject(value.openaiResponseInputs)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Input")
                }
            }
        }

        /** This represents the output of a function call that gets passed back to the model. */
        @JsonDeserialize(using = OpenAIResponseInput.Deserializer::class)
        @JsonSerialize(using = OpenAIResponseInput.Serializer::class)
        class OpenAIResponseInput
        private constructor(
            private val outputMessageWebSearchToolCall:
                OpenAIResponseOutputMessageWebSearchToolCall? =
                null,
            private val outputMessageFileSearchToolCall:
                OpenAIResponseOutputMessageFileSearchToolCall? =
                null,
            private val outputMessageFunctionToolCall:
                OpenAIResponseOutputMessageFunctionToolCall? =
                null,
            private val functionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput? = null,
            private val message: OpenAIResponseMessage? = null,
            private val _json: JsonValue? = null,
        ) {

            fun outputMessageWebSearchToolCall(): OpenAIResponseOutputMessageWebSearchToolCall? =
                outputMessageWebSearchToolCall

            fun outputMessageFileSearchToolCall(): OpenAIResponseOutputMessageFileSearchToolCall? =
                outputMessageFileSearchToolCall

            fun outputMessageFunctionToolCall(): OpenAIResponseOutputMessageFunctionToolCall? =
                outputMessageFunctionToolCall

            /** This represents the output of a function call that gets passed back to the model. */
            fun functionToolCallOutput(): OpenAIResponseInputFunctionToolCallOutput? =
                functionToolCallOutput

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun message(): OpenAIResponseMessage? = message

            fun isOutputMessageWebSearchToolCall(): Boolean = outputMessageWebSearchToolCall != null

            fun isOutputMessageFileSearchToolCall(): Boolean =
                outputMessageFileSearchToolCall != null

            fun isOutputMessageFunctionToolCall(): Boolean = outputMessageFunctionToolCall != null

            fun isFunctionToolCallOutput(): Boolean = functionToolCallOutput != null

            fun isMessage(): Boolean = message != null

            fun asOutputMessageWebSearchToolCall(): OpenAIResponseOutputMessageWebSearchToolCall =
                outputMessageWebSearchToolCall.getOrThrow("outputMessageWebSearchToolCall")

            fun asOutputMessageFileSearchToolCall(): OpenAIResponseOutputMessageFileSearchToolCall =
                outputMessageFileSearchToolCall.getOrThrow("outputMessageFileSearchToolCall")

            fun asOutputMessageFunctionToolCall(): OpenAIResponseOutputMessageFunctionToolCall =
                outputMessageFunctionToolCall.getOrThrow("outputMessageFunctionToolCall")

            /** This represents the output of a function call that gets passed back to the model. */
            fun asFunctionToolCallOutput(): OpenAIResponseInputFunctionToolCallOutput =
                functionToolCallOutput.getOrThrow("functionToolCallOutput")

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun asMessage(): OpenAIResponseMessage = message.getOrThrow("message")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    outputMessageWebSearchToolCall != null ->
                        visitor.visitOutputMessageWebSearchToolCall(outputMessageWebSearchToolCall)
                    outputMessageFileSearchToolCall != null ->
                        visitor.visitOutputMessageFileSearchToolCall(
                            outputMessageFileSearchToolCall
                        )
                    outputMessageFunctionToolCall != null ->
                        visitor.visitOutputMessageFunctionToolCall(outputMessageFunctionToolCall)
                    functionToolCallOutput != null ->
                        visitor.visitFunctionToolCallOutput(functionToolCallOutput)
                    message != null -> visitor.visitMessage(message)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): OpenAIResponseInput = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitOutputMessageWebSearchToolCall(
                            outputMessageWebSearchToolCall:
                                OpenAIResponseOutputMessageWebSearchToolCall
                        ) {
                            outputMessageWebSearchToolCall.validate()
                        }

                        override fun visitOutputMessageFileSearchToolCall(
                            outputMessageFileSearchToolCall:
                                OpenAIResponseOutputMessageFileSearchToolCall
                        ) {
                            outputMessageFileSearchToolCall.validate()
                        }

                        override fun visitOutputMessageFunctionToolCall(
                            outputMessageFunctionToolCall:
                                OpenAIResponseOutputMessageFunctionToolCall
                        ) {
                            outputMessageFunctionToolCall.validate()
                        }

                        override fun visitFunctionToolCallOutput(
                            functionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput
                        ) {
                            functionToolCallOutput.validate()
                        }

                        override fun visitMessage(message: OpenAIResponseMessage) {
                            message.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitOutputMessageWebSearchToolCall(
                            outputMessageWebSearchToolCall:
                                OpenAIResponseOutputMessageWebSearchToolCall
                        ) = outputMessageWebSearchToolCall.validity()

                        override fun visitOutputMessageFileSearchToolCall(
                            outputMessageFileSearchToolCall:
                                OpenAIResponseOutputMessageFileSearchToolCall
                        ) = outputMessageFileSearchToolCall.validity()

                        override fun visitOutputMessageFunctionToolCall(
                            outputMessageFunctionToolCall:
                                OpenAIResponseOutputMessageFunctionToolCall
                        ) = outputMessageFunctionToolCall.validity()

                        override fun visitFunctionToolCallOutput(
                            functionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput
                        ) = functionToolCallOutput.validity()

                        override fun visitMessage(message: OpenAIResponseMessage) =
                            message.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OpenAIResponseInput && outputMessageWebSearchToolCall == other.outputMessageWebSearchToolCall && outputMessageFileSearchToolCall == other.outputMessageFileSearchToolCall && outputMessageFunctionToolCall == other.outputMessageFunctionToolCall && functionToolCallOutput == other.functionToolCallOutput && message == other.message /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(outputMessageWebSearchToolCall, outputMessageFileSearchToolCall, outputMessageFunctionToolCall, functionToolCallOutput, message) /* spotless:on */

            override fun toString(): String =
                when {
                    outputMessageWebSearchToolCall != null ->
                        "OpenAIResponseInput{outputMessageWebSearchToolCall=$outputMessageWebSearchToolCall}"
                    outputMessageFileSearchToolCall != null ->
                        "OpenAIResponseInput{outputMessageFileSearchToolCall=$outputMessageFileSearchToolCall}"
                    outputMessageFunctionToolCall != null ->
                        "OpenAIResponseInput{outputMessageFunctionToolCall=$outputMessageFunctionToolCall}"
                    functionToolCallOutput != null ->
                        "OpenAIResponseInput{functionToolCallOutput=$functionToolCallOutput}"
                    message != null -> "OpenAIResponseInput{message=$message}"
                    _json != null -> "OpenAIResponseInput{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid OpenAIResponseInput")
                }

            companion object {

                fun ofOutputMessageWebSearchToolCall(
                    outputMessageWebSearchToolCall: OpenAIResponseOutputMessageWebSearchToolCall
                ) =
                    OpenAIResponseInput(
                        outputMessageWebSearchToolCall = outputMessageWebSearchToolCall
                    )

                fun ofOutputMessageFileSearchToolCall(
                    outputMessageFileSearchToolCall: OpenAIResponseOutputMessageFileSearchToolCall
                ) =
                    OpenAIResponseInput(
                        outputMessageFileSearchToolCall = outputMessageFileSearchToolCall
                    )

                fun ofOutputMessageFunctionToolCall(
                    outputMessageFunctionToolCall: OpenAIResponseOutputMessageFunctionToolCall
                ) =
                    OpenAIResponseInput(
                        outputMessageFunctionToolCall = outputMessageFunctionToolCall
                    )

                /**
                 * This represents the output of a function call that gets passed back to the model.
                 */
                fun ofFunctionToolCallOutput(
                    functionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput
                ) = OpenAIResponseInput(functionToolCallOutput = functionToolCallOutput)

                /**
                 * Corresponds to the various Message types in the Responses API. They are all under
                 * one type because the Responses API gives them all the same "type" value, and
                 * there is no way to tell them apart in certain scenarios.
                 */
                fun ofMessage(message: OpenAIResponseMessage) =
                    OpenAIResponseInput(message = message)
            }

            /**
             * An interface that defines how to map each variant of [OpenAIResponseInput] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitOutputMessageWebSearchToolCall(
                    outputMessageWebSearchToolCall: OpenAIResponseOutputMessageWebSearchToolCall
                ): T

                fun visitOutputMessageFileSearchToolCall(
                    outputMessageFileSearchToolCall: OpenAIResponseOutputMessageFileSearchToolCall
                ): T

                fun visitOutputMessageFunctionToolCall(
                    outputMessageFunctionToolCall: OpenAIResponseOutputMessageFunctionToolCall
                ): T

                /**
                 * This represents the output of a function call that gets passed back to the model.
                 */
                fun visitFunctionToolCallOutput(
                    functionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput
                ): T

                /**
                 * Corresponds to the various Message types in the Responses API. They are all under
                 * one type because the Responses API gives them all the same "type" value, and
                 * there is no way to tell them apart in certain scenarios.
                 */
                fun visitMessage(message: OpenAIResponseMessage): T

                /**
                 * Maps an unknown variant of [OpenAIResponseInput] to a value of type [T].
                 *
                 * An instance of [OpenAIResponseInput] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LlamaStackClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown OpenAIResponseInput: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<OpenAIResponseInput>(OpenAIResponseInput::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): OpenAIResponseInput {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            OpenAIResponseOutputMessageWebSearchToolCall
                                        >(),
                                    )
                                    ?.let {
                                        OpenAIResponseInput(
                                            outputMessageWebSearchToolCall = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            OpenAIResponseOutputMessageFileSearchToolCall
                                        >(),
                                    )
                                    ?.let {
                                        OpenAIResponseInput(
                                            outputMessageFileSearchToolCall = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            OpenAIResponseOutputMessageFunctionToolCall
                                        >(),
                                    )
                                    ?.let {
                                        OpenAIResponseInput(
                                            outputMessageFunctionToolCall = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<OpenAIResponseInputFunctionToolCallOutput>(),
                                    )
                                    ?.let {
                                        OpenAIResponseInput(
                                            functionToolCallOutput = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(node, jacksonTypeRef<OpenAIResponseMessage>())?.let {
                                    OpenAIResponseInput(message = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> OpenAIResponseInput(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<OpenAIResponseInput>(OpenAIResponseInput::class) {

                override fun serialize(
                    value: OpenAIResponseInput,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.outputMessageWebSearchToolCall != null ->
                            generator.writeObject(value.outputMessageWebSearchToolCall)
                        value.outputMessageFileSearchToolCall != null ->
                            generator.writeObject(value.outputMessageFileSearchToolCall)
                        value.outputMessageFunctionToolCall != null ->
                            generator.writeObject(value.outputMessageFunctionToolCall)
                        value.functionToolCallOutput != null ->
                            generator.writeObject(value.functionToolCallOutput)
                        value.message != null -> generator.writeObject(value.message)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid OpenAIResponseInput")
                    }
                }
            }

            class OpenAIResponseOutputMessageWebSearchToolCall
            private constructor(
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(id, status, type, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("web_search_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [OpenAIResponseOutputMessageWebSearchToolCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .status()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OpenAIResponseOutputMessageWebSearchToolCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var status: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("web_search_call")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        openaiResponseOutputMessageWebSearchToolCall:
                            OpenAIResponseOutputMessageWebSearchToolCall
                    ) = apply {
                        id = openaiResponseOutputMessageWebSearchToolCall.id
                        status = openaiResponseOutputMessageWebSearchToolCall.status
                        type = openaiResponseOutputMessageWebSearchToolCall.type
                        additionalProperties =
                            openaiResponseOutputMessageWebSearchToolCall.additionalProperties
                                .toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("web_search_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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

                    /**
                     * Returns an immutable instance of
                     * [OpenAIResponseOutputMessageWebSearchToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OpenAIResponseOutputMessageWebSearchToolCall =
                        OpenAIResponseOutputMessageWebSearchToolCall(
                            checkRequired("id", id),
                            checkRequired("status", status),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): OpenAIResponseOutputMessageWebSearchToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    status()
                    _type().let {
                        if (it != JsonValue.from("web_search_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("web_search_call")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OpenAIResponseOutputMessageWebSearchToolCall && id == other.id && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, status, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OpenAIResponseOutputMessageWebSearchToolCall{id=$id, status=$status, type=$type, additionalProperties=$additionalProperties}"
            }

            class OpenAIResponseOutputMessageFileSearchToolCall
            private constructor(
                private val id: JsonField<String>,
                private val queries: JsonField<List<String>>,
                private val status: JsonField<String>,
                private val type: JsonValue,
                private val results: JsonField<List<Result>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("queries")
                    @ExcludeMissing
                    queries: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("results")
                    @ExcludeMissing
                    results: JsonField<List<Result>> = JsonMissing.of(),
                ) : this(id, queries, status, type, results, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun queries(): List<String> = queries.getRequired("queries")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("file_search_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun results(): List<Result>? = results.getNullable("results")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [queries].
                 *
                 * Unlike [queries], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("queries")
                @ExcludeMissing
                fun _queries(): JsonField<List<String>> = queries

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /**
                 * Returns the raw JSON value of [results].
                 *
                 * Unlike [results], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("results")
                @ExcludeMissing
                fun _results(): JsonField<List<Result>> = results

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [OpenAIResponseOutputMessageFileSearchToolCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .queries()
                     * .status()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OpenAIResponseOutputMessageFileSearchToolCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var queries: JsonField<MutableList<String>>? = null
                    private var status: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("file_search_call")
                    private var results: JsonField<MutableList<Result>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        openaiResponseOutputMessageFileSearchToolCall:
                            OpenAIResponseOutputMessageFileSearchToolCall
                    ) = apply {
                        id = openaiResponseOutputMessageFileSearchToolCall.id
                        queries =
                            openaiResponseOutputMessageFileSearchToolCall.queries.map {
                                it.toMutableList()
                            }
                        status = openaiResponseOutputMessageFileSearchToolCall.status
                        type = openaiResponseOutputMessageFileSearchToolCall.type
                        results =
                            openaiResponseOutputMessageFileSearchToolCall.results.map {
                                it.toMutableList()
                            }
                        additionalProperties =
                            openaiResponseOutputMessageFileSearchToolCall.additionalProperties
                                .toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun queries(queries: List<String>) = queries(JsonField.of(queries))

                    /**
                     * Sets [Builder.queries] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.queries] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun queries(queries: JsonField<List<String>>) = apply {
                        this.queries = queries.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [queries].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addQuery(query: String) = apply {
                        queries =
                            (queries ?: JsonField.of(mutableListOf())).also {
                                checkKnown("queries", it).add(query)
                            }
                    }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("file_search_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun results(results: List<Result>) = results(JsonField.of(results))

                    /**
                     * Sets [Builder.results] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.results] with a well-typed `List<Result>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun results(results: JsonField<List<Result>>) = apply {
                        this.results = results.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Result] to [results].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addResult(result: Result) = apply {
                        results =
                            (results ?: JsonField.of(mutableListOf())).also {
                                checkKnown("results", it).add(result)
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

                    /**
                     * Returns an immutable instance of
                     * [OpenAIResponseOutputMessageFileSearchToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .queries()
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OpenAIResponseOutputMessageFileSearchToolCall =
                        OpenAIResponseOutputMessageFileSearchToolCall(
                            checkRequired("id", id),
                            checkRequired("queries", queries).map { it.toImmutable() },
                            checkRequired("status", status),
                            type,
                            (results ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): OpenAIResponseOutputMessageFileSearchToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    queries()
                    status()
                    _type().let {
                        if (it != JsonValue.from("file_search_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    results()?.forEach { it.validate() }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (queries.asKnown()?.size ?: 0) +
                        (if (status.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("file_search_call")) 1 else 0 } +
                        (results.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class Result
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Result]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Result]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(result: Result) = apply {
                            additionalProperties = result.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Result].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Result = Result(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Result = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Result{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OpenAIResponseOutputMessageFileSearchToolCall && id == other.id && queries == other.queries && status == other.status && type == other.type && results == other.results && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, queries, status, type, results, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OpenAIResponseOutputMessageFileSearchToolCall{id=$id, queries=$queries, status=$status, type=$type, results=$results, additionalProperties=$additionalProperties}"
            }

            class OpenAIResponseOutputMessageFunctionToolCall
            private constructor(
                private val arguments: JsonField<String>,
                private val callId: JsonField<String>,
                private val name: JsonField<String>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("call_id")
                    @ExcludeMissing
                    callId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(arguments, callId, name, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun arguments(): String = arguments.getRequired("arguments")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun callId(): String = callId.getRequired("call_id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("function_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                /**
                 * Returns the raw JSON value of [callId].
                 *
                 * Unlike [callId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [OpenAIResponseOutputMessageFunctionToolCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .arguments()
                     * .callId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OpenAIResponseOutputMessageFunctionToolCall]. */
                class Builder internal constructor() {

                    private var arguments: JsonField<String>? = null
                    private var callId: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("function_call")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        openaiResponseOutputMessageFunctionToolCall:
                            OpenAIResponseOutputMessageFunctionToolCall
                    ) = apply {
                        arguments = openaiResponseOutputMessageFunctionToolCall.arguments
                        callId = openaiResponseOutputMessageFunctionToolCall.callId
                        name = openaiResponseOutputMessageFunctionToolCall.name
                        type = openaiResponseOutputMessageFunctionToolCall.type
                        id = openaiResponseOutputMessageFunctionToolCall.id
                        status = openaiResponseOutputMessageFunctionToolCall.status
                        additionalProperties =
                            openaiResponseOutputMessageFunctionToolCall.additionalProperties
                                .toMutableMap()
                    }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun callId(callId: String) = callId(JsonField.of(callId))

                    /**
                     * Sets [Builder.callId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("function_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

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

                    /**
                     * Returns an immutable instance of
                     * [OpenAIResponseOutputMessageFunctionToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .arguments()
                     * .callId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OpenAIResponseOutputMessageFunctionToolCall =
                        OpenAIResponseOutputMessageFunctionToolCall(
                            checkRequired("arguments", arguments),
                            checkRequired("callId", callId),
                            checkRequired("name", name),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): OpenAIResponseOutputMessageFunctionToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    arguments()
                    callId()
                    name()
                    _type().let {
                        if (it != JsonValue.from("function_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (arguments.asKnown() == null) 0 else 1) +
                        (if (callId.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("function_call")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OpenAIResponseOutputMessageFunctionToolCall && arguments == other.arguments && callId == other.callId && name == other.name && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(arguments, callId, name, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OpenAIResponseOutputMessageFunctionToolCall{arguments=$arguments, callId=$callId, name=$name, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }

            /** This represents the output of a function call that gets passed back to the model. */
            class OpenAIResponseInputFunctionToolCallOutput
            private constructor(
                private val callId: JsonField<String>,
                private val output: JsonField<String>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("call_id")
                    @ExcludeMissing
                    callId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("output")
                    @ExcludeMissing
                    output: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(callId, output, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun callId(): String = callId.getRequired("call_id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun output(): String = output.getRequired("output")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("function_call_output")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [callId].
                 *
                 * Unlike [callId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

                /**
                 * Returns the raw JSON value of [output].
                 *
                 * Unlike [output], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [OpenAIResponseInputFunctionToolCallOutput].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .callId()
                     * .output()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OpenAIResponseInputFunctionToolCallOutput]. */
                class Builder internal constructor() {

                    private var callId: JsonField<String>? = null
                    private var output: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("function_call_output")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        openaiResponseInputFunctionToolCallOutput:
                            OpenAIResponseInputFunctionToolCallOutput
                    ) = apply {
                        callId = openaiResponseInputFunctionToolCallOutput.callId
                        output = openaiResponseInputFunctionToolCallOutput.output
                        type = openaiResponseInputFunctionToolCallOutput.type
                        id = openaiResponseInputFunctionToolCallOutput.id
                        status = openaiResponseInputFunctionToolCallOutput.status
                        additionalProperties =
                            openaiResponseInputFunctionToolCallOutput.additionalProperties
                                .toMutableMap()
                    }

                    fun callId(callId: String) = callId(JsonField.of(callId))

                    /**
                     * Sets [Builder.callId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                    fun output(output: String) = output(JsonField.of(output))

                    /**
                     * Sets [Builder.output] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.output] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun output(output: JsonField<String>) = apply { this.output = output }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("function_call_output")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

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

                    /**
                     * Returns an immutable instance of [OpenAIResponseInputFunctionToolCallOutput].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .callId()
                     * .output()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OpenAIResponseInputFunctionToolCallOutput =
                        OpenAIResponseInputFunctionToolCallOutput(
                            checkRequired("callId", callId),
                            checkRequired("output", output),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): OpenAIResponseInputFunctionToolCallOutput = apply {
                    if (validated) {
                        return@apply
                    }

                    callId()
                    output()
                    _type().let {
                        if (it != JsonValue.from("function_call_output")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (callId.asKnown() == null) 0 else 1) +
                        (if (output.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("function_call_output")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OpenAIResponseInputFunctionToolCallOutput && callId == other.callId && output == other.output && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(callId, output, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OpenAIResponseInputFunctionToolCallOutput{callId=$callId, output=$output, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            class OpenAIResponseMessage
            private constructor(
                private val content: JsonField<Content>,
                private val role: JsonField<Role>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<Content> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): Content = content.getRequired("content")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun role(): Role = role.getRequired("role")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("message")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content")
                @ExcludeMissing
                fun _content(): JsonField<Content> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [OpenAIResponseMessage].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OpenAIResponseMessage]. */
                class Builder internal constructor() {

                    private var content: JsonField<Content>? = null
                    private var role: JsonField<Role>? = null
                    private var type: JsonValue = JsonValue.from("message")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(openaiResponseMessage: OpenAIResponseMessage) = apply {
                        content = openaiResponseMessage.content
                        role = openaiResponseMessage.role
                        type = openaiResponseMessage.type
                        id = openaiResponseMessage.id
                        status = openaiResponseMessage.status
                        additionalProperties =
                            openaiResponseMessage.additionalProperties.toMutableMap()
                    }

                    fun content(content: Content) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [Content] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<Content>) = apply { this.content = content }

                    /** Alias for calling [content] with `Content.ofString(string)`. */
                    fun content(string: String) = content(Content.ofString(string))

                    /**
                     * Alias for calling [content] with
                     * `Content.ofOpenAIResponseInputMessageContents(openaiResponseInputMessageContents)`.
                     */
                    fun contentOfOpenAIResponseInputMessageContents(
                        openaiResponseInputMessageContents:
                            List<Content.OpenAIResponseInputMessageContent>
                    ) =
                        content(
                            Content.ofOpenAIResponseInputMessageContents(
                                openaiResponseInputMessageContents
                            )
                        )

                    /**
                     * Alias for calling [content] with
                     * `Content.ofOpenAIResponseOutputMessageContents(openaiResponseOutputMessageContents)`.
                     */
                    fun contentOfOpenAIResponseOutputMessageContents(
                        openaiResponseOutputMessageContents:
                            List<Content.OpenAIResponseOutputMessageContent>
                    ) =
                        content(
                            Content.ofOpenAIResponseOutputMessageContents(
                                openaiResponseOutputMessageContents
                            )
                        )

                    fun role(role: Role) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [Role] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<Role>) = apply { this.role = role }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("message")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

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

                    /**
                     * Returns an immutable instance of [OpenAIResponseMessage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): OpenAIResponseMessage =
                        OpenAIResponseMessage(
                            checkRequired("content", content),
                            checkRequired("role", role),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): OpenAIResponseMessage = apply {
                    if (validated) {
                        return@apply
                    }

                    content().validate()
                    role().validate()
                    _type().let {
                        if (it != JsonValue.from("message")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (content.asKnown()?.validity() ?: 0) +
                        (role.asKnown()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("message")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                @JsonDeserialize(using = Content.Deserializer::class)
                @JsonSerialize(using = Content.Serializer::class)
                class Content
                private constructor(
                    private val string: String? = null,
                    private val openaiResponseInputMessageContents:
                        List<OpenAIResponseInputMessageContent>? =
                        null,
                    private val openaiResponseOutputMessageContents:
                        List<OpenAIResponseOutputMessageContent>? =
                        null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): String? = string

                    fun openaiResponseInputMessageContents():
                        List<OpenAIResponseInputMessageContent>? =
                        openaiResponseInputMessageContents

                    fun openaiResponseOutputMessageContents():
                        List<OpenAIResponseOutputMessageContent>? =
                        openaiResponseOutputMessageContents

                    fun isString(): Boolean = string != null

                    fun isOpenAIResponseInputMessageContents(): Boolean =
                        openaiResponseInputMessageContents != null

                    fun isOpenAIResponseOutputMessageContents(): Boolean =
                        openaiResponseOutputMessageContents != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asOpenAIResponseInputMessageContents():
                        List<OpenAIResponseInputMessageContent> =
                        openaiResponseInputMessageContents.getOrThrow(
                            "openaiResponseInputMessageContents"
                        )

                    fun asOpenAIResponseOutputMessageContents():
                        List<OpenAIResponseOutputMessageContent> =
                        openaiResponseOutputMessageContents.getOrThrow(
                            "openaiResponseOutputMessageContents"
                        )

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            openaiResponseInputMessageContents != null ->
                                visitor.visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents
                                )
                            openaiResponseOutputMessageContents != null ->
                                visitor.visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents
                                )
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): Content = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents:
                                        List<OpenAIResponseInputMessageContent>
                                ) {
                                    openaiResponseInputMessageContents.forEach { it.validate() }
                                }

                                override fun visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents:
                                        List<OpenAIResponseOutputMessageContent>
                                ) {
                                    openaiResponseOutputMessageContents.forEach { it.validate() }
                                }
                            }
                        )
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents:
                                        List<OpenAIResponseInputMessageContent>
                                ) =
                                    openaiResponseInputMessageContents.sumOf {
                                        it.validity().toInt()
                                    }

                                override fun visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents:
                                        List<OpenAIResponseOutputMessageContent>
                                ) =
                                    openaiResponseOutputMessageContents.sumOf {
                                        it.validity().toInt()
                                    }

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Content && string == other.string && openaiResponseInputMessageContents == other.openaiResponseInputMessageContents && openaiResponseOutputMessageContents == other.openaiResponseOutputMessageContents /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiResponseInputMessageContents, openaiResponseOutputMessageContents) /* spotless:on */

                    override fun toString(): String =
                        when {
                            string != null -> "Content{string=$string}"
                            openaiResponseInputMessageContents != null ->
                                "Content{openaiResponseInputMessageContents=$openaiResponseInputMessageContents}"
                            openaiResponseOutputMessageContents != null ->
                                "Content{openaiResponseOutputMessageContents=$openaiResponseOutputMessageContents}"
                            _json != null -> "Content{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Content")
                        }

                    companion object {

                        fun ofString(string: String) = Content(string = string)

                        fun ofOpenAIResponseInputMessageContents(
                            openaiResponseInputMessageContents:
                                List<OpenAIResponseInputMessageContent>
                        ) =
                            Content(
                                openaiResponseInputMessageContents =
                                    openaiResponseInputMessageContents
                            )

                        fun ofOpenAIResponseOutputMessageContents(
                            openaiResponseOutputMessageContents:
                                List<OpenAIResponseOutputMessageContent>
                        ) =
                            Content(
                                openaiResponseOutputMessageContents =
                                    openaiResponseOutputMessageContents
                            )
                    }

                    /**
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitOpenAIResponseInputMessageContents(
                            openaiResponseInputMessageContents:
                                List<OpenAIResponseInputMessageContent>
                        ): T

                        fun visitOpenAIResponseOutputMessageContents(
                            openaiResponseOutputMessageContents:
                                List<OpenAIResponseOutputMessageContent>
                        ): T

                        /**
                         * Maps an unknown variant of [Content] to a value of type [T].
                         *
                         * An instance of [Content] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Content {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            Content(string = it, _json = json)
                                        },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<
                                                    List<OpenAIResponseInputMessageContent>
                                                >(),
                                            )
                                            ?.let {
                                                Content(
                                                    openaiResponseInputMessageContents = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<
                                                    List<OpenAIResponseOutputMessageContent>
                                                >(),
                                            )
                                            ?.let {
                                                Content(
                                                    openaiResponseOutputMessageContents = it,
                                                    _json = json,
                                                )
                                            },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> Content(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Content>(Content::class) {

                        override fun serialize(
                            value: Content,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.openaiResponseInputMessageContents != null ->
                                    generator.writeObject(value.openaiResponseInputMessageContents)
                                value.openaiResponseOutputMessageContents != null ->
                                    generator.writeObject(value.openaiResponseOutputMessageContents)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(using = OpenAIResponseInputMessageContent.Deserializer::class)
                    @JsonSerialize(using = OpenAIResponseInputMessageContent.Serializer::class)
                    class OpenAIResponseInputMessageContent
                    private constructor(
                        private val inputText: InputText? = null,
                        private val inputImage: InputImage? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun inputText(): InputText? = inputText

                        fun inputImage(): InputImage? = inputImage

                        fun isInputText(): Boolean = inputText != null

                        fun isInputImage(): Boolean = inputImage != null

                        fun asInputText(): InputText = inputText.getOrThrow("inputText")

                        fun asInputImage(): InputImage = inputImage.getOrThrow("inputImage")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                inputText != null -> visitor.visitInputText(inputText)
                                inputImage != null -> visitor.visitInputImage(inputImage)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): OpenAIResponseInputMessageContent = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitInputText(inputText: InputText) {
                                        inputText.validate()
                                    }

                                    override fun visitInputImage(inputImage: InputImage) {
                                        inputImage.validate()
                                    }
                                }
                            )
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitInputText(inputText: InputText) =
                                        inputText.validity()

                                    override fun visitInputImage(inputImage: InputImage) =
                                        inputImage.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is OpenAIResponseInputMessageContent && inputText == other.inputText && inputImage == other.inputImage /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inputText, inputImage) /* spotless:on */

                        override fun toString(): String =
                            when {
                                inputText != null ->
                                    "OpenAIResponseInputMessageContent{inputText=$inputText}"
                                inputImage != null ->
                                    "OpenAIResponseInputMessageContent{inputImage=$inputImage}"
                                _json != null ->
                                    "OpenAIResponseInputMessageContent{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIResponseInputMessageContent"
                                    )
                            }

                        companion object {

                            fun ofInputText(inputText: InputText) =
                                OpenAIResponseInputMessageContent(inputText = inputText)

                            fun ofInputImage(inputImage: InputImage) =
                                OpenAIResponseInputMessageContent(inputImage = inputImage)
                        }

                        /**
                         * An interface that defines how to map each variant of
                         * [OpenAIResponseInputMessageContent] to a value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitInputText(inputText: InputText): T

                            fun visitInputImage(inputImage: InputImage): T

                            /**
                             * Maps an unknown variant of [OpenAIResponseInputMessageContent] to a
                             * value of type [T].
                             *
                             * An instance of [OpenAIResponseInputMessageContent] can contain an
                             * unknown variant if it was deserialized from data that doesn't match
                             * any known variant. For example, if the SDK is on an older version
                             * than the API, then the API may respond with new variants that the SDK
                             * is unaware of.
                             *
                             * @throws LlamaStackClientInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown OpenAIResponseInputMessageContent: $json"
                                )
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<OpenAIResponseInputMessageContent>(
                                OpenAIResponseInputMessageContent::class
                            ) {

                            override fun ObjectCodec.deserialize(
                                node: JsonNode
                            ): OpenAIResponseInputMessageContent {
                                val json = JsonValue.fromJsonNode(node)
                                val type = json.asObject()?.get("type")?.asString()

                                when (type) {
                                    "input_text" -> {
                                        return tryDeserialize(node, jacksonTypeRef<InputText>())
                                            ?.let {
                                                OpenAIResponseInputMessageContent(
                                                    inputText = it,
                                                    _json = json,
                                                )
                                            } ?: OpenAIResponseInputMessageContent(_json = json)
                                    }
                                    "input_image" -> {
                                        return tryDeserialize(node, jacksonTypeRef<InputImage>())
                                            ?.let {
                                                OpenAIResponseInputMessageContent(
                                                    inputImage = it,
                                                    _json = json,
                                                )
                                            } ?: OpenAIResponseInputMessageContent(_json = json)
                                    }
                                }

                                return OpenAIResponseInputMessageContent(_json = json)
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<OpenAIResponseInputMessageContent>(
                                OpenAIResponseInputMessageContent::class
                            ) {

                            override fun serialize(
                                value: OpenAIResponseInputMessageContent,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.inputText != null ->
                                        generator.writeObject(value.inputText)
                                    value.inputImage != null ->
                                        generator.writeObject(value.inputImage)
                                    value._json != null -> generator.writeObject(value._json)
                                    else ->
                                        throw IllegalStateException(
                                            "Invalid OpenAIResponseInputMessageContent"
                                        )
                                }
                            }
                        }

                        class InputText
                        private constructor(
                            private val text: JsonField<String>,
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("text")
                                @ExcludeMissing
                                text: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(text, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun text(): String = text.getRequired("text")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("input_text")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [text].
                             *
                             * Unlike [text], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("text")
                            @ExcludeMissing
                            fun _text(): JsonField<String> = text

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputText].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .text()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputText]. */
                            class Builder internal constructor() {

                                private var text: JsonField<String>? = null
                                private var type: JsonValue = JsonValue.from("input_text")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputText: InputText) = apply {
                                    text = inputText.text
                                    type = inputText.type
                                    additionalProperties =
                                        inputText.additionalProperties.toMutableMap()
                                }

                                fun text(text: String) = text(JsonField.of(text))

                                /**
                                 * Sets [Builder.text] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.text] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun text(text: JsonField<String>) = apply { this.text = text }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("input_text")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputText].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .text()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputText =
                                    InputText(
                                        checkRequired("text", text),
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputText = apply {
                                if (validated) {
                                    return@apply
                                }

                                text()
                                _type().let {
                                    if (it != JsonValue.from("input_text")) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (text.asKnown() == null) 0 else 1) +
                                    type.let { if (it == JsonValue.from("input_text")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InputText && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputText{text=$text, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class InputImage
                        private constructor(
                            private val detail: JsonField<Detail>,
                            private val type: JsonValue,
                            private val imageUrl: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<Detail> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("image_url")
                                @ExcludeMissing
                                imageUrl: JsonField<String> = JsonMissing.of(),
                            ) : this(detail, type, imageUrl, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun detail(): Detail = detail.getRequired("detail")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("input_image")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun imageUrl(): String? = imageUrl.getNullable("image_url")

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<Detail> = detail

                            /**
                             * Returns the raw JSON value of [imageUrl].
                             *
                             * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            fun _imageUrl(): JsonField<String> = imageUrl

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputImage].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .detail()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputImage]. */
                            class Builder internal constructor() {

                                private var detail: JsonField<Detail>? = null
                                private var type: JsonValue = JsonValue.from("input_image")
                                private var imageUrl: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputImage: InputImage) = apply {
                                    detail = inputImage.detail
                                    type = inputImage.type
                                    imageUrl = inputImage.imageUrl
                                    additionalProperties =
                                        inputImage.additionalProperties.toMutableMap()
                                }

                                fun detail(detail: Detail) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [Detail] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<Detail>) = apply {
                                    this.detail = detail
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("input_image")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun imageUrl(imageUrl: JsonField<String>) = apply {
                                    this.imageUrl = imageUrl
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputImage].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .detail()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputImage =
                                    InputImage(
                                        checkRequired("detail", detail),
                                        type,
                                        imageUrl,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputImage = apply {
                                if (validated) {
                                    return@apply
                                }

                                detail().validate()
                                _type().let {
                                    if (it != JsonValue.from("input_image")) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                imageUrl()
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (detail.asKnown()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("input_image")) 1 else 0 } +
                                    (if (imageUrl.asKnown() == null) 0 else 1)

                            class Detail
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    val LOW = of("low")

                                    val HIGH = of("high")

                                    val AUTO = of("auto")

                                    fun of(value: String) = Detail(JsonField.of(value))
                                }

                                /** An enum containing [Detail]'s known values. */
                                enum class Known {
                                    LOW,
                                    HIGH,
                                    AUTO,
                                }

                                /**
                                 * An enum containing [Detail]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Detail] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LOW,
                                    HIGH,
                                    AUTO,
                                    /**
                                     * An enum member indicating that [Detail] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LOW -> Value.LOW
                                        HIGH -> Value.HIGH
                                        AUTO -> Value.AUTO
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaStackClientInvalidDataException if this class
                                 *   instance's value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LOW -> Known.LOW
                                        HIGH -> Known.HIGH
                                        AUTO -> Known.AUTO
                                        else ->
                                            throw LlamaStackClientInvalidDataException(
                                                "Unknown Detail: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaStackClientInvalidDataException if this class
                                 *   instance's value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString()
                                        ?: throw LlamaStackClientInvalidDataException(
                                            "Value is not a String"
                                        )

                                private var validated: Boolean = false

                                fun validate(): Detail = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is Detail && value == other.value /* spotless:on */
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InputImage && detail == other.detail && type == other.type && imageUrl == other.imageUrl && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(detail, type, imageUrl, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputImage{detail=$detail, type=$type, imageUrl=$imageUrl, additionalProperties=$additionalProperties}"
                        }
                    }

                    class OpenAIResponseOutputMessageContent
                    private constructor(
                        private val annotations: JsonField<List<Annotation>>,
                        private val text: JsonField<String>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("annotations")
                            @ExcludeMissing
                            annotations: JsonField<List<Annotation>> = JsonMissing.of(),
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(annotations, text, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun annotations(): List<Annotation> = annotations.getRequired("annotations")

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("output_text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [annotations].
                         *
                         * Unlike [annotations], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("annotations")
                        @ExcludeMissing
                        fun _annotations(): JsonField<List<Annotation>> = annotations

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [OpenAIResponseOutputMessageContent].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .annotations()
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [OpenAIResponseOutputMessageContent]. */
                        class Builder internal constructor() {

                            private var annotations: JsonField<MutableList<Annotation>>? = null
                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("output_text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                openaiResponseOutputMessageContent:
                                    OpenAIResponseOutputMessageContent
                            ) = apply {
                                annotations =
                                    openaiResponseOutputMessageContent.annotations.map {
                                        it.toMutableList()
                                    }
                                text = openaiResponseOutputMessageContent.text
                                type = openaiResponseOutputMessageContent.type
                                additionalProperties =
                                    openaiResponseOutputMessageContent.additionalProperties
                                        .toMutableMap()
                            }

                            fun annotations(annotations: List<Annotation>) =
                                annotations(JsonField.of(annotations))

                            /**
                             * Sets [Builder.annotations] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.annotations] with a well-typed
                             * `List<Annotation>` value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun annotations(annotations: JsonField<List<Annotation>>) = apply {
                                this.annotations = annotations.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [Annotation] to [annotations].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addAnnotation(annotation: Annotation) = apply {
                                annotations =
                                    (annotations ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("annotations", it).add(annotation)
                                    }
                            }

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofFileCitation(fileCitation)`.
                             */
                            fun addAnnotation(fileCitation: Annotation.FileCitation) =
                                addAnnotation(Annotation.ofFileCitation(fileCitation))

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofUrlCitation(urlCitation)`.
                             */
                            fun addAnnotation(urlCitation: Annotation.UrlCitation) =
                                addAnnotation(Annotation.ofUrlCitation(urlCitation))

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofContainerFileCitation(containerFileCitation)`.
                             */
                            fun addAnnotation(
                                containerFileCitation: Annotation.ContainerFileCitation
                            ) =
                                addAnnotation(
                                    Annotation.ofContainerFileCitation(containerFileCitation)
                                )

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofFilePath(filePath)`.
                             */
                            fun addAnnotation(filePath: Annotation.FilePath) =
                                addAnnotation(Annotation.ofFilePath(filePath))

                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("output_text")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of
                             * [OpenAIResponseOutputMessageContent].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .annotations()
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): OpenAIResponseOutputMessageContent =
                                OpenAIResponseOutputMessageContent(
                                    checkRequired("annotations", annotations).map {
                                        it.toImmutable()
                                    },
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): OpenAIResponseOutputMessageContent = apply {
                            if (validated) {
                                return@apply
                            }

                            annotations().forEach { it.validate() }
                            text()
                            _type().let {
                                if (it != JsonValue.from("output_text")) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (annotations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                (if (text.asKnown() == null) 0 else 1) +
                                type.let { if (it == JsonValue.from("output_text")) 1 else 0 }

                        @JsonDeserialize(using = Annotation.Deserializer::class)
                        @JsonSerialize(using = Annotation.Serializer::class)
                        class Annotation
                        private constructor(
                            private val fileCitation: FileCitation? = null,
                            private val urlCitation: UrlCitation? = null,
                            private val containerFileCitation: ContainerFileCitation? = null,
                            private val filePath: FilePath? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun fileCitation(): FileCitation? = fileCitation

                            fun urlCitation(): UrlCitation? = urlCitation

                            fun containerFileCitation(): ContainerFileCitation? =
                                containerFileCitation

                            fun filePath(): FilePath? = filePath

                            fun isFileCitation(): Boolean = fileCitation != null

                            fun isUrlCitation(): Boolean = urlCitation != null

                            fun isContainerFileCitation(): Boolean = containerFileCitation != null

                            fun isFilePath(): Boolean = filePath != null

                            fun asFileCitation(): FileCitation =
                                fileCitation.getOrThrow("fileCitation")

                            fun asUrlCitation(): UrlCitation = urlCitation.getOrThrow("urlCitation")

                            fun asContainerFileCitation(): ContainerFileCitation =
                                containerFileCitation.getOrThrow("containerFileCitation")

                            fun asFilePath(): FilePath = filePath.getOrThrow("filePath")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    fileCitation != null -> visitor.visitFileCitation(fileCitation)
                                    urlCitation != null -> visitor.visitUrlCitation(urlCitation)
                                    containerFileCitation != null ->
                                        visitor.visitContainerFileCitation(containerFileCitation)
                                    filePath != null -> visitor.visitFilePath(filePath)
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): Annotation = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitFileCitation(fileCitation: FileCitation) {
                                            fileCitation.validate()
                                        }

                                        override fun visitUrlCitation(urlCitation: UrlCitation) {
                                            urlCitation.validate()
                                        }

                                        override fun visitContainerFileCitation(
                                            containerFileCitation: ContainerFileCitation
                                        ) {
                                            containerFileCitation.validate()
                                        }

                                        override fun visitFilePath(filePath: FilePath) {
                                            filePath.validate()
                                        }
                                    }
                                )
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitFileCitation(fileCitation: FileCitation) =
                                            fileCitation.validity()

                                        override fun visitUrlCitation(urlCitation: UrlCitation) =
                                            urlCitation.validity()

                                        override fun visitContainerFileCitation(
                                            containerFileCitation: ContainerFileCitation
                                        ) = containerFileCitation.validity()

                                        override fun visitFilePath(filePath: FilePath) =
                                            filePath.validity()

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Annotation && fileCitation == other.fileCitation && urlCitation == other.urlCitation && containerFileCitation == other.containerFileCitation && filePath == other.filePath /* spotless:on */
                            }

                            override fun hashCode(): Int = /* spotless:off */ Objects.hash(fileCitation, urlCitation, containerFileCitation, filePath) /* spotless:on */

                            override fun toString(): String =
                                when {
                                    fileCitation != null -> "Annotation{fileCitation=$fileCitation}"
                                    urlCitation != null -> "Annotation{urlCitation=$urlCitation}"
                                    containerFileCitation != null ->
                                        "Annotation{containerFileCitation=$containerFileCitation}"
                                    filePath != null -> "Annotation{filePath=$filePath}"
                                    _json != null -> "Annotation{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Annotation")
                                }

                            companion object {

                                fun ofFileCitation(fileCitation: FileCitation) =
                                    Annotation(fileCitation = fileCitation)

                                fun ofUrlCitation(urlCitation: UrlCitation) =
                                    Annotation(urlCitation = urlCitation)

                                fun ofContainerFileCitation(
                                    containerFileCitation: ContainerFileCitation
                                ) = Annotation(containerFileCitation = containerFileCitation)

                                fun ofFilePath(filePath: FilePath) = Annotation(filePath = filePath)
                            }

                            /**
                             * An interface that defines how to map each variant of [Annotation] to
                             * a value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitFileCitation(fileCitation: FileCitation): T

                                fun visitUrlCitation(urlCitation: UrlCitation): T

                                fun visitContainerFileCitation(
                                    containerFileCitation: ContainerFileCitation
                                ): T

                                fun visitFilePath(filePath: FilePath): T

                                /**
                                 * Maps an unknown variant of [Annotation] to a value of type [T].
                                 *
                                 * An instance of [Annotation] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant.
                                 * For example, if the SDK is on an older version than the API, then
                                 * the API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws LlamaStackClientInvalidDataException in the default
                                 *   implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Annotation: $json"
                                    )
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<Annotation>(Annotation::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Annotation {
                                    val json = JsonValue.fromJsonNode(node)
                                    val type = json.asObject()?.get("type")?.asString()

                                    when (type) {
                                        "file_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<FileCitation>(),
                                                )
                                                ?.let {
                                                    Annotation(fileCitation = it, _json = json)
                                                } ?: Annotation(_json = json)
                                        }
                                        "url_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<UrlCitation>(),
                                                )
                                                ?.let { Annotation(urlCitation = it, _json = json) }
                                                ?: Annotation(_json = json)
                                        }
                                        "container_file_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<ContainerFileCitation>(),
                                                )
                                                ?.let {
                                                    Annotation(
                                                        containerFileCitation = it,
                                                        _json = json,
                                                    )
                                                } ?: Annotation(_json = json)
                                        }
                                        "file_path" -> {
                                            return tryDeserialize(node, jacksonTypeRef<FilePath>())
                                                ?.let { Annotation(filePath = it, _json = json) }
                                                ?: Annotation(_json = json)
                                        }
                                    }

                                    return Annotation(_json = json)
                                }
                            }

                            internal class Serializer :
                                BaseSerializer<Annotation>(Annotation::class) {

                                override fun serialize(
                                    value: Annotation,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.fileCitation != null ->
                                            generator.writeObject(value.fileCitation)
                                        value.urlCitation != null ->
                                            generator.writeObject(value.urlCitation)
                                        value.containerFileCitation != null ->
                                            generator.writeObject(value.containerFileCitation)
                                        value.filePath != null ->
                                            generator.writeObject(value.filePath)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Annotation")
                                    }
                                }
                            }

                            class FileCitation
                            private constructor(
                                private val fileId: JsonField<String>,
                                private val filename: JsonField<String>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("filename")
                                    @ExcludeMissing
                                    filename: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(fileId, filename, index, type, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun filename(): String = filename.getRequired("filename")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("file_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [filename].
                                 *
                                 * Unlike [filename], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("filename")
                                @ExcludeMissing
                                fun _filename(): JsonField<String> = filename

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [FileCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .filename()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FileCitation]. */
                                class Builder internal constructor() {

                                    private var fileId: JsonField<String>? = null
                                    private var filename: JsonField<String>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("file_citation")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(fileCitation: FileCitation) = apply {
                                        fileId = fileCitation.fileId
                                        filename = fileCitation.filename
                                        index = fileCitation.index
                                        type = fileCitation.type
                                        additionalProperties =
                                            fileCitation.additionalProperties.toMutableMap()
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun filename(filename: String) =
                                        filename(JsonField.of(filename))

                                    /**
                                     * Sets [Builder.filename] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.filename] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun filename(filename: JsonField<String>) = apply {
                                        this.filename = filename
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("file_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FileCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .filename()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FileCitation =
                                        FileCitation(
                                            checkRequired("fileId", fileId),
                                            checkRequired("filename", filename),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FileCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    fileId()
                                    filename()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("file_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (filename.asKnown() == null) 0 else 1) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("file_citation")) 1 else 0
                                        }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is FileCitation && fileId == other.fileId && filename == other.filename && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(fileId, filename, index, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FileCitation{fileId=$fileId, filename=$filename, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class UrlCitation
                            private constructor(
                                private val endIndex: JsonField<Long>,
                                private val startIndex: JsonField<Long>,
                                private val title: JsonField<String>,
                                private val type: JsonValue,
                                private val url: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    endIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    startIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("title")
                                    @ExcludeMissing
                                    title: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    url: JsonField<String> = JsonMissing.of(),
                                ) : this(endIndex, startIndex, title, type, url, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun endIndex(): Long = endIndex.getRequired("end_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun startIndex(): Long = startIndex.getRequired("start_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun title(): String = title.getRequired("title")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("url_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * Returns the raw JSON value of [endIndex].
                                 *
                                 * Unlike [endIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("end_index")
                                @ExcludeMissing
                                fun _endIndex(): JsonField<Long> = endIndex

                                /**
                                 * Returns the raw JSON value of [startIndex].
                                 *
                                 * Unlike [startIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("start_index")
                                @ExcludeMissing
                                fun _startIndex(): JsonField<Long> = startIndex

                                /**
                                 * Returns the raw JSON value of [title].
                                 *
                                 * Unlike [title], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("title")
                                @ExcludeMissing
                                fun _title(): JsonField<String> = title

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [UrlCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .endIndex()
                                     * .startIndex()
                                     * .title()
                                     * .url()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [UrlCitation]. */
                                class Builder internal constructor() {

                                    private var endIndex: JsonField<Long>? = null
                                    private var startIndex: JsonField<Long>? = null
                                    private var title: JsonField<String>? = null
                                    private var type: JsonValue = JsonValue.from("url_citation")
                                    private var url: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(urlCitation: UrlCitation) = apply {
                                        endIndex = urlCitation.endIndex
                                        startIndex = urlCitation.startIndex
                                        title = urlCitation.title
                                        type = urlCitation.type
                                        url = urlCitation.url
                                        additionalProperties =
                                            urlCitation.additionalProperties.toMutableMap()
                                    }

                                    fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                    /**
                                     * Sets [Builder.endIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.endIndex] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun endIndex(endIndex: JsonField<Long>) = apply {
                                        this.endIndex = endIndex
                                    }

                                    fun startIndex(startIndex: Long) =
                                        startIndex(JsonField.of(startIndex))

                                    /**
                                     * Sets [Builder.startIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.startIndex] with a
                                     * well-typed [Long] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun startIndex(startIndex: JsonField<Long>) = apply {
                                        this.startIndex = startIndex
                                    }

                                    fun title(title: String) = title(JsonField.of(title))

                                    /**
                                     * Sets [Builder.title] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.title] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun title(title: JsonField<String>) = apply {
                                        this.title = title
                                    }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("url_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun url(url: String) = url(JsonField.of(url))

                                    /**
                                     * Sets [Builder.url] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [UrlCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .endIndex()
                                     * .startIndex()
                                     * .title()
                                     * .url()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): UrlCitation =
                                        UrlCitation(
                                            checkRequired("endIndex", endIndex),
                                            checkRequired("startIndex", startIndex),
                                            checkRequired("title", title),
                                            type,
                                            checkRequired("url", url),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): UrlCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    endIndex()
                                    startIndex()
                                    title()
                                    _type().let {
                                        if (it != JsonValue.from("url_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    url()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (endIndex.asKnown() == null) 0 else 1) +
                                        (if (startIndex.asKnown() == null) 0 else 1) +
                                        (if (title.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("url_citation")) 1 else 0
                                        } +
                                        (if (url.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is UrlCitation && endIndex == other.endIndex && startIndex == other.startIndex && title == other.title && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(endIndex, startIndex, title, type, url, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "UrlCitation{endIndex=$endIndex, startIndex=$startIndex, title=$title, type=$type, url=$url, additionalProperties=$additionalProperties}"
                            }

                            class ContainerFileCitation
                            private constructor(
                                private val containerId: JsonField<String>,
                                private val endIndex: JsonField<Long>,
                                private val fileId: JsonField<String>,
                                private val filename: JsonField<String>,
                                private val startIndex: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("container_id")
                                    @ExcludeMissing
                                    containerId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    endIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("filename")
                                    @ExcludeMissing
                                    filename: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    startIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(
                                    containerId,
                                    endIndex,
                                    fileId,
                                    filename,
                                    startIndex,
                                    type,
                                    mutableMapOf(),
                                )

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun containerId(): String = containerId.getRequired("container_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun endIndex(): Long = endIndex.getRequired("end_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun filename(): String = filename.getRequired("filename")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun startIndex(): Long = startIndex.getRequired("start_index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("container_file_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [containerId].
                                 *
                                 * Unlike [containerId], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("container_id")
                                @ExcludeMissing
                                fun _containerId(): JsonField<String> = containerId

                                /**
                                 * Returns the raw JSON value of [endIndex].
                                 *
                                 * Unlike [endIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("end_index")
                                @ExcludeMissing
                                fun _endIndex(): JsonField<Long> = endIndex

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [filename].
                                 *
                                 * Unlike [filename], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("filename")
                                @ExcludeMissing
                                fun _filename(): JsonField<String> = filename

                                /**
                                 * Returns the raw JSON value of [startIndex].
                                 *
                                 * Unlike [startIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("start_index")
                                @ExcludeMissing
                                fun _startIndex(): JsonField<Long> = startIndex

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [ContainerFileCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .containerId()
                                     * .endIndex()
                                     * .fileId()
                                     * .filename()
                                     * .startIndex()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ContainerFileCitation]. */
                                class Builder internal constructor() {

                                    private var containerId: JsonField<String>? = null
                                    private var endIndex: JsonField<Long>? = null
                                    private var fileId: JsonField<String>? = null
                                    private var filename: JsonField<String>? = null
                                    private var startIndex: JsonField<Long>? = null
                                    private var type: JsonValue =
                                        JsonValue.from("container_file_citation")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(
                                        containerFileCitation: ContainerFileCitation
                                    ) = apply {
                                        containerId = containerFileCitation.containerId
                                        endIndex = containerFileCitation.endIndex
                                        fileId = containerFileCitation.fileId
                                        filename = containerFileCitation.filename
                                        startIndex = containerFileCitation.startIndex
                                        type = containerFileCitation.type
                                        additionalProperties =
                                            containerFileCitation.additionalProperties
                                                .toMutableMap()
                                    }

                                    fun containerId(containerId: String) =
                                        containerId(JsonField.of(containerId))

                                    /**
                                     * Sets [Builder.containerId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.containerId] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun containerId(containerId: JsonField<String>) = apply {
                                        this.containerId = containerId
                                    }

                                    fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                    /**
                                     * Sets [Builder.endIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.endIndex] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun endIndex(endIndex: JsonField<Long>) = apply {
                                        this.endIndex = endIndex
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun filename(filename: String) =
                                        filename(JsonField.of(filename))

                                    /**
                                     * Sets [Builder.filename] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.filename] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun filename(filename: JsonField<String>) = apply {
                                        this.filename = filename
                                    }

                                    fun startIndex(startIndex: Long) =
                                        startIndex(JsonField.of(startIndex))

                                    /**
                                     * Sets [Builder.startIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.startIndex] with a
                                     * well-typed [Long] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun startIndex(startIndex: JsonField<Long>) = apply {
                                        this.startIndex = startIndex
                                    }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("container_file_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ContainerFileCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .containerId()
                                     * .endIndex()
                                     * .fileId()
                                     * .filename()
                                     * .startIndex()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): ContainerFileCitation =
                                        ContainerFileCitation(
                                            checkRequired("containerId", containerId),
                                            checkRequired("endIndex", endIndex),
                                            checkRequired("fileId", fileId),
                                            checkRequired("filename", filename),
                                            checkRequired("startIndex", startIndex),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): ContainerFileCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    containerId()
                                    endIndex()
                                    fileId()
                                    filename()
                                    startIndex()
                                    _type().let {
                                        if (it != JsonValue.from("container_file_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (containerId.asKnown() == null) 0 else 1) +
                                        (if (endIndex.asKnown() == null) 0 else 1) +
                                        (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (filename.asKnown() == null) 0 else 1) +
                                        (if (startIndex.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("container_file_citation")) 1
                                            else 0
                                        }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is ContainerFileCitation && containerId == other.containerId && endIndex == other.endIndex && fileId == other.fileId && filename == other.filename && startIndex == other.startIndex && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(containerId, endIndex, fileId, filename, startIndex, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ContainerFileCitation{containerId=$containerId, endIndex=$endIndex, fileId=$fileId, filename=$filename, startIndex=$startIndex, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class FilePath
                            private constructor(
                                private val fileId: JsonField<String>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(fileId, index, type, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("file_path")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [FilePath].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FilePath]. */
                                class Builder internal constructor() {

                                    private var fileId: JsonField<String>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("file_path")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(filePath: FilePath) = apply {
                                        fileId = filePath.fileId
                                        index = filePath.index
                                        type = filePath.type
                                        additionalProperties =
                                            filePath.additionalProperties.toMutableMap()
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("file_path")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FilePath].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FilePath =
                                        FilePath(
                                            checkRequired("fileId", fileId),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FilePath = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    fileId()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("file_path")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let { if (it == JsonValue.from("file_path")) 1 else 0 }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is FilePath && fileId == other.fileId && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(fileId, index, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FilePath{fileId=$fileId, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is OpenAIResponseOutputMessageContent && annotations == other.annotations && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(annotations, text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "OpenAIResponseOutputMessageContent{annotations=$annotations, text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }
                }

                class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val SYSTEM = of("system")

                        val DEVELOPER = of("developer")

                        val USER = of("user")

                        val ASSISTANT = of("assistant")

                        fun of(value: String) = Role(JsonField.of(value))
                    }

                    /** An enum containing [Role]'s known values. */
                    enum class Known {
                        SYSTEM,
                        DEVELOPER,
                        USER,
                        ASSISTANT,
                    }

                    /**
                     * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Role] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SYSTEM,
                        DEVELOPER,
                        USER,
                        ASSISTANT,
                        /**
                         * An enum member indicating that [Role] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SYSTEM -> Value.SYSTEM
                            DEVELOPER -> Value.DEVELOPER
                            USER -> Value.USER
                            ASSISTANT -> Value.ASSISTANT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   is a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SYSTEM -> Known.SYSTEM
                            DEVELOPER -> Known.DEVELOPER
                            USER -> Known.USER
                            ASSISTANT -> Known.ASSISTANT
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Role: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Role = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OpenAIResponseMessage && content == other.content && role == other.role && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(content, role, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OpenAIResponseMessage{content=$content, role=$role, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }
        }
    }

    class Text
    private constructor(
        private val format: JsonField<Format>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of()
        ) : this(format, mutableMapOf())

        /**
         * Configuration for Responses API text format.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun format(): Format? = format.getNullable("format")

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Text]. */
            fun builder() = Builder()
        }

        /** A builder for [Text]. */
        class Builder internal constructor() {

            private var format: JsonField<Format> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(text: Text) = apply {
                format = text.format
                additionalProperties = text.additionalProperties.toMutableMap()
            }

            /** Configuration for Responses API text format. */
            fun format(format: Format) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [Format] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<Format>) = apply { this.format = format }

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

            /**
             * Returns an immutable instance of [Text].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Text = Text(format, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Text = apply {
            if (validated) {
                return@apply
            }

            format()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (format.asKnown()?.validity() ?: 0)

        /** Configuration for Responses API text format. */
        class Format
        private constructor(
            private val type: JsonField<Type>,
            private val description: JsonField<String>,
            private val name: JsonField<String>,
            private val schema: JsonField<Schema>,
            private val strict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("schema")
                @ExcludeMissing
                schema: JsonField<Schema> = JsonMissing.of(),
                @JsonProperty("strict")
                @ExcludeMissing
                strict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(type, description, name, schema, strict, mutableMapOf())

            /**
             * Must be "text", "json_schema", or "json_object" to identify the format type
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * (Optional) A description of the response format. Only used for json_schema.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * The name of the response format. Only used for json_schema.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * The JSON schema the response should conform to. In a Python SDK, this is often a
             * `pydantic` model. Only used for json_schema.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun schema(): Schema? = schema.getNullable("schema")

            /**
             * (Optional) Whether to strictly enforce the JSON schema. If true, the response must
             * match the schema exactly. Only used for json_schema.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun strict(): Boolean? = strict.getNullable("strict")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [schema].
             *
             * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<Schema> = schema

            /**
             * Returns the raw JSON value of [strict].
             *
             * Unlike [strict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("strict") @ExcludeMissing fun _strict(): JsonField<Boolean> = strict

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Format].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Format]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var schema: JsonField<Schema> = JsonMissing.of()
                private var strict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(format: Format) = apply {
                    type = format.type
                    description = format.description
                    name = format.name
                    schema = format.schema
                    strict = format.strict
                    additionalProperties = format.additionalProperties.toMutableMap()
                }

                /** Must be "text", "json_schema", or "json_object" to identify the format type */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** (Optional) A description of the response format. Only used for json_schema. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The name of the response format. Only used for json_schema. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The JSON schema the response should conform to. In a Python SDK, this is often a
                 * `pydantic` model. Only used for json_schema.
                 */
                fun schema(schema: Schema) = schema(JsonField.of(schema))

                /**
                 * Sets [Builder.schema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schema] with a well-typed [Schema] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                /**
                 * (Optional) Whether to strictly enforce the JSON schema. If true, the response
                 * must match the schema exactly. Only used for json_schema.
                 */
                fun strict(strict: Boolean) = strict(JsonField.of(strict))

                /**
                 * Sets [Builder.strict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.strict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

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

                /**
                 * Returns an immutable instance of [Format].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Format =
                    Format(
                        checkRequired("type", type),
                        description,
                        name,
                        schema,
                        strict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Format = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                description()
                name()
                schema()?.validate()
                strict()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (type.asKnown()?.validity() ?: 0) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (schema.asKnown()?.validity() ?: 0) +
                    (if (strict.asKnown() == null) 0 else 1)

            /** Must be "text", "json_schema", or "json_object" to identify the format type */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val TEXT = of("text")

                    val JSON_SCHEMA = of("json_schema")

                    val JSON_OBJECT = of("json_object")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TEXT,
                    JSON_SCHEMA,
                    JSON_OBJECT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TEXT,
                    JSON_SCHEMA,
                    JSON_OBJECT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TEXT -> Value.TEXT
                        JSON_SCHEMA -> Value.JSON_SCHEMA
                        JSON_OBJECT -> Value.JSON_OBJECT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        TEXT -> Known.TEXT
                        JSON_SCHEMA -> Known.JSON_SCHEMA
                        JSON_OBJECT -> Known.JSON_OBJECT
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The JSON schema the response should conform to. In a Python SDK, this is often a
             * `pydantic` model. Only used for json_schema.
             */
            class Schema
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Schema]. */
                    fun builder() = Builder()
                }

                /** A builder for [Schema]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(schema: Schema) = apply {
                        additionalProperties = schema.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [Schema].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Schema = Schema(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Schema = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Schema && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Schema{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Format && type == other.type && description == other.description && name == other.name && schema == other.schema && strict == other.strict && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, description, name, schema, strict, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Format{type=$type, description=$description, name=$name, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Text && format == other.format && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(format, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Text{format=$format, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Tool.Deserializer::class)
    @JsonSerialize(using = Tool.Serializer::class)
    class Tool
    private constructor(
        private val openaiResponseInputToolWebSearch: OpenAIResponseInputToolWebSearch? = null,
        private val fileSearch: FileSearch? = null,
        private val function: Function? = null,
        private val mcp: Mcp? = null,
        private val _json: JsonValue? = null,
    ) {

        fun openaiResponseInputToolWebSearch(): OpenAIResponseInputToolWebSearch? =
            openaiResponseInputToolWebSearch

        fun fileSearch(): FileSearch? = fileSearch

        fun function(): Function? = function

        fun mcp(): Mcp? = mcp

        fun isOpenAIResponseInputToolWebSearch(): Boolean = openaiResponseInputToolWebSearch != null

        fun isFileSearch(): Boolean = fileSearch != null

        fun isFunction(): Boolean = function != null

        fun isMcp(): Boolean = mcp != null

        fun asOpenAIResponseInputToolWebSearch(): OpenAIResponseInputToolWebSearch =
            openaiResponseInputToolWebSearch.getOrThrow("openaiResponseInputToolWebSearch")

        fun asFileSearch(): FileSearch = fileSearch.getOrThrow("fileSearch")

        fun asFunction(): Function = function.getOrThrow("function")

        fun asMcp(): Mcp = mcp.getOrThrow("mcp")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                openaiResponseInputToolWebSearch != null ->
                    visitor.visitOpenAIResponseInputToolWebSearch(openaiResponseInputToolWebSearch)
                fileSearch != null -> visitor.visitFileSearch(fileSearch)
                function != null -> visitor.visitFunction(function)
                mcp != null -> visitor.visitMcp(mcp)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Tool = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOpenAIResponseInputToolWebSearch(
                        openaiResponseInputToolWebSearch: OpenAIResponseInputToolWebSearch
                    ) {
                        openaiResponseInputToolWebSearch.validate()
                    }

                    override fun visitFileSearch(fileSearch: FileSearch) {
                        fileSearch.validate()
                    }

                    override fun visitFunction(function: Function) {
                        function.validate()
                    }

                    override fun visitMcp(mcp: Mcp) {
                        mcp.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitOpenAIResponseInputToolWebSearch(
                        openaiResponseInputToolWebSearch: OpenAIResponseInputToolWebSearch
                    ) = openaiResponseInputToolWebSearch.validity()

                    override fun visitFileSearch(fileSearch: FileSearch) = fileSearch.validity()

                    override fun visitFunction(function: Function) = function.validity()

                    override fun visitMcp(mcp: Mcp) = mcp.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tool && openaiResponseInputToolWebSearch == other.openaiResponseInputToolWebSearch && fileSearch == other.fileSearch && function == other.function && mcp == other.mcp /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(openaiResponseInputToolWebSearch, fileSearch, function, mcp) /* spotless:on */

        override fun toString(): String =
            when {
                openaiResponseInputToolWebSearch != null ->
                    "Tool{openaiResponseInputToolWebSearch=$openaiResponseInputToolWebSearch}"
                fileSearch != null -> "Tool{fileSearch=$fileSearch}"
                function != null -> "Tool{function=$function}"
                mcp != null -> "Tool{mcp=$mcp}"
                _json != null -> "Tool{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Tool")
            }

        companion object {

            fun ofOpenAIResponseInputToolWebSearch(
                openaiResponseInputToolWebSearch: OpenAIResponseInputToolWebSearch
            ) = Tool(openaiResponseInputToolWebSearch = openaiResponseInputToolWebSearch)

            fun ofFileSearch(fileSearch: FileSearch) = Tool(fileSearch = fileSearch)

            fun ofFunction(function: Function) = Tool(function = function)

            fun ofMcp(mcp: Mcp) = Tool(mcp = mcp)
        }

        /** An interface that defines how to map each variant of [Tool] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOpenAIResponseInputToolWebSearch(
                openaiResponseInputToolWebSearch: OpenAIResponseInputToolWebSearch
            ): T

            fun visitFileSearch(fileSearch: FileSearch): T

            fun visitFunction(function: Function): T

            fun visitMcp(mcp: Mcp): T

            /**
             * Maps an unknown variant of [Tool] to a value of type [T].
             *
             * An instance of [Tool] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Tool: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Tool>(Tool::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Tool {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "file_search" -> {
                        return tryDeserialize(node, jacksonTypeRef<FileSearch>())?.let {
                            Tool(fileSearch = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "function" -> {
                        return tryDeserialize(node, jacksonTypeRef<Function>())?.let {
                            Tool(function = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "mcp" -> {
                        return tryDeserialize(node, jacksonTypeRef<Mcp>())?.let {
                            Tool(mcp = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                }

                return tryDeserialize(node, jacksonTypeRef<OpenAIResponseInputToolWebSearch>())
                    ?.let { Tool(openaiResponseInputToolWebSearch = it, _json = json) }
                    ?: Tool(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Tool>(Tool::class) {

            override fun serialize(
                value: Tool,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.openaiResponseInputToolWebSearch != null ->
                        generator.writeObject(value.openaiResponseInputToolWebSearch)
                    value.fileSearch != null -> generator.writeObject(value.fileSearch)
                    value.function != null -> generator.writeObject(value.function)
                    value.mcp != null -> generator.writeObject(value.mcp)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Tool")
                }
            }
        }

        class OpenAIResponseInputToolWebSearch
        private constructor(
            private val type: JsonField<Type>,
            private val searchContextSize: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("search_context_size")
                @ExcludeMissing
                searchContextSize: JsonField<String> = JsonMissing.of(),
            ) : this(type, searchContextSize, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun searchContextSize(): String? = searchContextSize.getNullable("search_context_size")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [searchContextSize].
             *
             * Unlike [searchContextSize], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("search_context_size")
            @ExcludeMissing
            fun _searchContextSize(): JsonField<String> = searchContextSize

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [OpenAIResponseInputToolWebSearch].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OpenAIResponseInputToolWebSearch]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var searchContextSize: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    openaiResponseInputToolWebSearch: OpenAIResponseInputToolWebSearch
                ) = apply {
                    type = openaiResponseInputToolWebSearch.type
                    searchContextSize = openaiResponseInputToolWebSearch.searchContextSize
                    additionalProperties =
                        openaiResponseInputToolWebSearch.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun searchContextSize(searchContextSize: String) =
                    searchContextSize(JsonField.of(searchContextSize))

                /**
                 * Sets [Builder.searchContextSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.searchContextSize] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun searchContextSize(searchContextSize: JsonField<String>) = apply {
                    this.searchContextSize = searchContextSize
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

                /**
                 * Returns an immutable instance of [OpenAIResponseInputToolWebSearch].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OpenAIResponseInputToolWebSearch =
                    OpenAIResponseInputToolWebSearch(
                        checkRequired("type", type),
                        searchContextSize,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OpenAIResponseInputToolWebSearch = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                searchContextSize()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (type.asKnown()?.validity() ?: 0) +
                    (if (searchContextSize.asKnown() == null) 0 else 1)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val WEB_SEARCH = of("web_search")

                    val WEB_SEARCH_PREVIEW = of("web_search_preview")

                    val WEB_SEARCH_PREVIEW_2025_03_11 = of("web_search_preview_2025_03_11")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    WEB_SEARCH,
                    WEB_SEARCH_PREVIEW,
                    WEB_SEARCH_PREVIEW_2025_03_11,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WEB_SEARCH,
                    WEB_SEARCH_PREVIEW,
                    WEB_SEARCH_PREVIEW_2025_03_11,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WEB_SEARCH -> Value.WEB_SEARCH
                        WEB_SEARCH_PREVIEW -> Value.WEB_SEARCH_PREVIEW
                        WEB_SEARCH_PREVIEW_2025_03_11 -> Value.WEB_SEARCH_PREVIEW_2025_03_11
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        WEB_SEARCH -> Known.WEB_SEARCH
                        WEB_SEARCH_PREVIEW -> Known.WEB_SEARCH_PREVIEW
                        WEB_SEARCH_PREVIEW_2025_03_11 -> Known.WEB_SEARCH_PREVIEW_2025_03_11
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OpenAIResponseInputToolWebSearch && type == other.type && searchContextSize == other.searchContextSize && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, searchContextSize, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OpenAIResponseInputToolWebSearch{type=$type, searchContextSize=$searchContextSize, additionalProperties=$additionalProperties}"
        }

        class FileSearch
        private constructor(
            private val type: JsonValue,
            private val vectorStoreIds: JsonField<List<String>>,
            private val filters: JsonField<Filters>,
            private val maxNumResults: JsonField<Long>,
            private val rankingOptions: JsonField<RankingOptions>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("vector_store_ids")
                @ExcludeMissing
                vectorStoreIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<Filters> = JsonMissing.of(),
                @JsonProperty("max_num_results")
                @ExcludeMissing
                maxNumResults: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("ranking_options")
                @ExcludeMissing
                rankingOptions: JsonField<RankingOptions> = JsonMissing.of(),
            ) : this(type, vectorStoreIds, filters, maxNumResults, rankingOptions, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("file_search")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun vectorStoreIds(): List<String> = vectorStoreIds.getRequired("vector_store_ids")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun filters(): Filters? = filters.getNullable("filters")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxNumResults(): Long? = maxNumResults.getNullable("max_num_results")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun rankingOptions(): RankingOptions? = rankingOptions.getNullable("ranking_options")

            /**
             * Returns the raw JSON value of [vectorStoreIds].
             *
             * Unlike [vectorStoreIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("vector_store_ids")
            @ExcludeMissing
            fun _vectorStoreIds(): JsonField<List<String>> = vectorStoreIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

            /**
             * Returns the raw JSON value of [maxNumResults].
             *
             * Unlike [maxNumResults], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_num_results")
            @ExcludeMissing
            fun _maxNumResults(): JsonField<Long> = maxNumResults

            /**
             * Returns the raw JSON value of [rankingOptions].
             *
             * Unlike [rankingOptions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ranking_options")
            @ExcludeMissing
            fun _rankingOptions(): JsonField<RankingOptions> = rankingOptions

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [FileSearch].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .vectorStoreIds()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FileSearch]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("file_search")
                private var vectorStoreIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<Filters> = JsonMissing.of()
                private var maxNumResults: JsonField<Long> = JsonMissing.of()
                private var rankingOptions: JsonField<RankingOptions> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fileSearch: FileSearch) = apply {
                    type = fileSearch.type
                    vectorStoreIds = fileSearch.vectorStoreIds.map { it.toMutableList() }
                    filters = fileSearch.filters
                    maxNumResults = fileSearch.maxNumResults
                    rankingOptions = fileSearch.rankingOptions
                    additionalProperties = fileSearch.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("file_search")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun vectorStoreIds(vectorStoreIds: List<String>) =
                    vectorStoreIds(JsonField.of(vectorStoreIds))

                /**
                 * Sets [Builder.vectorStoreIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vectorStoreIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun vectorStoreIds(vectorStoreIds: JsonField<List<String>>) = apply {
                    this.vectorStoreIds = vectorStoreIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [vectorStoreIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addVectorStoreId(vectorStoreId: String) = apply {
                    vectorStoreIds =
                        (vectorStoreIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("vectorStoreIds", it).add(vectorStoreId)
                        }
                }

                fun filters(filters: Filters) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed [Filters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

                fun maxNumResults(maxNumResults: Long) = maxNumResults(JsonField.of(maxNumResults))

                /**
                 * Sets [Builder.maxNumResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxNumResults] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxNumResults(maxNumResults: JsonField<Long>) = apply {
                    this.maxNumResults = maxNumResults
                }

                fun rankingOptions(rankingOptions: RankingOptions) =
                    rankingOptions(JsonField.of(rankingOptions))

                /**
                 * Sets [Builder.rankingOptions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rankingOptions] with a well-typed
                 * [RankingOptions] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun rankingOptions(rankingOptions: JsonField<RankingOptions>) = apply {
                    this.rankingOptions = rankingOptions
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

                /**
                 * Returns an immutable instance of [FileSearch].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .vectorStoreIds()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FileSearch =
                    FileSearch(
                        type,
                        checkRequired("vectorStoreIds", vectorStoreIds).map { it.toImmutable() },
                        filters,
                        maxNumResults,
                        rankingOptions,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FileSearch = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("file_search")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                vectorStoreIds()
                filters()?.validate()
                maxNumResults()
                rankingOptions()?.validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                type.let { if (it == JsonValue.from("file_search")) 1 else 0 } +
                    (vectorStoreIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.validity() ?: 0) +
                    (if (maxNumResults.asKnown() == null) 0 else 1) +
                    (rankingOptions.asKnown()?.validity() ?: 0)

            class Filters
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Filters]. */
                    fun builder() = Builder()
                }

                /** A builder for [Filters]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filters: Filters) = apply {
                        additionalProperties = filters.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [Filters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Filters = Filters(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Filters = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filters && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Filters{additionalProperties=$additionalProperties}"
            }

            class RankingOptions
            private constructor(
                private val ranker: JsonField<String>,
                private val scoreThreshold: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("ranker")
                    @ExcludeMissing
                    ranker: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("score_threshold")
                    @ExcludeMissing
                    scoreThreshold: JsonField<Double> = JsonMissing.of(),
                ) : this(ranker, scoreThreshold, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun ranker(): String? = ranker.getNullable("ranker")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun scoreThreshold(): Double? = scoreThreshold.getNullable("score_threshold")

                /**
                 * Returns the raw JSON value of [ranker].
                 *
                 * Unlike [ranker], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("ranker") @ExcludeMissing fun _ranker(): JsonField<String> = ranker

                /**
                 * Returns the raw JSON value of [scoreThreshold].
                 *
                 * Unlike [scoreThreshold], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("score_threshold")
                @ExcludeMissing
                fun _scoreThreshold(): JsonField<Double> = scoreThreshold

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [RankingOptions].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [RankingOptions]. */
                class Builder internal constructor() {

                    private var ranker: JsonField<String> = JsonMissing.of()
                    private var scoreThreshold: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(rankingOptions: RankingOptions) = apply {
                        ranker = rankingOptions.ranker
                        scoreThreshold = rankingOptions.scoreThreshold
                        additionalProperties = rankingOptions.additionalProperties.toMutableMap()
                    }

                    fun ranker(ranker: String) = ranker(JsonField.of(ranker))

                    /**
                     * Sets [Builder.ranker] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ranker] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ranker(ranker: JsonField<String>) = apply { this.ranker = ranker }

                    fun scoreThreshold(scoreThreshold: Double) =
                        scoreThreshold(JsonField.of(scoreThreshold))

                    /**
                     * Sets [Builder.scoreThreshold] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scoreThreshold] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun scoreThreshold(scoreThreshold: JsonField<Double>) = apply {
                        this.scoreThreshold = scoreThreshold
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

                    /**
                     * Returns an immutable instance of [RankingOptions].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RankingOptions =
                        RankingOptions(ranker, scoreThreshold, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): RankingOptions = apply {
                    if (validated) {
                        return@apply
                    }

                    ranker()
                    scoreThreshold()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (ranker.asKnown() == null) 0 else 1) +
                        (if (scoreThreshold.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RankingOptions && ranker == other.ranker && scoreThreshold == other.scoreThreshold && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(ranker, scoreThreshold, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RankingOptions{ranker=$ranker, scoreThreshold=$scoreThreshold, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FileSearch && type == other.type && vectorStoreIds == other.vectorStoreIds && filters == other.filters && maxNumResults == other.maxNumResults && rankingOptions == other.rankingOptions && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, vectorStoreIds, filters, maxNumResults, rankingOptions, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FileSearch{type=$type, vectorStoreIds=$vectorStoreIds, filters=$filters, maxNumResults=$maxNumResults, rankingOptions=$rankingOptions, additionalProperties=$additionalProperties}"
        }

        class Function
        private constructor(
            private val name: JsonField<String>,
            private val type: JsonValue,
            private val description: JsonField<String>,
            private val parameters: JsonField<Parameters>,
            private val strict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("strict")
                @ExcludeMissing
                strict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(name, type, description, parameters, strict, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("function")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun parameters(): Parameters? = parameters.getNullable("parameters")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun strict(): Boolean? = strict.getNullable("strict")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [strict].
             *
             * Unlike [strict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("strict") @ExcludeMissing fun _strict(): JsonField<Boolean> = strict

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Function].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("function")
                private var description: JsonField<String> = JsonMissing.of()
                private var parameters: JsonField<Parameters> = JsonMissing.of()
                private var strict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(function: Function) = apply {
                    name = function.name
                    type = function.type
                    description = function.description
                    parameters = function.parameters
                    strict = function.strict
                    additionalProperties = function.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("function")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parameters(parameters: JsonField<Parameters>) = apply {
                    this.parameters = parameters
                }

                fun strict(strict: Boolean) = strict(JsonField.of(strict))

                /**
                 * Sets [Builder.strict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.strict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

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

                /**
                 * Returns an immutable instance of [Function].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Function =
                    Function(
                        checkRequired("name", name),
                        type,
                        description,
                        parameters,
                        strict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                name()
                _type().let {
                    if (it != JsonValue.from("function")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                description()
                parameters()?.validate()
                strict()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (name.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("function")) 1 else 0 } +
                    (if (description.asKnown() == null) 0 else 1) +
                    (parameters.asKnown()?.validity() ?: 0) +
                    (if (strict.asKnown() == null) 0 else 1)

            class Parameters
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Parameters]. */
                    fun builder() = Builder()
                }

                /** A builder for [Parameters]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(parameters: Parameters) = apply {
                        additionalProperties = parameters.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [Parameters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Parameters = Parameters(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Parameters = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Parameters && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Function && name == other.name && type == other.type && description == other.description && parameters == other.parameters && strict == other.strict && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, type, description, parameters, strict, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{name=$name, type=$type, description=$description, parameters=$parameters, strict=$strict, additionalProperties=$additionalProperties}"
        }

        class Mcp
        private constructor(
            private val requireApproval: JsonField<RequireApproval>,
            private val serverLabel: JsonField<String>,
            private val serverUrl: JsonField<String>,
            private val type: JsonValue,
            private val allowedTools: JsonField<AllowedTools>,
            private val headers: JsonField<Headers>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("require_approval")
                @ExcludeMissing
                requireApproval: JsonField<RequireApproval> = JsonMissing.of(),
                @JsonProperty("server_label")
                @ExcludeMissing
                serverLabel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("server_url")
                @ExcludeMissing
                serverUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("allowed_tools")
                @ExcludeMissing
                allowedTools: JsonField<AllowedTools> = JsonMissing.of(),
                @JsonProperty("headers")
                @ExcludeMissing
                headers: JsonField<Headers> = JsonMissing.of(),
            ) : this(
                requireApproval,
                serverLabel,
                serverUrl,
                type,
                allowedTools,
                headers,
                mutableMapOf(),
            )

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requireApproval(): RequireApproval = requireApproval.getRequired("require_approval")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serverLabel(): String = serverLabel.getRequired("server_label")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serverUrl(): String = serverUrl.getRequired("server_url")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("mcp")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun allowedTools(): AllowedTools? = allowedTools.getNullable("allowed_tools")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun headers(): Headers? = headers.getNullable("headers")

            /**
             * Returns the raw JSON value of [requireApproval].
             *
             * Unlike [requireApproval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("require_approval")
            @ExcludeMissing
            fun _requireApproval(): JsonField<RequireApproval> = requireApproval

            /**
             * Returns the raw JSON value of [serverLabel].
             *
             * Unlike [serverLabel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("server_label")
            @ExcludeMissing
            fun _serverLabel(): JsonField<String> = serverLabel

            /**
             * Returns the raw JSON value of [serverUrl].
             *
             * Unlike [serverUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("server_url")
            @ExcludeMissing
            fun _serverUrl(): JsonField<String> = serverUrl

            /**
             * Returns the raw JSON value of [allowedTools].
             *
             * Unlike [allowedTools], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allowed_tools")
            @ExcludeMissing
            fun _allowedTools(): JsonField<AllowedTools> = allowedTools

            /**
             * Returns the raw JSON value of [headers].
             *
             * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Mcp].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .requireApproval()
                 * .serverLabel()
                 * .serverUrl()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Mcp]. */
            class Builder internal constructor() {

                private var requireApproval: JsonField<RequireApproval>? = null
                private var serverLabel: JsonField<String>? = null
                private var serverUrl: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("mcp")
                private var allowedTools: JsonField<AllowedTools> = JsonMissing.of()
                private var headers: JsonField<Headers> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mcp: Mcp) = apply {
                    requireApproval = mcp.requireApproval
                    serverLabel = mcp.serverLabel
                    serverUrl = mcp.serverUrl
                    type = mcp.type
                    allowedTools = mcp.allowedTools
                    headers = mcp.headers
                    additionalProperties = mcp.additionalProperties.toMutableMap()
                }

                fun requireApproval(requireApproval: RequireApproval) =
                    requireApproval(JsonField.of(requireApproval))

                /**
                 * Sets [Builder.requireApproval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requireApproval] with a well-typed
                 * [RequireApproval] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun requireApproval(requireApproval: JsonField<RequireApproval>) = apply {
                    this.requireApproval = requireApproval
                }

                /**
                 * Alias for calling [requireApproval] with
                 * `RequireApproval.ofUnionMember0(unionMember0)`.
                 */
                fun requireApproval(unionMember0: RequireApproval.UnionMember0) =
                    requireApproval(RequireApproval.ofUnionMember0(unionMember0))

                /**
                 * Alias for calling [requireApproval] with
                 * `RequireApproval.ofApprovalFilter(approvalFilter)`.
                 */
                fun requireApproval(approvalFilter: RequireApproval.ApprovalFilter) =
                    requireApproval(RequireApproval.ofApprovalFilter(approvalFilter))

                fun serverLabel(serverLabel: String) = serverLabel(JsonField.of(serverLabel))

                /**
                 * Sets [Builder.serverLabel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serverLabel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun serverLabel(serverLabel: JsonField<String>) = apply {
                    this.serverLabel = serverLabel
                }

                fun serverUrl(serverUrl: String) = serverUrl(JsonField.of(serverUrl))

                /**
                 * Sets [Builder.serverUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serverUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun serverUrl(serverUrl: JsonField<String>) = apply { this.serverUrl = serverUrl }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("mcp")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun allowedTools(allowedTools: AllowedTools) =
                    allowedTools(JsonField.of(allowedTools))

                /**
                 * Sets [Builder.allowedTools] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedTools] with a well-typed [AllowedTools]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun allowedTools(allowedTools: JsonField<AllowedTools>) = apply {
                    this.allowedTools = allowedTools
                }

                /** Alias for calling [allowedTools] with `AllowedTools.ofStrings(strings)`. */
                fun allowedToolsOfStrings(strings: List<String>) =
                    allowedTools(AllowedTools.ofStrings(strings))

                /** Alias for calling [allowedTools] with `AllowedTools.ofFilter(filter)`. */
                fun allowedTools(filter: AllowedTools.AllowedToolsFilter) =
                    allowedTools(AllowedTools.ofFilter(filter))

                fun headers(headers: Headers) = headers(JsonField.of(headers))

                /**
                 * Sets [Builder.headers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headers] with a well-typed [Headers] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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

                /**
                 * Returns an immutable instance of [Mcp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .requireApproval()
                 * .serverLabel()
                 * .serverUrl()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Mcp =
                    Mcp(
                        checkRequired("requireApproval", requireApproval),
                        checkRequired("serverLabel", serverLabel),
                        checkRequired("serverUrl", serverUrl),
                        type,
                        allowedTools,
                        headers,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Mcp = apply {
                if (validated) {
                    return@apply
                }

                requireApproval().validate()
                serverLabel()
                serverUrl()
                _type().let {
                    if (it != JsonValue.from("mcp")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                allowedTools()?.validate()
                headers()?.validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (requireApproval.asKnown()?.validity() ?: 0) +
                    (if (serverLabel.asKnown() == null) 0 else 1) +
                    (if (serverUrl.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("mcp")) 1 else 0 } +
                    (allowedTools.asKnown()?.validity() ?: 0) +
                    (headers.asKnown()?.validity() ?: 0)

            @JsonDeserialize(using = RequireApproval.Deserializer::class)
            @JsonSerialize(using = RequireApproval.Serializer::class)
            class RequireApproval
            private constructor(
                private val unionMember0: UnionMember0? = null,
                private val approvalFilter: ApprovalFilter? = null,
                private val _json: JsonValue? = null,
            ) {

                fun unionMember0(): UnionMember0? = unionMember0

                fun approvalFilter(): ApprovalFilter? = approvalFilter

                fun isUnionMember0(): Boolean = unionMember0 != null

                fun isApprovalFilter(): Boolean = approvalFilter != null

                fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                fun asApprovalFilter(): ApprovalFilter = approvalFilter.getOrThrow("approvalFilter")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                        approvalFilter != null -> visitor.visitApprovalFilter(approvalFilter)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): RequireApproval = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) {
                                unionMember0.validate()
                            }

                            override fun visitApprovalFilter(approvalFilter: ApprovalFilter) {
                                approvalFilter.validate()
                            }
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) =
                                unionMember0.validity()

                            override fun visitApprovalFilter(approvalFilter: ApprovalFilter) =
                                approvalFilter.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RequireApproval && unionMember0 == other.unionMember0 && approvalFilter == other.approvalFilter /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, approvalFilter) /* spotless:on */

                override fun toString(): String =
                    when {
                        unionMember0 != null -> "RequireApproval{unionMember0=$unionMember0}"
                        approvalFilter != null -> "RequireApproval{approvalFilter=$approvalFilter}"
                        _json != null -> "RequireApproval{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid RequireApproval")
                    }

                companion object {

                    fun ofUnionMember0(unionMember0: UnionMember0) =
                        RequireApproval(unionMember0 = unionMember0)

                    fun ofApprovalFilter(approvalFilter: ApprovalFilter) =
                        RequireApproval(approvalFilter = approvalFilter)
                }

                /**
                 * An interface that defines how to map each variant of [RequireApproval] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitUnionMember0(unionMember0: UnionMember0): T

                    fun visitApprovalFilter(approvalFilter: ApprovalFilter): T

                    /**
                     * Maps an unknown variant of [RequireApproval] to a value of type [T].
                     *
                     * An instance of [RequireApproval] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LlamaStackClientInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown RequireApproval: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<RequireApproval>(RequireApproval::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): RequireApproval {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                        RequireApproval(unionMember0 = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<ApprovalFilter>())?.let {
                                        RequireApproval(approvalFilter = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // array).
                            0 -> RequireApproval(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<RequireApproval>(RequireApproval::class) {

                    override fun serialize(
                        value: RequireApproval,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                            value.approvalFilter != null ->
                                generator.writeObject(value.approvalFilter)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid RequireApproval")
                        }
                    }
                }

                class UnionMember0
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ALWAYS = of("always")

                        val NEVER = of("never")

                        fun of(value: String) = UnionMember0(JsonField.of(value))
                    }

                    /** An enum containing [UnionMember0]'s known values. */
                    enum class Known {
                        ALWAYS,
                        NEVER,
                    }

                    /**
                     * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [UnionMember0] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ALWAYS,
                        NEVER,
                        /**
                         * An enum member indicating that [UnionMember0] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ALWAYS -> Value.ALWAYS
                            NEVER -> Value.NEVER
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   is a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ALWAYS -> Known.ALWAYS
                            NEVER -> Known.NEVER
                            else ->
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown UnionMember0: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): UnionMember0 = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is UnionMember0 && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class ApprovalFilter
                private constructor(
                    private val always: JsonField<List<String>>,
                    private val never: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("always")
                        @ExcludeMissing
                        always: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("never")
                        @ExcludeMissing
                        never: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(always, never, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun always(): List<String>? = always.getNullable("always")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun never(): List<String>? = never.getNullable("never")

                    /**
                     * Returns the raw JSON value of [always].
                     *
                     * Unlike [always], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("always")
                    @ExcludeMissing
                    fun _always(): JsonField<List<String>> = always

                    /**
                     * Returns the raw JSON value of [never].
                     *
                     * Unlike [never], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("never")
                    @ExcludeMissing
                    fun _never(): JsonField<List<String>> = never

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [ApprovalFilter].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ApprovalFilter]. */
                    class Builder internal constructor() {

                        private var always: JsonField<MutableList<String>>? = null
                        private var never: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(approvalFilter: ApprovalFilter) = apply {
                            always = approvalFilter.always.map { it.toMutableList() }
                            never = approvalFilter.never.map { it.toMutableList() }
                            additionalProperties =
                                approvalFilter.additionalProperties.toMutableMap()
                        }

                        fun always(always: List<String>) = always(JsonField.of(always))

                        /**
                         * Sets [Builder.always] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.always] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun always(always: JsonField<List<String>>) = apply {
                            this.always = always.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [always].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addAlway(alway: String) = apply {
                            always =
                                (always ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("always", it).add(alway)
                                }
                        }

                        fun never(never: List<String>) = never(JsonField.of(never))

                        /**
                         * Sets [Builder.never] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.never] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun never(never: JsonField<List<String>>) = apply {
                            this.never = never.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [Builder.never].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addNever(never: String) = apply {
                            this.never =
                                (this.never ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("never", it).add(never)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ApprovalFilter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ApprovalFilter =
                            ApprovalFilter(
                                (always ?: JsonMissing.of()).map { it.toImmutable() },
                                (never ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ApprovalFilter = apply {
                        if (validated) {
                            return@apply
                        }

                        always()
                        never()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (always.asKnown()?.size ?: 0) + (never.asKnown()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ApprovalFilter && always == other.always && never == other.never && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(always, never, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ApprovalFilter{always=$always, never=$never, additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(using = AllowedTools.Deserializer::class)
            @JsonSerialize(using = AllowedTools.Serializer::class)
            class AllowedTools
            private constructor(
                private val strings: List<String>? = null,
                private val filter: AllowedToolsFilter? = null,
                private val _json: JsonValue? = null,
            ) {

                fun strings(): List<String>? = strings

                fun filter(): AllowedToolsFilter? = filter

                fun isStrings(): Boolean = strings != null

                fun isFilter(): Boolean = filter != null

                fun asStrings(): List<String> = strings.getOrThrow("strings")

                fun asFilter(): AllowedToolsFilter = filter.getOrThrow("filter")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        strings != null -> visitor.visitStrings(strings)
                        filter != null -> visitor.visitFilter(filter)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): AllowedTools = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitStrings(strings: List<String>) {}

                            override fun visitFilter(filter: AllowedToolsFilter) {
                                filter.validate()
                            }
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitStrings(strings: List<String>) = strings.size

                            override fun visitFilter(filter: AllowedToolsFilter) = filter.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AllowedTools && strings == other.strings && filter == other.filter /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(strings, filter) /* spotless:on */

                override fun toString(): String =
                    when {
                        strings != null -> "AllowedTools{strings=$strings}"
                        filter != null -> "AllowedTools{filter=$filter}"
                        _json != null -> "AllowedTools{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid AllowedTools")
                    }

                companion object {

                    fun ofStrings(strings: List<String>) = AllowedTools(strings = strings)

                    fun ofFilter(filter: AllowedToolsFilter) = AllowedTools(filter = filter)
                }

                /**
                 * An interface that defines how to map each variant of [AllowedTools] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitStrings(strings: List<String>): T

                    fun visitFilter(filter: AllowedToolsFilter): T

                    /**
                     * Maps an unknown variant of [AllowedTools] to a value of type [T].
                     *
                     * An instance of [AllowedTools] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LlamaStackClientInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown AllowedTools: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<AllowedTools>(AllowedTools::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): AllowedTools {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<AllowedToolsFilter>())
                                        ?.let { AllowedTools(filter = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        AllowedTools(strings = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> AllowedTools(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<AllowedTools>(AllowedTools::class) {

                    override fun serialize(
                        value: AllowedTools,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.strings != null -> generator.writeObject(value.strings)
                            value.filter != null -> generator.writeObject(value.filter)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid AllowedTools")
                        }
                    }
                }

                class AllowedToolsFilter
                private constructor(
                    private val toolNames: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tool_names")
                        @ExcludeMissing
                        toolNames: JsonField<List<String>> = JsonMissing.of()
                    ) : this(toolNames, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun toolNames(): List<String>? = toolNames.getNullable("tool_names")

                    /**
                     * Returns the raw JSON value of [toolNames].
                     *
                     * Unlike [toolNames], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("tool_names")
                    @ExcludeMissing
                    fun _toolNames(): JsonField<List<String>> = toolNames

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [AllowedToolsFilter].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [AllowedToolsFilter]. */
                    class Builder internal constructor() {

                        private var toolNames: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(allowedToolsFilter: AllowedToolsFilter) = apply {
                            toolNames = allowedToolsFilter.toolNames.map { it.toMutableList() }
                            additionalProperties =
                                allowedToolsFilter.additionalProperties.toMutableMap()
                        }

                        fun toolNames(toolNames: List<String>) = toolNames(JsonField.of(toolNames))

                        /**
                         * Sets [Builder.toolNames] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.toolNames] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun toolNames(toolNames: JsonField<List<String>>) = apply {
                            this.toolNames = toolNames.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [toolNames].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addToolName(toolName: String) = apply {
                            toolNames =
                                (toolNames ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("toolNames", it).add(toolName)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AllowedToolsFilter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): AllowedToolsFilter =
                            AllowedToolsFilter(
                                (toolNames ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): AllowedToolsFilter = apply {
                        if (validated) {
                            return@apply
                        }

                        toolNames()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = (toolNames.asKnown()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AllowedToolsFilter && toolNames == other.toolNames && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(toolNames, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AllowedToolsFilter{toolNames=$toolNames, additionalProperties=$additionalProperties}"
                }
            }

            class Headers
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Headers]. */
                    fun builder() = Builder()
                }

                /** A builder for [Headers]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(headers: Headers) = apply {
                        additionalProperties = headers.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [Headers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Headers = Headers(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Headers = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Headers && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Headers{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Mcp && requireApproval == other.requireApproval && serverLabel == other.serverLabel && serverUrl == other.serverUrl && type == other.type && allowedTools == other.allowedTools && headers == other.headers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(requireApproval, serverLabel, serverUrl, type, allowedTools, headers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mcp{requireApproval=$requireApproval, serverLabel=$serverLabel, serverUrl=$serverUrl, type=$type, allowedTools=$allowedTools, headers=$headers, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ResponseCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
