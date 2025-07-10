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
import com.llama.llamastack.core.allMaxBy
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class ResponseObject
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val model: JsonField<String>,
    private val object_: JsonValue,
    private val output: JsonField<List<Output>>,
    private val parallelToolCalls: JsonField<Boolean>,
    private val status: JsonField<String>,
    private val text: JsonField<Text>,
    private val error: JsonField<Error>,
    private val previousResponseId: JsonField<String>,
    private val temperature: JsonField<Double>,
    private val topP: JsonField<Double>,
    private val truncation: JsonField<String>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonValue = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonField<List<Output>> = JsonMissing.of(),
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<Text> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
        @JsonProperty("previous_response_id")
        @ExcludeMissing
        previousResponseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("truncation")
        @ExcludeMissing
        truncation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        model,
        object_,
        output,
        parallelToolCalls,
        status,
        text,
        error,
        previousResponseId,
        temperature,
        topP,
        truncation,
        user,
        mutableMapOf(),
    )

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("response")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun output(): List<Output> = output.getRequired("output")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parallelToolCalls(): Boolean = parallelToolCalls.getRequired("parallel_tool_calls")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): Text = text.getRequired("text")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun error(): Error? = error.getNullable("error")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun previousResponseId(): String? = previousResponseId.getNullable("previous_response_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun temperature(): Double? = temperature.getNullable("temperature")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topP(): Double? = topP.getNullable("top_p")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun truncation(): String? = truncation.getNullable("truncation")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun user(): String? = user.getNullable("user")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [output].
     *
     * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<List<Output>> = output

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Text> = text

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

    /**
     * Returns the raw JSON value of [previousResponseId].
     *
     * Unlike [previousResponseId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_response_id")
    @ExcludeMissing
    fun _previousResponseId(): JsonField<String> = previousResponseId

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    /**
     * Returns the raw JSON value of [truncation].
     *
     * Unlike [truncation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truncation") @ExcludeMissing fun _truncation(): JsonField<String> = truncation

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
         * Returns a mutable builder for constructing an instance of [ResponseObject].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .model()
         * .output()
         * .parallelToolCalls()
         * .status()
         * .text()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ResponseObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Long>? = null
        private var model: JsonField<String>? = null
        private var object_: JsonValue = JsonValue.from("response")
        private var output: JsonField<MutableList<Output>>? = null
        private var parallelToolCalls: JsonField<Boolean>? = null
        private var status: JsonField<String>? = null
        private var text: JsonField<Text>? = null
        private var error: JsonField<Error> = JsonMissing.of()
        private var previousResponseId: JsonField<String> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var truncation: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(responseObject: ResponseObject) = apply {
            id = responseObject.id
            createdAt = responseObject.createdAt
            model = responseObject.model
            object_ = responseObject.object_
            output = responseObject.output.map { it.toMutableList() }
            parallelToolCalls = responseObject.parallelToolCalls
            status = responseObject.status
            text = responseObject.text
            error = responseObject.error
            previousResponseId = responseObject.previousResponseId
            temperature = responseObject.temperature
            topP = responseObject.topP
            truncation = responseObject.truncation
            user = responseObject.user
            additionalProperties = responseObject.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("response")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun object_(object_: JsonValue) = apply { this.object_ = object_ }

        fun output(output: List<Output>) = output(JsonField.of(output))

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed `List<Output>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun output(output: JsonField<List<Output>>) = apply {
            this.output = output.map { it.toMutableList() }
        }

        /**
         * Adds a single [Output] to [Builder.output].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutput(output: Output) = apply {
            this.output =
                (this.output ?: JsonField.of(mutableListOf())).also {
                    checkKnown("output", it).add(output)
                }
        }

        /** Alias for calling [addOutput] with `Output.ofMessage(message)`. */
        fun addOutput(message: Output.Message) = addOutput(Output.ofMessage(message))

        /** Alias for calling [addOutput] with `Output.ofWebSearchCall(webSearchCall)`. */
        fun addOutput(webSearchCall: Output.WebSearchCall) =
            addOutput(Output.ofWebSearchCall(webSearchCall))

        /** Alias for calling [addOutput] with `Output.ofFileSearchCall(fileSearchCall)`. */
        fun addOutput(fileSearchCall: Output.FileSearchCall) =
            addOutput(Output.ofFileSearchCall(fileSearchCall))

        /** Alias for calling [addOutput] with `Output.ofFunctionCall(functionCall)`. */
        fun addOutput(functionCall: Output.FunctionCall) =
            addOutput(Output.ofFunctionCall(functionCall))

        /** Alias for calling [addOutput] with `Output.ofMcpCall(mcpCall)`. */
        fun addOutput(mcpCall: Output.McpCall) = addOutput(Output.ofMcpCall(mcpCall))

        /** Alias for calling [addOutput] with `Output.ofMcpListTools(mcpListTools)`. */
        fun addOutput(mcpListTools: Output.McpListTools) =
            addOutput(Output.ofMcpListTools(mcpListTools))

        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(JsonField.of(parallelToolCalls))

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun text(text: Text) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Text] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Text>) = apply { this.text = text }

        fun error(error: Error) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [Error] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<Error>) = apply { this.error = error }

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

        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        fun topP(topP: Double) = topP(JsonField.of(topP))

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

        fun truncation(truncation: String) = truncation(JsonField.of(truncation))

        /**
         * Sets [Builder.truncation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truncation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truncation(truncation: JsonField<String>) = apply { this.truncation = truncation }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

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
         * Returns an immutable instance of [ResponseObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .model()
         * .output()
         * .parallelToolCalls()
         * .status()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResponseObject =
            ResponseObject(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("model", model),
                object_,
                checkRequired("output", output).map { it.toImmutable() },
                checkRequired("parallelToolCalls", parallelToolCalls),
                checkRequired("status", status),
                checkRequired("text", text),
                error,
                previousResponseId,
                temperature,
                topP,
                truncation,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ResponseObject = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        model()
        _object_().let {
            if (it != JsonValue.from("response")) {
                throw LlamaStackClientInvalidDataException("'object_' is invalid, received $it")
            }
        }
        output().forEach { it.validate() }
        parallelToolCalls()
        status()
        text().validate()
        error()?.validate()
        previousResponseId()
        temperature()
        topP()
        truncation()
        user()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (model.asKnown() == null) 0 else 1) +
            object_.let { if (it == JsonValue.from("response")) 1 else 0 } +
            (output.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (parallelToolCalls.asKnown() == null) 0 else 1) +
            (if (status.asKnown() == null) 0 else 1) +
            (text.asKnown()?.validity() ?: 0) +
            (error.asKnown()?.validity() ?: 0) +
            (if (previousResponseId.asKnown() == null) 0 else 1) +
            (if (temperature.asKnown() == null) 0 else 1) +
            (if (topP.asKnown() == null) 0 else 1) +
            (if (truncation.asKnown() == null) 0 else 1) +
            (if (user.asKnown() == null) 0 else 1)

    /**
     * Corresponds to the various Message types in the Responses API. They are all under one type
     * because the Responses API gives them all the same "type" value, and there is no way to tell
     * them apart in certain scenarios.
     */
    @JsonDeserialize(using = Output.Deserializer::class)
    @JsonSerialize(using = Output.Serializer::class)
    class Output
    private constructor(
        private val message: Message? = null,
        private val webSearchCall: WebSearchCall? = null,
        private val fileSearchCall: FileSearchCall? = null,
        private val functionCall: FunctionCall? = null,
        private val mcpCall: McpCall? = null,
        private val mcpListTools: McpListTools? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        fun message(): Message? = message

        fun webSearchCall(): WebSearchCall? = webSearchCall

        fun fileSearchCall(): FileSearchCall? = fileSearchCall

        fun functionCall(): FunctionCall? = functionCall

        fun mcpCall(): McpCall? = mcpCall

        fun mcpListTools(): McpListTools? = mcpListTools

        fun isMessage(): Boolean = message != null

        fun isWebSearchCall(): Boolean = webSearchCall != null

        fun isFileSearchCall(): Boolean = fileSearchCall != null

        fun isFunctionCall(): Boolean = functionCall != null

        fun isMcpCall(): Boolean = mcpCall != null

        fun isMcpListTools(): Boolean = mcpListTools != null

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        fun asMessage(): Message = message.getOrThrow("message")

        fun asWebSearchCall(): WebSearchCall = webSearchCall.getOrThrow("webSearchCall")

        fun asFileSearchCall(): FileSearchCall = fileSearchCall.getOrThrow("fileSearchCall")

        fun asFunctionCall(): FunctionCall = functionCall.getOrThrow("functionCall")

        fun asMcpCall(): McpCall = mcpCall.getOrThrow("mcpCall")

        fun asMcpListTools(): McpListTools = mcpListTools.getOrThrow("mcpListTools")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                message != null -> visitor.visitMessage(message)
                webSearchCall != null -> visitor.visitWebSearchCall(webSearchCall)
                fileSearchCall != null -> visitor.visitFileSearchCall(fileSearchCall)
                functionCall != null -> visitor.visitFunctionCall(functionCall)
                mcpCall != null -> visitor.visitMcpCall(mcpCall)
                mcpListTools != null -> visitor.visitMcpListTools(mcpListTools)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Output = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMessage(message: Message) {
                        message.validate()
                    }

                    override fun visitWebSearchCall(webSearchCall: WebSearchCall) {
                        webSearchCall.validate()
                    }

                    override fun visitFileSearchCall(fileSearchCall: FileSearchCall) {
                        fileSearchCall.validate()
                    }

                    override fun visitFunctionCall(functionCall: FunctionCall) {
                        functionCall.validate()
                    }

                    override fun visitMcpCall(mcpCall: McpCall) {
                        mcpCall.validate()
                    }

                    override fun visitMcpListTools(mcpListTools: McpListTools) {
                        mcpListTools.validate()
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
                    override fun visitMessage(message: Message) = message.validity()

                    override fun visitWebSearchCall(webSearchCall: WebSearchCall) =
                        webSearchCall.validity()

                    override fun visitFileSearchCall(fileSearchCall: FileSearchCall) =
                        fileSearchCall.validity()

                    override fun visitFunctionCall(functionCall: FunctionCall) =
                        functionCall.validity()

                    override fun visitMcpCall(mcpCall: McpCall) = mcpCall.validity()

                    override fun visitMcpListTools(mcpListTools: McpListTools) =
                        mcpListTools.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Output && message == other.message && webSearchCall == other.webSearchCall && fileSearchCall == other.fileSearchCall && functionCall == other.functionCall && mcpCall == other.mcpCall && mcpListTools == other.mcpListTools /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(message, webSearchCall, fileSearchCall, functionCall, mcpCall, mcpListTools) /* spotless:on */

        override fun toString(): String =
            when {
                message != null -> "Output{message=$message}"
                webSearchCall != null -> "Output{webSearchCall=$webSearchCall}"
                fileSearchCall != null -> "Output{fileSearchCall=$fileSearchCall}"
                functionCall != null -> "Output{functionCall=$functionCall}"
                mcpCall != null -> "Output{mcpCall=$mcpCall}"
                mcpListTools != null -> "Output{mcpListTools=$mcpListTools}"
                _json != null -> "Output{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Output")
            }

        companion object {

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun ofMessage(message: Message) = Output(message = message)

            fun ofWebSearchCall(webSearchCall: WebSearchCall) =
                Output(webSearchCall = webSearchCall)

            fun ofFileSearchCall(fileSearchCall: FileSearchCall) =
                Output(fileSearchCall = fileSearchCall)

            fun ofFunctionCall(functionCall: FunctionCall) = Output(functionCall = functionCall)

            fun ofMcpCall(mcpCall: McpCall) = Output(mcpCall = mcpCall)

            fun ofMcpListTools(mcpListTools: McpListTools) = Output(mcpListTools = mcpListTools)
        }

        /** An interface that defines how to map each variant of [Output] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun visitMessage(message: Message): T

            fun visitWebSearchCall(webSearchCall: WebSearchCall): T

            fun visitFileSearchCall(fileSearchCall: FileSearchCall): T

            fun visitFunctionCall(functionCall: FunctionCall): T

            fun visitMcpCall(mcpCall: McpCall): T

            fun visitMcpListTools(mcpListTools: McpListTools): T

            /**
             * Maps an unknown variant of [Output] to a value of type [T].
             *
             * An instance of [Output] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Output: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Output>(Output::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Output {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "message" -> {
                        return tryDeserialize(node, jacksonTypeRef<Message>())?.let {
                            Output(message = it, _json = json)
                        } ?: Output(_json = json)
                    }
                    "web_search_call" -> {
                        return tryDeserialize(node, jacksonTypeRef<WebSearchCall>())?.let {
                            Output(webSearchCall = it, _json = json)
                        } ?: Output(_json = json)
                    }
                    "file_search_call" -> {
                        return tryDeserialize(node, jacksonTypeRef<FileSearchCall>())?.let {
                            Output(fileSearchCall = it, _json = json)
                        } ?: Output(_json = json)
                    }
                    "function_call" -> {
                        return tryDeserialize(node, jacksonTypeRef<FunctionCall>())?.let {
                            Output(functionCall = it, _json = json)
                        } ?: Output(_json = json)
                    }
                    "mcp_call" -> {
                        return tryDeserialize(node, jacksonTypeRef<McpCall>())?.let {
                            Output(mcpCall = it, _json = json)
                        } ?: Output(_json = json)
                    }
                    "mcp_list_tools" -> {
                        return tryDeserialize(node, jacksonTypeRef<McpListTools>())?.let {
                            Output(mcpListTools = it, _json = json)
                        } ?: Output(_json = json)
                    }
                }

                return Output(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Output>(Output::class) {

            override fun serialize(
                value: Output,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.message != null -> generator.writeObject(value.message)
                    value.webSearchCall != null -> generator.writeObject(value.webSearchCall)
                    value.fileSearchCall != null -> generator.writeObject(value.fileSearchCall)
                    value.functionCall != null -> generator.writeObject(value.functionCall)
                    value.mcpCall != null -> generator.writeObject(value.mcpCall)
                    value.mcpListTools != null -> generator.writeObject(value.mcpListTools)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Output")
                }
            }
        }

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        class Message
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
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, type, id, status, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): String? = status.getNullable("status")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
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
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Message].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * .role()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Message]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonField<Role>? = null
                private var type: JsonValue = JsonValue.from("message")
                private var id: JsonField<String> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(message: Message) = apply {
                    content = message.content
                    role = message.role
                    type = message.type
                    id = message.id
                    status = message.status
                    additionalProperties = message.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.role] with a well-typed [Role] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [Message].
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
                fun build(): Message =
                    Message(
                        checkRequired("content", content),
                        checkRequired("role", role),
                        type,
                        id,
                        status,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Message = apply {
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

                fun openaiResponseInputMessageContents(): List<OpenAIResponseInputMessageContent>? =
                    openaiResponseInputMessageContents

                fun openaiResponseOutputMessageContents():
                    List<OpenAIResponseOutputMessageContent>? = openaiResponseOutputMessageContents

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
                            ) = openaiResponseInputMessageContents.sumOf { it.validity().toInt() }

                            override fun visitOpenAIResponseOutputMessageContents(
                                openaiResponseOutputMessageContents:
                                    List<OpenAIResponseOutputMessageContent>
                            ) = openaiResponseOutputMessageContents.sumOf { it.validity().toInt() }

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
                        openaiResponseInputMessageContents: List<OpenAIResponseInputMessageContent>
                    ) =
                        Content(
                            openaiResponseInputMessageContents = openaiResponseInputMessageContents
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
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOpenAIResponseInputMessageContents(
                        openaiResponseInputMessageContents: List<OpenAIResponseInputMessageContent>
                    ): T

                    fun visitOpenAIResponseOutputMessageContents(
                        openaiResponseOutputMessageContents:
                            List<OpenAIResponseOutputMessageContent>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LlamaStackClientInvalidDataException in the default implementation.
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
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
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
                            _json != null -> "OpenAIResponseInputMessageContent{_unknown=$_json}"
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
                         * Maps an unknown variant of [OpenAIResponseInputMessageContent] to a value
                         * of type [T].
                         *
                         * An instance of [OpenAIResponseInputMessageContent] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
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
                                    return tryDeserialize(node, jacksonTypeRef<InputText>())?.let {
                                        OpenAIResponseInputMessageContent(
                                            inputText = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIResponseInputMessageContent(_json = json)
                                }
                                "input_image" -> {
                                    return tryDeserialize(node, jacksonTypeRef<InputImage>())?.let {
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
                                value.inputText != null -> generator.writeObject(value.inputText)
                                value.inputImage != null -> generator.writeObject(value.inputImage)
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
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(text, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("input_text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
                                additionalProperties = inputText.additionalProperties.toMutableMap()
                            }

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
                             * JsonValue.from("input_text")
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun detail(): Detail = detail.getRequired("detail")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("input_image")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
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
                             * You should usually call [Builder.detail] with a well-typed [Detail]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun detail(detail: JsonField<Detail>) = apply { this.detail = detail }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("input_image")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<String>) = apply {
                                this.imageUrl = imageUrl
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Detail]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Detail] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                LOW,
                                HIGH,
                                AUTO,
                                /**
                                 * An enum member indicating that [Detail] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    LOW -> Value.LOW
                                    HIGH -> Value.HIGH
                                    AUTO -> Value.AUTO
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LlamaStackClientInvalidDataException if this class instance's
                             *   value is a not a known member.
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
                             * @throws LlamaStackClientInvalidDataException if this class instance's
                             *   value does not have the expected primitive type.
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
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                            openaiResponseOutputMessageContent: OpenAIResponseOutputMessageContent
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
                         * `List<Annotation>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
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
                        fun addAnnotation(containerFileCitation: Annotation.ContainerFileCitation) =
                            addAnnotation(Annotation.ofContainerFileCitation(containerFileCitation))

                        /**
                         * Alias for calling [addAnnotation] with `Annotation.ofFilePath(filePath)`.
                         */
                        fun addAnnotation(filePath: Annotation.FilePath) =
                            addAnnotation(Annotation.ofFilePath(filePath))

                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("output_text")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
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
                         * Returns an immutable instance of [OpenAIResponseOutputMessageContent].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
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
                                checkRequired("annotations", annotations).map { it.toImmutable() },
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
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

                        fun containerFileCitation(): ContainerFileCitation? = containerFileCitation

                        fun filePath(): FilePath? = filePath

                        fun isFileCitation(): Boolean = fileCitation != null

                        fun isUrlCitation(): Boolean = urlCitation != null

                        fun isContainerFileCitation(): Boolean = containerFileCitation != null

                        fun isFilePath(): Boolean = filePath != null

                        fun asFileCitation(): FileCitation = fileCitation.getOrThrow("fileCitation")

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * An interface that defines how to map each variant of [Annotation] to a
                         * value of type [T].
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
                             * An instance of [Annotation] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
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
                                        return tryDeserialize(node, jacksonTypeRef<FileCitation>())
                                            ?.let { Annotation(fileCitation = it, _json = json) }
                                            ?: Annotation(_json = json)
                                    }
                                    "url_citation" -> {
                                        return tryDeserialize(node, jacksonTypeRef<UrlCitation>())
                                            ?.let { Annotation(urlCitation = it, _json = json) }
                                            ?: Annotation(_json = json)
                                    }
                                    "container_file_citation" -> {
                                        return tryDeserialize(
                                                node,
                                                jacksonTypeRef<ContainerFileCitation>(),
                                            )
                                            ?.let {
                                                Annotation(containerFileCitation = it, _json = json)
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

                        internal class Serializer : BaseSerializer<Annotation>(Annotation::class) {

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
                                    value.filePath != null -> generator.writeObject(value.filePath)
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
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun fileId(): String = fileId.getRequired("file_id")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun filename(): String = filename.getRequired("filename")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun index(): Long = index.getRequired("index")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("file_citation")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [fileId].
                             *
                             * Unlike [fileId], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fun _fileId(): JsonField<String> = fileId

                            /**
                             * Returns the raw JSON value of [filename].
                             *
                             * Unlike [filename], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filename")
                            @ExcludeMissing
                            fun _filename(): JsonField<String> = filename

                            /**
                             * Returns the raw JSON value of [index].
                             *
                             * Unlike [index], this method doesn't throw if the JSON field has an
                             * unexpected type.
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
                                private var additionalProperties: MutableMap<String, JsonValue> =
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
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun fileId(fileId: JsonField<String>) = apply {
                                    this.fileId = fileId
                                }

                                fun filename(filename: String) = filename(JsonField.of(filename))

                                /**
                                 * Sets [Builder.filename] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filename] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filename(filename: JsonField<String>) = apply {
                                    this.filename = filename
                                }

                                fun index(index: Long) = index(JsonField.of(index))

                                /**
                                 * Sets [Builder.index] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.index] with a well-typed [Long]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun index(index: JsonField<Long>) = apply { this.index = index }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("file_citation")
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
                                 * Returns an immutable instance of [FileCitation].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
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
                                    type.let { if (it == JsonValue.from("file_citation")) 1 else 0 }

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
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun endIndex(): Long = endIndex.getRequired("end_index")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun startIndex(): Long = startIndex.getRequired("start_index")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun title(): String = title.getRequired("title")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("url_citation")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun url(): String = url.getRequired("url")

                            /**
                             * Returns the raw JSON value of [endIndex].
                             *
                             * Unlike [endIndex], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("end_index")
                            @ExcludeMissing
                            fun _endIndex(): JsonField<Long> = endIndex

                            /**
                             * Returns the raw JSON value of [startIndex].
                             *
                             * Unlike [startIndex], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("start_index")
                            @ExcludeMissing
                            fun _startIndex(): JsonField<Long> = startIndex

                            /**
                             * Returns the raw JSON value of [title].
                             *
                             * Unlike [title], this method doesn't throw if the JSON field has an
                             * unexpected type.
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
                            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                                private var additionalProperties: MutableMap<String, JsonValue> =
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
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun endIndex(endIndex: JsonField<Long>) = apply {
                                    this.endIndex = endIndex
                                }

                                fun startIndex(startIndex: Long) =
                                    startIndex(JsonField.of(startIndex))

                                /**
                                 * Sets [Builder.startIndex] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.startIndex] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun startIndex(startIndex: JsonField<Long>) = apply {
                                    this.startIndex = startIndex
                                }

                                fun title(title: String) = title(JsonField.of(title))

                                /**
                                 * Sets [Builder.title] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.title] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun title(title: JsonField<String>) = apply { this.title = title }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("url_citation")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun url(url: String) = url(JsonField.of(url))

                                /**
                                 * Sets [Builder.url] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.url] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun url(url: JsonField<String>) = apply { this.url = url }

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
                                 * Returns an immutable instance of [UrlCitation].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
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
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun containerId(): String = containerId.getRequired("container_id")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun endIndex(): Long = endIndex.getRequired("end_index")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun fileId(): String = fileId.getRequired("file_id")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun filename(): String = filename.getRequired("filename")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun startIndex(): Long = startIndex.getRequired("start_index")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("container_file_citation")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [containerId].
                             *
                             * Unlike [containerId], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("container_id")
                            @ExcludeMissing
                            fun _containerId(): JsonField<String> = containerId

                            /**
                             * Returns the raw JSON value of [endIndex].
                             *
                             * Unlike [endIndex], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("end_index")
                            @ExcludeMissing
                            fun _endIndex(): JsonField<Long> = endIndex

                            /**
                             * Returns the raw JSON value of [fileId].
                             *
                             * Unlike [fileId], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fun _fileId(): JsonField<String> = fileId

                            /**
                             * Returns the raw JSON value of [filename].
                             *
                             * Unlike [filename], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filename")
                            @ExcludeMissing
                            fun _filename(): JsonField<String> = filename

                            /**
                             * Returns the raw JSON value of [startIndex].
                             *
                             * Unlike [startIndex], this method doesn't throw if the JSON field has
                             * an unexpected type.
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
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(containerFileCitation: ContainerFileCitation) =
                                    apply {
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
                                 * You should usually call [Builder.containerId] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun containerId(containerId: JsonField<String>) = apply {
                                    this.containerId = containerId
                                }

                                fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                /**
                                 * Sets [Builder.endIndex] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.endIndex] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun endIndex(endIndex: JsonField<Long>) = apply {
                                    this.endIndex = endIndex
                                }

                                fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                /**
                                 * Sets [Builder.fileId] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.fileId] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun fileId(fileId: JsonField<String>) = apply {
                                    this.fileId = fileId
                                }

                                fun filename(filename: String) = filename(JsonField.of(filename))

                                /**
                                 * Sets [Builder.filename] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filename] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filename(filename: JsonField<String>) = apply {
                                    this.filename = filename
                                }

                                fun startIndex(startIndex: Long) =
                                    startIndex(JsonField.of(startIndex))

                                /**
                                 * Sets [Builder.startIndex] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.startIndex] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun startIndex(startIndex: JsonField<Long>) = apply {
                                    this.startIndex = startIndex
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("container_file_citation")
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
                                 * Returns an immutable instance of [ContainerFileCitation].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
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
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun fileId(): String = fileId.getRequired("file_id")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun index(): Long = index.getRequired("index")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("file_path")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [fileId].
                             *
                             * Unlike [fileId], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fun _fileId(): JsonField<String> = fileId

                            /**
                             * Returns the raw JSON value of [index].
                             *
                             * Unlike [index], this method doesn't throw if the JSON field has an
                             * unexpected type.
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
                                private var additionalProperties: MutableMap<String, JsonValue> =
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
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun fileId(fileId: JsonField<String>) = apply {
                                    this.fileId = fileId
                                }

                                fun index(index: Long) = index(JsonField.of(index))

                                /**
                                 * Sets [Builder.index] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.index] with a well-typed [Long]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun index(index: JsonField<Long>) = apply { this.index = index }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("file_path")
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
                                 * Returns an immutable instance of [FilePath].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
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
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SYSTEM,
                    DEVELOPER,
                    USER,
                    ASSISTANT,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
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
                        SYSTEM -> Value.SYSTEM
                        DEVELOPER -> Value.DEVELOPER
                        USER -> Value.USER
                        ASSISTANT -> Value.ASSISTANT
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
                        SYSTEM -> Known.SYSTEM
                        DEVELOPER -> Known.DEVELOPER
                        USER -> Known.USER
                        ASSISTANT -> Known.ASSISTANT
                        else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
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

                return /* spotless:off */ other is Message && content == other.content && role == other.role && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, role, type, id, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Message{content=$content, role=$role, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
        }

        class WebSearchCall
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
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [WebSearchCall].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [WebSearchCall]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var status: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("web_search_call")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(webSearchCall: WebSearchCall) = apply {
                    id = webSearchCall.id
                    status = webSearchCall.status
                    type = webSearchCall.type
                    additionalProperties = webSearchCall.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
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
                 * Returns an immutable instance of [WebSearchCall].
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
                fun build(): WebSearchCall =
                    WebSearchCall(
                        checkRequired("id", id),
                        checkRequired("status", status),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WebSearchCall = apply {
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

                return /* spotless:off */ other is WebSearchCall && id == other.id && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, status, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WebSearchCall{id=$id, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        class FileSearchCall
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
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun queries(): List<String> = queries.getRequired("queries")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Unlike [queries], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("queries")
            @ExcludeMissing
            fun _queries(): JsonField<List<String>> = queries

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

            /**
             * Returns the raw JSON value of [results].
             *
             * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [FileSearchCall].
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

            /** A builder for [FileSearchCall]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var queries: JsonField<MutableList<String>>? = null
                private var status: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("file_search_call")
                private var results: JsonField<MutableList<Result>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fileSearchCall: FileSearchCall) = apply {
                    id = fileSearchCall.id
                    queries = fileSearchCall.queries.map { it.toMutableList() }
                    status = fileSearchCall.status
                    type = fileSearchCall.type
                    results = fileSearchCall.results.map { it.toMutableList() }
                    additionalProperties = fileSearchCall.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun queries(queries: List<String>) = queries(JsonField.of(queries))

                /**
                 * Sets [Builder.queries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.queries] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
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
                 * You should usually call [Builder.results] with a well-typed `List<Result>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [FileSearchCall].
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
                fun build(): FileSearchCall =
                    FileSearchCall(
                        checkRequired("id", id),
                        checkRequired("queries", queries).map { it.toImmutable() },
                        checkRequired("status", status),
                        type,
                        (results ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FileSearchCall = apply {
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

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(result: Result) = apply {
                        additionalProperties = result.additionalProperties.toMutableMap()
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

                return /* spotless:off */ other is FileSearchCall && id == other.id && queries == other.queries && status == other.status && type == other.type && results == other.results && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, queries, status, type, results, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FileSearchCall{id=$id, queries=$queries, status=$status, type=$type, results=$results, additionalProperties=$additionalProperties}"
        }

        class FunctionCall
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
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(arguments, callId, name, type, id, status, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun arguments(): String = arguments.getRequired("arguments")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun callId(): String = callId.getRequired("call_id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Unlike [callId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [FunctionCall].
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

            /** A builder for [FunctionCall]. */
            class Builder internal constructor() {

                private var arguments: JsonField<String>? = null
                private var callId: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("function_call")
                private var id: JsonField<String> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(functionCall: FunctionCall) = apply {
                    arguments = functionCall.arguments
                    callId = functionCall.callId
                    name = functionCall.name
                    type = functionCall.type
                    id = functionCall.id
                    status = functionCall.status
                    additionalProperties = functionCall.additionalProperties.toMutableMap()
                }

                fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                /**
                 * Sets [Builder.arguments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arguments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

                fun callId(callId: String) = callId(JsonField.of(callId))

                /**
                 * Sets [Builder.callId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callId(callId: JsonField<String>) = apply { this.callId = callId }

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [FunctionCall].
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
                fun build(): FunctionCall =
                    FunctionCall(
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

            fun validate(): FunctionCall = apply {
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

                return /* spotless:off */ other is FunctionCall && arguments == other.arguments && callId == other.callId && name == other.name && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(arguments, callId, name, type, id, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FunctionCall{arguments=$arguments, callId=$callId, name=$name, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
        }

        class McpCall
        private constructor(
            private val id: JsonField<String>,
            private val arguments: JsonField<String>,
            private val name: JsonField<String>,
            private val serverLabel: JsonField<String>,
            private val type: JsonValue,
            private val error: JsonField<String>,
            private val output: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("arguments")
                @ExcludeMissing
                arguments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("server_label")
                @ExcludeMissing
                serverLabel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
                @JsonProperty("output") @ExcludeMissing output: JsonField<String> = JsonMissing.of(),
            ) : this(id, arguments, name, serverLabel, type, error, output, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun arguments(): String = arguments.getRequired("arguments")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serverLabel(): String = serverLabel.getRequired("server_label")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("mcp_call")
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
            fun error(): String? = error.getNullable("error")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun output(): String? = output.getNullable("output")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

            /**
             * Returns the raw JSON value of [output].
             *
             * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

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
                 * Returns a mutable builder for constructing an instance of [McpCall].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .arguments()
                 * .name()
                 * .serverLabel()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [McpCall]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var arguments: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var serverLabel: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("mcp_call")
                private var error: JsonField<String> = JsonMissing.of()
                private var output: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mcpCall: McpCall) = apply {
                    id = mcpCall.id
                    arguments = mcpCall.arguments
                    name = mcpCall.name
                    serverLabel = mcpCall.serverLabel
                    type = mcpCall.type
                    error = mcpCall.error
                    output = mcpCall.output
                    additionalProperties = mcpCall.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                /**
                 * Sets [Builder.arguments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arguments] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("mcp_call")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun error(error: String) = error(JsonField.of(error))

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<String>) = apply { this.error = error }

                fun output(output: String) = output(JsonField.of(output))

                /**
                 * Sets [Builder.output] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.output] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun output(output: JsonField<String>) = apply { this.output = output }

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
                 * Returns an immutable instance of [McpCall].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .arguments()
                 * .name()
                 * .serverLabel()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): McpCall =
                    McpCall(
                        checkRequired("id", id),
                        checkRequired("arguments", arguments),
                        checkRequired("name", name),
                        checkRequired("serverLabel", serverLabel),
                        type,
                        error,
                        output,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): McpCall = apply {
                if (validated) {
                    return@apply
                }

                id()
                arguments()
                name()
                serverLabel()
                _type().let {
                    if (it != JsonValue.from("mcp_call")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                error()
                output()
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
                    (if (arguments.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (serverLabel.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("mcp_call")) 1 else 0 } +
                    (if (error.asKnown() == null) 0 else 1) +
                    (if (output.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is McpCall && id == other.id && arguments == other.arguments && name == other.name && serverLabel == other.serverLabel && type == other.type && error == other.error && output == other.output && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, arguments, name, serverLabel, type, error, output, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "McpCall{id=$id, arguments=$arguments, name=$name, serverLabel=$serverLabel, type=$type, error=$error, output=$output, additionalProperties=$additionalProperties}"
        }

        class McpListTools
        private constructor(
            private val id: JsonField<String>,
            private val serverLabel: JsonField<String>,
            private val tools: JsonField<List<Tool>>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("server_label")
                @ExcludeMissing
                serverLabel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tools")
                @ExcludeMissing
                tools: JsonField<List<Tool>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(id, serverLabel, tools, type, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

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
            fun tools(): List<Tool> = tools.getRequired("tools")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("mcp_list_tools")
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
             * Returns the raw JSON value of [serverLabel].
             *
             * Unlike [serverLabel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("server_label")
            @ExcludeMissing
            fun _serverLabel(): JsonField<String> = serverLabel

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
                 * Returns a mutable builder for constructing an instance of [McpListTools].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .serverLabel()
                 * .tools()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [McpListTools]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var serverLabel: JsonField<String>? = null
                private var tools: JsonField<MutableList<Tool>>? = null
                private var type: JsonValue = JsonValue.from("mcp_list_tools")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mcpListTools: McpListTools) = apply {
                    id = mcpListTools.id
                    serverLabel = mcpListTools.serverLabel
                    tools = mcpListTools.tools.map { it.toMutableList() }
                    type = mcpListTools.type
                    additionalProperties = mcpListTools.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

                /**
                 * Sets [Builder.tools] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tools] with a well-typed `List<Tool>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("mcp_list_tools")
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
                 * Returns an immutable instance of [McpListTools].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .serverLabel()
                 * .tools()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): McpListTools =
                    McpListTools(
                        checkRequired("id", id),
                        checkRequired("serverLabel", serverLabel),
                        checkRequired("tools", tools).map { it.toImmutable() },
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): McpListTools = apply {
                if (validated) {
                    return@apply
                }

                id()
                serverLabel()
                tools().forEach { it.validate() }
                _type().let {
                    if (it != JsonValue.from("mcp_list_tools")) {
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
                    (if (serverLabel.asKnown() == null) 0 else 1) +
                    (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    type.let { if (it == JsonValue.from("mcp_list_tools")) 1 else 0 }

            class Tool
            private constructor(
                private val inputSchema: JsonField<InputSchema>,
                private val name: JsonField<String>,
                private val description: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("input_schema")
                    @ExcludeMissing
                    inputSchema: JsonField<InputSchema> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                ) : this(inputSchema, name, description, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun inputSchema(): InputSchema = inputSchema.getRequired("input_schema")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * Returns the raw JSON value of [inputSchema].
                 *
                 * Unlike [inputSchema], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_schema")
                @ExcludeMissing
                fun _inputSchema(): JsonField<InputSchema> = inputSchema

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

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
                     * Returns a mutable builder for constructing an instance of [Tool].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .inputSchema()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Tool]. */
                class Builder internal constructor() {

                    private var inputSchema: JsonField<InputSchema>? = null
                    private var name: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tool: Tool) = apply {
                        inputSchema = tool.inputSchema
                        name = tool.name
                        description = tool.description
                        additionalProperties = tool.additionalProperties.toMutableMap()
                    }

                    fun inputSchema(inputSchema: InputSchema) =
                        inputSchema(JsonField.of(inputSchema))

                    /**
                     * Sets [Builder.inputSchema] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputSchema] with a well-typed [InputSchema]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inputSchema(inputSchema: JsonField<InputSchema>) = apply {
                        this.inputSchema = inputSchema
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
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
                     * Returns an immutable instance of [Tool].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .inputSchema()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tool =
                        Tool(
                            checkRequired("inputSchema", inputSchema),
                            checkRequired("name", name),
                            description,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Tool = apply {
                    if (validated) {
                        return@apply
                    }

                    inputSchema().validate()
                    name()
                    description()
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
                    (inputSchema.asKnown()?.validity() ?: 0) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1)

                class InputSchema
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

                        /**
                         * Returns a mutable builder for constructing an instance of [InputSchema].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [InputSchema]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(inputSchema: InputSchema) = apply {
                            additionalProperties = inputSchema.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [InputSchema].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): InputSchema = InputSchema(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): InputSchema = apply {
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

                        return /* spotless:off */ other is InputSchema && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InputSchema{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tool && inputSchema == other.inputSchema && name == other.name && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(inputSchema, name, description, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tool{inputSchema=$inputSchema, name=$name, description=$description, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is McpListTools && id == other.id && serverLabel == other.serverLabel && tools == other.tools && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, serverLabel, tools, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "McpListTools{id=$id, serverLabel=$serverLabel, tools=$tools, type=$type, additionalProperties=$additionalProperties}"
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

    class Error
    private constructor(
        private val code: JsonField<String>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(code, message, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .message()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var message: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(error: Error) = apply {
                code = error.code
                message = error.message
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            code()
            message()
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
            (if (code.asKnown() == null) 0 else 1) + (if (message.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Error && code == other.code && message == other.message && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, message, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{code=$code, message=$message, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseObject && id == other.id && createdAt == other.createdAt && model == other.model && object_ == other.object_ && output == other.output && parallelToolCalls == other.parallelToolCalls && status == other.status && text == other.text && error == other.error && previousResponseId == other.previousResponseId && temperature == other.temperature && topP == other.topP && truncation == other.truncation && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, model, object_, output, parallelToolCalls, status, text, error, previousResponseId, temperature, topP, truncation, user, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponseObject{id=$id, createdAt=$createdAt, model=$model, object_=$object_, output=$output, parallelToolCalls=$parallelToolCalls, status=$status, text=$text, error=$error, previousResponseId=$previousResponseId, temperature=$temperature, topP=$topP, truncation=$truncation, user=$user, additionalProperties=$additionalProperties}"
}
