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

class SafetyRunShieldParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun messages(): List<Message> = body.messages()

    fun params(): Params = body.params()

    fun shieldId(): String = body.shieldId()

    fun _messages(): JsonField<List<Message>> = body._messages()

    fun _params(): JsonField<Params> = body._params()

    fun _shieldId(): JsonField<String> = body._shieldId()

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
        @JsonProperty("messages")
        @ExcludeMissing
        private val messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("params")
        @ExcludeMissing
        private val params: JsonField<Params> = JsonMissing.of(),
        @JsonProperty("shield_id")
        @ExcludeMissing
        private val shieldId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun messages(): List<Message> = messages.getRequired("messages")

        fun params(): Params = params.getRequired("params")

        fun shieldId(): String = shieldId.getRequired("shield_id")

        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

        @JsonProperty("shield_id") @ExcludeMissing fun _shieldId(): JsonField<String> = shieldId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            params().validate()
            shieldId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var params: JsonField<Params>? = null
            private var shieldId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                params = body.params
                shieldId = body.shieldId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(message)
                    }
            }

            /** A message from the user in a chat conversation. */
            fun addMessage(user: UserMessage) = addMessage(Message.ofUser(user))

            /** A message from the user in a chat conversation. */
            fun addUserMessage(content: InterleavedContent) =
                addMessage(UserMessage.builder().content(content).build())

            /** A message from the user in a chat conversation. */
            fun addUserMessage(string: String) = addUserMessage(InterleavedContent.ofString(string))

            /** A image content item */
            fun addUserMessage(imageContentItem: InterleavedContent.ImageContentItem) =
                addUserMessage(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun addUserMessage(textContentItem: InterleavedContent.TextContentItem) =
                addUserMessage(InterleavedContent.ofTextContentItem(textContentItem))

            /** A message from the user in a chat conversation. */
            fun addUserMessageOfItems(items: List<InterleavedContentItem>) =
                addUserMessage(InterleavedContent.ofItems(items))

            /** A system message providing instructions or context to the model. */
            fun addMessage(system: SystemMessage) = addMessage(Message.ofSystem(system))

            /** A system message providing instructions or context to the model. */
            fun addSystemMessage(content: InterleavedContent) =
                addMessage(SystemMessage.builder().content(content).build())

            /** A system message providing instructions or context to the model. */
            fun addSystemMessage(string: String) =
                addSystemMessage(InterleavedContent.ofString(string))

            /** A image content item */
            fun addSystemMessage(imageContentItem: InterleavedContent.ImageContentItem) =
                addSystemMessage(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun addSystemMessage(textContentItem: InterleavedContent.TextContentItem) =
                addSystemMessage(InterleavedContent.ofTextContentItem(textContentItem))

            /** A system message providing instructions or context to the model. */
            fun addSystemMessageOfItems(items: List<InterleavedContentItem>) =
                addSystemMessage(InterleavedContent.ofItems(items))

            /** A message representing the result of a tool invocation. */
            fun addMessage(toolResponse: ToolResponseMessage) =
                addMessage(Message.ofToolResponse(toolResponse))

            /** A message containing the model's (assistant) response in a chat conversation. */
            fun addMessage(completion: CompletionMessage) =
                addMessage(Message.ofCompletion(completion))

            fun params(params: Params) = params(JsonField.of(params))

            fun params(params: JsonField<Params>) = apply { this.params = params }

            fun shieldId(shieldId: String) = shieldId(JsonField.of(shieldId))

            fun shieldId(shieldId: JsonField<String>) = apply { this.shieldId = shieldId }

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
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("params", params),
                    checkRequired("shieldId", shieldId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && messages == other.messages && params == other.params && shieldId == other.shieldId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messages, params, shieldId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, params=$params, shieldId=$shieldId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [SafetyRunShieldParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(safetyRunShieldParams: SafetyRunShieldParams) = apply {
            body = safetyRunShieldParams.body.toBuilder()
            additionalHeaders = safetyRunShieldParams.additionalHeaders.toBuilder()
            additionalQueryParams = safetyRunShieldParams.additionalQueryParams.toBuilder()
        }

        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** A message from the user in a chat conversation. */
        fun addMessage(user: UserMessage) = apply { body.addMessage(user) }

        /** A message from the user in a chat conversation. */
        fun addUserMessage(content: InterleavedContent) = apply { body.addUserMessage(content) }

        /** A message from the user in a chat conversation. */
        fun addUserMessage(string: String) = apply { body.addUserMessage(string) }

        /** A image content item */
        fun addUserMessage(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addUserMessage(imageContentItem)
        }

        /** A text content item */
        fun addUserMessage(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addUserMessage(textContentItem)
        }

        /** A message from the user in a chat conversation. */
        fun addUserMessageOfItems(items: List<InterleavedContentItem>) = apply {
            body.addUserMessageOfItems(items)
        }

        /** A system message providing instructions or context to the model. */
        fun addMessage(system: SystemMessage) = apply { body.addMessage(system) }

        /** A system message providing instructions or context to the model. */
        fun addSystemMessage(content: InterleavedContent) = apply { body.addSystemMessage(content) }

        /** A system message providing instructions or context to the model. */
        fun addSystemMessage(string: String) = apply { body.addSystemMessage(string) }

        /** A image content item */
        fun addSystemMessage(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addSystemMessage(imageContentItem)
        }

        /** A text content item */
        fun addSystemMessage(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addSystemMessage(textContentItem)
        }

        /** A system message providing instructions or context to the model. */
        fun addSystemMessageOfItems(items: List<InterleavedContentItem>) = apply {
            body.addSystemMessageOfItems(items)
        }

        /** A message representing the result of a tool invocation. */
        fun addMessage(toolResponse: ToolResponseMessage) = apply { body.addMessage(toolResponse) }

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun addMessage(completion: CompletionMessage) = apply { body.addMessage(completion) }

        fun params(params: Params) = apply { body.params(params) }

        fun params(params: JsonField<Params>) = apply { body.params(params) }

        fun shieldId(shieldId: String) = apply { body.shieldId(shieldId) }

        fun shieldId(shieldId: JsonField<String>) = apply { body.shieldId(shieldId) }

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

        fun build(): SafetyRunShieldParams =
            SafetyRunShieldParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Params
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(params: Params) = apply {
                additionalProperties = params.additionalProperties.toMutableMap()
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

            fun build(): Params = Params(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SafetyRunShieldParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SafetyRunShieldParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
