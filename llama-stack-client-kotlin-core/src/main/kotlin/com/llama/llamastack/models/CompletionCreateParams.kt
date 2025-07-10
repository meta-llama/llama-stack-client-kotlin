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

/** Generate an OpenAI-compatible completion for the given prompt using the specified model. */
class CompletionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * The prompt to generate a completion for.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): Prompt = body.prompt()

    /**
     * (Optional) The number of completions to generate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bestOf(): Long? = body.bestOf()

    /**
     * (Optional) Whether to echo the prompt.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun echo(): Boolean? = body.echo()

    /**
     * (Optional) The penalty for repeated tokens.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = body.frequencyPenalty()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun guidedChoice(): List<String>? = body.guidedChoice()

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
    fun maxTokens(): Long? = body.maxTokens()

    /**
     * (Optional) The number of completions to generate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun n(): Long? = body.n()

    /**
     * (Optional) The penalty for repeated tokens.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun presencePenalty(): Double? = body.presencePenalty()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun promptLogprobs(): Long? = body.promptLogprobs()

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
     * (Optional) The suffix that should be appended to the completion.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun suffix(): String? = body.suffix()

    /**
     * (Optional) The temperature to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun temperature(): Double? = body.temperature()

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
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompt(): JsonField<Prompt> = body._prompt()

    /**
     * Returns the raw JSON value of [bestOf].
     *
     * Unlike [bestOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bestOf(): JsonField<Long> = body._bestOf()

    /**
     * Returns the raw JSON value of [echo].
     *
     * Unlike [echo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _echo(): JsonField<Boolean> = body._echo()

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frequencyPenalty(): JsonField<Double> = body._frequencyPenalty()

    /**
     * Returns the raw JSON value of [guidedChoice].
     *
     * Unlike [guidedChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guidedChoice(): JsonField<List<String>> = body._guidedChoice()

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
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _presencePenalty(): JsonField<Double> = body._presencePenalty()

    /**
     * Returns the raw JSON value of [promptLogprobs].
     *
     * Unlike [promptLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _promptLogprobs(): JsonField<Long> = body._promptLogprobs()

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
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _suffix(): JsonField<String> = body._suffix()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

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
         * Returns a mutable builder for constructing an instance of [CompletionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .model()
         * .prompt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompletionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(completionCreateParams: CompletionCreateParams) = apply {
            body = completionCreateParams.body.toBuilder()
            additionalHeaders = completionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = completionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [model]
         * - [prompt]
         * - [bestOf]
         * - [echo]
         * - [frequencyPenalty]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        /** The prompt to generate a completion for. */
        fun prompt(prompt: Prompt) = apply { body.prompt(prompt) }

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [Prompt] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<Prompt>) = apply { body.prompt(prompt) }

        /** Alias for calling [prompt] with `Prompt.ofString(string)`. */
        fun prompt(string: String) = apply { body.prompt(string) }

        /** Alias for calling [prompt] with `Prompt.ofStrings(strings)`. */
        fun promptOfStrings(strings: List<String>) = apply { body.promptOfStrings(strings) }

        /** Alias for calling [prompt] with `Prompt.ofLongs(longs)`. */
        fun promptOfLongs(longs: List<Long>) = apply { body.promptOfLongs(longs) }

        /** Alias for calling [prompt] with `Prompt.ofLists(lists)`. */
        fun promptOfLists(lists: List<List<Long>>) = apply { body.promptOfLists(lists) }

        /** (Optional) The number of completions to generate. */
        fun bestOf(bestOf: Long) = apply { body.bestOf(bestOf) }

        /**
         * Sets [Builder.bestOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bestOf] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bestOf(bestOf: JsonField<Long>) = apply { body.bestOf(bestOf) }

        /** (Optional) Whether to echo the prompt. */
        fun echo(echo: Boolean) = apply { body.echo(echo) }

        /**
         * Sets [Builder.echo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.echo] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun echo(echo: JsonField<Boolean>) = apply { body.echo(echo) }

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

        fun guidedChoice(guidedChoice: List<String>) = apply { body.guidedChoice(guidedChoice) }

        /**
         * Sets [Builder.guidedChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guidedChoice] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guidedChoice(guidedChoice: JsonField<List<String>>) = apply {
            body.guidedChoice(guidedChoice)
        }

        /**
         * Adds a single [String] to [Builder.guidedChoice].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuidedChoice(guidedChoice: String) = apply { body.addGuidedChoice(guidedChoice) }

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

        fun promptLogprobs(promptLogprobs: Long) = apply { body.promptLogprobs(promptLogprobs) }

        /**
         * Sets [Builder.promptLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptLogprobs(promptLogprobs: JsonField<Long>) = apply {
            body.promptLogprobs(promptLogprobs)
        }

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

        /** (Optional) The suffix that should be appended to the completion. */
        fun suffix(suffix: String) = apply { body.suffix(suffix) }

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { body.suffix(suffix) }

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
         * Returns an immutable instance of [CompletionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .model()
         * .prompt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletionCreateParams =
            CompletionCreateParams(
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
        private val model: JsonField<String>,
        private val prompt: JsonField<Prompt>,
        private val bestOf: JsonField<Long>,
        private val echo: JsonField<Boolean>,
        private val frequencyPenalty: JsonField<Double>,
        private val guidedChoice: JsonField<List<String>>,
        private val logitBias: JsonField<LogitBias>,
        private val logprobs: JsonField<Boolean>,
        private val maxTokens: JsonField<Long>,
        private val n: JsonField<Long>,
        private val presencePenalty: JsonField<Double>,
        private val promptLogprobs: JsonField<Long>,
        private val seed: JsonField<Long>,
        private val stop: JsonField<Stop>,
        private val streamOptions: JsonField<StreamOptions>,
        private val suffix: JsonField<String>,
        private val temperature: JsonField<Double>,
        private val topP: JsonField<Double>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<Prompt> = JsonMissing.of(),
            @JsonProperty("best_of") @ExcludeMissing bestOf: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("echo") @ExcludeMissing echo: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("guided_choice")
            @ExcludeMissing
            guidedChoice: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("logit_bias")
            @ExcludeMissing
            logitBias: JsonField<LogitBias> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_tokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("prompt_logprobs")
            @ExcludeMissing
            promptLogprobs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stop") @ExcludeMissing stop: JsonField<Stop> = JsonMissing.of(),
            @JsonProperty("stream_options")
            @ExcludeMissing
            streamOptions: JsonField<StreamOptions> = JsonMissing.of(),
            @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(
            model,
            prompt,
            bestOf,
            echo,
            frequencyPenalty,
            guidedChoice,
            logitBias,
            logprobs,
            maxTokens,
            n,
            presencePenalty,
            promptLogprobs,
            seed,
            stop,
            streamOptions,
            suffix,
            temperature,
            topP,
            user,
            mutableMapOf(),
        )

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
         * The prompt to generate a completion for.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun prompt(): Prompt = prompt.getRequired("prompt")

        /**
         * (Optional) The number of completions to generate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bestOf(): Long? = bestOf.getNullable("best_of")

        /**
         * (Optional) Whether to echo the prompt.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun echo(): Boolean? = echo.getNullable("echo")

        /**
         * (Optional) The penalty for repeated tokens.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun guidedChoice(): List<String>? = guidedChoice.getNullable("guided_choice")

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
        fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

        /**
         * (Optional) The number of completions to generate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun n(): Long? = n.getNullable("n")

        /**
         * (Optional) The penalty for repeated tokens.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun promptLogprobs(): Long? = promptLogprobs.getNullable("prompt_logprobs")

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
         * (Optional) The suffix that should be appended to the completion.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun suffix(): String? = suffix.getNullable("suffix")

        /**
         * (Optional) The temperature to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun temperature(): Double? = temperature.getNullable("temperature")

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
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<Prompt> = prompt

        /**
         * Returns the raw JSON value of [bestOf].
         *
         * Unlike [bestOf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("best_of") @ExcludeMissing fun _bestOf(): JsonField<Long> = bestOf

        /**
         * Returns the raw JSON value of [echo].
         *
         * Unlike [echo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("echo") @ExcludeMissing fun _echo(): JsonField<Boolean> = echo

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
         * Returns the raw JSON value of [guidedChoice].
         *
         * Unlike [guidedChoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guided_choice")
        @ExcludeMissing
        fun _guidedChoice(): JsonField<List<String>> = guidedChoice

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
         * Returns the raw JSON value of [presencePenalty].
         *
         * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        fun _presencePenalty(): JsonField<Double> = presencePenalty

        /**
         * Returns the raw JSON value of [promptLogprobs].
         *
         * Unlike [promptLogprobs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_logprobs")
        @ExcludeMissing
        fun _promptLogprobs(): JsonField<Long> = promptLogprobs

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
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

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
             * .model()
             * .prompt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var prompt: JsonField<Prompt>? = null
            private var bestOf: JsonField<Long> = JsonMissing.of()
            private var echo: JsonField<Boolean> = JsonMissing.of()
            private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
            private var guidedChoice: JsonField<MutableList<String>>? = null
            private var logitBias: JsonField<LogitBias> = JsonMissing.of()
            private var logprobs: JsonField<Boolean> = JsonMissing.of()
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var n: JsonField<Long> = JsonMissing.of()
            private var presencePenalty: JsonField<Double> = JsonMissing.of()
            private var promptLogprobs: JsonField<Long> = JsonMissing.of()
            private var seed: JsonField<Long> = JsonMissing.of()
            private var stop: JsonField<Stop> = JsonMissing.of()
            private var streamOptions: JsonField<StreamOptions> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var topP: JsonField<Double> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                model = body.model
                prompt = body.prompt
                bestOf = body.bestOf
                echo = body.echo
                frequencyPenalty = body.frequencyPenalty
                guidedChoice = body.guidedChoice.map { it.toMutableList() }
                logitBias = body.logitBias
                logprobs = body.logprobs
                maxTokens = body.maxTokens
                n = body.n
                presencePenalty = body.presencePenalty
                promptLogprobs = body.promptLogprobs
                seed = body.seed
                stop = body.stop
                streamOptions = body.streamOptions
                suffix = body.suffix
                temperature = body.temperature
                topP = body.topP
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** The prompt to generate a completion for. */
            fun prompt(prompt: Prompt) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [Prompt] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<Prompt>) = apply { this.prompt = prompt }

            /** Alias for calling [prompt] with `Prompt.ofString(string)`. */
            fun prompt(string: String) = prompt(Prompt.ofString(string))

            /** Alias for calling [prompt] with `Prompt.ofStrings(strings)`. */
            fun promptOfStrings(strings: List<String>) = prompt(Prompt.ofStrings(strings))

            /** Alias for calling [prompt] with `Prompt.ofLongs(longs)`. */
            fun promptOfLongs(longs: List<Long>) = prompt(Prompt.ofLongs(longs))

            /** Alias for calling [prompt] with `Prompt.ofLists(lists)`. */
            fun promptOfLists(lists: List<List<Long>>) = prompt(Prompt.ofLists(lists))

            /** (Optional) The number of completions to generate. */
            fun bestOf(bestOf: Long) = bestOf(JsonField.of(bestOf))

            /**
             * Sets [Builder.bestOf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bestOf] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bestOf(bestOf: JsonField<Long>) = apply { this.bestOf = bestOf }

            /** (Optional) Whether to echo the prompt. */
            fun echo(echo: Boolean) = echo(JsonField.of(echo))

            /**
             * Sets [Builder.echo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.echo] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun echo(echo: JsonField<Boolean>) = apply { this.echo = echo }

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

            fun guidedChoice(guidedChoice: List<String>) = guidedChoice(JsonField.of(guidedChoice))

            /**
             * Sets [Builder.guidedChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guidedChoice] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guidedChoice(guidedChoice: JsonField<List<String>>) = apply {
                this.guidedChoice = guidedChoice.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.guidedChoice].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGuidedChoice(guidedChoice: String) = apply {
                this.guidedChoice =
                    (this.guidedChoice ?: JsonField.of(mutableListOf())).also {
                        checkKnown("guidedChoice", it).add(guidedChoice)
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

            fun promptLogprobs(promptLogprobs: Long) = promptLogprobs(JsonField.of(promptLogprobs))

            /**
             * Sets [Builder.promptLogprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptLogprobs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptLogprobs(promptLogprobs: JsonField<Long>) = apply {
                this.promptLogprobs = promptLogprobs
            }

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

            /** (Optional) The suffix that should be appended to the completion. */
            fun suffix(suffix: String) = suffix(JsonField.of(suffix))

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

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
             * .model()
             * .prompt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("model", model),
                    checkRequired("prompt", prompt),
                    bestOf,
                    echo,
                    frequencyPenalty,
                    (guidedChoice ?: JsonMissing.of()).map { it.toImmutable() },
                    logitBias,
                    logprobs,
                    maxTokens,
                    n,
                    presencePenalty,
                    promptLogprobs,
                    seed,
                    stop,
                    streamOptions,
                    suffix,
                    temperature,
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

            model()
            prompt().validate()
            bestOf()
            echo()
            frequencyPenalty()
            guidedChoice()
            logitBias()?.validate()
            logprobs()
            maxTokens()
            n()
            presencePenalty()
            promptLogprobs()
            seed()
            stop()?.validate()
            streamOptions()?.validate()
            suffix()
            temperature()
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
            (if (model.asKnown() == null) 0 else 1) +
                (prompt.asKnown()?.validity() ?: 0) +
                (if (bestOf.asKnown() == null) 0 else 1) +
                (if (echo.asKnown() == null) 0 else 1) +
                (if (frequencyPenalty.asKnown() == null) 0 else 1) +
                (guidedChoice.asKnown()?.size ?: 0) +
                (logitBias.asKnown()?.validity() ?: 0) +
                (if (logprobs.asKnown() == null) 0 else 1) +
                (if (maxTokens.asKnown() == null) 0 else 1) +
                (if (n.asKnown() == null) 0 else 1) +
                (if (presencePenalty.asKnown() == null) 0 else 1) +
                (if (promptLogprobs.asKnown() == null) 0 else 1) +
                (if (seed.asKnown() == null) 0 else 1) +
                (stop.asKnown()?.validity() ?: 0) +
                (streamOptions.asKnown()?.validity() ?: 0) +
                (if (suffix.asKnown() == null) 0 else 1) +
                (if (temperature.asKnown() == null) 0 else 1) +
                (if (topP.asKnown() == null) 0 else 1) +
                (if (user.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && model == other.model && prompt == other.prompt && bestOf == other.bestOf && echo == other.echo && frequencyPenalty == other.frequencyPenalty && guidedChoice == other.guidedChoice && logitBias == other.logitBias && logprobs == other.logprobs && maxTokens == other.maxTokens && n == other.n && presencePenalty == other.presencePenalty && promptLogprobs == other.promptLogprobs && seed == other.seed && stop == other.stop && streamOptions == other.streamOptions && suffix == other.suffix && temperature == other.temperature && topP == other.topP && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(model, prompt, bestOf, echo, frequencyPenalty, guidedChoice, logitBias, logprobs, maxTokens, n, presencePenalty, promptLogprobs, seed, stop, streamOptions, suffix, temperature, topP, user, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{model=$model, prompt=$prompt, bestOf=$bestOf, echo=$echo, frequencyPenalty=$frequencyPenalty, guidedChoice=$guidedChoice, logitBias=$logitBias, logprobs=$logprobs, maxTokens=$maxTokens, n=$n, presencePenalty=$presencePenalty, promptLogprobs=$promptLogprobs, seed=$seed, stop=$stop, streamOptions=$streamOptions, suffix=$suffix, temperature=$temperature, topP=$topP, user=$user, additionalProperties=$additionalProperties}"
    }

    /** The prompt to generate a completion for. */
    @JsonDeserialize(using = Prompt.Deserializer::class)
    @JsonSerialize(using = Prompt.Serializer::class)
    class Prompt
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val longs: List<Long>? = null,
        private val lists: List<List<Long>>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun longs(): List<Long>? = longs

        fun lists(): List<List<Long>>? = lists

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun isLongs(): Boolean = longs != null

        fun isLists(): Boolean = lists != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asLongs(): List<Long> = longs.getOrThrow("longs")

        fun asLists(): List<List<Long>> = lists.getOrThrow("lists")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                longs != null -> visitor.visitLongs(longs)
                lists != null -> visitor.visitLists(lists)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Prompt = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}

                    override fun visitLongs(longs: List<Long>) {}

                    override fun visitLists(lists: List<List<Long>>) {}
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

                    override fun visitLongs(longs: List<Long>) = longs.size

                    override fun visitLists(lists: List<List<Long>>) =
                        lists.sumOf { it.size.toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Prompt && string == other.string && strings == other.strings && longs == other.longs && lists == other.lists /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, strings, longs, lists) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Prompt{string=$string}"
                strings != null -> "Prompt{strings=$strings}"
                longs != null -> "Prompt{longs=$longs}"
                lists != null -> "Prompt{lists=$lists}"
                _json != null -> "Prompt{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Prompt")
            }

        companion object {

            fun ofString(string: String) = Prompt(string = string)

            fun ofStrings(strings: List<String>) = Prompt(strings = strings)

            fun ofLongs(longs: List<Long>) = Prompt(longs = longs)

            fun ofLists(lists: List<List<Long>>) = Prompt(lists = lists)
        }

        /** An interface that defines how to map each variant of [Prompt] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun visitLongs(longs: List<Long>): T

            fun visitLists(lists: List<List<Long>>): T

            /**
             * Maps an unknown variant of [Prompt] to a value of type [T].
             *
             * An instance of [Prompt] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Prompt: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Prompt>(Prompt::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Prompt {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Prompt(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Prompt(strings = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<Long>>())?.let {
                                Prompt(longs = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<List<Long>>>())?.let {
                                Prompt(lists = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Prompt(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Prompt>(Prompt::class) {

            override fun serialize(
                value: Prompt,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value.longs != null -> generator.writeObject(value.longs)
                    value.lists != null -> generator.writeObject(value.lists)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Prompt")
                }
            }
        }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompletionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CompletionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
