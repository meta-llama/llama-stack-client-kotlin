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

/**
 * Generate an OpenAI-compatible chat completion for the given messages using the specified model.
 */
class ChatCompletionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of messages in the conversation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * (Optional) The penalty for repeated tokens.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = body.frequencyPenalty()

    /**
     * (Optional) The function call to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun functionCall(): FunctionCall? = body.functionCall()

    /**
     * (Optional) List of functions to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun functions(): List<Function>? = body.functions()

    /**
     * (Optional) The logit bias to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logitBias(): LogitBias? = body.logitBias()

    /**
     * (Optional) The log probabilities to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logprobs(): Boolean? = body.logprobs()

    /**
     * (Optional) The maximum number of tokens to generate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxCompletionTokens(): Long? = body.maxCompletionTokens()

    /**
     * (Optional) The maximum number of tokens to generate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxTokens(): Long? = body.maxTokens()

    /**
     * (Optional) The number of completions to generate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun n(): Long? = body.n()

    /**
     * (Optional) Whether to parallelize tool calls.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parallelToolCalls(): Boolean? = body.parallelToolCalls()

    /**
     * (Optional) The penalty for repeated tokens.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun presencePenalty(): Double? = body.presencePenalty()

    /**
     * (Optional) The response format to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = body.responseFormat()

    /**
     * (Optional) The seed to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seed(): Long? = body.seed()

    /**
     * (Optional) The stop tokens to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stop(): Stop? = body.stop()

    /**
     * (Optional) The stream options to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun streamOptions(): StreamOptions? = body.streamOptions()

    /**
     * (Optional) The temperature to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun temperature(): Double? = body.temperature()

    /**
     * (Optional) The tool choice to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun toolChoice(): ToolChoice? = body.toolChoice()

    /**
     * (Optional) The tools to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tools(): List<Tool>? = body.tools()

    /**
     * (Optional) The top log probabilities to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topLogprobs(): Long? = body.topLogprobs()

    /**
     * (Optional) The top p to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topP(): Double? = body.topP()

    /**
     * (Optional) The user to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun user(): String? = body.user()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frequencyPenalty(): JsonField<Double> = body._frequencyPenalty()

    /**
     * Returns the raw JSON value of [functionCall].
     *
     * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _functionCall(): JsonField<FunctionCall> = body._functionCall()

    /**
     * Returns the raw JSON value of [functions].
     *
     * Unlike [functions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _functions(): JsonField<List<Function>> = body._functions()

    /**
     * Returns the raw JSON value of [logitBias].
     *
     * Unlike [logitBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logitBias(): JsonField<LogitBias> = body._logitBias()

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logprobs(): JsonField<Boolean> = body._logprobs()

    /**
     * Returns the raw JSON value of [maxCompletionTokens].
     *
     * Unlike [maxCompletionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxCompletionTokens(): JsonField<Long> = body._maxCompletionTokens()

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _n(): JsonField<Long> = body._n()

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _parallelToolCalls(): JsonField<Boolean> = body._parallelToolCalls()

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _presencePenalty(): JsonField<Double> = body._presencePenalty()

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seed(): JsonField<Long> = body._seed()

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stop(): JsonField<Stop> = body._stop()

    /**
     * Returns the raw JSON value of [streamOptions].
     *
     * Unlike [streamOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamOptions(): JsonField<StreamOptions> = body._streamOptions()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<Tool>> = body._tools()

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topLogprobs(): JsonField<Long> = body._topLogprobs()

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topP(): JsonField<Double> = body._topP()

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _user(): JsonField<String> = body._user()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatCompletionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .messages()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(chatCompletionCreateParams: ChatCompletionCreateParams) = apply {
            body = chatCompletionCreateParams.body.toBuilder()
            additionalHeaders = chatCompletionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = chatCompletionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messages]
         * - [model]
         * - [frequencyPenalty]
         * - [functionCall]
         * - [functions]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of messages in the conversation. */
        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
        fun addMessage(user: Message.User) = apply { body.addMessage(user) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * Message.User.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessage(content: Message.User.Content) = apply { body.addUserMessage(content) }

        /** Alias for calling [addUserMessage] with `Message.User.Content.ofString(string)`. */
        fun addUserMessage(string: String) = apply { body.addUserMessage(string) }

        /**
         * Alias for calling [addUserMessage] with
         * `Message.User.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
         */
        fun addUserMessageOfOpenAIChatCompletionContentPartParams(
            openaiChatCompletionContentPartParams:
                List<Message.User.Content.OpenAIChatCompletionContentPartParam>
        ) = apply {
            body.addUserMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams
            )
        }

        /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
        fun addMessage(system: Message.System) = apply { body.addMessage(system) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * Message.System.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessage(content: Message.System.Content) = apply {
            body.addSystemMessage(content)
        }

        /** Alias for calling [addSystemMessage] with `Message.System.Content.ofString(string)`. */
        fun addSystemMessage(string: String) = apply { body.addSystemMessage(string) }

        /**
         * Alias for calling [addSystemMessage] with
         * `Message.System.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
         */
        fun addSystemMessageOfOpenAIChatCompletionContentPartParams(
            openaiChatCompletionContentPartParams:
                List<Message.System.Content.OpenAIChatCompletionContentPartParam>
        ) = apply {
            body.addSystemMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams
            )
        }

        /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
        fun addMessage(assistant: Message.Assistant) = apply { body.addMessage(assistant) }

        /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
        fun addMessage(tool: Message.Tool) = apply { body.addMessage(tool) }

        /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
        fun addMessage(developer: Message.Developer) = apply { body.addMessage(developer) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * Message.Developer.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addDeveloperMessage(content: Message.Developer.Content) = apply {
            body.addDeveloperMessage(content)
        }

        /**
         * Alias for calling [addDeveloperMessage] with
         * `Message.Developer.Content.ofString(string)`.
         */
        fun addDeveloperMessage(string: String) = apply { body.addDeveloperMessage(string) }

        /**
         * Alias for calling [addDeveloperMessage] with
         * `Message.Developer.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
         */
        fun addDeveloperMessageOfOpenAIChatCompletionContentPartParams(
            openaiChatCompletionContentPartParams:
                List<Message.Developer.Content.OpenAIChatCompletionContentPartParam>
        ) = apply {
            body.addDeveloperMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams
            )
        }

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** (Optional) The penalty for repeated tokens. */
        fun frequencyPenalty(frequencyPenalty: Double) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /** (Optional) The function call to use. */
        fun functionCall(functionCall: FunctionCall) = apply { body.functionCall(functionCall) }

        /**
         * Sets [Builder.functionCall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functionCall] with a well-typed [FunctionCall] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
            body.functionCall(functionCall)
        }

        /** Alias for calling [functionCall] with `FunctionCall.ofString(string)`. */
        fun functionCall(string: String) = apply { body.functionCall(string) }

        /** Alias for calling [functionCall] with `FunctionCall.ofUnionMember1(unionMember1)`. */
        fun functionCall(unionMember1: FunctionCall.UnionMember1) = apply {
            body.functionCall(unionMember1)
        }

        /** (Optional) List of functions to use. */
        fun functions(functions: List<Function>) = apply { body.functions(functions) }

        /**
         * Sets [Builder.functions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functions] with a well-typed `List<Function>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun functions(functions: JsonField<List<Function>>) = apply { body.functions(functions) }

        /**
         * Adds a single [Function] to [functions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFunction(function: Function) = apply { body.addFunction(function) }

        /** (Optional) The logit bias to use. */
        fun logitBias(logitBias: LogitBias) = apply { body.logitBias(logitBias) }

        /**
         * Sets [Builder.logitBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logitBias(logitBias: JsonField<LogitBias>) = apply { body.logitBias(logitBias) }

        /** (Optional) The log probabilities to use. */
        fun logprobs(logprobs: Boolean) = apply { body.logprobs(logprobs) }

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { body.logprobs(logprobs) }

        /** (Optional) The maximum number of tokens to generate. */
        fun maxCompletionTokens(maxCompletionTokens: Long) = apply {
            body.maxCompletionTokens(maxCompletionTokens)
        }

        /**
         * Sets [Builder.maxCompletionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxCompletionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxCompletionTokens(maxCompletionTokens: JsonField<Long>) = apply {
            body.maxCompletionTokens(maxCompletionTokens)
        }

        /** (Optional) The maximum number of tokens to generate. */
        fun maxTokens(maxTokens: Long) = apply { body.maxTokens(maxTokens) }

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        /** (Optional) The number of completions to generate. */
        fun n(n: Long) = apply { body.n(n) }

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Long>) = apply { body.n(n) }

        /** (Optional) Whether to parallelize tool calls. */
        fun parallelToolCalls(parallelToolCalls: Boolean) = apply {
            body.parallelToolCalls(parallelToolCalls)
        }

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            body.parallelToolCalls(parallelToolCalls)
        }

        /** (Optional) The penalty for repeated tokens. */
        fun presencePenalty(presencePenalty: Double) = apply {
            body.presencePenalty(presencePenalty)
        }

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            body.presencePenalty(presencePenalty)
        }

        /** (Optional) The response format to use. */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofText()`. */
        fun responseFormatText() = apply { body.responseFormatText() }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`. */
        fun responseFormat(jsonSchema: ResponseFormat.JsonSchema) = apply {
            body.responseFormat(jsonSchema)
        }

        /**
         * Alias for calling [responseFormat] with the following:
         * ```kotlin
         * ResponseFormat.JsonSchema.builder()
         *     .jsonSchema(jsonSchema)
         *     .build()
         * ```
         */
        fun jsonSchemaResponseFormat(jsonSchema: ResponseFormat.JsonSchema.InnerJsonSchema) =
            apply {
                body.jsonSchemaResponseFormat(jsonSchema)
            }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonObject()`. */
        fun responseFormatJsonObject() = apply { body.responseFormatJsonObject() }

        /** (Optional) The seed to use. */
        fun seed(seed: Long) = apply { body.seed(seed) }

        /**
         * Sets [Builder.seed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seed(seed: JsonField<Long>) = apply { body.seed(seed) }

        /** (Optional) The stop tokens to use. */
        fun stop(stop: Stop) = apply { body.stop(stop) }

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<Stop>) = apply { body.stop(stop) }

        /** Alias for calling [stop] with `Stop.ofString(string)`. */
        fun stop(string: String) = apply { body.stop(string) }

        /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
        fun stopOfStrings(strings: List<String>) = apply { body.stopOfStrings(strings) }

        /** (Optional) The stream options to use. */
        fun streamOptions(streamOptions: StreamOptions) = apply {
            body.streamOptions(streamOptions)
        }

        /**
         * Sets [Builder.streamOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamOptions] with a well-typed [StreamOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamOptions(streamOptions: JsonField<StreamOptions>) = apply {
            body.streamOptions(streamOptions)
        }

        /** (Optional) The temperature to use. */
        fun temperature(temperature: Double) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        /** (Optional) The tool choice to use. */
        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
        fun toolChoice(string: String) = apply { body.toolChoice(string) }

        /** Alias for calling [toolChoice] with `ToolChoice.ofUnionMember1(unionMember1)`. */
        fun toolChoice(unionMember1: ToolChoice.UnionMember1) = apply {
            body.toolChoice(unionMember1)
        }

        /** (Optional) The tools to use. */
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

        /** (Optional) The top log probabilities to use. */
        fun topLogprobs(topLogprobs: Long) = apply { body.topLogprobs(topLogprobs) }

        /**
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { body.topLogprobs(topLogprobs) }

        /** (Optional) The top p to use. */
        fun topP(topP: Double) = apply { body.topP(topP) }

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { body.topP(topP) }

        /** (Optional) The user to use. */
        fun user(user: String) = apply { body.user(user) }

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { body.user(user) }

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
         * Returns an immutable instance of [ChatCompletionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .messages()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionCreateParams =
            ChatCompletionCreateParams(
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
        private val messages: JsonField<List<Message>>,
        private val model: JsonField<String>,
        private val frequencyPenalty: JsonField<Double>,
        private val functionCall: JsonField<FunctionCall>,
        private val functions: JsonField<List<Function>>,
        private val logitBias: JsonField<LogitBias>,
        private val logprobs: JsonField<Boolean>,
        private val maxCompletionTokens: JsonField<Long>,
        private val maxTokens: JsonField<Long>,
        private val n: JsonField<Long>,
        private val parallelToolCalls: JsonField<Boolean>,
        private val presencePenalty: JsonField<Double>,
        private val responseFormat: JsonField<ResponseFormat>,
        private val seed: JsonField<Long>,
        private val stop: JsonField<Stop>,
        private val streamOptions: JsonField<StreamOptions>,
        private val temperature: JsonField<Double>,
        private val toolChoice: JsonField<ToolChoice>,
        private val tools: JsonField<List<Tool>>,
        private val topLogprobs: JsonField<Long>,
        private val topP: JsonField<Double>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("function_call")
            @ExcludeMissing
            functionCall: JsonField<FunctionCall> = JsonMissing.of(),
            @JsonProperty("functions")
            @ExcludeMissing
            functions: JsonField<List<Function>> = JsonMissing.of(),
            @JsonProperty("logit_bias")
            @ExcludeMissing
            logitBias: JsonField<LogitBias> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_completion_tokens")
            @ExcludeMissing
            maxCompletionTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_tokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("parallel_tool_calls")
            @ExcludeMissing
            parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("response_format")
            @ExcludeMissing
            responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
            @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stop") @ExcludeMissing stop: JsonField<Stop> = JsonMissing.of(),
            @JsonProperty("stream_options")
            @ExcludeMissing
            streamOptions: JsonField<StreamOptions> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tool_choice")
            @ExcludeMissing
            toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
            @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
            @JsonProperty("top_logprobs")
            @ExcludeMissing
            topLogprobs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(
            messages,
            model,
            frequencyPenalty,
            functionCall,
            functions,
            logitBias,
            logprobs,
            maxCompletionTokens,
            maxTokens,
            n,
            parallelToolCalls,
            presencePenalty,
            responseFormat,
            seed,
            stop,
            streamOptions,
            temperature,
            toolChoice,
            tools,
            topLogprobs,
            topP,
            user,
            mutableMapOf(),
        )

        /**
         * List of messages in the conversation.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * (Optional) The penalty for repeated tokens.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

        /**
         * (Optional) The function call to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun functionCall(): FunctionCall? = functionCall.getNullable("function_call")

        /**
         * (Optional) List of functions to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun functions(): List<Function>? = functions.getNullable("functions")

        /**
         * (Optional) The logit bias to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logitBias(): LogitBias? = logitBias.getNullable("logit_bias")

        /**
         * (Optional) The log probabilities to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logprobs(): Boolean? = logprobs.getNullable("logprobs")

        /**
         * (Optional) The maximum number of tokens to generate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxCompletionTokens(): Long? = maxCompletionTokens.getNullable("max_completion_tokens")

        /**
         * (Optional) The maximum number of tokens to generate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

        /**
         * (Optional) The number of completions to generate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun n(): Long? = n.getNullable("n")

        /**
         * (Optional) Whether to parallelize tool calls.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parallelToolCalls(): Boolean? = parallelToolCalls.getNullable("parallel_tool_calls")

        /**
         * (Optional) The penalty for repeated tokens.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

        /**
         * (Optional) The response format to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        /**
         * (Optional) The seed to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun seed(): Long? = seed.getNullable("seed")

        /**
         * (Optional) The stop tokens to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stop(): Stop? = stop.getNullable("stop")

        /**
         * (Optional) The stream options to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun streamOptions(): StreamOptions? = streamOptions.getNullable("stream_options")

        /**
         * (Optional) The temperature to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun temperature(): Double? = temperature.getNullable("temperature")

        /**
         * (Optional) The tool choice to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /**
         * (Optional) The tools to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tools(): List<Tool>? = tools.getNullable("tools")

        /**
         * (Optional) The top log probabilities to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun topLogprobs(): Long? = topLogprobs.getNullable("top_logprobs")

        /**
         * (Optional) The top p to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun topP(): Double? = topP.getNullable("top_p")

        /**
         * (Optional) The user to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun user(): String? = user.getNullable("user")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [frequencyPenalty].
         *
         * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

        /**
         * Returns the raw JSON value of [functionCall].
         *
         * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("function_call")
        @ExcludeMissing
        fun _functionCall(): JsonField<FunctionCall> = functionCall

        /**
         * Returns the raw JSON value of [functions].
         *
         * Unlike [functions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("functions")
        @ExcludeMissing
        fun _functions(): JsonField<List<Function>> = functions

        /**
         * Returns the raw JSON value of [logitBias].
         *
         * Unlike [logitBias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logit_bias")
        @ExcludeMissing
        fun _logitBias(): JsonField<LogitBias> = logitBias

        /**
         * Returns the raw JSON value of [logprobs].
         *
         * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Boolean> = logprobs

        /**
         * Returns the raw JSON value of [maxCompletionTokens].
         *
         * Unlike [maxCompletionTokens], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_completion_tokens")
        @ExcludeMissing
        fun _maxCompletionTokens(): JsonField<Long> = maxCompletionTokens

        /**
         * Returns the raw JSON value of [maxTokens].
         *
         * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

        /**
         * Returns the raw JSON value of [n].
         *
         * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

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
         * Returns the raw JSON value of [presencePenalty].
         *
         * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        fun _presencePenalty(): JsonField<Double> = presencePenalty

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        /**
         * Returns the raw JSON value of [seed].
         *
         * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

        /**
         * Returns the raw JSON value of [stop].
         *
         * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<Stop> = stop

        /**
         * Returns the raw JSON value of [streamOptions].
         *
         * Unlike [streamOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stream_options")
        @ExcludeMissing
        fun _streamOptions(): JsonField<StreamOptions> = streamOptions

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [toolChoice].
         *
         * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /**
         * Returns the raw JSON value of [tools].
         *
         * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

        /**
         * Returns the raw JSON value of [topLogprobs].
         *
         * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        fun _topLogprobs(): JsonField<Long> = topLogprobs

        /**
         * Returns the raw JSON value of [topP].
         *
         * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .messages()
             * .model()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var model: JsonField<String>? = null
            private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
            private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
            private var functions: JsonField<MutableList<Function>>? = null
            private var logitBias: JsonField<LogitBias> = JsonMissing.of()
            private var logprobs: JsonField<Boolean> = JsonMissing.of()
            private var maxCompletionTokens: JsonField<Long> = JsonMissing.of()
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var n: JsonField<Long> = JsonMissing.of()
            private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
            private var presencePenalty: JsonField<Double> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var seed: JsonField<Long> = JsonMissing.of()
            private var stop: JsonField<Stop> = JsonMissing.of()
            private var streamOptions: JsonField<StreamOptions> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var topLogprobs: JsonField<Long> = JsonMissing.of()
            private var topP: JsonField<Double> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                model = body.model
                frequencyPenalty = body.frequencyPenalty
                functionCall = body.functionCall
                functions = body.functions.map { it.toMutableList() }
                logitBias = body.logitBias
                logprobs = body.logprobs
                maxCompletionTokens = body.maxCompletionTokens
                maxTokens = body.maxTokens
                n = body.n
                parallelToolCalls = body.parallelToolCalls
                presencePenalty = body.presencePenalty
                responseFormat = body.responseFormat
                seed = body.seed
                stop = body.stop
                streamOptions = body.streamOptions
                temperature = body.temperature
                toolChoice = body.toolChoice
                tools = body.tools.map { it.toMutableList() }
                topLogprobs = body.topLogprobs
                topP = body.topP
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of messages in the conversation. */
            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [messages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
            fun addMessage(user: Message.User) = addMessage(Message.ofUser(user))

            /**
             * Alias for calling [addMessage] with the following:
             * ```kotlin
             * Message.User.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserMessage(content: Message.User.Content) =
                addMessage(Message.User.builder().content(content).build())

            /** Alias for calling [addUserMessage] with `Message.User.Content.ofString(string)`. */
            fun addUserMessage(string: String) =
                addUserMessage(Message.User.Content.ofString(string))

            /**
             * Alias for calling [addUserMessage] with
             * `Message.User.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
             */
            fun addUserMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams:
                    List<Message.User.Content.OpenAIChatCompletionContentPartParam>
            ) =
                addUserMessage(
                    Message.User.Content.ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams
                    )
                )

            /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
            fun addMessage(system: Message.System) = addMessage(Message.ofSystem(system))

            /**
             * Alias for calling [addMessage] with the following:
             * ```kotlin
             * Message.System.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemMessage(content: Message.System.Content) =
                addMessage(Message.System.builder().content(content).build())

            /**
             * Alias for calling [addSystemMessage] with `Message.System.Content.ofString(string)`.
             */
            fun addSystemMessage(string: String) =
                addSystemMessage(Message.System.Content.ofString(string))

            /**
             * Alias for calling [addSystemMessage] with
             * `Message.System.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
             */
            fun addSystemMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams:
                    List<Message.System.Content.OpenAIChatCompletionContentPartParam>
            ) =
                addSystemMessage(
                    Message.System.Content.ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams
                    )
                )

            /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
            fun addMessage(assistant: Message.Assistant) =
                addMessage(Message.ofAssistant(assistant))

            /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
            fun addMessage(tool: Message.Tool) = addMessage(Message.ofTool(tool))

            /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
            fun addMessage(developer: Message.Developer) =
                addMessage(Message.ofDeveloper(developer))

            /**
             * Alias for calling [addMessage] with the following:
             * ```kotlin
             * Message.Developer.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addDeveloperMessage(content: Message.Developer.Content) =
                addMessage(Message.Developer.builder().content(content).build())

            /**
             * Alias for calling [addDeveloperMessage] with
             * `Message.Developer.Content.ofString(string)`.
             */
            fun addDeveloperMessage(string: String) =
                addDeveloperMessage(Message.Developer.Content.ofString(string))

            /**
             * Alias for calling [addDeveloperMessage] with
             * `Message.Developer.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
             */
            fun addDeveloperMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams:
                    List<Message.Developer.Content.OpenAIChatCompletionContentPartParam>
            ) =
                addDeveloperMessage(
                    Message.Developer.Content.ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams
                    )
                )

            /**
             * The identifier of the model to use. The model must be registered with Llama Stack and
             * available via the /models endpoint.
             */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** (Optional) The penalty for repeated tokens. */
            fun frequencyPenalty(frequencyPenalty: Double) =
                frequencyPenalty(JsonField.of(frequencyPenalty))

            /**
             * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
                this.frequencyPenalty = frequencyPenalty
            }

            /** (Optional) The function call to use. */
            fun functionCall(functionCall: FunctionCall) = functionCall(JsonField.of(functionCall))

            /**
             * Sets [Builder.functionCall] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionCall] with a well-typed [FunctionCall] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                this.functionCall = functionCall
            }

            /** Alias for calling [functionCall] with `FunctionCall.ofString(string)`. */
            fun functionCall(string: String) = functionCall(FunctionCall.ofString(string))

            /**
             * Alias for calling [functionCall] with `FunctionCall.ofUnionMember1(unionMember1)`.
             */
            fun functionCall(unionMember1: FunctionCall.UnionMember1) =
                functionCall(FunctionCall.ofUnionMember1(unionMember1))

            /** (Optional) List of functions to use. */
            fun functions(functions: List<Function>) = functions(JsonField.of(functions))

            /**
             * Sets [Builder.functions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functions] with a well-typed `List<Function>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functions(functions: JsonField<List<Function>>) = apply {
                this.functions = functions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Function] to [functions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFunction(function: Function) = apply {
                functions =
                    (functions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("functions", it).add(function)
                    }
            }

            /** (Optional) The logit bias to use. */
            fun logitBias(logitBias: LogitBias) = logitBias(JsonField.of(logitBias))

            /**
             * Sets [Builder.logitBias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logitBias(logitBias: JsonField<LogitBias>) = apply { this.logitBias = logitBias }

            /** (Optional) The log probabilities to use. */
            fun logprobs(logprobs: Boolean) = logprobs(JsonField.of(logprobs))

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

            /** (Optional) The maximum number of tokens to generate. */
            fun maxCompletionTokens(maxCompletionTokens: Long) =
                maxCompletionTokens(JsonField.of(maxCompletionTokens))

            /**
             * Sets [Builder.maxCompletionTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxCompletionTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxCompletionTokens(maxCompletionTokens: JsonField<Long>) = apply {
                this.maxCompletionTokens = maxCompletionTokens
            }

            /** (Optional) The maximum number of tokens to generate. */
            fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

            /**
             * Sets [Builder.maxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

            /** (Optional) The number of completions to generate. */
            fun n(n: Long) = n(JsonField.of(n))

            /**
             * Sets [Builder.n] to an arbitrary JSON value.
             *
             * You should usually call [Builder.n] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun n(n: JsonField<Long>) = apply { this.n = n }

            /** (Optional) Whether to parallelize tool calls. */
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

            /** (Optional) The penalty for repeated tokens. */
            fun presencePenalty(presencePenalty: Double) =
                presencePenalty(JsonField.of(presencePenalty))

            /**
             * Sets [Builder.presencePenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
                this.presencePenalty = presencePenalty
            }

            /** (Optional) The response format to use. */
            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /** Alias for calling [responseFormat] with `ResponseFormat.ofText()`. */
            fun responseFormatText() = responseFormat(ResponseFormat.ofText())

            /**
             * Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`.
             */
            fun responseFormat(jsonSchema: ResponseFormat.JsonSchema) =
                responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

            /**
             * Alias for calling [responseFormat] with the following:
             * ```kotlin
             * ResponseFormat.JsonSchema.builder()
             *     .jsonSchema(jsonSchema)
             *     .build()
             * ```
             */
            fun jsonSchemaResponseFormat(jsonSchema: ResponseFormat.JsonSchema.InnerJsonSchema) =
                responseFormat(ResponseFormat.JsonSchema.builder().jsonSchema(jsonSchema).build())

            /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonObject()`. */
            fun responseFormatJsonObject() = responseFormat(ResponseFormat.ofJsonObject())

            /** (Optional) The seed to use. */
            fun seed(seed: Long) = seed(JsonField.of(seed))

            /**
             * Sets [Builder.seed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

            /** (Optional) The stop tokens to use. */
            fun stop(stop: Stop) = stop(JsonField.of(stop))

            /**
             * Sets [Builder.stop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun stop(stop: JsonField<Stop>) = apply { this.stop = stop }

            /** Alias for calling [stop] with `Stop.ofString(string)`. */
            fun stop(string: String) = stop(Stop.ofString(string))

            /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
            fun stopOfStrings(strings: List<String>) = stop(Stop.ofStrings(strings))

            /** (Optional) The stream options to use. */
            fun streamOptions(streamOptions: StreamOptions) =
                streamOptions(JsonField.of(streamOptions))

            /**
             * Sets [Builder.streamOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamOptions] with a well-typed [StreamOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun streamOptions(streamOptions: JsonField<StreamOptions>) = apply {
                this.streamOptions = streamOptions
            }

            /** (Optional) The temperature to use. */
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

            /** (Optional) The tool choice to use. */
            fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

            /**
             * Sets [Builder.toolChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
            fun toolChoice(string: String) = toolChoice(ToolChoice.ofString(string))

            /** Alias for calling [toolChoice] with `ToolChoice.ofUnionMember1(unionMember1)`. */
            fun toolChoice(unionMember1: ToolChoice.UnionMember1) =
                toolChoice(ToolChoice.ofUnionMember1(unionMember1))

            /** (Optional) The tools to use. */
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

            /** (Optional) The top log probabilities to use. */
            fun topLogprobs(topLogprobs: Long) = topLogprobs(JsonField.of(topLogprobs))

            /**
             * Sets [Builder.topLogprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

            /** (Optional) The top p to use. */
            fun topP(topP: Double) = topP(JsonField.of(topP))

            /**
             * Sets [Builder.topP] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

            /** (Optional) The user to use. */
            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .messages()
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("model", model),
                    frequencyPenalty,
                    functionCall,
                    (functions ?: JsonMissing.of()).map { it.toImmutable() },
                    logitBias,
                    logprobs,
                    maxCompletionTokens,
                    maxTokens,
                    n,
                    parallelToolCalls,
                    presencePenalty,
                    responseFormat,
                    seed,
                    stop,
                    streamOptions,
                    temperature,
                    toolChoice,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    topLogprobs,
                    topP,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            model()
            frequencyPenalty()
            functionCall()?.validate()
            functions()?.forEach { it.validate() }
            logitBias()?.validate()
            logprobs()
            maxCompletionTokens()
            maxTokens()
            n()
            parallelToolCalls()
            presencePenalty()
            responseFormat()?.validate()
            seed()
            stop()?.validate()
            streamOptions()?.validate()
            temperature()
            toolChoice()?.validate()
            tools()?.forEach { it.validate() }
            topLogprobs()
            topP()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (messages.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (model.asKnown() == null) 0 else 1) +
                (if (frequencyPenalty.asKnown() == null) 0 else 1) +
                (functionCall.asKnown()?.validity() ?: 0) +
                (functions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (logitBias.asKnown()?.validity() ?: 0) +
                (if (logprobs.asKnown() == null) 0 else 1) +
                (if (maxCompletionTokens.asKnown() == null) 0 else 1) +
                (if (maxTokens.asKnown() == null) 0 else 1) +
                (if (n.asKnown() == null) 0 else 1) +
                (if (parallelToolCalls.asKnown() == null) 0 else 1) +
                (if (presencePenalty.asKnown() == null) 0 else 1) +
                (responseFormat.asKnown()?.validity() ?: 0) +
                (if (seed.asKnown() == null) 0 else 1) +
                (stop.asKnown()?.validity() ?: 0) +
                (streamOptions.asKnown()?.validity() ?: 0) +
                (if (temperature.asKnown() == null) 0 else 1) +
                (toolChoice.asKnown()?.validity() ?: 0) +
                (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (topLogprobs.asKnown() == null) 0 else 1) +
                (if (topP.asKnown() == null) 0 else 1) +
                (if (user.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && messages == other.messages && model == other.model && frequencyPenalty == other.frequencyPenalty && functionCall == other.functionCall && functions == other.functions && logitBias == other.logitBias && logprobs == other.logprobs && maxCompletionTokens == other.maxCompletionTokens && maxTokens == other.maxTokens && n == other.n && parallelToolCalls == other.parallelToolCalls && presencePenalty == other.presencePenalty && responseFormat == other.responseFormat && seed == other.seed && stop == other.stop && streamOptions == other.streamOptions && temperature == other.temperature && toolChoice == other.toolChoice && tools == other.tools && topLogprobs == other.topLogprobs && topP == other.topP && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messages, model, frequencyPenalty, functionCall, functions, logitBias, logprobs, maxCompletionTokens, maxTokens, n, parallelToolCalls, presencePenalty, responseFormat, seed, stop, streamOptions, temperature, toolChoice, tools, topLogprobs, topP, user, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, model=$model, frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, functions=$functions, logitBias=$logitBias, logprobs=$logprobs, maxCompletionTokens=$maxCompletionTokens, maxTokens=$maxTokens, n=$n, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, responseFormat=$responseFormat, seed=$seed, stop=$stop, streamOptions=$streamOptions, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, user=$user, additionalProperties=$additionalProperties}"
    }

    /** A message from the user in an OpenAI-compatible chat completion request. */
    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val user: User? = null,
        private val system: System? = null,
        private val assistant: Assistant? = null,
        private val tool: Tool? = null,
        private val developer: Developer? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A message from the user in an OpenAI-compatible chat completion request. */
        fun user(): User? = user

        /** A system message providing instructions or context to the model. */
        fun system(): System? = system

        /**
         * A message containing the model's (assistant) response in an OpenAI-compatible chat
         * completion request.
         */
        fun assistant(): Assistant? = assistant

        /**
         * A message representing the result of a tool invocation in an OpenAI-compatible chat
         * completion request.
         */
        fun tool(): Tool? = tool

        /** A message from the developer in an OpenAI-compatible chat completion request. */
        fun developer(): Developer? = developer

        fun isUser(): Boolean = user != null

        fun isSystem(): Boolean = system != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isDeveloper(): Boolean = developer != null

        /** A message from the user in an OpenAI-compatible chat completion request. */
        fun asUser(): User = user.getOrThrow("user")

        /** A system message providing instructions or context to the model. */
        fun asSystem(): System = system.getOrThrow("system")

        /**
         * A message containing the model's (assistant) response in an OpenAI-compatible chat
         * completion request.
         */
        fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

        /**
         * A message representing the result of a tool invocation in an OpenAI-compatible chat
         * completion request.
         */
        fun asTool(): Tool = tool.getOrThrow("tool")

        /** A message from the developer in an OpenAI-compatible chat completion request. */
        fun asDeveloper(): Developer = developer.getOrThrow("developer")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                user != null -> visitor.visitUser(user)
                system != null -> visitor.visitSystem(system)
                assistant != null -> visitor.visitAssistant(assistant)
                tool != null -> visitor.visitTool(tool)
                developer != null -> visitor.visitDeveloper(developer)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: User) {
                        user.validate()
                    }

                    override fun visitSystem(system: System) {
                        system.validate()
                    }

                    override fun visitAssistant(assistant: Assistant) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: Tool) {
                        tool.validate()
                    }

                    override fun visitDeveloper(developer: Developer) {
                        developer.validate()
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
                    override fun visitUser(user: User) = user.validity()

                    override fun visitSystem(system: System) = system.validity()

                    override fun visitAssistant(assistant: Assistant) = assistant.validity()

                    override fun visitTool(tool: Tool) = tool.validity()

                    override fun visitDeveloper(developer: Developer) = developer.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Message && user == other.user && system == other.system && assistant == other.assistant && tool == other.tool && developer == other.developer /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, system, assistant, tool, developer) /* spotless:on */

        override fun toString(): String =
            when {
                user != null -> "Message{user=$user}"
                system != null -> "Message{system=$system}"
                assistant != null -> "Message{assistant=$assistant}"
                tool != null -> "Message{tool=$tool}"
                developer != null -> "Message{developer=$developer}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            /** A message from the user in an OpenAI-compatible chat completion request. */
            fun ofUser(user: User) = Message(user = user)

            /** A system message providing instructions or context to the model. */
            fun ofSystem(system: System) = Message(system = system)

            /**
             * A message containing the model's (assistant) response in an OpenAI-compatible chat
             * completion request.
             */
            fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

            /**
             * A message representing the result of a tool invocation in an OpenAI-compatible chat
             * completion request.
             */
            fun ofTool(tool: Tool) = Message(tool = tool)

            /** A message from the developer in an OpenAI-compatible chat completion request. */
            fun ofDeveloper(developer: Developer) = Message(developer = developer)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            /** A message from the user in an OpenAI-compatible chat completion request. */
            fun visitUser(user: User): T

            /** A system message providing instructions or context to the model. */
            fun visitSystem(system: System): T

            /**
             * A message containing the model's (assistant) response in an OpenAI-compatible chat
             * completion request.
             */
            fun visitAssistant(assistant: Assistant): T

            /**
             * A message representing the result of a tool invocation in an OpenAI-compatible chat
             * completion request.
             */
            fun visitTool(tool: Tool): T

            /** A message from the developer in an OpenAI-compatible chat completion request. */
            fun visitDeveloper(developer: Developer): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)
                val role = json.asObject()?.get("role")?.asString()

                when (role) {
                    "user" -> {
                        return tryDeserialize(node, jacksonTypeRef<User>())?.let {
                            Message(user = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(node, jacksonTypeRef<System>())?.let {
                            Message(system = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                            Message(assistant = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                            Message(tool = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "developer" -> {
                        return tryDeserialize(node, jacksonTypeRef<Developer>())?.let {
                            Message(developer = it, _json = json)
                        } ?: Message(_json = json)
                    }
                }

                return Message(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.user != null -> generator.writeObject(value.user)
                    value.system != null -> generator.writeObject(value.system)
                    value.assistant != null -> generator.writeObject(value.assistant)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.developer != null -> generator.writeObject(value.developer)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        /** A message from the user in an OpenAI-compatible chat completion request. */
        class User
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, name, mutableMapOf())

            /**
             * The content of the message, which can include text and other media
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Must be "user" to identify this as a user message
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("user")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * (Optional) The name of the user message participant.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("user")
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(user: User) = apply {
                    content = user.content
                    role = user.role
                    name = user.name
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The content of the message, which can include text and other media */
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
                 * `Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
                 */
                fun contentOfOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams:
                        List<Content.OpenAIChatCompletionContentPartParam>
                ) =
                    content(
                        Content.ofOpenAIChatCompletionContentPartParams(
                            openaiChatCompletionContentPartParams
                        )
                    )

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("user")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** (Optional) The name of the user message participant. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(
                        checkRequired("content", content),
                        role,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("user")) {
                        throw LlamaStackClientInvalidDataException(
                            "'role' is invalid, received $it"
                        )
                    }
                }
                name()
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
                    role.let { if (it == JsonValue.from("user")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1)

            /** The content of the message, which can include text and other media */
            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val openaiChatCompletionContentPartParams:
                    List<OpenAIChatCompletionContentPartParam>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun openaiChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam>? =
                    openaiChatCompletionContentPartParams

                fun isString(): Boolean = string != null

                fun isOpenAIChatCompletionContentPartParams(): Boolean =
                    openaiChatCompletionContentPartParams != null

                fun asString(): String = string.getOrThrow("string")

                fun asOpenAIChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam> =
                    openaiChatCompletionContentPartParams.getOrThrow(
                        "openaiChatCompletionContentPartParams"
                    )

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        openaiChatCompletionContentPartParams != null ->
                            visitor.visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) {
                                openaiChatCompletionContentPartParams.forEach { it.validate() }
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) =
                                openaiChatCompletionContentPartParams.sumOf {
                                    it.validity().toInt()
                                }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && string == other.string && openaiChatCompletionContentPartParams == other.openaiChatCompletionContentPartParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiChatCompletionContentPartParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        openaiChatCompletionContentPartParams != null ->
                            "Content{openaiChatCompletionContentPartParams=$openaiChatCompletionContentPartParams}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
                    ) =
                        Content(
                            openaiChatCompletionContentPartParams =
                                openaiChatCompletionContentPartParams
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
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
                                                List<OpenAIChatCompletionContentPartParam>
                                            >(),
                                        )
                                        ?.let {
                                            Content(
                                                openaiChatCompletionContentPartParams = it,
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
                            value.openaiChatCompletionContentPartParams != null ->
                                generator.writeObject(value.openaiChatCompletionContentPartParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = OpenAIChatCompletionContentPartParam.Deserializer::class)
                @JsonSerialize(using = OpenAIChatCompletionContentPartParam.Serializer::class)
                class OpenAIChatCompletionContentPartParam
                private constructor(
                    private val text: Text? = null,
                    private val imageUrl: ImageUrl? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun text(): Text? = text

                    fun imageUrl(): ImageUrl? = imageUrl

                    fun isText(): Boolean = text != null

                    fun isImageUrl(): Boolean = imageUrl != null

                    fun asText(): Text = text.getOrThrow("text")

                    fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            text != null -> visitor.visitText(text)
                            imageUrl != null -> visitor.visitImageUrl(imageUrl)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): OpenAIChatCompletionContentPartParam = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: Text) {
                                    text.validate()
                                }

                                override fun visitImageUrl(imageUrl: ImageUrl) {
                                    imageUrl.validate()
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
                                override fun visitText(text: Text) = text.validity()

                                override fun visitImageUrl(imageUrl: ImageUrl) = imageUrl.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is OpenAIChatCompletionContentPartParam && text == other.text && imageUrl == other.imageUrl /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, imageUrl) /* spotless:on */

                    override fun toString(): String =
                        when {
                            text != null -> "OpenAIChatCompletionContentPartParam{text=$text}"
                            imageUrl != null ->
                                "OpenAIChatCompletionContentPartParam{imageUrl=$imageUrl}"
                            _json != null -> "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid OpenAIChatCompletionContentPartParam"
                                )
                        }

                    companion object {

                        fun ofText(text: Text) = OpenAIChatCompletionContentPartParam(text = text)

                        fun ofImageUrl(imageUrl: ImageUrl) =
                            OpenAIChatCompletionContentPartParam(imageUrl = imageUrl)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [OpenAIChatCompletionContentPartParam] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitText(text: Text): T

                        fun visitImageUrl(imageUrl: ImageUrl): T

                        /**
                         * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to a
                         * value of type [T].
                         *
                         * An instance of [OpenAIChatCompletionContentPartParam] can contain an
                         * unknown variant if it was deserialized from data that doesn't match any
                         * known variant. For example, if the SDK is on an older version than the
                         * API, then the API may respond with new variants that the SDK is unaware
                         * of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OpenAIChatCompletionContentPartParam: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): OpenAIChatCompletionContentPartParam {
                            val json = JsonValue.fromJsonNode(node)
                            val type = json.asObject()?.get("type")?.asString()

                            when (type) {
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            text = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                                "image_url" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ImageUrl>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            imageUrl = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                            }

                            return OpenAIChatCompletionContentPartParam(_json = json)
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun serialize(
                            value: OpenAIChatCompletionContentPartParam,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.imageUrl != null -> generator.writeObject(value.imageUrl)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }
                        }
                    }

                    class Text
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
                         * JsonValue.from("text")
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
                             * Returns a mutable builder for constructing an instance of [Text].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Text]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(text: Text) = apply {
                                this.text = text.text
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
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
                             * JsonValue.from("text")
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
                             * Returns an immutable instance of [Text].
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
                            fun build(): Text =
                                Text(
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Text = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
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
                                type.let { if (it == JsonValue.from("text")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Text && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ImageUrl
                    private constructor(
                        private val imageUrl: JsonField<InnerImageUrl>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            imageUrl: JsonField<InnerImageUrl> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(imageUrl, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("image_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [imageUrl].
                         *
                         * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun _imageUrl(): JsonField<InnerImageUrl> = imageUrl

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
                             * Returns a mutable builder for constructing an instance of [ImageUrl].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ImageUrl]. */
                        class Builder internal constructor() {

                            private var imageUrl: JsonField<InnerImageUrl>? = null
                            private var type: JsonValue = JsonValue.from("image_url")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(imageUrl: ImageUrl) = apply {
                                this.imageUrl = imageUrl.imageUrl
                                type = imageUrl.type
                                additionalProperties = imageUrl.additionalProperties.toMutableMap()
                            }

                            fun imageUrl(imageUrl: InnerImageUrl) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed
                             * [InnerImageUrl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<InnerImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
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
                             * Returns an immutable instance of [ImageUrl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ImageUrl =
                                ImageUrl(
                                    checkRequired("imageUrl", imageUrl),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ImageUrl = apply {
                            if (validated) {
                                return@apply
                            }

                            imageUrl().validate()
                            _type().let {
                                if (it != JsonValue.from("image_url")) {
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
                            (imageUrl.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                        class InnerImageUrl
                        private constructor(
                            private val url: JsonField<String>,
                            private val detail: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("url")
                                @ExcludeMissing
                                url: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<String> = JsonMissing.of(),
                            ) : this(url, detail, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun url(): String = url.getRequired("url")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun detail(): String? = detail.getNullable("detail")

                            /**
                             * Returns the raw JSON value of [url].
                             *
                             * Unlike [url], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<String> = detail

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
                                 * [InnerImageUrl].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InnerImageUrl]. */
                            class Builder internal constructor() {

                                private var url: JsonField<String>? = null
                                private var detail: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(innerImageUrl: InnerImageUrl) = apply {
                                    url = innerImageUrl.url
                                    detail = innerImageUrl.detail
                                    additionalProperties =
                                        innerImageUrl.additionalProperties.toMutableMap()
                                }

                                fun url(url: String) = url(JsonField.of(url))

                                /**
                                 * Sets [Builder.url] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.url] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun url(url: JsonField<String>) = apply { this.url = url }

                                fun detail(detail: String) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<String>) = apply {
                                    this.detail = detail
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
                                 * Returns an immutable instance of [InnerImageUrl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InnerImageUrl =
                                    InnerImageUrl(
                                        checkRequired("url", url),
                                        detail,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InnerImageUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                url()
                                detail()
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
                                (if (url.asKnown() == null) 0 else 1) +
                                    (if (detail.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InnerImageUrl && url == other.url && detail == other.detail && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(url, detail, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InnerImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ImageUrl && imageUrl == other.imageUrl && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(imageUrl, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is User && content == other.content && role == other.role && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, role, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }

        /** A system message providing instructions or context to the model. */
        class System
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, name, mutableMapOf())

            /**
             * The content of the "system prompt". If multiple system messages are provided, they
             * are concatenated. The underlying Llama Stack code may also add other system messages
             * (for example, for formatting tool definitions).
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Must be "system" to identify this as a system message
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("system")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * (Optional) The name of the system message participant.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [System].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [System]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("system")
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(system: System) = apply {
                    content = system.content
                    role = system.role
                    name = system.name
                    additionalProperties = system.additionalProperties.toMutableMap()
                }

                /**
                 * The content of the "system prompt". If multiple system messages are provided,
                 * they are concatenated. The underlying Llama Stack code may also add other system
                 * messages (for example, for formatting tool definitions).
                 */
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
                 * `Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
                 */
                fun contentOfOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams:
                        List<Content.OpenAIChatCompletionContentPartParam>
                ) =
                    content(
                        Content.ofOpenAIChatCompletionContentPartParams(
                            openaiChatCompletionContentPartParams
                        )
                    )

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("system")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** (Optional) The name of the system message participant. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [System].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): System =
                    System(
                        checkRequired("content", content),
                        role,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): System = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("system")) {
                        throw LlamaStackClientInvalidDataException(
                            "'role' is invalid, received $it"
                        )
                    }
                }
                name()
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
                    role.let { if (it == JsonValue.from("system")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1)

            /**
             * The content of the "system prompt". If multiple system messages are provided, they
             * are concatenated. The underlying Llama Stack code may also add other system messages
             * (for example, for formatting tool definitions).
             */
            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val openaiChatCompletionContentPartParams:
                    List<OpenAIChatCompletionContentPartParam>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun openaiChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam>? =
                    openaiChatCompletionContentPartParams

                fun isString(): Boolean = string != null

                fun isOpenAIChatCompletionContentPartParams(): Boolean =
                    openaiChatCompletionContentPartParams != null

                fun asString(): String = string.getOrThrow("string")

                fun asOpenAIChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam> =
                    openaiChatCompletionContentPartParams.getOrThrow(
                        "openaiChatCompletionContentPartParams"
                    )

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        openaiChatCompletionContentPartParams != null ->
                            visitor.visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) {
                                openaiChatCompletionContentPartParams.forEach { it.validate() }
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) =
                                openaiChatCompletionContentPartParams.sumOf {
                                    it.validity().toInt()
                                }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && string == other.string && openaiChatCompletionContentPartParams == other.openaiChatCompletionContentPartParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiChatCompletionContentPartParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        openaiChatCompletionContentPartParams != null ->
                            "Content{openaiChatCompletionContentPartParams=$openaiChatCompletionContentPartParams}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
                    ) =
                        Content(
                            openaiChatCompletionContentPartParams =
                                openaiChatCompletionContentPartParams
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
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
                                                List<OpenAIChatCompletionContentPartParam>
                                            >(),
                                        )
                                        ?.let {
                                            Content(
                                                openaiChatCompletionContentPartParams = it,
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
                            value.openaiChatCompletionContentPartParams != null ->
                                generator.writeObject(value.openaiChatCompletionContentPartParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = OpenAIChatCompletionContentPartParam.Deserializer::class)
                @JsonSerialize(using = OpenAIChatCompletionContentPartParam.Serializer::class)
                class OpenAIChatCompletionContentPartParam
                private constructor(
                    private val text: Text? = null,
                    private val imageUrl: ImageUrl? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun text(): Text? = text

                    fun imageUrl(): ImageUrl? = imageUrl

                    fun isText(): Boolean = text != null

                    fun isImageUrl(): Boolean = imageUrl != null

                    fun asText(): Text = text.getOrThrow("text")

                    fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            text != null -> visitor.visitText(text)
                            imageUrl != null -> visitor.visitImageUrl(imageUrl)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): OpenAIChatCompletionContentPartParam = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: Text) {
                                    text.validate()
                                }

                                override fun visitImageUrl(imageUrl: ImageUrl) {
                                    imageUrl.validate()
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
                                override fun visitText(text: Text) = text.validity()

                                override fun visitImageUrl(imageUrl: ImageUrl) = imageUrl.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is OpenAIChatCompletionContentPartParam && text == other.text && imageUrl == other.imageUrl /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, imageUrl) /* spotless:on */

                    override fun toString(): String =
                        when {
                            text != null -> "OpenAIChatCompletionContentPartParam{text=$text}"
                            imageUrl != null ->
                                "OpenAIChatCompletionContentPartParam{imageUrl=$imageUrl}"
                            _json != null -> "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid OpenAIChatCompletionContentPartParam"
                                )
                        }

                    companion object {

                        fun ofText(text: Text) = OpenAIChatCompletionContentPartParam(text = text)

                        fun ofImageUrl(imageUrl: ImageUrl) =
                            OpenAIChatCompletionContentPartParam(imageUrl = imageUrl)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [OpenAIChatCompletionContentPartParam] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitText(text: Text): T

                        fun visitImageUrl(imageUrl: ImageUrl): T

                        /**
                         * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to a
                         * value of type [T].
                         *
                         * An instance of [OpenAIChatCompletionContentPartParam] can contain an
                         * unknown variant if it was deserialized from data that doesn't match any
                         * known variant. For example, if the SDK is on an older version than the
                         * API, then the API may respond with new variants that the SDK is unaware
                         * of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OpenAIChatCompletionContentPartParam: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): OpenAIChatCompletionContentPartParam {
                            val json = JsonValue.fromJsonNode(node)
                            val type = json.asObject()?.get("type")?.asString()

                            when (type) {
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            text = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                                "image_url" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ImageUrl>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            imageUrl = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                            }

                            return OpenAIChatCompletionContentPartParam(_json = json)
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun serialize(
                            value: OpenAIChatCompletionContentPartParam,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.imageUrl != null -> generator.writeObject(value.imageUrl)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }
                        }
                    }

                    class Text
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
                         * JsonValue.from("text")
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
                             * Returns a mutable builder for constructing an instance of [Text].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Text]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(text: Text) = apply {
                                this.text = text.text
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
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
                             * JsonValue.from("text")
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
                             * Returns an immutable instance of [Text].
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
                            fun build(): Text =
                                Text(
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Text = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
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
                                type.let { if (it == JsonValue.from("text")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Text && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ImageUrl
                    private constructor(
                        private val imageUrl: JsonField<InnerImageUrl>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            imageUrl: JsonField<InnerImageUrl> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(imageUrl, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("image_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [imageUrl].
                         *
                         * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun _imageUrl(): JsonField<InnerImageUrl> = imageUrl

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
                             * Returns a mutable builder for constructing an instance of [ImageUrl].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ImageUrl]. */
                        class Builder internal constructor() {

                            private var imageUrl: JsonField<InnerImageUrl>? = null
                            private var type: JsonValue = JsonValue.from("image_url")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(imageUrl: ImageUrl) = apply {
                                this.imageUrl = imageUrl.imageUrl
                                type = imageUrl.type
                                additionalProperties = imageUrl.additionalProperties.toMutableMap()
                            }

                            fun imageUrl(imageUrl: InnerImageUrl) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed
                             * [InnerImageUrl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<InnerImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
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
                             * Returns an immutable instance of [ImageUrl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ImageUrl =
                                ImageUrl(
                                    checkRequired("imageUrl", imageUrl),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ImageUrl = apply {
                            if (validated) {
                                return@apply
                            }

                            imageUrl().validate()
                            _type().let {
                                if (it != JsonValue.from("image_url")) {
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
                            (imageUrl.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                        class InnerImageUrl
                        private constructor(
                            private val url: JsonField<String>,
                            private val detail: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("url")
                                @ExcludeMissing
                                url: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<String> = JsonMissing.of(),
                            ) : this(url, detail, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun url(): String = url.getRequired("url")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun detail(): String? = detail.getNullable("detail")

                            /**
                             * Returns the raw JSON value of [url].
                             *
                             * Unlike [url], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<String> = detail

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
                                 * [InnerImageUrl].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InnerImageUrl]. */
                            class Builder internal constructor() {

                                private var url: JsonField<String>? = null
                                private var detail: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(innerImageUrl: InnerImageUrl) = apply {
                                    url = innerImageUrl.url
                                    detail = innerImageUrl.detail
                                    additionalProperties =
                                        innerImageUrl.additionalProperties.toMutableMap()
                                }

                                fun url(url: String) = url(JsonField.of(url))

                                /**
                                 * Sets [Builder.url] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.url] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun url(url: JsonField<String>) = apply { this.url = url }

                                fun detail(detail: String) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<String>) = apply {
                                    this.detail = detail
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
                                 * Returns an immutable instance of [InnerImageUrl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InnerImageUrl =
                                    InnerImageUrl(
                                        checkRequired("url", url),
                                        detail,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InnerImageUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                url()
                                detail()
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
                                (if (url.asKnown() == null) 0 else 1) +
                                    (if (detail.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InnerImageUrl && url == other.url && detail == other.detail && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(url, detail, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InnerImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ImageUrl && imageUrl == other.imageUrl && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(imageUrl, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is System && content == other.content && role == other.role && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, role, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "System{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }

        /**
         * A message containing the model's (assistant) response in an OpenAI-compatible chat
         * completion request.
         */
        class Assistant
        private constructor(
            private val role: JsonValue,
            private val content: JsonField<Content>,
            private val name: JsonField<String>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            ) : this(role, content, name, toolCalls, mutableMapOf())

            /**
             * Must be "assistant" to identify this as the model's response
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("assistant")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * The content of the model's response
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun content(): Content? = content.getNullable("content")

            /**
             * (Optional) The name of the assistant message participant.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * List of tool calls. Each tool call is an OpenAIChatCompletionToolCall object.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [toolCalls].
             *
             * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

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

                /** Returns a mutable builder for constructing an instance of [Assistant]. */
                fun builder() = Builder()
            }

            /** A builder for [Assistant]. */
            class Builder internal constructor() {

                private var role: JsonValue = JsonValue.from("assistant")
                private var content: JsonField<Content> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(assistant: Assistant) = apply {
                    role = assistant.role
                    content = assistant.content
                    name = assistant.name
                    toolCalls = assistant.toolCalls.map { it.toMutableList() }
                    additionalProperties = assistant.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("assistant")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** The content of the model's response */
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
                 * `Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
                 */
                fun contentOfOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams:
                        List<Content.OpenAIChatCompletionContentPartParam>
                ) =
                    content(
                        Content.ofOpenAIChatCompletionContentPartParams(
                            openaiChatCompletionContentPartParams
                        )
                    )

                /** (Optional) The name of the assistant message participant. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** List of tool calls. Each tool call is an OpenAIChatCompletionToolCall object. */
                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /**
                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolCall] to [toolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolCall(toolCall: ToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
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
                 * Returns an immutable instance of [Assistant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Assistant =
                    Assistant(
                        role,
                        content,
                        name,
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Assistant = apply {
                if (validated) {
                    return@apply
                }

                _role().let {
                    if (it != JsonValue.from("assistant")) {
                        throw LlamaStackClientInvalidDataException(
                            "'role' is invalid, received $it"
                        )
                    }
                }
                content()?.validate()
                name()
                toolCalls()?.forEach { it.validate() }
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
                role.let { if (it == JsonValue.from("assistant")) 1 else 0 } +
                    (content.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (toolCalls.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            /** The content of the model's response */
            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val openaiChatCompletionContentPartParams:
                    List<OpenAIChatCompletionContentPartParam>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun openaiChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam>? =
                    openaiChatCompletionContentPartParams

                fun isString(): Boolean = string != null

                fun isOpenAIChatCompletionContentPartParams(): Boolean =
                    openaiChatCompletionContentPartParams != null

                fun asString(): String = string.getOrThrow("string")

                fun asOpenAIChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam> =
                    openaiChatCompletionContentPartParams.getOrThrow(
                        "openaiChatCompletionContentPartParams"
                    )

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        openaiChatCompletionContentPartParams != null ->
                            visitor.visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) {
                                openaiChatCompletionContentPartParams.forEach { it.validate() }
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) =
                                openaiChatCompletionContentPartParams.sumOf {
                                    it.validity().toInt()
                                }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && string == other.string && openaiChatCompletionContentPartParams == other.openaiChatCompletionContentPartParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiChatCompletionContentPartParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        openaiChatCompletionContentPartParams != null ->
                            "Content{openaiChatCompletionContentPartParams=$openaiChatCompletionContentPartParams}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
                    ) =
                        Content(
                            openaiChatCompletionContentPartParams =
                                openaiChatCompletionContentPartParams
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
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
                                                List<OpenAIChatCompletionContentPartParam>
                                            >(),
                                        )
                                        ?.let {
                                            Content(
                                                openaiChatCompletionContentPartParams = it,
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
                            value.openaiChatCompletionContentPartParams != null ->
                                generator.writeObject(value.openaiChatCompletionContentPartParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = OpenAIChatCompletionContentPartParam.Deserializer::class)
                @JsonSerialize(using = OpenAIChatCompletionContentPartParam.Serializer::class)
                class OpenAIChatCompletionContentPartParam
                private constructor(
                    private val text: Text? = null,
                    private val imageUrl: ImageUrl? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun text(): Text? = text

                    fun imageUrl(): ImageUrl? = imageUrl

                    fun isText(): Boolean = text != null

                    fun isImageUrl(): Boolean = imageUrl != null

                    fun asText(): Text = text.getOrThrow("text")

                    fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            text != null -> visitor.visitText(text)
                            imageUrl != null -> visitor.visitImageUrl(imageUrl)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): OpenAIChatCompletionContentPartParam = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: Text) {
                                    text.validate()
                                }

                                override fun visitImageUrl(imageUrl: ImageUrl) {
                                    imageUrl.validate()
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
                                override fun visitText(text: Text) = text.validity()

                                override fun visitImageUrl(imageUrl: ImageUrl) = imageUrl.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is OpenAIChatCompletionContentPartParam && text == other.text && imageUrl == other.imageUrl /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, imageUrl) /* spotless:on */

                    override fun toString(): String =
                        when {
                            text != null -> "OpenAIChatCompletionContentPartParam{text=$text}"
                            imageUrl != null ->
                                "OpenAIChatCompletionContentPartParam{imageUrl=$imageUrl}"
                            _json != null -> "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid OpenAIChatCompletionContentPartParam"
                                )
                        }

                    companion object {

                        fun ofText(text: Text) = OpenAIChatCompletionContentPartParam(text = text)

                        fun ofImageUrl(imageUrl: ImageUrl) =
                            OpenAIChatCompletionContentPartParam(imageUrl = imageUrl)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [OpenAIChatCompletionContentPartParam] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitText(text: Text): T

                        fun visitImageUrl(imageUrl: ImageUrl): T

                        /**
                         * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to a
                         * value of type [T].
                         *
                         * An instance of [OpenAIChatCompletionContentPartParam] can contain an
                         * unknown variant if it was deserialized from data that doesn't match any
                         * known variant. For example, if the SDK is on an older version than the
                         * API, then the API may respond with new variants that the SDK is unaware
                         * of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OpenAIChatCompletionContentPartParam: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): OpenAIChatCompletionContentPartParam {
                            val json = JsonValue.fromJsonNode(node)
                            val type = json.asObject()?.get("type")?.asString()

                            when (type) {
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            text = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                                "image_url" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ImageUrl>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            imageUrl = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                            }

                            return OpenAIChatCompletionContentPartParam(_json = json)
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun serialize(
                            value: OpenAIChatCompletionContentPartParam,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.imageUrl != null -> generator.writeObject(value.imageUrl)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }
                        }
                    }

                    class Text
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
                         * JsonValue.from("text")
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
                             * Returns a mutable builder for constructing an instance of [Text].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Text]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(text: Text) = apply {
                                this.text = text.text
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
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
                             * JsonValue.from("text")
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
                             * Returns an immutable instance of [Text].
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
                            fun build(): Text =
                                Text(
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Text = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
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
                                type.let { if (it == JsonValue.from("text")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Text && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ImageUrl
                    private constructor(
                        private val imageUrl: JsonField<InnerImageUrl>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            imageUrl: JsonField<InnerImageUrl> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(imageUrl, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("image_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [imageUrl].
                         *
                         * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun _imageUrl(): JsonField<InnerImageUrl> = imageUrl

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
                             * Returns a mutable builder for constructing an instance of [ImageUrl].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ImageUrl]. */
                        class Builder internal constructor() {

                            private var imageUrl: JsonField<InnerImageUrl>? = null
                            private var type: JsonValue = JsonValue.from("image_url")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(imageUrl: ImageUrl) = apply {
                                this.imageUrl = imageUrl.imageUrl
                                type = imageUrl.type
                                additionalProperties = imageUrl.additionalProperties.toMutableMap()
                            }

                            fun imageUrl(imageUrl: InnerImageUrl) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed
                             * [InnerImageUrl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<InnerImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
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
                             * Returns an immutable instance of [ImageUrl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ImageUrl =
                                ImageUrl(
                                    checkRequired("imageUrl", imageUrl),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ImageUrl = apply {
                            if (validated) {
                                return@apply
                            }

                            imageUrl().validate()
                            _type().let {
                                if (it != JsonValue.from("image_url")) {
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
                            (imageUrl.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                        class InnerImageUrl
                        private constructor(
                            private val url: JsonField<String>,
                            private val detail: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("url")
                                @ExcludeMissing
                                url: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<String> = JsonMissing.of(),
                            ) : this(url, detail, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun url(): String = url.getRequired("url")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun detail(): String? = detail.getNullable("detail")

                            /**
                             * Returns the raw JSON value of [url].
                             *
                             * Unlike [url], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<String> = detail

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
                                 * [InnerImageUrl].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InnerImageUrl]. */
                            class Builder internal constructor() {

                                private var url: JsonField<String>? = null
                                private var detail: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(innerImageUrl: InnerImageUrl) = apply {
                                    url = innerImageUrl.url
                                    detail = innerImageUrl.detail
                                    additionalProperties =
                                        innerImageUrl.additionalProperties.toMutableMap()
                                }

                                fun url(url: String) = url(JsonField.of(url))

                                /**
                                 * Sets [Builder.url] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.url] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun url(url: JsonField<String>) = apply { this.url = url }

                                fun detail(detail: String) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<String>) = apply {
                                    this.detail = detail
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
                                 * Returns an immutable instance of [InnerImageUrl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InnerImageUrl =
                                    InnerImageUrl(
                                        checkRequired("url", url),
                                        detail,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InnerImageUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                url()
                                detail()
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
                                (if (url.asKnown() == null) 0 else 1) +
                                    (if (detail.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InnerImageUrl && url == other.url && detail == other.detail && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(url, detail, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InnerImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ImageUrl && imageUrl == other.imageUrl && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(imageUrl, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
                    }
                }
            }

            class ToolCall
            private constructor(
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val function: JsonField<Function>,
                private val index: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("function")
                    @ExcludeMissing
                    function: JsonField<Function> = JsonMissing.of(),
                    @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                ) : this(type, id, function, index, mutableMapOf())

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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun function(): Function? = function.getNullable("function")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun index(): Long? = index.getNullable("index")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [function].
                 *
                 * Unlike [function], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("function")
                @ExcludeMissing
                fun _function(): JsonField<Function> = function

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

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

                    /** Returns a mutable builder for constructing an instance of [ToolCall]. */
                    fun builder() = Builder()
                }

                /** A builder for [ToolCall]. */
                class Builder internal constructor() {

                    private var type: JsonValue = JsonValue.from("function")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var function: JsonField<Function> = JsonMissing.of()
                    private var index: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(toolCall: ToolCall) = apply {
                        type = toolCall.type
                        id = toolCall.id
                        function = toolCall.function
                        index = toolCall.index
                        additionalProperties = toolCall.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("function")
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

                    fun function(function: Function) = function(JsonField.of(function))

                    /**
                     * Sets [Builder.function] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.function] with a well-typed [Function] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun function(function: JsonField<Function>) = apply { this.function = function }

                    fun index(index: Long) = index(JsonField.of(index))

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Long>) = apply { this.index = index }

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
                     * Returns an immutable instance of [ToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ToolCall =
                        ToolCall(type, id, function, index, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): ToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    _type().let {
                        if (it != JsonValue.from("function")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    function()?.validate()
                    index()
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
                    type.let { if (it == JsonValue.from("function")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (function.asKnown()?.validity() ?: 0) +
                        (if (index.asKnown() == null) 0 else 1)

                class Function
                private constructor(
                    private val arguments: JsonField<String>,
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        arguments: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                    ) : this(arguments, name, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun arguments(): String? = arguments.getNullable("arguments")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): String? = name.getNullable("name")

                    /**
                     * Returns the raw JSON value of [arguments].
                     *
                     * Unlike [arguments], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun _arguments(): JsonField<String> = arguments

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                        /** Returns a mutable builder for constructing an instance of [Function]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var arguments: JsonField<String> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(function: Function) = apply {
                            arguments = function.arguments
                            name = function.name
                            additionalProperties = function.additionalProperties.toMutableMap()
                        }

                        fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                        /**
                         * Sets [Builder.arguments] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.arguments] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun arguments(arguments: JsonField<String>) = apply {
                            this.arguments = arguments
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

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
                         * Returns an immutable instance of [Function].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Function =
                            Function(arguments, name, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        arguments()
                        name()
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
                            (if (name.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Function && arguments == other.arguments && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(arguments, name, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ToolCall && type == other.type && id == other.id && function == other.function && index == other.index && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(type, id, function, index, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ToolCall{type=$type, id=$id, function=$function, index=$index, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Assistant && role == other.role && content == other.content && name == other.name && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(role, content, name, toolCalls, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Assistant{role=$role, content=$content, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        /**
         * A message representing the result of a tool invocation in an OpenAI-compatible chat
         * completion request.
         */
        class Tool
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val toolCallId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, toolCallId, mutableMapOf())

            /**
             * The response content from the tool
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Must be "tool" to identify this as a tool response
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("tool")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * Unique identifier for the tool call this response is for
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

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
                 * .content()
                 * .toolCallId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Tool]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("tool")
                private var toolCallId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tool: Tool) = apply {
                    content = tool.content
                    role = tool.role
                    toolCallId = tool.toolCallId
                    additionalProperties = tool.additionalProperties.toMutableMap()
                }

                /** The response content from the tool */
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
                 * `Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
                 */
                fun contentOfOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams:
                        List<Content.OpenAIChatCompletionContentPartParam>
                ) =
                    content(
                        Content.ofOpenAIChatCompletionContentPartParams(
                            openaiChatCompletionContentPartParams
                        )
                    )

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("tool")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Unique identifier for the tool call this response is for */
                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
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
                 * .content()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tool =
                    Tool(
                        checkRequired("content", content),
                        role,
                        checkRequired("toolCallId", toolCallId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tool = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("tool")) {
                        throw LlamaStackClientInvalidDataException(
                            "'role' is invalid, received $it"
                        )
                    }
                }
                toolCallId()
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
                    role.let { if (it == JsonValue.from("tool")) 1 else 0 } +
                    (if (toolCallId.asKnown() == null) 0 else 1)

            /** The response content from the tool */
            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val openaiChatCompletionContentPartParams:
                    List<OpenAIChatCompletionContentPartParam>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun openaiChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam>? =
                    openaiChatCompletionContentPartParams

                fun isString(): Boolean = string != null

                fun isOpenAIChatCompletionContentPartParams(): Boolean =
                    openaiChatCompletionContentPartParams != null

                fun asString(): String = string.getOrThrow("string")

                fun asOpenAIChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam> =
                    openaiChatCompletionContentPartParams.getOrThrow(
                        "openaiChatCompletionContentPartParams"
                    )

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        openaiChatCompletionContentPartParams != null ->
                            visitor.visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) {
                                openaiChatCompletionContentPartParams.forEach { it.validate() }
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) =
                                openaiChatCompletionContentPartParams.sumOf {
                                    it.validity().toInt()
                                }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && string == other.string && openaiChatCompletionContentPartParams == other.openaiChatCompletionContentPartParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiChatCompletionContentPartParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        openaiChatCompletionContentPartParams != null ->
                            "Content{openaiChatCompletionContentPartParams=$openaiChatCompletionContentPartParams}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
                    ) =
                        Content(
                            openaiChatCompletionContentPartParams =
                                openaiChatCompletionContentPartParams
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
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
                                                List<OpenAIChatCompletionContentPartParam>
                                            >(),
                                        )
                                        ?.let {
                                            Content(
                                                openaiChatCompletionContentPartParams = it,
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
                            value.openaiChatCompletionContentPartParams != null ->
                                generator.writeObject(value.openaiChatCompletionContentPartParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = OpenAIChatCompletionContentPartParam.Deserializer::class)
                @JsonSerialize(using = OpenAIChatCompletionContentPartParam.Serializer::class)
                class OpenAIChatCompletionContentPartParam
                private constructor(
                    private val text: Text? = null,
                    private val imageUrl: ImageUrl? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun text(): Text? = text

                    fun imageUrl(): ImageUrl? = imageUrl

                    fun isText(): Boolean = text != null

                    fun isImageUrl(): Boolean = imageUrl != null

                    fun asText(): Text = text.getOrThrow("text")

                    fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            text != null -> visitor.visitText(text)
                            imageUrl != null -> visitor.visitImageUrl(imageUrl)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): OpenAIChatCompletionContentPartParam = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: Text) {
                                    text.validate()
                                }

                                override fun visitImageUrl(imageUrl: ImageUrl) {
                                    imageUrl.validate()
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
                                override fun visitText(text: Text) = text.validity()

                                override fun visitImageUrl(imageUrl: ImageUrl) = imageUrl.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is OpenAIChatCompletionContentPartParam && text == other.text && imageUrl == other.imageUrl /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, imageUrl) /* spotless:on */

                    override fun toString(): String =
                        when {
                            text != null -> "OpenAIChatCompletionContentPartParam{text=$text}"
                            imageUrl != null ->
                                "OpenAIChatCompletionContentPartParam{imageUrl=$imageUrl}"
                            _json != null -> "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid OpenAIChatCompletionContentPartParam"
                                )
                        }

                    companion object {

                        fun ofText(text: Text) = OpenAIChatCompletionContentPartParam(text = text)

                        fun ofImageUrl(imageUrl: ImageUrl) =
                            OpenAIChatCompletionContentPartParam(imageUrl = imageUrl)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [OpenAIChatCompletionContentPartParam] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitText(text: Text): T

                        fun visitImageUrl(imageUrl: ImageUrl): T

                        /**
                         * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to a
                         * value of type [T].
                         *
                         * An instance of [OpenAIChatCompletionContentPartParam] can contain an
                         * unknown variant if it was deserialized from data that doesn't match any
                         * known variant. For example, if the SDK is on an older version than the
                         * API, then the API may respond with new variants that the SDK is unaware
                         * of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OpenAIChatCompletionContentPartParam: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): OpenAIChatCompletionContentPartParam {
                            val json = JsonValue.fromJsonNode(node)
                            val type = json.asObject()?.get("type")?.asString()

                            when (type) {
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            text = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                                "image_url" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ImageUrl>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            imageUrl = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                            }

                            return OpenAIChatCompletionContentPartParam(_json = json)
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun serialize(
                            value: OpenAIChatCompletionContentPartParam,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.imageUrl != null -> generator.writeObject(value.imageUrl)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }
                        }
                    }

                    class Text
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
                         * JsonValue.from("text")
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
                             * Returns a mutable builder for constructing an instance of [Text].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Text]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(text: Text) = apply {
                                this.text = text.text
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
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
                             * JsonValue.from("text")
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
                             * Returns an immutable instance of [Text].
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
                            fun build(): Text =
                                Text(
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Text = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
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
                                type.let { if (it == JsonValue.from("text")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Text && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ImageUrl
                    private constructor(
                        private val imageUrl: JsonField<InnerImageUrl>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            imageUrl: JsonField<InnerImageUrl> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(imageUrl, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("image_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [imageUrl].
                         *
                         * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun _imageUrl(): JsonField<InnerImageUrl> = imageUrl

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
                             * Returns a mutable builder for constructing an instance of [ImageUrl].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ImageUrl]. */
                        class Builder internal constructor() {

                            private var imageUrl: JsonField<InnerImageUrl>? = null
                            private var type: JsonValue = JsonValue.from("image_url")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(imageUrl: ImageUrl) = apply {
                                this.imageUrl = imageUrl.imageUrl
                                type = imageUrl.type
                                additionalProperties = imageUrl.additionalProperties.toMutableMap()
                            }

                            fun imageUrl(imageUrl: InnerImageUrl) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed
                             * [InnerImageUrl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<InnerImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
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
                             * Returns an immutable instance of [ImageUrl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ImageUrl =
                                ImageUrl(
                                    checkRequired("imageUrl", imageUrl),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ImageUrl = apply {
                            if (validated) {
                                return@apply
                            }

                            imageUrl().validate()
                            _type().let {
                                if (it != JsonValue.from("image_url")) {
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
                            (imageUrl.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                        class InnerImageUrl
                        private constructor(
                            private val url: JsonField<String>,
                            private val detail: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("url")
                                @ExcludeMissing
                                url: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<String> = JsonMissing.of(),
                            ) : this(url, detail, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun url(): String = url.getRequired("url")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun detail(): String? = detail.getNullable("detail")

                            /**
                             * Returns the raw JSON value of [url].
                             *
                             * Unlike [url], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<String> = detail

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
                                 * [InnerImageUrl].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InnerImageUrl]. */
                            class Builder internal constructor() {

                                private var url: JsonField<String>? = null
                                private var detail: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(innerImageUrl: InnerImageUrl) = apply {
                                    url = innerImageUrl.url
                                    detail = innerImageUrl.detail
                                    additionalProperties =
                                        innerImageUrl.additionalProperties.toMutableMap()
                                }

                                fun url(url: String) = url(JsonField.of(url))

                                /**
                                 * Sets [Builder.url] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.url] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun url(url: JsonField<String>) = apply { this.url = url }

                                fun detail(detail: String) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<String>) = apply {
                                    this.detail = detail
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
                                 * Returns an immutable instance of [InnerImageUrl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InnerImageUrl =
                                    InnerImageUrl(
                                        checkRequired("url", url),
                                        detail,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InnerImageUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                url()
                                detail()
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
                                (if (url.asKnown() == null) 0 else 1) +
                                    (if (detail.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InnerImageUrl && url == other.url && detail == other.detail && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(url, detail, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InnerImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ImageUrl && imageUrl == other.imageUrl && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(imageUrl, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tool && content == other.content && role == other.role && toolCallId == other.toolCallId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, role, toolCallId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tool{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
        }

        /** A message from the developer in an OpenAI-compatible chat completion request. */
        class Developer
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, name, mutableMapOf())

            /**
             * The content of the developer message
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Must be "developer" to identify this as a developer message
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("developer")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * (Optional) The name of the developer message participant.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [Developer].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Developer]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("developer")
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(developer: Developer) = apply {
                    content = developer.content
                    role = developer.role
                    name = developer.name
                    additionalProperties = developer.additionalProperties.toMutableMap()
                }

                /** The content of the developer message */
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
                 * `Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
                 */
                fun contentOfOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams:
                        List<Content.OpenAIChatCompletionContentPartParam>
                ) =
                    content(
                        Content.ofOpenAIChatCompletionContentPartParams(
                            openaiChatCompletionContentPartParams
                        )
                    )

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("developer")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** (Optional) The name of the developer message participant. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Developer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Developer =
                    Developer(
                        checkRequired("content", content),
                        role,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Developer = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("developer")) {
                        throw LlamaStackClientInvalidDataException(
                            "'role' is invalid, received $it"
                        )
                    }
                }
                name()
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
                    role.let { if (it == JsonValue.from("developer")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1)

            /** The content of the developer message */
            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val openaiChatCompletionContentPartParams:
                    List<OpenAIChatCompletionContentPartParam>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun openaiChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam>? =
                    openaiChatCompletionContentPartParams

                fun isString(): Boolean = string != null

                fun isOpenAIChatCompletionContentPartParams(): Boolean =
                    openaiChatCompletionContentPartParams != null

                fun asString(): String = string.getOrThrow("string")

                fun asOpenAIChatCompletionContentPartParams():
                    List<OpenAIChatCompletionContentPartParam> =
                    openaiChatCompletionContentPartParams.getOrThrow(
                        "openaiChatCompletionContentPartParams"
                    )

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        openaiChatCompletionContentPartParams != null ->
                            visitor.visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) {
                                openaiChatCompletionContentPartParams.forEach { it.validate() }
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

                            override fun visitOpenAIChatCompletionContentPartParams(
                                openaiChatCompletionContentPartParams:
                                    List<OpenAIChatCompletionContentPartParam>
                            ) =
                                openaiChatCompletionContentPartParams.sumOf {
                                    it.validity().toInt()
                                }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && string == other.string && openaiChatCompletionContentPartParams == other.openaiChatCompletionContentPartParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiChatCompletionContentPartParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        openaiChatCompletionContentPartParams != null ->
                            "Content{openaiChatCompletionContentPartParams=$openaiChatCompletionContentPartParams}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
                    ) =
                        Content(
                            openaiChatCompletionContentPartParams =
                                openaiChatCompletionContentPartParams
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams:
                            List<OpenAIChatCompletionContentPartParam>
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
                                                List<OpenAIChatCompletionContentPartParam>
                                            >(),
                                        )
                                        ?.let {
                                            Content(
                                                openaiChatCompletionContentPartParams = it,
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
                            value.openaiChatCompletionContentPartParams != null ->
                                generator.writeObject(value.openaiChatCompletionContentPartParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = OpenAIChatCompletionContentPartParam.Deserializer::class)
                @JsonSerialize(using = OpenAIChatCompletionContentPartParam.Serializer::class)
                class OpenAIChatCompletionContentPartParam
                private constructor(
                    private val text: Text? = null,
                    private val imageUrl: ImageUrl? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun text(): Text? = text

                    fun imageUrl(): ImageUrl? = imageUrl

                    fun isText(): Boolean = text != null

                    fun isImageUrl(): Boolean = imageUrl != null

                    fun asText(): Text = text.getOrThrow("text")

                    fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            text != null -> visitor.visitText(text)
                            imageUrl != null -> visitor.visitImageUrl(imageUrl)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): OpenAIChatCompletionContentPartParam = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: Text) {
                                    text.validate()
                                }

                                override fun visitImageUrl(imageUrl: ImageUrl) {
                                    imageUrl.validate()
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
                                override fun visitText(text: Text) = text.validity()

                                override fun visitImageUrl(imageUrl: ImageUrl) = imageUrl.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is OpenAIChatCompletionContentPartParam && text == other.text && imageUrl == other.imageUrl /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, imageUrl) /* spotless:on */

                    override fun toString(): String =
                        when {
                            text != null -> "OpenAIChatCompletionContentPartParam{text=$text}"
                            imageUrl != null ->
                                "OpenAIChatCompletionContentPartParam{imageUrl=$imageUrl}"
                            _json != null -> "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid OpenAIChatCompletionContentPartParam"
                                )
                        }

                    companion object {

                        fun ofText(text: Text) = OpenAIChatCompletionContentPartParam(text = text)

                        fun ofImageUrl(imageUrl: ImageUrl) =
                            OpenAIChatCompletionContentPartParam(imageUrl = imageUrl)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [OpenAIChatCompletionContentPartParam] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitText(text: Text): T

                        fun visitImageUrl(imageUrl: ImageUrl): T

                        /**
                         * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to a
                         * value of type [T].
                         *
                         * An instance of [OpenAIChatCompletionContentPartParam] can contain an
                         * unknown variant if it was deserialized from data that doesn't match any
                         * known variant. For example, if the SDK is on an older version than the
                         * API, then the API may respond with new variants that the SDK is unaware
                         * of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OpenAIChatCompletionContentPartParam: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): OpenAIChatCompletionContentPartParam {
                            val json = JsonValue.fromJsonNode(node)
                            val type = json.asObject()?.get("type")?.asString()

                            when (type) {
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            text = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                                "image_url" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ImageUrl>())?.let {
                                        OpenAIChatCompletionContentPartParam(
                                            imageUrl = it,
                                            _json = json,
                                        )
                                    } ?: OpenAIChatCompletionContentPartParam(_json = json)
                                }
                            }

                            return OpenAIChatCompletionContentPartParam(_json = json)
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<OpenAIChatCompletionContentPartParam>(
                            OpenAIChatCompletionContentPartParam::class
                        ) {

                        override fun serialize(
                            value: OpenAIChatCompletionContentPartParam,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.imageUrl != null -> generator.writeObject(value.imageUrl)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }
                        }
                    }

                    class Text
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
                         * JsonValue.from("text")
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
                             * Returns a mutable builder for constructing an instance of [Text].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Text]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(text: Text) = apply {
                                this.text = text.text
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
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
                             * JsonValue.from("text")
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
                             * Returns an immutable instance of [Text].
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
                            fun build(): Text =
                                Text(
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Text = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
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
                                type.let { if (it == JsonValue.from("text")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Text && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ImageUrl
                    private constructor(
                        private val imageUrl: JsonField<InnerImageUrl>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            imageUrl: JsonField<InnerImageUrl> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(imageUrl, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("image_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [imageUrl].
                         *
                         * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun _imageUrl(): JsonField<InnerImageUrl> = imageUrl

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
                             * Returns a mutable builder for constructing an instance of [ImageUrl].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ImageUrl]. */
                        class Builder internal constructor() {

                            private var imageUrl: JsonField<InnerImageUrl>? = null
                            private var type: JsonValue = JsonValue.from("image_url")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(imageUrl: ImageUrl) = apply {
                                this.imageUrl = imageUrl.imageUrl
                                type = imageUrl.type
                                additionalProperties = imageUrl.additionalProperties.toMutableMap()
                            }

                            fun imageUrl(imageUrl: InnerImageUrl) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed
                             * [InnerImageUrl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<InnerImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
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
                             * Returns an immutable instance of [ImageUrl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ImageUrl =
                                ImageUrl(
                                    checkRequired("imageUrl", imageUrl),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ImageUrl = apply {
                            if (validated) {
                                return@apply
                            }

                            imageUrl().validate()
                            _type().let {
                                if (it != JsonValue.from("image_url")) {
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
                            (imageUrl.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                        class InnerImageUrl
                        private constructor(
                            private val url: JsonField<String>,
                            private val detail: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("url")
                                @ExcludeMissing
                                url: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<String> = JsonMissing.of(),
                            ) : this(url, detail, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun url(): String = url.getRequired("url")

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun detail(): String? = detail.getNullable("detail")

                            /**
                             * Returns the raw JSON value of [url].
                             *
                             * Unlike [url], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<String> = detail

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
                                 * [InnerImageUrl].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InnerImageUrl]. */
                            class Builder internal constructor() {

                                private var url: JsonField<String>? = null
                                private var detail: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(innerImageUrl: InnerImageUrl) = apply {
                                    url = innerImageUrl.url
                                    detail = innerImageUrl.detail
                                    additionalProperties =
                                        innerImageUrl.additionalProperties.toMutableMap()
                                }

                                fun url(url: String) = url(JsonField.of(url))

                                /**
                                 * Sets [Builder.url] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.url] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun url(url: JsonField<String>) = apply { this.url = url }

                                fun detail(detail: String) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<String>) = apply {
                                    this.detail = detail
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
                                 * Returns an immutable instance of [InnerImageUrl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .url()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InnerImageUrl =
                                    InnerImageUrl(
                                        checkRequired("url", url),
                                        detail,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InnerImageUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                url()
                                detail()
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
                                (if (url.asKnown() == null) 0 else 1) +
                                    (if (detail.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InnerImageUrl && url == other.url && detail == other.detail && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(url, detail, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InnerImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ImageUrl && imageUrl == other.imageUrl && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(imageUrl, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Developer && content == other.content && role == other.role && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, role, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Developer{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    /** (Optional) The function call to use. */
    @JsonDeserialize(using = FunctionCall.Deserializer::class)
    @JsonSerialize(using = FunctionCall.Serializer::class)
    class FunctionCall
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): FunctionCall = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
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

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionCall && string == other.string && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "FunctionCall{string=$string}"
                unionMember1 != null -> "FunctionCall{unionMember1=$unionMember1}"
                _json != null -> "FunctionCall{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionCall")
            }

        companion object {

            fun ofString(string: String) = FunctionCall(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) =
                FunctionCall(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [FunctionCall] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [FunctionCall] to a value of type [T].
             *
             * An instance of [FunctionCall] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown FunctionCall: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FunctionCall>(FunctionCall::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionCall {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                FunctionCall(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                FunctionCall(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> FunctionCall(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

            override fun serialize(
                value: FunctionCall,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FunctionCall")
                }
            }
        }

        class UnionMember1
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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    class Function
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

            /** Returns a mutable builder for constructing an instance of [Function]. */
            fun builder() = Builder()
        }

        /** A builder for [Function]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(function: Function) = apply {
                additionalProperties = function.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Function].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Function = Function(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Function = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Function && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Function{additionalProperties=$additionalProperties}"
    }

    /** (Optional) The logit bias to use. */
    class LogitBias
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

            /** Returns a mutable builder for constructing an instance of [LogitBias]. */
            fun builder() = Builder()
        }

        /** A builder for [LogitBias]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logitBias: LogitBias) = apply {
                additionalProperties = logitBias.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [LogitBias].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LogitBias = LogitBias(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): LogitBias = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LogitBias && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "LogitBias{additionalProperties=$additionalProperties}"
    }

    /** (Optional) The response format to use. */
    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val text: JsonValue? = null,
        private val jsonSchema: JsonSchema? = null,
        private val jsonObject: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun text(): JsonValue? = text

        fun jsonSchema(): JsonSchema? = jsonSchema

        fun jsonObject(): JsonValue? = jsonObject

        fun isText(): Boolean = text != null

        fun isJsonSchema(): Boolean = jsonSchema != null

        fun isJsonObject(): Boolean = jsonObject != null

        fun asText(): JsonValue = text.getOrThrow("text")

        fun asJsonSchema(): JsonSchema = jsonSchema.getOrThrow("jsonSchema")

        fun asJsonObject(): JsonValue = jsonObject.getOrThrow("jsonObject")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                text != null -> visitor.visitText(text)
                jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
                jsonObject != null -> visitor.visitJsonObject(jsonObject)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitText(text: JsonValue) {
                        text.let {
                            if (it != JsonValue.from(mapOf("type" to "text"))) {
                                throw LlamaStackClientInvalidDataException(
                                    "'text' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitJsonSchema(jsonSchema: JsonSchema) {
                        jsonSchema.validate()
                    }

                    override fun visitJsonObject(jsonObject: JsonValue) {
                        jsonObject.let {
                            if (it != JsonValue.from(mapOf("type" to "json_object"))) {
                                throw LlamaStackClientInvalidDataException(
                                    "'jsonObject' is invalid, received $it"
                                )
                            }
                        }
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
                    override fun visitText(text: JsonValue) =
                        text.let { if (it == JsonValue.from(mapOf("type" to "text"))) 1 else 0 }

                    override fun visitJsonSchema(jsonSchema: JsonSchema) = jsonSchema.validity()

                    override fun visitJsonObject(jsonObject: JsonValue) =
                        jsonObject.let {
                            if (it == JsonValue.from(mapOf("type" to "json_object"))) 1 else 0
                        }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFormat && text == other.text && jsonSchema == other.jsonSchema && jsonObject == other.jsonObject /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, jsonSchema, jsonObject) /* spotless:on */

        override fun toString(): String =
            when {
                text != null -> "ResponseFormat{text=$text}"
                jsonSchema != null -> "ResponseFormat{jsonSchema=$jsonSchema}"
                jsonObject != null -> "ResponseFormat{jsonObject=$jsonObject}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }

        companion object {

            fun ofText() = ResponseFormat(text = JsonValue.from(mapOf("type" to "text")))

            fun ofJsonSchema(jsonSchema: JsonSchema) = ResponseFormat(jsonSchema = jsonSchema)

            fun ofJsonObject() =
                ResponseFormat(jsonObject = JsonValue.from(mapOf("type" to "json_object")))
        }

        /**
         * An interface that defines how to map each variant of [ResponseFormat] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitText(text: JsonValue): T

            fun visitJsonSchema(jsonSchema: JsonSchema): T

            fun visitJsonObject(jsonObject: JsonValue): T

            /**
             * Maps an unknown variant of [ResponseFormat] to a value of type [T].
             *
             * An instance of [ResponseFormat] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "text" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { ResponseFormat(text = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: ResponseFormat(_json = json)
                    }
                    "json_schema" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonSchema>())?.let {
                            ResponseFormat(jsonSchema = it, _json = json)
                        } ?: ResponseFormat(_json = json)
                    }
                    "json_object" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { ResponseFormat(jsonObject = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: ResponseFormat(_json = json)
                    }
                }

                return ResponseFormat(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.text != null -> generator.writeObject(value.text)
                    value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                    value.jsonObject != null -> generator.writeObject(value.jsonObject)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }

        class JsonSchema
        private constructor(
            private val jsonSchema: JsonField<InnerJsonSchema>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("json_schema")
                @ExcludeMissing
                jsonSchema: JsonField<InnerJsonSchema> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(jsonSchema, type, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun jsonSchema(): InnerJsonSchema = jsonSchema.getRequired("json_schema")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("json_schema")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [jsonSchema].
             *
             * Unlike [jsonSchema], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("json_schema")
            @ExcludeMissing
            fun _jsonSchema(): JsonField<InnerJsonSchema> = jsonSchema

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
                 * Returns a mutable builder for constructing an instance of [JsonSchema].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .jsonSchema()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [JsonSchema]. */
            class Builder internal constructor() {

                private var jsonSchema: JsonField<InnerJsonSchema>? = null
                private var type: JsonValue = JsonValue.from("json_schema")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(jsonSchema: JsonSchema) = apply {
                    this.jsonSchema = jsonSchema.jsonSchema
                    type = jsonSchema.type
                    additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                }

                fun jsonSchema(jsonSchema: InnerJsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                /**
                 * Sets [Builder.jsonSchema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jsonSchema] with a well-typed [InnerJsonSchema]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun jsonSchema(jsonSchema: JsonField<InnerJsonSchema>) = apply {
                    this.jsonSchema = jsonSchema
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("json_schema")
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
                 * Returns an immutable instance of [JsonSchema].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .jsonSchema()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): JsonSchema =
                    JsonSchema(
                        checkRequired("jsonSchema", jsonSchema),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): JsonSchema = apply {
                if (validated) {
                    return@apply
                }

                jsonSchema().validate()
                _type().let {
                    if (it != JsonValue.from("json_schema")) {
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
                (jsonSchema.asKnown()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("json_schema")) 1 else 0 }

            class InnerJsonSchema
            private constructor(
                private val name: JsonField<String>,
                private val description: JsonField<String>,
                private val schema: JsonField<Schema>,
                private val strict: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("schema")
                    @ExcludeMissing
                    schema: JsonField<Schema> = JsonMissing.of(),
                    @JsonProperty("strict")
                    @ExcludeMissing
                    strict: JsonField<Boolean> = JsonMissing.of(),
                ) : this(name, description, schema, strict, mutableMapOf())

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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun schema(): Schema? = schema.getNullable("schema")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun strict(): Boolean? = strict.getNullable("strict")

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

                /**
                 * Returns the raw JSON value of [schema].
                 *
                 * Unlike [schema], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<Schema> = schema

                /**
                 * Returns the raw JSON value of [strict].
                 *
                 * Unlike [strict], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [InnerJsonSchema].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [InnerJsonSchema]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var schema: JsonField<Schema> = JsonMissing.of()
                    private var strict: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(innerJsonSchema: InnerJsonSchema) = apply {
                        name = innerJsonSchema.name
                        description = innerJsonSchema.description
                        schema = innerJsonSchema.schema
                        strict = innerJsonSchema.strict
                        additionalProperties = innerJsonSchema.additionalProperties.toMutableMap()
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

                    fun schema(schema: Schema) = schema(JsonField.of(schema))

                    /**
                     * Sets [Builder.schema] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.schema] with a well-typed [Schema] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                    fun strict(strict: Boolean) = strict(JsonField.of(strict))

                    /**
                     * Sets [Builder.strict] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strict] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [InnerJsonSchema].
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
                    fun build(): InnerJsonSchema =
                        InnerJsonSchema(
                            checkRequired("name", name),
                            description,
                            schema,
                            strict,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InnerJsonSchema = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    description()
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
                    (if (name.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (schema.asKnown()?.validity() ?: 0) +
                        (if (strict.asKnown() == null) 0 else 1)

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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(schema: Schema) = apply {
                            additionalProperties = schema.additionalProperties.toMutableMap()
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

                    return /* spotless:off */ other is InnerJsonSchema && name == other.name && description == other.description && schema == other.schema && strict == other.strict && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(name, description, schema, strict, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerJsonSchema{name=$name, description=$description, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is JsonSchema && jsonSchema == other.jsonSchema && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(jsonSchema, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JsonSchema{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /** (Optional) The stop tokens to use. */
    @JsonDeserialize(using = Stop.Deserializer::class)
    @JsonSerialize(using = Stop.Serializer::class)
    class Stop
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Stop = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
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

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Stop && string == other.string && strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, strings) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Stop{string=$string}"
                strings != null -> "Stop{strings=$strings}"
                _json != null -> "Stop{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stop")
            }

        companion object {

            fun ofString(string: String) = Stop(string = string)

            fun ofStrings(strings: List<String>) = Stop(strings = strings)
        }

        /** An interface that defines how to map each variant of [Stop] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Stop] to a value of type [T].
             *
             * An instance of [Stop] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Stop: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Stop>(Stop::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Stop {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Stop(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Stop(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Stop(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Stop>(Stop::class) {

            override fun serialize(
                value: Stop,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stop")
                }
            }
        }
    }

    /** (Optional) The stream options to use. */
    class StreamOptions
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

            /** Returns a mutable builder for constructing an instance of [StreamOptions]. */
            fun builder() = Builder()
        }

        /** A builder for [StreamOptions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(streamOptions: StreamOptions) = apply {
                additionalProperties = streamOptions.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [StreamOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StreamOptions = StreamOptions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): StreamOptions = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StreamOptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "StreamOptions{additionalProperties=$additionalProperties}"
    }

    /** (Optional) The tool choice to use. */
    @JsonDeserialize(using = ToolChoice.Deserializer::class)
    @JsonSerialize(using = ToolChoice.Serializer::class)
    class ToolChoice
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ToolChoice = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
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

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolChoice && string == other.string && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "ToolChoice{string=$string}"
                unionMember1 != null -> "ToolChoice{unionMember1=$unionMember1}"
                _json != null -> "ToolChoice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolChoice")
            }

        companion object {

            fun ofString(string: String) = ToolChoice(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = ToolChoice(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [ToolChoice] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [ToolChoice] to a value of type [T].
             *
             * An instance of [ToolChoice] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ToolChoice: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                ToolChoice(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ToolChoice(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> ToolChoice(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

            override fun serialize(
                value: ToolChoice,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolChoice")
                }
            }
        }

        class UnionMember1
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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    class Tool
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

            /** Returns a mutable builder for constructing an instance of [Tool]. */
            fun builder() = Builder()
        }

        /** A builder for [Tool]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tool: Tool) = apply {
                additionalProperties = tool.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Tool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tool = Tool(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Tool = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tool && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Tool{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ChatCompletionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
