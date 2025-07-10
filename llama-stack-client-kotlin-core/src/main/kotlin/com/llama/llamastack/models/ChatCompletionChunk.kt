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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Chunk from a streaming response to an OpenAI-compatible chat completion request. */
class ChatCompletionChunk
private constructor(
    private val id: JsonField<String>,
    private val choices: JsonField<List<Choice>>,
    private val created: JsonField<Long>,
    private val model: JsonField<String>,
    private val object_: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("choices")
        @ExcludeMissing
        choices: JsonField<List<Choice>> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonValue = JsonMissing.of(),
    ) : this(id, choices, created, model, object_, mutableMapOf())

    /**
     * The ID of the chat completion
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * List of choices
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun choices(): List<Choice> = choices.getRequired("choices")

    /**
     * The Unix timestamp in seconds when the chat completion was created
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): Long = created.getRequired("created")

    /**
     * The model that was used to generate the chat completion
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * The object type, which will be "chat.completion.chunk"
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("chat.completion.chunk")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [choices].
     *
     * Unlike [choices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("choices") @ExcludeMissing fun _choices(): JsonField<List<Choice>> = choices

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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
         * Returns a mutable builder for constructing an instance of [ChatCompletionChunk].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .choices()
         * .created()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionChunk]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var choices: JsonField<MutableList<Choice>>? = null
        private var created: JsonField<Long>? = null
        private var model: JsonField<String>? = null
        private var object_: JsonValue = JsonValue.from("chat.completion.chunk")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionChunk: ChatCompletionChunk) = apply {
            id = chatCompletionChunk.id
            choices = chatCompletionChunk.choices.map { it.toMutableList() }
            created = chatCompletionChunk.created
            model = chatCompletionChunk.model
            object_ = chatCompletionChunk.object_
            additionalProperties = chatCompletionChunk.additionalProperties.toMutableMap()
        }

        /** The ID of the chat completion */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** List of choices */
        fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

        /**
         * Sets [Builder.choices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.choices] with a well-typed `List<Choice>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun choices(choices: JsonField<List<Choice>>) = apply {
            this.choices = choices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Choice] to [choices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChoice(choice: Choice) = apply {
            choices =
                (choices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("choices", it).add(choice)
                }
        }

        /** The Unix timestamp in seconds when the chat completion was created */
        fun created(created: Long) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** The model that was used to generate the chat completion */
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
         * JsonValue.from("chat.completion.chunk")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun object_(object_: JsonValue) = apply { this.object_ = object_ }

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
         * Returns an immutable instance of [ChatCompletionChunk].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .choices()
         * .created()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionChunk =
            ChatCompletionChunk(
                checkRequired("id", id),
                checkRequired("choices", choices).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("model", model),
                object_,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatCompletionChunk = apply {
        if (validated) {
            return@apply
        }

        id()
        choices().forEach { it.validate() }
        created()
        model()
        _object_().let {
            if (it != JsonValue.from("chat.completion.chunk")) {
                throw LlamaStackClientInvalidDataException("'object_' is invalid, received $it")
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (choices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (created.asKnown() == null) 0 else 1) +
            (if (model.asKnown() == null) 0 else 1) +
            object_.let { if (it == JsonValue.from("chat.completion.chunk")) 1 else 0 }

    /** A chunk choice from an OpenAI-compatible chat completion streaming response. */
    class Choice
    private constructor(
        private val delta: JsonField<Delta>,
        private val finishReason: JsonField<String>,
        private val index: JsonField<Long>,
        private val logprobs: JsonField<Logprobs>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delta") @ExcludeMissing delta: JsonField<Delta> = JsonMissing.of(),
            @JsonProperty("finish_reason")
            @ExcludeMissing
            finishReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<Logprobs> = JsonMissing.of(),
        ) : this(delta, finishReason, index, logprobs, mutableMapOf())

        /**
         * The delta from the chunk
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun delta(): Delta = delta.getRequired("delta")

        /**
         * The reason the model stopped generating
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun finishReason(): String = finishReason.getRequired("finish_reason")

        /**
         * The index of the choice
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * (Optional) The log probabilities for the tokens in the message
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        /**
         * Returns the raw JSON value of [delta].
         *
         * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<Delta> = delta

        /**
         * Returns the raw JSON value of [finishReason].
         *
         * Unlike [finishReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("finish_reason")
        @ExcludeMissing
        fun _finishReason(): JsonField<String> = finishReason

        /**
         * Returns the raw JSON value of [index].
         *
         * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

        /**
         * Returns the raw JSON value of [logprobs].
         *
         * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

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
             * Returns a mutable builder for constructing an instance of [Choice].
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .finishReason()
             * .index()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Choice]. */
        class Builder internal constructor() {

            private var delta: JsonField<Delta>? = null
            private var finishReason: JsonField<String>? = null
            private var index: JsonField<Long>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(choice: Choice) = apply {
                delta = choice.delta
                finishReason = choice.finishReason
                index = choice.index
                logprobs = choice.logprobs
                additionalProperties = choice.additionalProperties.toMutableMap()
            }

            /** The delta from the chunk */
            fun delta(delta: Delta) = delta(JsonField.of(delta))

            /**
             * Sets [Builder.delta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delta] with a well-typed [Delta] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun delta(delta: JsonField<Delta>) = apply { this.delta = delta }

            /** The reason the model stopped generating */
            fun finishReason(finishReason: String) = finishReason(JsonField.of(finishReason))

            /**
             * Sets [Builder.finishReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finishReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finishReason(finishReason: JsonField<String>) = apply {
                this.finishReason = finishReason
            }

            /** The index of the choice */
            fun index(index: Long) = index(JsonField.of(index))

            /**
             * Sets [Builder.index] to an arbitrary JSON value.
             *
             * You should usually call [Builder.index] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            /** (Optional) The log probabilities for the tokens in the message */
            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed [Logprobs] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

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
             * Returns an immutable instance of [Choice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .finishReason()
             * .index()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Choice =
                Choice(
                    checkRequired("delta", delta),
                    checkRequired("finishReason", finishReason),
                    checkRequired("index", index),
                    logprobs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Choice = apply {
            if (validated) {
                return@apply
            }

            delta().validate()
            finishReason()
            index()
            logprobs()?.validate()
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
            (delta.asKnown()?.validity() ?: 0) +
                (if (finishReason.asKnown() == null) 0 else 1) +
                (if (index.asKnown() == null) 0 else 1) +
                (logprobs.asKnown()?.validity() ?: 0)

        /** The delta from the chunk */
        class Delta
        private constructor(
            private val content: JsonField<String>,
            private val refusal: JsonField<String>,
            private val role: JsonField<String>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("refusal")
                @ExcludeMissing
                refusal: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            ) : this(content, refusal, role, toolCalls, mutableMapOf())

            /**
             * (Optional) The content of the delta
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun content(): String? = content.getNullable("content")

            /**
             * (Optional) The refusal of the delta
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun refusal(): String? = refusal.getNullable("refusal")

            /**
             * (Optional) The role of the delta
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun role(): String? = role.getNullable("role")

            /**
             * (Optional) The tool calls of the delta
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
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [refusal].
             *
             * Unlike [refusal], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("refusal") @ExcludeMissing fun _refusal(): JsonField<String> = refusal

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

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

                /** Returns a mutable builder for constructing an instance of [Delta]. */
                fun builder() = Builder()
            }

            /** A builder for [Delta]. */
            class Builder internal constructor() {

                private var content: JsonField<String> = JsonMissing.of()
                private var refusal: JsonField<String> = JsonMissing.of()
                private var role: JsonField<String> = JsonMissing.of()
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(delta: Delta) = apply {
                    content = delta.content
                    refusal = delta.refusal
                    role = delta.role
                    toolCalls = delta.toolCalls.map { it.toMutableList() }
                    additionalProperties = delta.additionalProperties.toMutableMap()
                }

                /** (Optional) The content of the delta */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /** (Optional) The refusal of the delta */
                fun refusal(refusal: String) = refusal(JsonField.of(refusal))

                /**
                 * Sets [Builder.refusal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refusal] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refusal(refusal: JsonField<String>) = apply { this.refusal = refusal }

                /** (Optional) The role of the delta */
                fun role(role: String) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<String>) = apply { this.role = role }

                /** (Optional) The tool calls of the delta */
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
                 * Returns an immutable instance of [Delta].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Delta =
                    Delta(
                        content,
                        refusal,
                        role,
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Delta = apply {
                if (validated) {
                    return@apply
                }

                content()
                refusal()
                role()
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
                (if (content.asKnown() == null) 0 else 1) +
                    (if (refusal.asKnown() == null) 0 else 1) +
                    (if (role.asKnown() == null) 0 else 1) +
                    (toolCalls.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

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

                return /* spotless:off */ other is Delta && content == other.content && refusal == other.refusal && role == other.role && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, refusal, role, toolCalls, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Delta{content=$content, refusal=$refusal, role=$role, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        /** (Optional) The log probabilities for the tokens in the message */
        class Logprobs
        private constructor(
            private val content: JsonField<List<Content>>,
            private val refusal: JsonField<List<Refusal>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<List<Content>> = JsonMissing.of(),
                @JsonProperty("refusal")
                @ExcludeMissing
                refusal: JsonField<List<Refusal>> = JsonMissing.of(),
            ) : this(content, refusal, mutableMapOf())

            /**
             * (Optional) The log probabilities for the tokens in the message
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun content(): List<Content>? = content.getNullable("content")

            /**
             * (Optional) The log probabilities for the tokens in the message
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun refusal(): List<Refusal>? = refusal.getNullable("refusal")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content")
            @ExcludeMissing
            fun _content(): JsonField<List<Content>> = content

            /**
             * Returns the raw JSON value of [refusal].
             *
             * Unlike [refusal], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("refusal")
            @ExcludeMissing
            fun _refusal(): JsonField<List<Refusal>> = refusal

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

                /** Returns a mutable builder for constructing an instance of [Logprobs]. */
                fun builder() = Builder()
            }

            /** A builder for [Logprobs]. */
            class Builder internal constructor() {

                private var content: JsonField<MutableList<Content>>? = null
                private var refusal: JsonField<MutableList<Refusal>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(logprobs: Logprobs) = apply {
                    content = logprobs.content.map { it.toMutableList() }
                    refusal = logprobs.refusal.map { it.toMutableList() }
                    additionalProperties = logprobs.additionalProperties.toMutableMap()
                }

                /** (Optional) The log probabilities for the tokens in the message */
                fun content(content: List<Content>) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed `List<Content>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<List<Content>>) = apply {
                    this.content = content.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Content] to [Builder.content].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addContent(content: Content) = apply {
                    this.content =
                        (this.content ?: JsonField.of(mutableListOf())).also {
                            checkKnown("content", it).add(content)
                        }
                }

                /** (Optional) The log probabilities for the tokens in the message */
                fun refusal(refusal: List<Refusal>) = refusal(JsonField.of(refusal))

                /**
                 * Sets [Builder.refusal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refusal] with a well-typed `List<Refusal>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refusal(refusal: JsonField<List<Refusal>>) = apply {
                    this.refusal = refusal.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Refusal] to [Builder.refusal].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRefusal(refusal: Refusal) = apply {
                    this.refusal =
                        (this.refusal ?: JsonField.of(mutableListOf())).also {
                            checkKnown("refusal", it).add(refusal)
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
                 * Returns an immutable instance of [Logprobs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Logprobs =
                    Logprobs(
                        (content ?: JsonMissing.of()).map { it.toImmutable() },
                        (refusal ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Logprobs = apply {
                if (validated) {
                    return@apply
                }

                content()?.forEach { it.validate() }
                refusal()?.forEach { it.validate() }
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
                (content.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (refusal.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * The log probability for a token from an OpenAI-compatible chat completion response.
             */
            class Content
            private constructor(
                private val token: JsonField<String>,
                private val logprob: JsonField<Double>,
                private val topLogprobs: JsonField<List<TopLogprob>>,
                private val bytes: JsonField<List<Long>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("token")
                    @ExcludeMissing
                    token: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("logprob")
                    @ExcludeMissing
                    logprob: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("top_logprobs")
                    @ExcludeMissing
                    topLogprobs: JsonField<List<TopLogprob>> = JsonMissing.of(),
                    @JsonProperty("bytes")
                    @ExcludeMissing
                    bytes: JsonField<List<Long>> = JsonMissing.of(),
                ) : this(token, logprob, topLogprobs, bytes, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun token(): String = token.getRequired("token")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun logprob(): Double = logprob.getRequired("logprob")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun topLogprobs(): List<TopLogprob> = topLogprobs.getRequired("top_logprobs")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun bytes(): List<Long>? = bytes.getNullable("bytes")

                /**
                 * Returns the raw JSON value of [token].
                 *
                 * Unlike [token], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

                /**
                 * Returns the raw JSON value of [logprob].
                 *
                 * Unlike [logprob], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("logprob") @ExcludeMissing fun _logprob(): JsonField<Double> = logprob

                /**
                 * Returns the raw JSON value of [topLogprobs].
                 *
                 * Unlike [topLogprobs], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("top_logprobs")
                @ExcludeMissing
                fun _topLogprobs(): JsonField<List<TopLogprob>> = topLogprobs

                /**
                 * Returns the raw JSON value of [bytes].
                 *
                 * Unlike [bytes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bytes") @ExcludeMissing fun _bytes(): JsonField<List<Long>> = bytes

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
                     * Returns a mutable builder for constructing an instance of [Content].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .token()
                     * .logprob()
                     * .topLogprobs()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Content]. */
                class Builder internal constructor() {

                    private var token: JsonField<String>? = null
                    private var logprob: JsonField<Double>? = null
                    private var topLogprobs: JsonField<MutableList<TopLogprob>>? = null
                    private var bytes: JsonField<MutableList<Long>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(content: Content) = apply {
                        token = content.token
                        logprob = content.logprob
                        topLogprobs = content.topLogprobs.map { it.toMutableList() }
                        bytes = content.bytes.map { it.toMutableList() }
                        additionalProperties = content.additionalProperties.toMutableMap()
                    }

                    fun token(token: String) = token(JsonField.of(token))

                    /**
                     * Sets [Builder.token] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.token] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun token(token: JsonField<String>) = apply { this.token = token }

                    fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                    /**
                     * Sets [Builder.logprob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.logprob] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                    fun topLogprobs(topLogprobs: List<TopLogprob>) =
                        topLogprobs(JsonField.of(topLogprobs))

                    /**
                     * Sets [Builder.topLogprobs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.topLogprobs] with a well-typed
                     * `List<TopLogprob>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun topLogprobs(topLogprobs: JsonField<List<TopLogprob>>) = apply {
                        this.topLogprobs = topLogprobs.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [TopLogprob] to [topLogprobs].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTopLogprob(topLogprob: TopLogprob) = apply {
                        topLogprobs =
                            (topLogprobs ?: JsonField.of(mutableListOf())).also {
                                checkKnown("topLogprobs", it).add(topLogprob)
                            }
                    }

                    fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                    /**
                     * Sets [Builder.bytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bytes] with a well-typed `List<Long>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bytes(bytes: JsonField<List<Long>>) = apply {
                        this.bytes = bytes.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Long] to [bytes].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addByte(byte: Long) = apply {
                        bytes =
                            (bytes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("bytes", it).add(byte)
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
                     * Returns an immutable instance of [Content].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .token()
                     * .logprob()
                     * .topLogprobs()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Content =
                        Content(
                            checkRequired("token", token),
                            checkRequired("logprob", logprob),
                            checkRequired("topLogprobs", topLogprobs).map { it.toImmutable() },
                            (bytes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    token()
                    logprob()
                    topLogprobs().forEach { it.validate() }
                    bytes()
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
                    (if (token.asKnown() == null) 0 else 1) +
                        (if (logprob.asKnown() == null) 0 else 1) +
                        (topLogprobs.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (bytes.asKnown()?.size ?: 0)

                /**
                 * The top log probability for a token from an OpenAI-compatible chat completion
                 * response.
                 */
                class TopLogprob
                private constructor(
                    private val token: JsonField<String>,
                    private val logprob: JsonField<Double>,
                    private val bytes: JsonField<List<Long>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("token")
                        @ExcludeMissing
                        token: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("logprob")
                        @ExcludeMissing
                        logprob: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("bytes")
                        @ExcludeMissing
                        bytes: JsonField<List<Long>> = JsonMissing.of(),
                    ) : this(token, logprob, bytes, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun token(): String = token.getRequired("token")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun logprob(): Double = logprob.getRequired("logprob")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bytes(): List<Long>? = bytes.getNullable("bytes")

                    /**
                     * Returns the raw JSON value of [token].
                     *
                     * Unlike [token], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

                    /**
                     * Returns the raw JSON value of [logprob].
                     *
                     * Unlike [logprob], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("logprob")
                    @ExcludeMissing
                    fun _logprob(): JsonField<Double> = logprob

                    /**
                     * Returns the raw JSON value of [bytes].
                     *
                     * Unlike [bytes], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("bytes")
                    @ExcludeMissing
                    fun _bytes(): JsonField<List<Long>> = bytes

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
                         * Returns a mutable builder for constructing an instance of [TopLogprob].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .token()
                         * .logprob()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [TopLogprob]. */
                    class Builder internal constructor() {

                        private var token: JsonField<String>? = null
                        private var logprob: JsonField<Double>? = null
                        private var bytes: JsonField<MutableList<Long>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(topLogprob: TopLogprob) = apply {
                            token = topLogprob.token
                            logprob = topLogprob.logprob
                            bytes = topLogprob.bytes.map { it.toMutableList() }
                            additionalProperties = topLogprob.additionalProperties.toMutableMap()
                        }

                        fun token(token: String) = token(JsonField.of(token))

                        /**
                         * Sets [Builder.token] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.token] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun token(token: JsonField<String>) = apply { this.token = token }

                        fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                        /**
                         * Sets [Builder.logprob] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.logprob] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                        fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                        /**
                         * Sets [Builder.bytes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bytes] with a well-typed `List<Long>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bytes(bytes: JsonField<List<Long>>) = apply {
                            this.bytes = bytes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Long] to [bytes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addByte(byte: Long) = apply {
                            bytes =
                                (bytes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("bytes", it).add(byte)
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
                         * Returns an immutable instance of [TopLogprob].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .token()
                         * .logprob()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TopLogprob =
                            TopLogprob(
                                checkRequired("token", token),
                                checkRequired("logprob", logprob),
                                (bytes ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TopLogprob = apply {
                        if (validated) {
                            return@apply
                        }

                        token()
                        logprob()
                        bytes()
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
                        (if (token.asKnown() == null) 0 else 1) +
                            (if (logprob.asKnown() == null) 0 else 1) +
                            (bytes.asKnown()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TopLogprob && token == other.token && logprob == other.logprob && bytes == other.bytes && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(token, logprob, bytes, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TopLogprob{token=$token, logprob=$logprob, bytes=$bytes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && token == other.token && logprob == other.logprob && topLogprobs == other.topLogprobs && bytes == other.bytes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(token, logprob, topLogprobs, bytes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Content{token=$token, logprob=$logprob, topLogprobs=$topLogprobs, bytes=$bytes, additionalProperties=$additionalProperties}"
            }

            /**
             * The log probability for a token from an OpenAI-compatible chat completion response.
             */
            class Refusal
            private constructor(
                private val token: JsonField<String>,
                private val logprob: JsonField<Double>,
                private val topLogprobs: JsonField<List<TopLogprob>>,
                private val bytes: JsonField<List<Long>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("token")
                    @ExcludeMissing
                    token: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("logprob")
                    @ExcludeMissing
                    logprob: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("top_logprobs")
                    @ExcludeMissing
                    topLogprobs: JsonField<List<TopLogprob>> = JsonMissing.of(),
                    @JsonProperty("bytes")
                    @ExcludeMissing
                    bytes: JsonField<List<Long>> = JsonMissing.of(),
                ) : this(token, logprob, topLogprobs, bytes, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun token(): String = token.getRequired("token")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun logprob(): Double = logprob.getRequired("logprob")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun topLogprobs(): List<TopLogprob> = topLogprobs.getRequired("top_logprobs")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun bytes(): List<Long>? = bytes.getNullable("bytes")

                /**
                 * Returns the raw JSON value of [token].
                 *
                 * Unlike [token], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

                /**
                 * Returns the raw JSON value of [logprob].
                 *
                 * Unlike [logprob], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("logprob") @ExcludeMissing fun _logprob(): JsonField<Double> = logprob

                /**
                 * Returns the raw JSON value of [topLogprobs].
                 *
                 * Unlike [topLogprobs], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("top_logprobs")
                @ExcludeMissing
                fun _topLogprobs(): JsonField<List<TopLogprob>> = topLogprobs

                /**
                 * Returns the raw JSON value of [bytes].
                 *
                 * Unlike [bytes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bytes") @ExcludeMissing fun _bytes(): JsonField<List<Long>> = bytes

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
                     * Returns a mutable builder for constructing an instance of [Refusal].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .token()
                     * .logprob()
                     * .topLogprobs()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Refusal]. */
                class Builder internal constructor() {

                    private var token: JsonField<String>? = null
                    private var logprob: JsonField<Double>? = null
                    private var topLogprobs: JsonField<MutableList<TopLogprob>>? = null
                    private var bytes: JsonField<MutableList<Long>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(refusal: Refusal) = apply {
                        token = refusal.token
                        logprob = refusal.logprob
                        topLogprobs = refusal.topLogprobs.map { it.toMutableList() }
                        bytes = refusal.bytes.map { it.toMutableList() }
                        additionalProperties = refusal.additionalProperties.toMutableMap()
                    }

                    fun token(token: String) = token(JsonField.of(token))

                    /**
                     * Sets [Builder.token] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.token] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun token(token: JsonField<String>) = apply { this.token = token }

                    fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                    /**
                     * Sets [Builder.logprob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.logprob] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                    fun topLogprobs(topLogprobs: List<TopLogprob>) =
                        topLogprobs(JsonField.of(topLogprobs))

                    /**
                     * Sets [Builder.topLogprobs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.topLogprobs] with a well-typed
                     * `List<TopLogprob>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun topLogprobs(topLogprobs: JsonField<List<TopLogprob>>) = apply {
                        this.topLogprobs = topLogprobs.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [TopLogprob] to [topLogprobs].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTopLogprob(topLogprob: TopLogprob) = apply {
                        topLogprobs =
                            (topLogprobs ?: JsonField.of(mutableListOf())).also {
                                checkKnown("topLogprobs", it).add(topLogprob)
                            }
                    }

                    fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                    /**
                     * Sets [Builder.bytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bytes] with a well-typed `List<Long>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bytes(bytes: JsonField<List<Long>>) = apply {
                        this.bytes = bytes.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Long] to [bytes].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addByte(byte: Long) = apply {
                        bytes =
                            (bytes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("bytes", it).add(byte)
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
                     * Returns an immutable instance of [Refusal].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .token()
                     * .logprob()
                     * .topLogprobs()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Refusal =
                        Refusal(
                            checkRequired("token", token),
                            checkRequired("logprob", logprob),
                            checkRequired("topLogprobs", topLogprobs).map { it.toImmutable() },
                            (bytes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Refusal = apply {
                    if (validated) {
                        return@apply
                    }

                    token()
                    logprob()
                    topLogprobs().forEach { it.validate() }
                    bytes()
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
                    (if (token.asKnown() == null) 0 else 1) +
                        (if (logprob.asKnown() == null) 0 else 1) +
                        (topLogprobs.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (bytes.asKnown()?.size ?: 0)

                /**
                 * The top log probability for a token from an OpenAI-compatible chat completion
                 * response.
                 */
                class TopLogprob
                private constructor(
                    private val token: JsonField<String>,
                    private val logprob: JsonField<Double>,
                    private val bytes: JsonField<List<Long>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("token")
                        @ExcludeMissing
                        token: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("logprob")
                        @ExcludeMissing
                        logprob: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("bytes")
                        @ExcludeMissing
                        bytes: JsonField<List<Long>> = JsonMissing.of(),
                    ) : this(token, logprob, bytes, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun token(): String = token.getRequired("token")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun logprob(): Double = logprob.getRequired("logprob")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bytes(): List<Long>? = bytes.getNullable("bytes")

                    /**
                     * Returns the raw JSON value of [token].
                     *
                     * Unlike [token], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

                    /**
                     * Returns the raw JSON value of [logprob].
                     *
                     * Unlike [logprob], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("logprob")
                    @ExcludeMissing
                    fun _logprob(): JsonField<Double> = logprob

                    /**
                     * Returns the raw JSON value of [bytes].
                     *
                     * Unlike [bytes], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("bytes")
                    @ExcludeMissing
                    fun _bytes(): JsonField<List<Long>> = bytes

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
                         * Returns a mutable builder for constructing an instance of [TopLogprob].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .token()
                         * .logprob()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [TopLogprob]. */
                    class Builder internal constructor() {

                        private var token: JsonField<String>? = null
                        private var logprob: JsonField<Double>? = null
                        private var bytes: JsonField<MutableList<Long>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(topLogprob: TopLogprob) = apply {
                            token = topLogprob.token
                            logprob = topLogprob.logprob
                            bytes = topLogprob.bytes.map { it.toMutableList() }
                            additionalProperties = topLogprob.additionalProperties.toMutableMap()
                        }

                        fun token(token: String) = token(JsonField.of(token))

                        /**
                         * Sets [Builder.token] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.token] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun token(token: JsonField<String>) = apply { this.token = token }

                        fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                        /**
                         * Sets [Builder.logprob] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.logprob] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                        fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                        /**
                         * Sets [Builder.bytes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bytes] with a well-typed `List<Long>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bytes(bytes: JsonField<List<Long>>) = apply {
                            this.bytes = bytes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Long] to [bytes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addByte(byte: Long) = apply {
                            bytes =
                                (bytes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("bytes", it).add(byte)
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
                         * Returns an immutable instance of [TopLogprob].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .token()
                         * .logprob()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TopLogprob =
                            TopLogprob(
                                checkRequired("token", token),
                                checkRequired("logprob", logprob),
                                (bytes ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TopLogprob = apply {
                        if (validated) {
                            return@apply
                        }

                        token()
                        logprob()
                        bytes()
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
                        (if (token.asKnown() == null) 0 else 1) +
                            (if (logprob.asKnown() == null) 0 else 1) +
                            (bytes.asKnown()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TopLogprob && token == other.token && logprob == other.logprob && bytes == other.bytes && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(token, logprob, bytes, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TopLogprob{token=$token, logprob=$logprob, bytes=$bytes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Refusal && token == other.token && logprob == other.logprob && topLogprobs == other.topLogprobs && bytes == other.bytes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(token, logprob, topLogprobs, bytes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Refusal{token=$token, logprob=$logprob, topLogprobs=$topLogprobs, bytes=$bytes, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Logprobs && content == other.content && refusal == other.refusal && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, refusal, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Logprobs{content=$content, refusal=$refusal, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Choice && delta == other.delta && finishReason == other.finishReason && index == other.index && logprobs == other.logprobs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(delta, finishReason, index, logprobs, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Choice{delta=$delta, finishReason=$finishReason, index=$index, logprobs=$logprobs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionChunk && id == other.id && choices == other.choices && created == other.created && model == other.model && object_ == other.object_ && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, choices, created, model, object_, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionChunk{id=$id, choices=$choices, created=$created, model=$model, object_=$object_, additionalProperties=$additionalProperties}"
}
