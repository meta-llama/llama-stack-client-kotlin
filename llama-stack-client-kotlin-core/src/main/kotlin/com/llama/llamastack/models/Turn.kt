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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Turn
@JsonCreator
private constructor(
    @JsonProperty("input_messages")
    @ExcludeMissing
    private val inputMessages: JsonField<List<InputMessage>> = JsonMissing.of(),
    @JsonProperty("output_attachments")
    @ExcludeMissing
    private val outputAttachments: JsonField<List<OutputAttachment>> = JsonMissing.of(),
    @JsonProperty("output_message")
    @ExcludeMissing
    private val outputMessage: JsonField<CompletionMessage> = JsonMissing.of(),
    @JsonProperty("session_id")
    @ExcludeMissing
    private val sessionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("steps")
    @ExcludeMissing
    private val steps: JsonField<List<Step>> = JsonMissing.of(),
    @JsonProperty("turn_id")
    @ExcludeMissing
    private val turnId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun inputMessages(): List<InputMessage> = inputMessages.getRequired("input_messages")

    fun outputAttachments(): List<OutputAttachment> =
        outputAttachments.getRequired("output_attachments")

    fun outputMessage(): CompletionMessage = outputMessage.getRequired("output_message")

    fun sessionId(): String = sessionId.getRequired("session_id")

    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    fun steps(): List<Step> = steps.getRequired("steps")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    @JsonProperty("input_messages")
    @ExcludeMissing
    fun _inputMessages(): JsonField<List<InputMessage>> = inputMessages

    @JsonProperty("output_attachments")
    @ExcludeMissing
    fun _outputAttachments(): JsonField<List<OutputAttachment>> = outputAttachments

    @JsonProperty("output_message")
    @ExcludeMissing
    fun _outputMessage(): JsonField<CompletionMessage> = outputMessage

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId(): JsonField<String> = turnId

    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Turn = apply {
        if (validated) {
            return@apply
        }

        inputMessages().forEach { it.validate() }
        outputAttachments().forEach { it.validate() }
        outputMessage().validate()
        sessionId()
        startedAt()
        steps().forEach { it.validate() }
        turnId()
        completedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var inputMessages: JsonField<MutableList<InputMessage>>? = null
        private var outputAttachments: JsonField<MutableList<OutputAttachment>>? = null
        private var outputMessage: JsonField<CompletionMessage>? = null
        private var sessionId: JsonField<String>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var steps: JsonField<MutableList<Step>>? = null
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(turn: Turn) = apply {
            inputMessages = turn.inputMessages.map { it.toMutableList() }
            outputAttachments = turn.outputAttachments.map { it.toMutableList() }
            outputMessage = turn.outputMessage
            sessionId = turn.sessionId
            startedAt = turn.startedAt
            steps = turn.steps.map { it.toMutableList() }
            turnId = turn.turnId
            completedAt = turn.completedAt
            additionalProperties = turn.additionalProperties.toMutableMap()
        }

        fun inputMessages(inputMessages: List<InputMessage>) =
            inputMessages(JsonField.of(inputMessages))

        fun inputMessages(inputMessages: JsonField<List<InputMessage>>) = apply {
            this.inputMessages = inputMessages.map { it.toMutableList() }
        }

        fun addInputMessage(inputMessage: InputMessage) = apply {
            inputMessages =
                (inputMessages ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(inputMessage)
                }
        }

        fun addInputMessage(user: UserMessage) = addInputMessage(InputMessage.ofUser(user))

        fun addInputMessage(toolResponse: ToolResponseMessage) =
            addInputMessage(InputMessage.ofToolResponse(toolResponse))

        fun outputAttachments(outputAttachments: List<OutputAttachment>) =
            outputAttachments(JsonField.of(outputAttachments))

        fun outputAttachments(outputAttachments: JsonField<List<OutputAttachment>>) = apply {
            this.outputAttachments = outputAttachments.map { it.toMutableList() }
        }

        fun addOutputAttachment(outputAttachment: OutputAttachment) = apply {
            outputAttachments =
                (outputAttachments ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(outputAttachment)
                }
        }

        fun outputMessage(outputMessage: CompletionMessage) =
            outputMessage(JsonField.of(outputMessage))

        fun outputMessage(outputMessage: JsonField<CompletionMessage>) = apply {
            this.outputMessage = outputMessage
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun steps(steps: List<Step>) = steps(JsonField.of(steps))

        fun steps(steps: JsonField<List<Step>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        fun addStep(step: Step) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(step)
                }
        }

        fun addStep(inference: InferenceStep) = addStep(Step.ofInference(inference))

        fun addStep(toolExecution: ToolExecutionStep) = addStep(Step.ofToolExecution(toolExecution))

        fun addStep(shieldCall: ShieldCallStep) = addStep(Step.ofShieldCall(shieldCall))

        fun addStep(memoryRetrieval: MemoryRetrievalStep) =
            addStep(Step.ofMemoryRetrieval(memoryRetrieval))

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
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

        fun build(): Turn =
            Turn(
                checkRequired("inputMessages", inputMessages).map { it.toImmutable() },
                checkRequired("outputAttachments", outputAttachments).map { it.toImmutable() },
                checkRequired("outputMessage", outputMessage),
                checkRequired("sessionId", sessionId),
                checkRequired("startedAt", startedAt),
                checkRequired("steps", steps).map { it.toImmutable() },
                checkRequired("turnId", turnId),
                completedAt,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = InputMessage.Deserializer::class)
    @JsonSerialize(using = InputMessage.Serializer::class)
    class InputMessage
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

        fun validate(): InputMessage = apply {
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

            return /* spotless:off */ other is InputMessage && user == other.user && toolResponse == other.toolResponse /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, toolResponse) /* spotless:on */

        override fun toString(): String =
            when {
                user != null -> "InputMessage{user=$user}"
                toolResponse != null -> "InputMessage{toolResponse=$toolResponse}"
                _json != null -> "InputMessage{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputMessage")
            }

        companion object {

            fun ofUser(user: UserMessage) = InputMessage(user = user)

            fun ofToolResponse(toolResponse: ToolResponseMessage) =
                InputMessage(toolResponse = toolResponse)
        }

        interface Visitor<out T> {

            fun visitUser(user: UserMessage): T

            fun visitToolResponse(toolResponse: ToolResponseMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown InputMessage: $json")
            }
        }

        class Deserializer : BaseDeserializer<InputMessage>(InputMessage::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputMessage {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(user = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(toolResponse = it, _json = json)
                    }

                return InputMessage(_json = json)
            }
        }

        class Serializer : BaseSerializer<InputMessage>(InputMessage::class) {

            override fun serialize(
                value: InputMessage,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.user != null -> generator.writeObject(value.user)
                    value.toolResponse != null -> generator.writeObject(value.toolResponse)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InputMessage")
                }
            }
        }
    }

    @NoAutoDetect
    class OutputAttachment
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

        fun validate(): OutputAttachment = apply {
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

            internal fun from(outputAttachment: OutputAttachment) = apply {
                content = outputAttachment.content
                mimeType = outputAttachment.mimeType
                additionalProperties = outputAttachment.additionalProperties.toMutableMap()
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

            fun build(): OutputAttachment =
                OutputAttachment(
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

            return /* spotless:off */ other is OutputAttachment && content == other.content && mimeType == other.mimeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, mimeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutputAttachment{content=$content, mimeType=$mimeType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Step.Deserializer::class)
    @JsonSerialize(using = Step.Serializer::class)
    class Step
    private constructor(
        private val inference: InferenceStep? = null,
        private val toolExecution: ToolExecutionStep? = null,
        private val shieldCall: ShieldCallStep? = null,
        private val memoryRetrieval: MemoryRetrievalStep? = null,
        private val _json: JsonValue? = null,
    ) {

        fun inference(): InferenceStep? = inference

        fun toolExecution(): ToolExecutionStep? = toolExecution

        fun shieldCall(): ShieldCallStep? = shieldCall

        fun memoryRetrieval(): MemoryRetrievalStep? = memoryRetrieval

        fun isInference(): Boolean = inference != null

        fun isToolExecution(): Boolean = toolExecution != null

        fun isShieldCall(): Boolean = shieldCall != null

        fun isMemoryRetrieval(): Boolean = memoryRetrieval != null

        fun asInference(): InferenceStep = inference.getOrThrow("inference")

        fun asToolExecution(): ToolExecutionStep = toolExecution.getOrThrow("toolExecution")

        fun asShieldCall(): ShieldCallStep = shieldCall.getOrThrow("shieldCall")

        fun asMemoryRetrieval(): MemoryRetrievalStep = memoryRetrieval.getOrThrow("memoryRetrieval")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                inference != null -> visitor.visitInference(inference)
                toolExecution != null -> visitor.visitToolExecution(toolExecution)
                shieldCall != null -> visitor.visitShieldCall(shieldCall)
                memoryRetrieval != null -> visitor.visitMemoryRetrieval(memoryRetrieval)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Step = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInference(inference: InferenceStep) {
                        inference.validate()
                    }

                    override fun visitToolExecution(toolExecution: ToolExecutionStep) {
                        toolExecution.validate()
                    }

                    override fun visitShieldCall(shieldCall: ShieldCallStep) {
                        shieldCall.validate()
                    }

                    override fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) {
                        memoryRetrieval.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Step && inference == other.inference && toolExecution == other.toolExecution && shieldCall == other.shieldCall && memoryRetrieval == other.memoryRetrieval /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inference, toolExecution, shieldCall, memoryRetrieval) /* spotless:on */

        override fun toString(): String =
            when {
                inference != null -> "Step{inference=$inference}"
                toolExecution != null -> "Step{toolExecution=$toolExecution}"
                shieldCall != null -> "Step{shieldCall=$shieldCall}"
                memoryRetrieval != null -> "Step{memoryRetrieval=$memoryRetrieval}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }

        companion object {

            fun ofInference(inference: InferenceStep) = Step(inference = inference)

            fun ofToolExecution(toolExecution: ToolExecutionStep) =
                Step(toolExecution = toolExecution)

            fun ofShieldCall(shieldCall: ShieldCallStep) = Step(shieldCall = shieldCall)

            fun ofMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) =
                Step(memoryRetrieval = memoryRetrieval)
        }

        interface Visitor<out T> {

            fun visitInference(inference: InferenceStep): T

            fun visitToolExecution(toolExecution: ToolExecutionStep): T

            fun visitShieldCall(shieldCall: ShieldCallStep): T

            fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Step: $json")
            }
        }

        class Deserializer : BaseDeserializer<Step>(Step::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Step {
                val json = JsonValue.fromJsonNode(node)
                val stepType = json.asObject()?.get("step_type")?.asString()

                when (stepType) {
                    "inference" -> {
                        tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                            ?.let {
                                return Step(inference = it, _json = json)
                            }
                    }
                    "tool_execution" -> {
                        tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) { it.validate() }
                            ?.let {
                                return Step(toolExecution = it, _json = json)
                            }
                    }
                    "shield_call" -> {
                        tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                            ?.let {
                                return Step(shieldCall = it, _json = json)
                            }
                    }
                    "memory_retrieval" -> {
                        tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) {
                                it.validate()
                            }
                            ?.let {
                                return Step(memoryRetrieval = it, _json = json)
                            }
                    }
                }

                return Step(_json = json)
            }
        }

        class Serializer : BaseSerializer<Step>(Step::class) {

            override fun serialize(
                value: Step,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.inference != null -> generator.writeObject(value.inference)
                    value.toolExecution != null -> generator.writeObject(value.toolExecution)
                    value.shieldCall != null -> generator.writeObject(value.shieldCall)
                    value.memoryRetrieval != null -> generator.writeObject(value.memoryRetrieval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Step")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Turn && inputMessages == other.inputMessages && outputAttachments == other.outputAttachments && outputMessage == other.outputMessage && sessionId == other.sessionId && startedAt == other.startedAt && steps == other.steps && turnId == other.turnId && completedAt == other.completedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(inputMessages, outputAttachments, outputMessage, sessionId, startedAt, steps, turnId, completedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Turn{inputMessages=$inputMessages, outputAttachments=$outputAttachments, outputMessage=$outputMessage, sessionId=$sessionId, startedAt=$startedAt, steps=$steps, turnId=$turnId, completedAt=$completedAt, additionalProperties=$additionalProperties}"
}
