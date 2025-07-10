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
import com.llama.llamastack.core.allMaxBy
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class ChatCompletionRetrieveResponse
private constructor(
    private val id: JsonField<String>,
    private val choices: JsonField<List<Choice>>,
    private val created: JsonField<Long>,
    private val inputMessages: JsonField<List<InputMessage>>,
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
        @JsonProperty("input_messages")
        @ExcludeMissing
        inputMessages: JsonField<List<InputMessage>> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonValue = JsonMissing.of(),
    ) : this(id, choices, created, inputMessages, model, object_, mutableMapOf())

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
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputMessages(): List<InputMessage> = inputMessages.getRequired("input_messages")

    /**
     * The model that was used to generate the chat completion
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * The object type, which will be "chat.completion"
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("chat.completion")
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
     * Returns the raw JSON value of [inputMessages].
     *
     * Unlike [inputMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input_messages")
    @ExcludeMissing
    fun _inputMessages(): JsonField<List<InputMessage>> = inputMessages

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
         * Returns a mutable builder for constructing an instance of
         * [ChatCompletionRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .choices()
         * .created()
         * .inputMessages()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var choices: JsonField<MutableList<Choice>>? = null
        private var created: JsonField<Long>? = null
        private var inputMessages: JsonField<MutableList<InputMessage>>? = null
        private var model: JsonField<String>? = null
        private var object_: JsonValue = JsonValue.from("chat.completion")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionRetrieveResponse: ChatCompletionRetrieveResponse) = apply {
            id = chatCompletionRetrieveResponse.id
            choices = chatCompletionRetrieveResponse.choices.map { it.toMutableList() }
            created = chatCompletionRetrieveResponse.created
            inputMessages = chatCompletionRetrieveResponse.inputMessages.map { it.toMutableList() }
            model = chatCompletionRetrieveResponse.model
            object_ = chatCompletionRetrieveResponse.object_
            additionalProperties =
                chatCompletionRetrieveResponse.additionalProperties.toMutableMap()
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

        fun inputMessages(inputMessages: List<InputMessage>) =
            inputMessages(JsonField.of(inputMessages))

        /**
         * Sets [Builder.inputMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputMessages] with a well-typed `List<InputMessage>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputMessages(inputMessages: JsonField<List<InputMessage>>) = apply {
            this.inputMessages = inputMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [InputMessage] to [inputMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputMessage(inputMessage: InputMessage) = apply {
            inputMessages =
                (inputMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputMessages", it).add(inputMessage)
                }
        }

        /** Alias for calling [addInputMessage] with `InputMessage.ofUser(user)`. */
        fun addInputMessage(user: InputMessage.User) = addInputMessage(InputMessage.ofUser(user))

        /**
         * Alias for calling [addInputMessage] with the following:
         * ```kotlin
         * InputMessage.User.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserInputMessage(content: InputMessage.User.Content) =
            addInputMessage(InputMessage.User.builder().content(content).build())

        /**
         * Alias for calling [addUserInputMessage] with
         * `InputMessage.User.Content.ofString(string)`.
         */
        fun addUserInputMessage(string: String) =
            addUserInputMessage(InputMessage.User.Content.ofString(string))

        /**
         * Alias for calling [addUserInputMessage] with
         * `InputMessage.User.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
         */
        fun addUserInputMessageOfOpenAIChatCompletionContentPartParams(
            openaiChatCompletionContentPartParams:
                List<InputMessage.User.Content.OpenAIChatCompletionContentPartParam>
        ) =
            addUserInputMessage(
                InputMessage.User.Content.ofOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams
                )
            )

        /** Alias for calling [addInputMessage] with `InputMessage.ofSystem(system)`. */
        fun addInputMessage(system: InputMessage.System) =
            addInputMessage(InputMessage.ofSystem(system))

        /**
         * Alias for calling [addInputMessage] with the following:
         * ```kotlin
         * InputMessage.System.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemInputMessage(content: InputMessage.System.Content) =
            addInputMessage(InputMessage.System.builder().content(content).build())

        /**
         * Alias for calling [addSystemInputMessage] with
         * `InputMessage.System.Content.ofString(string)`.
         */
        fun addSystemInputMessage(string: String) =
            addSystemInputMessage(InputMessage.System.Content.ofString(string))

        /**
         * Alias for calling [addSystemInputMessage] with
         * `InputMessage.System.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
         */
        fun addSystemInputMessageOfOpenAIChatCompletionContentPartParams(
            openaiChatCompletionContentPartParams:
                List<InputMessage.System.Content.OpenAIChatCompletionContentPartParam>
        ) =
            addSystemInputMessage(
                InputMessage.System.Content.ofOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams
                )
            )

        /** Alias for calling [addInputMessage] with `InputMessage.ofAssistant(assistant)`. */
        fun addInputMessage(assistant: InputMessage.Assistant) =
            addInputMessage(InputMessage.ofAssistant(assistant))

        /** Alias for calling [addInputMessage] with `InputMessage.ofTool(tool)`. */
        fun addInputMessage(tool: InputMessage.Tool) = addInputMessage(InputMessage.ofTool(tool))

        /** Alias for calling [addInputMessage] with `InputMessage.ofDeveloper(developer)`. */
        fun addInputMessage(developer: InputMessage.Developer) =
            addInputMessage(InputMessage.ofDeveloper(developer))

        /**
         * Alias for calling [addInputMessage] with the following:
         * ```kotlin
         * InputMessage.Developer.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addDeveloperInputMessage(content: InputMessage.Developer.Content) =
            addInputMessage(InputMessage.Developer.builder().content(content).build())

        /**
         * Alias for calling [addDeveloperInputMessage] with
         * `InputMessage.Developer.Content.ofString(string)`.
         */
        fun addDeveloperInputMessage(string: String) =
            addDeveloperInputMessage(InputMessage.Developer.Content.ofString(string))

        /**
         * Alias for calling [addDeveloperInputMessage] with
         * `InputMessage.Developer.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
         */
        fun addDeveloperInputMessageOfOpenAIChatCompletionContentPartParams(
            openaiChatCompletionContentPartParams:
                List<InputMessage.Developer.Content.OpenAIChatCompletionContentPartParam>
        ) =
            addDeveloperInputMessage(
                InputMessage.Developer.Content.ofOpenAIChatCompletionContentPartParams(
                    openaiChatCompletionContentPartParams
                )
            )

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
         * JsonValue.from("chat.completion")
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
         * Returns an immutable instance of [ChatCompletionRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .choices()
         * .created()
         * .inputMessages()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionRetrieveResponse =
            ChatCompletionRetrieveResponse(
                checkRequired("id", id),
                checkRequired("choices", choices).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("inputMessages", inputMessages).map { it.toImmutable() },
                checkRequired("model", model),
                object_,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatCompletionRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        choices().forEach { it.validate() }
        created()
        inputMessages().forEach { it.validate() }
        model()
        _object_().let {
            if (it != JsonValue.from("chat.completion")) {
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
            (inputMessages.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (model.asKnown() == null) 0 else 1) +
            object_.let { if (it == JsonValue.from("chat.completion")) 1 else 0 }

    /** A choice from an OpenAI-compatible chat completion response. */
    class Choice
    private constructor(
        private val finishReason: JsonField<String>,
        private val index: JsonField<Long>,
        private val message: JsonField<Message>,
        private val logprobs: JsonField<Logprobs>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("finish_reason")
            @ExcludeMissing
            finishReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<Logprobs> = JsonMissing.of(),
        ) : this(finishReason, index, message, logprobs, mutableMapOf())

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
         * The message from the model
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun message(): Message = message.getRequired("message")

        /**
         * (Optional) The log probabilities for the tokens in the message
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

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
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

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
             * .finishReason()
             * .index()
             * .message()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Choice]. */
        class Builder internal constructor() {

            private var finishReason: JsonField<String>? = null
            private var index: JsonField<Long>? = null
            private var message: JsonField<Message>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(choice: Choice) = apply {
                finishReason = choice.finishReason
                index = choice.index
                message = choice.message
                logprobs = choice.logprobs
                additionalProperties = choice.additionalProperties.toMutableMap()
            }

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

            /** The message from the model */
            fun message(message: Message) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [Message] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<Message>) = apply { this.message = message }

            /** Alias for calling [message] with `Message.ofUser(user)`. */
            fun message(user: Message.User) = message(Message.ofUser(user))

            /**
             * Alias for calling [message] with the following:
             * ```kotlin
             * Message.User.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun userMessage(content: Message.User.Content) =
                message(Message.User.builder().content(content).build())

            /** Alias for calling [userMessage] with `Message.User.Content.ofString(string)`. */
            fun userMessage(string: String) = userMessage(Message.User.Content.ofString(string))

            /**
             * Alias for calling [userMessage] with
             * `Message.User.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
             */
            fun userMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams:
                    List<Message.User.Content.OpenAIChatCompletionContentPartParam>
            ) =
                userMessage(
                    Message.User.Content.ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams
                    )
                )

            /** Alias for calling [message] with `Message.ofSystem(system)`. */
            fun message(system: Message.System) = message(Message.ofSystem(system))

            /**
             * Alias for calling [message] with the following:
             * ```kotlin
             * Message.System.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun systemMessage(content: Message.System.Content) =
                message(Message.System.builder().content(content).build())

            /** Alias for calling [systemMessage] with `Message.System.Content.ofString(string)`. */
            fun systemMessage(string: String) =
                systemMessage(Message.System.Content.ofString(string))

            /**
             * Alias for calling [systemMessage] with
             * `Message.System.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
             */
            fun systemMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams:
                    List<Message.System.Content.OpenAIChatCompletionContentPartParam>
            ) =
                systemMessage(
                    Message.System.Content.ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams
                    )
                )

            /** Alias for calling [message] with `Message.ofAssistant(assistant)`. */
            fun message(assistant: Message.Assistant) = message(Message.ofAssistant(assistant))

            /** Alias for calling [message] with `Message.ofTool(tool)`. */
            fun message(tool: Message.Tool) = message(Message.ofTool(tool))

            /** Alias for calling [message] with `Message.ofDeveloper(developer)`. */
            fun message(developer: Message.Developer) = message(Message.ofDeveloper(developer))

            /**
             * Alias for calling [message] with the following:
             * ```kotlin
             * Message.Developer.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun developerMessage(content: Message.Developer.Content) =
                message(Message.Developer.builder().content(content).build())

            /**
             * Alias for calling [developerMessage] with
             * `Message.Developer.Content.ofString(string)`.
             */
            fun developerMessage(string: String) =
                developerMessage(Message.Developer.Content.ofString(string))

            /**
             * Alias for calling [developerMessage] with
             * `Message.Developer.Content.ofOpenAIChatCompletionContentPartParams(openaiChatCompletionContentPartParams)`.
             */
            fun developerMessageOfOpenAIChatCompletionContentPartParams(
                openaiChatCompletionContentPartParams:
                    List<Message.Developer.Content.OpenAIChatCompletionContentPartParam>
            ) =
                developerMessage(
                    Message.Developer.Content.ofOpenAIChatCompletionContentPartParams(
                        openaiChatCompletionContentPartParams
                    )
                )

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
             * .finishReason()
             * .index()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Choice =
                Choice(
                    checkRequired("finishReason", finishReason),
                    checkRequired("index", index),
                    checkRequired("message", message),
                    logprobs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Choice = apply {
            if (validated) {
                return@apply
            }

            finishReason()
            index()
            message().validate()
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
            (if (finishReason.asKnown() == null) 0 else 1) +
                (if (index.asKnown() == null) 0 else 1) +
                (message.asKnown()?.validity() ?: 0) +
                (logprobs.asKnown()?.validity() ?: 0)

        /** The message from the model */
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
                 * A message containing the model's (assistant) response in an OpenAI-compatible
                 * chat completion request.
                 */
                fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

                /**
                 * A message representing the result of a tool invocation in an OpenAI-compatible
                 * chat completion request.
                 */
                fun ofTool(tool: Tool) = Message(tool = tool)

                /** A message from the developer in an OpenAI-compatible chat completion request. */
                fun ofDeveloper(developer: Developer) = Message(developer = developer)
            }

            /**
             * An interface that defines how to map each variant of [Message] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** A message from the user in an OpenAI-compatible chat completion request. */
                fun visitUser(user: User): T

                /** A system message providing instructions or context to the model. */
                fun visitSystem(system: System): T

                /**
                 * A message containing the model's (assistant) response in an OpenAI-compatible
                 * chat completion request.
                 */
                fun visitAssistant(assistant: Assistant): T

                /**
                 * A message representing the result of a tool invocation in an OpenAI-compatible
                 * chat completion request.
                 */
                fun visitTool(tool: Tool): T

                /** A message from the developer in an OpenAI-compatible chat completion request. */
                fun visitDeveloper(developer: Developer): T

                /**
                 * Maps an unknown variant of [Message] to a value of type [T].
                 *
                 * An instance of [Message] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
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
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
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
                                value.openaiChatCompletionContentPartParams != null ->
                                    generator.writeObject(
                                        value.openaiChatCompletionContentPartParams
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(
                        using = OpenAIChatCompletionContentPartParam.Deserializer::class
                    )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitText(text: Text) = text.validity()

                                    override fun visitImageUrl(imageUrl: ImageUrl) =
                                        imageUrl.validity()

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
                                _json != null ->
                                    "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }

                        companion object {

                            fun ofText(text: Text) =
                                OpenAIChatCompletionContentPartParam(text = text)

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
                             * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to
                             * a value of type [T].
                             *
                             * An instance of [OpenAIChatCompletionContentPartParam] can contain an
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
                                        return tryDeserialize(node, jacksonTypeRef<ImageUrl>())
                                            ?.let {
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
                             * JsonValue.from("text")
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
                                 * JsonValue.from("text")
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(imageUrl, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [ImageUrl].
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
                                    additionalProperties =
                                        imageUrl.additionalProperties.toMutableMap()
                                }

                                fun imageUrl(imageUrl: InnerImageUrl) =
                                    imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [InnerImageUrl] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
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
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
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
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
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
                                     * Returns an immutable instance of [InnerImageUrl].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
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
                 * The content of the "system prompt". If multiple system messages are provided,
                 * they are concatenated. The underlying Llama Stack code may also add other system
                 * messages (for example, for formatting tool definitions).
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

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
                     * they are concatenated. The underlying Llama Stack code may also add other
                     * system messages (for example, for formatting tool definitions).
                     */
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
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
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
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                 * The content of the "system prompt". If multiple system messages are provided,
                 * they are concatenated. The underlying Llama Stack code may also add other system
                 * messages (for example, for formatting tool definitions).
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
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
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
                                value.openaiChatCompletionContentPartParams != null ->
                                    generator.writeObject(
                                        value.openaiChatCompletionContentPartParams
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(
                        using = OpenAIChatCompletionContentPartParam.Deserializer::class
                    )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitText(text: Text) = text.validity()

                                    override fun visitImageUrl(imageUrl: ImageUrl) =
                                        imageUrl.validity()

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
                                _json != null ->
                                    "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }

                        companion object {

                            fun ofText(text: Text) =
                                OpenAIChatCompletionContentPartParam(text = text)

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
                             * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to
                             * a value of type [T].
                             *
                             * An instance of [OpenAIChatCompletionContentPartParam] can contain an
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
                                        return tryDeserialize(node, jacksonTypeRef<ImageUrl>())
                                            ?.let {
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
                             * JsonValue.from("text")
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
                                 * JsonValue.from("text")
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(imageUrl, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [ImageUrl].
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
                                    additionalProperties =
                                        imageUrl.additionalProperties.toMutableMap()
                                }

                                fun imageUrl(imageUrl: InnerImageUrl) =
                                    imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [InnerImageUrl] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
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
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
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
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
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
                                     * Returns an immutable instance of [InnerImageUrl].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
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
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun content(): Content? = content.getNullable("content")

                /**
                 * (Optional) The name of the assistant message participant.
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

                /**
                 * List of tool calls. Each tool call is an OpenAIChatCompletionToolCall object.
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

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
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * List of tool calls. Each tool call is an OpenAIChatCompletionToolCall object.
                     */
                    fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                    /**
                     * Sets [Builder.toolCalls] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.toolCalls] with a well-typed
                     * `List<ToolCall>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
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
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
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
                                value.openaiChatCompletionContentPartParams != null ->
                                    generator.writeObject(
                                        value.openaiChatCompletionContentPartParams
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(
                        using = OpenAIChatCompletionContentPartParam.Deserializer::class
                    )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitText(text: Text) = text.validity()

                                    override fun visitImageUrl(imageUrl: ImageUrl) =
                                        imageUrl.validity()

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
                                _json != null ->
                                    "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }

                        companion object {

                            fun ofText(text: Text) =
                                OpenAIChatCompletionContentPartParam(text = text)

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
                             * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to
                             * a value of type [T].
                             *
                             * An instance of [OpenAIChatCompletionContentPartParam] can contain an
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
                                        return tryDeserialize(node, jacksonTypeRef<ImageUrl>())
                                            ?.let {
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
                             * JsonValue.from("text")
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
                                 * JsonValue.from("text")
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(imageUrl, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [ImageUrl].
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
                                    additionalProperties =
                                        imageUrl.additionalProperties.toMutableMap()
                                }

                                fun imageUrl(imageUrl: InnerImageUrl) =
                                    imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [InnerImageUrl] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
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
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
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
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
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
                                     * Returns an immutable instance of [InnerImageUrl].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
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
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("function")
                        @ExcludeMissing
                        function: JsonField<Function> = JsonMissing.of(),
                        @JsonProperty("index")
                        @ExcludeMissing
                        index: JsonField<Long> = JsonMissing.of(),
                    ) : this(type, id, function, index, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```kotlin
                     * JsonValue.from("function")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): String? = id.getNullable("id")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun function(): Function? = function.getNullable("function")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun index(): Long? = index.getNullable("index")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [function].
                     *
                     * Unlike [function], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("function")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun function(function: Function) = function(JsonField.of(function))

                        /**
                         * Sets [Builder.function] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.function] with a well-typed [Function]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun function(function: JsonField<Function>) = apply {
                            this.function = function
                        }

                        fun index(index: Long) = index(JsonField.of(index))

                        /**
                         * Sets [Builder.index] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.index] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun index(index: JsonField<Long>) = apply { this.index = index }

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
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun arguments(): String? = arguments.getNullable("arguments")

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
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
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                             * Returns a mutable builder for constructing an instance of [Function].
                             */
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
                             * You should usually call [Builder.arguments] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun arguments(arguments: JsonField<String>) = apply {
                                this.arguments = arguments
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
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
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

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
                 * Returns the raw JSON value of [toolCallId].
                 *
                 * Unlike [toolCallId], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
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
                                value.openaiChatCompletionContentPartParams != null ->
                                    generator.writeObject(
                                        value.openaiChatCompletionContentPartParams
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(
                        using = OpenAIChatCompletionContentPartParam.Deserializer::class
                    )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitText(text: Text) = text.validity()

                                    override fun visitImageUrl(imageUrl: ImageUrl) =
                                        imageUrl.validity()

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
                                _json != null ->
                                    "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }

                        companion object {

                            fun ofText(text: Text) =
                                OpenAIChatCompletionContentPartParam(text = text)

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
                             * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to
                             * a value of type [T].
                             *
                             * An instance of [OpenAIChatCompletionContentPartParam] can contain an
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
                                        return tryDeserialize(node, jacksonTypeRef<ImageUrl>())
                                            ?.let {
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
                             * JsonValue.from("text")
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
                                 * JsonValue.from("text")
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(imageUrl, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [ImageUrl].
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
                                    additionalProperties =
                                        imageUrl.additionalProperties.toMutableMap()
                                }

                                fun imageUrl(imageUrl: InnerImageUrl) =
                                    imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [InnerImageUrl] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
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
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
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
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
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
                                     * Returns an immutable instance of [InnerImageUrl].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
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
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
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
                                value.openaiChatCompletionContentPartParams != null ->
                                    generator.writeObject(
                                        value.openaiChatCompletionContentPartParams
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(
                        using = OpenAIChatCompletionContentPartParam.Deserializer::class
                    )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitText(text: Text) = text.validity()

                                    override fun visitImageUrl(imageUrl: ImageUrl) =
                                        imageUrl.validity()

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
                                _json != null ->
                                    "OpenAIChatCompletionContentPartParam{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIChatCompletionContentPartParam"
                                    )
                            }

                        companion object {

                            fun ofText(text: Text) =
                                OpenAIChatCompletionContentPartParam(text = text)

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
                             * Maps an unknown variant of [OpenAIChatCompletionContentPartParam] to
                             * a value of type [T].
                             *
                             * An instance of [OpenAIChatCompletionContentPartParam] can contain an
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
                                        return tryDeserialize(node, jacksonTypeRef<ImageUrl>())
                                            ?.let {
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
                             * JsonValue.from("text")
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
                                 * JsonValue.from("text")
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(imageUrl, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun imageUrl(): InnerImageUrl = imageUrl.getRequired("image_url")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [ImageUrl].
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
                                    additionalProperties =
                                        imageUrl.additionalProperties.toMutableMap()
                                }

                                fun imageUrl(imageUrl: InnerImageUrl) =
                                    imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [InnerImageUrl] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
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
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
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
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
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
                                     * Returns an immutable instance of [InnerImageUrl].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
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

            return /* spotless:off */ other is Choice && finishReason == other.finishReason && index == other.index && message == other.message && logprobs == other.logprobs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(finishReason, index, message, logprobs, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Choice{finishReason=$finishReason, index=$index, message=$message, logprobs=$logprobs, additionalProperties=$additionalProperties}"
    }

    /** A message from the user in an OpenAI-compatible chat completion request. */
    @JsonDeserialize(using = InputMessage.Deserializer::class)
    @JsonSerialize(using = InputMessage.Serializer::class)
    class InputMessage
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

        fun validate(): InputMessage = apply {
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

            return /* spotless:off */ other is InputMessage && user == other.user && system == other.system && assistant == other.assistant && tool == other.tool && developer == other.developer /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, system, assistant, tool, developer) /* spotless:on */

        override fun toString(): String =
            when {
                user != null -> "InputMessage{user=$user}"
                system != null -> "InputMessage{system=$system}"
                assistant != null -> "InputMessage{assistant=$assistant}"
                tool != null -> "InputMessage{tool=$tool}"
                developer != null -> "InputMessage{developer=$developer}"
                _json != null -> "InputMessage{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputMessage")
            }

        companion object {

            /** A message from the user in an OpenAI-compatible chat completion request. */
            fun ofUser(user: User) = InputMessage(user = user)

            /** A system message providing instructions or context to the model. */
            fun ofSystem(system: System) = InputMessage(system = system)

            /**
             * A message containing the model's (assistant) response in an OpenAI-compatible chat
             * completion request.
             */
            fun ofAssistant(assistant: Assistant) = InputMessage(assistant = assistant)

            /**
             * A message representing the result of a tool invocation in an OpenAI-compatible chat
             * completion request.
             */
            fun ofTool(tool: Tool) = InputMessage(tool = tool)

            /** A message from the developer in an OpenAI-compatible chat completion request. */
            fun ofDeveloper(developer: Developer) = InputMessage(developer = developer)
        }

        /**
         * An interface that defines how to map each variant of [InputMessage] to a value of type
         * [T].
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
             * Maps an unknown variant of [InputMessage] to a value of type [T].
             *
             * An instance of [InputMessage] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown InputMessage: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<InputMessage>(InputMessage::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputMessage {
                val json = JsonValue.fromJsonNode(node)
                val role = json.asObject()?.get("role")?.asString()

                when (role) {
                    "user" -> {
                        return tryDeserialize(node, jacksonTypeRef<User>())?.let {
                            InputMessage(user = it, _json = json)
                        } ?: InputMessage(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(node, jacksonTypeRef<System>())?.let {
                            InputMessage(system = it, _json = json)
                        } ?: InputMessage(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                            InputMessage(assistant = it, _json = json)
                        } ?: InputMessage(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                            InputMessage(tool = it, _json = json)
                        } ?: InputMessage(_json = json)
                    }
                    "developer" -> {
                        return tryDeserialize(node, jacksonTypeRef<Developer>())?.let {
                            InputMessage(developer = it, _json = json)
                        } ?: InputMessage(_json = json)
                    }
                }

                return InputMessage(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<InputMessage>(InputMessage::class) {

            override fun serialize(
                value: InputMessage,
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
                    else -> throw IllegalStateException("Invalid InputMessage")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionRetrieveResponse && id == other.id && choices == other.choices && created == other.created && inputMessages == other.inputMessages && model == other.model && object_ == other.object_ && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, choices, created, inputMessages, model, object_, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionRetrieveResponse{id=$id, choices=$choices, created=$created, inputMessages=$inputMessages, model=$model, object_=$object_, additionalProperties=$additionalProperties}"
}
