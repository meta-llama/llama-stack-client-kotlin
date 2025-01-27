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
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class AgentTurnCreateParams
constructor(
    private val agentId: String,
    private val sessionId: String,
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: AgentTurnCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun agentId(): String = agentId

    fun sessionId(): String = sessionId

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun messages(): List<Message> = body.messages()

    fun documents(): List<Document>? = body.documents()

    fun toolgroups(): List<Toolgroup>? = body.toolgroups()

    fun _messages(): JsonField<List<Message>> = body._messages()

    fun _documents(): JsonField<List<Document>> = body._documents()

    fun _toolgroups(): JsonField<List<Toolgroup>> = body._toolgroups()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): AgentTurnCreateBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> agentId
            1 -> sessionId
            else -> ""
        }
    }

    @NoAutoDetect
    class AgentTurnCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("messages")
        @ExcludeMissing
        private val messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        private val documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("toolgroups")
        @ExcludeMissing
        private val toolgroups: JsonField<List<Toolgroup>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun messages(): List<Message> = messages.getRequired("messages")

        fun documents(): List<Document>? = documents.getNullable("documents")

        fun toolgroups(): List<Toolgroup>? = toolgroups.getNullable("toolgroups")

        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<Document>> = documents

        @JsonProperty("toolgroups")
        @ExcludeMissing
        fun _toolgroups(): JsonField<List<Toolgroup>> = toolgroups

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnCreateBody = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            documents()?.forEach { it.validate() }
            toolgroups()?.forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var messages: JsonField<MutableList<Message>>? = null
            private var documents: JsonField<MutableList<Document>>? = null
            private var toolgroups: JsonField<MutableList<Toolgroup>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentTurnCreateBody: AgentTurnCreateBody) = apply {
                messages = agentTurnCreateBody.messages.map { it.toMutableList() }
                documents = agentTurnCreateBody.documents.map { it.toMutableList() }
                toolgroups = agentTurnCreateBody.toolgroups.map { it.toMutableList() }
                additionalProperties = agentTurnCreateBody.additionalProperties.toMutableMap()
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

            fun addMessage(user: UserMessage) = addMessage(Message.ofUser(user))

            fun addMessage(toolResponse: ToolResponseMessage) =
                addMessage(Message.ofToolResponse(toolResponse))

            fun documents(documents: List<Document>) = documents(JsonField.of(documents))

            fun documents(documents: JsonField<List<Document>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            fun addDocument(document: Document) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(document)
                    }
            }

            fun toolgroups(toolgroups: List<Toolgroup>) = toolgroups(JsonField.of(toolgroups))

            fun toolgroups(toolgroups: JsonField<List<Toolgroup>>) = apply {
                this.toolgroups = toolgroups.map { it.toMutableList() }
            }

            fun addToolgroup(toolgroup: Toolgroup) = apply {
                toolgroups =
                    (toolgroups ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(toolgroup)
                    }
            }

            fun addToolgroup(string: String) = addToolgroup(Toolgroup.ofString(string))

            fun addToolgroup(unionMember1: Toolgroup.UnionMember1) =
                addToolgroup(Toolgroup.ofUnionMember1(unionMember1))

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

            fun build(): AgentTurnCreateBody =
                AgentTurnCreateBody(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
                    (toolgroups ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnCreateBody && messages == other.messages && documents == other.documents && toolgroups == other.toolgroups && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messages, documents, toolgroups, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnCreateBody{messages=$messages, documents=$documents, toolgroups=$toolgroups, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var agentId: String? = null
        private var sessionId: String? = null
        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: AgentTurnCreateBody.Builder = AgentTurnCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentTurnCreateParams: AgentTurnCreateParams) = apply {
            agentId = agentTurnCreateParams.agentId
            sessionId = agentTurnCreateParams.sessionId
            xLlamaStackClientVersion = agentTurnCreateParams.xLlamaStackClientVersion
            xLlamaStackProviderData = agentTurnCreateParams.xLlamaStackProviderData
            body = agentTurnCreateParams.body.toBuilder()
            additionalHeaders = agentTurnCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentTurnCreateParams.additionalQueryParams.toBuilder()
        }

        fun agentId(agentId: String) = apply { this.agentId = agentId }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        fun addMessage(message: Message) = apply { body.addMessage(message) }

        fun addMessage(user: UserMessage) = apply { body.addMessage(user) }

        fun addMessage(toolResponse: ToolResponseMessage) = apply { body.addMessage(toolResponse) }

        fun documents(documents: List<Document>) = apply { body.documents(documents) }

        fun documents(documents: JsonField<List<Document>>) = apply { body.documents(documents) }

        fun addDocument(document: Document) = apply { body.addDocument(document) }

        fun toolgroups(toolgroups: List<Toolgroup>) = apply { body.toolgroups(toolgroups) }

        fun toolgroups(toolgroups: JsonField<List<Toolgroup>>) = apply {
            body.toolgroups(toolgroups)
        }

        fun addToolgroup(toolgroup: Toolgroup) = apply { body.addToolgroup(toolgroup) }

        fun addToolgroup(string: String) = apply { body.addToolgroup(string) }

        fun addToolgroup(unionMember1: Toolgroup.UnionMember1) = apply {
            body.addToolgroup(unionMember1)
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

        fun build(): AgentTurnCreateParams =
            AgentTurnCreateParams(
                checkRequired("agentId", agentId),
                checkRequired("sessionId", sessionId),
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val user: UserMessage? = null,
        private val toolResponse: ToolResponseMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun user(): UserMessage? = user

        fun toolResponse(): ToolResponseMessage? = toolResponse

        fun isUser(): Boolean = user != null

        fun isToolResponse(): Boolean = toolResponse != null

        fun asUser(): UserMessage = user.getOrThrow("user")

        fun asToolResponse(): ToolResponseMessage = toolResponse.getOrThrow("toolResponse")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                user != null -> visitor.visitUser(user)
                toolResponse != null -> visitor.visitToolResponse(toolResponse)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: UserMessage) {
                        user.validate()
                    }

                    override fun visitToolResponse(toolResponse: ToolResponseMessage) {
                        toolResponse.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Message && user == other.user && toolResponse == other.toolResponse /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, toolResponse) /* spotless:on */

        override fun toString(): String =
            when {
                user != null -> "Message{user=$user}"
                toolResponse != null -> "Message{toolResponse=$toolResponse}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            fun ofUser(user: UserMessage) = Message(user = user)

            fun ofToolResponse(toolResponse: ToolResponseMessage) =
                Message(toolResponse = toolResponse)
        }

        interface Visitor<out T> {

            fun visitUser(user: UserMessage): T

            fun visitToolResponse(toolResponse: ToolResponseMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Message: $json")
            }
        }

        class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return Message(user = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return Message(toolResponse = it, _json = json)
                    }

                return Message(_json = json)
            }
        }

        class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.user != null -> generator.writeObject(value.user)
                    value.toolResponse != null -> generator.writeObject(value.toolResponse)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }
    }

    @NoAutoDetect
    class Document
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("mime_type")
        @ExcludeMissing
        private val mimeType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): Content = content.getRequired("content")

        fun mimeType(): String = mimeType.getRequired("mime_type")

        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            mimeType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<Content>? = null
            private var mimeType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(document: Document) = apply {
                content = document.content
                mimeType = document.mimeType
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            fun content(content: Content) = content(JsonField.of(content))

            fun content(content: JsonField<Content>) = apply { this.content = content }

            fun content(string: String) = content(Content.ofString(string))

            fun content(imageContentItem: Content.ImageContentItem) =
                content(Content.ofImageContentItem(imageContentItem))

            fun content(textContentItem: Content.TextContentItem) =
                content(Content.ofTextContentItem(textContentItem))

            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(Content.ofInterleavedContentItems(interleavedContentItems))

            fun content(url: Url) = content(Content.ofUrl(url))

            fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

            fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

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

            fun build(): Document =
                Document(
                    checkRequired("content", content),
                    checkRequired("mimeType", mimeType),
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val string: String? = null,
            private val imageContentItem: ImageContentItem? = null,
            private val textContentItem: TextContentItem? = null,
            private val interleavedContentItems: List<InterleavedContentItem>? = null,
            private val url: Url? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun imageContentItem(): ImageContentItem? = imageContentItem

            fun textContentItem(): TextContentItem? = textContentItem

            fun interleavedContentItems(): List<InterleavedContentItem>? = interleavedContentItems

            fun url(): Url? = url

            fun isString(): Boolean = string != null

            fun isImageContentItem(): Boolean = imageContentItem != null

            fun isTextContentItem(): Boolean = textContentItem != null

            fun isInterleavedContentItems(): Boolean = interleavedContentItems != null

            fun isUrl(): Boolean = url != null

            fun asString(): String = string.getOrThrow("string")

            fun asImageContentItem(): ImageContentItem =
                imageContentItem.getOrThrow("imageContentItem")

            fun asTextContentItem(): TextContentItem = textContentItem.getOrThrow("textContentItem")

            fun asInterleavedContentItems(): List<InterleavedContentItem> =
                interleavedContentItems.getOrThrow("interleavedContentItems")

            fun asUrl(): Url = url.getOrThrow("url")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageContentItem != null -> visitor.visitImageContentItem(imageContentItem)
                    textContentItem != null -> visitor.visitTextContentItem(textContentItem)
                    interleavedContentItems != null ->
                        visitor.visitInterleavedContentItems(interleavedContentItems)
                    url != null -> visitor.visitUrl(url)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitImageContentItem(imageContentItem: ImageContentItem) {
                            imageContentItem.validate()
                        }

                        override fun visitTextContentItem(textContentItem: TextContentItem) {
                            textContentItem.validate()
                        }

                        override fun visitInterleavedContentItems(
                            interleavedContentItems: List<InterleavedContentItem>
                        ) {
                            interleavedContentItems.forEach { it.validate() }
                        }

                        override fun visitUrl(url: Url) {
                            url.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Content && string == other.string && imageContentItem == other.imageContentItem && textContentItem == other.textContentItem && interleavedContentItems == other.interleavedContentItems && url == other.url /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageContentItem, textContentItem, interleavedContentItems, url) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    imageContentItem != null -> "Content{imageContentItem=$imageContentItem}"
                    textContentItem != null -> "Content{textContentItem=$textContentItem}"
                    interleavedContentItems != null ->
                        "Content{interleavedContentItems=$interleavedContentItems}"
                    url != null -> "Content{url=$url}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                fun ofString(string: String) = Content(string = string)

                fun ofImageContentItem(imageContentItem: ImageContentItem) =
                    Content(imageContentItem = imageContentItem)

                fun ofTextContentItem(textContentItem: TextContentItem) =
                    Content(textContentItem = textContentItem)

                fun ofInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ) = Content(interleavedContentItems = interleavedContentItems)

                fun ofUrl(url: Url) = Content(url = url)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitImageContentItem(imageContentItem: ImageContentItem): T

                fun visitTextContentItem(textContentItem: TextContentItem): T

                fun visitInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ): T

                fun visitUrl(url: Url): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                }
            }

            class Deserializer : BaseDeserializer<Content>(Content::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Content(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ImageContentItem>()) { it.validate() }
                        ?.let {
                            return Content(imageContentItem = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<TextContentItem>()) { it.validate() }
                        ?.let {
                            return Content(textContentItem = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<List<InterleavedContentItem>>()) {
                            it.forEach { it.validate() }
                        }
                        ?.let {
                            return Content(interleavedContentItems = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<Url>()) { it.validate() }
                        ?.let {
                            return Content(url = it, _json = json)
                        }

                    return Content(_json = json)
                }
            }

            class Serializer : BaseSerializer<Content>(Content::class) {

                override fun serialize(
                    value: Content,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.imageContentItem != null ->
                            generator.writeObject(value.imageContentItem)
                        value.textContentItem != null ->
                            generator.writeObject(value.textContentItem)
                        value.interleavedContentItems != null ->
                            generator.writeObject(value.interleavedContentItems)
                        value.url != null -> generator.writeObject(value.url)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            @NoAutoDetect
            class ImageContentItem
            @JsonCreator
            private constructor(
                @JsonProperty("image")
                @ExcludeMissing
                private val image: JsonField<Image> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonValue = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun image(): Image = image.getRequired("image")

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<Image> = image

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ImageContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    image().validate()
                    _type().let {
                        if (it != JsonValue.from("image")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var image: JsonField<Image>? = null
                    private var type: JsonValue = JsonValue.from("image")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(imageContentItem: ImageContentItem) = apply {
                        image = imageContentItem.image
                        type = imageContentItem.type
                        additionalProperties = imageContentItem.additionalProperties.toMutableMap()
                    }

                    fun image(image: Image) = image(JsonField.of(image))

                    fun image(image: JsonField<Image>) = apply { this.image = image }

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

                    fun build(): ImageContentItem =
                        ImageContentItem(
                            checkRequired("image", image),
                            type,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Image
                @JsonCreator
                private constructor(
                    @JsonProperty("data")
                    @ExcludeMissing
                    private val data: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("url")
                    @ExcludeMissing
                    private val url: JsonField<Url> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun data(): String? = data.getNullable("data")

                    fun url(): Url? = url.getNullable("url")

                    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

                    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<Url> = url

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Image = apply {
                        if (validated) {
                            return@apply
                        }

                        data()
                        url()?.validate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var data: JsonField<String> = JsonMissing.of()
                        private var url: JsonField<Url> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(image: Image) = apply {
                            data = image.data
                            url = image.url
                            additionalProperties = image.additionalProperties.toMutableMap()
                        }

                        fun data(data: String) = data(JsonField.of(data))

                        fun data(data: JsonField<String>) = apply { this.data = data }

                        fun url(url: Url) = url(JsonField.of(url))

                        fun url(url: JsonField<Url>) = apply { this.url = url }

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

                        fun build(): Image =
                            Image(
                                data,
                                url,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Image && data == other.data && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(data, url, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Image{data=$data, url=$url, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ImageContentItem && image == other.image && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(image, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImageContentItem{image=$image, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class TextContentItem
            @JsonCreator
            private constructor(
                @JsonProperty("text")
                @ExcludeMissing
                private val text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonValue = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun text(): String = text.getRequired("text")

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TextContentItem = apply {
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

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var text: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("text")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(textContentItem: TextContentItem) = apply {
                        text = textContentItem.text
                        type = textContentItem.type
                        additionalProperties = textContentItem.additionalProperties.toMutableMap()
                    }

                    fun text(text: String) = text(JsonField.of(text))

                    fun text(text: JsonField<String>) = apply { this.text = text }

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

                    fun build(): TextContentItem =
                        TextContentItem(
                            checkRequired("text", text),
                            type,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TextContentItem && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TextContentItem{text=$text, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Document && content == other.content && mimeType == other.mimeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, mimeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{content=$content, mimeType=$mimeType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Toolgroup.Deserializer::class)
    @JsonSerialize(using = Toolgroup.Serializer::class)
    class Toolgroup
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

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Toolgroup = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Toolgroup && string == other.string && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Toolgroup{string=$string}"
                unionMember1 != null -> "Toolgroup{unionMember1=$unionMember1}"
                _json != null -> "Toolgroup{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Toolgroup")
            }

        companion object {

            fun ofString(string: String) = Toolgroup(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = Toolgroup(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Toolgroup: $json")
            }
        }

        class Deserializer : BaseDeserializer<Toolgroup>(Toolgroup::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Toolgroup {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Toolgroup(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return Toolgroup(unionMember1 = it, _json = json)
                    }

                return Toolgroup(_json = json)
            }
        }

        class Serializer : BaseSerializer<Toolgroup>(Toolgroup::class) {

            override fun serialize(
                value: Toolgroup,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Toolgroup")
                }
            }
        }

        @NoAutoDetect
        class UnionMember1
        @JsonCreator
        private constructor(
            @JsonProperty("args")
            @ExcludeMissing
            private val args: JsonField<Args> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun args(): Args = args.getRequired("args")

            fun name(): String = name.getRequired("name")

            @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                args().validate()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var args: JsonField<Args>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    args = unionMember1.args
                    name = unionMember1.name
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun args(args: Args) = args(JsonField.of(args))

                fun args(args: JsonField<Args>) = apply { this.args = args }

                fun name(name: String) = name(JsonField.of(name))

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

                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("args", args),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Args
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Args = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(args: Args) = apply {
                        additionalProperties = args.additionalProperties.toMutableMap()
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

                    fun build(): Args = Args(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Args && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Args{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && args == other.args && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(args, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{args=$args, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentTurnCreateParams && agentId == other.agentId && sessionId == other.sessionId && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(agentId, sessionId, xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AgentTurnCreateParams{agentId=$agentId, sessionId=$sessionId, xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
