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
    private val outputMessage: JsonField<OutputMessage> = JsonMissing.of(),
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

    fun outputMessage(): OutputMessage = outputMessage.getRequired("output_message")

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
    fun _outputMessage(): JsonField<OutputMessage> = outputMessage

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
        private var outputMessage: JsonField<OutputMessage>? = null
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

        fun addInputMessage(userMessage: UserMessage) =
            addInputMessage(InputMessage.ofUserMessage(userMessage))

        fun addInputMessage(toolResponseMessage: ToolResponseMessage) =
            addInputMessage(InputMessage.ofToolResponseMessage(toolResponseMessage))

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

        fun outputMessage(outputMessage: OutputMessage) = outputMessage(JsonField.of(outputMessage))

        fun outputMessage(outputMessage: JsonField<OutputMessage>) = apply {
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

        fun addStep(inferenceStep: InferenceStep) = addStep(Step.ofInferenceStep(inferenceStep))

        fun addStep(toolExecutionStep: ToolExecutionStep) =
            addStep(Step.ofToolExecutionStep(toolExecutionStep))

        fun addStep(shieldCallStep: ShieldCallStep) = addStep(Step.ofShieldCallStep(shieldCallStep))

        fun addStep(memoryRetrievalStep: MemoryRetrievalStep) =
            addStep(Step.ofMemoryRetrievalStep(memoryRetrievalStep))

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
        private val userMessage: UserMessage? = null,
        private val toolResponseMessage: ToolResponseMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun userMessage(): UserMessage? = userMessage

        fun toolResponseMessage(): ToolResponseMessage? = toolResponseMessage

        fun isUserMessage(): Boolean = userMessage != null

        fun isToolResponseMessage(): Boolean = toolResponseMessage != null

        fun asUserMessage(): UserMessage = userMessage.getOrThrow("userMessage")

        fun asToolResponseMessage(): ToolResponseMessage =
            toolResponseMessage.getOrThrow("toolResponseMessage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                userMessage != null -> visitor.visitUserMessage(userMessage)
                toolResponseMessage != null -> visitor.visitToolResponseMessage(toolResponseMessage)
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
                    override fun visitUserMessage(userMessage: UserMessage) {
                        userMessage.validate()
                    }

                    override fun visitToolResponseMessage(
                        toolResponseMessage: ToolResponseMessage
                    ) {
                        toolResponseMessage.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InputMessage && userMessage == other.userMessage && toolResponseMessage == other.toolResponseMessage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(userMessage, toolResponseMessage) /* spotless:on */

        override fun toString(): String =
            when {
                userMessage != null -> "InputMessage{userMessage=$userMessage}"
                toolResponseMessage != null ->
                    "InputMessage{toolResponseMessage=$toolResponseMessage}"
                _json != null -> "InputMessage{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputMessage")
            }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = InputMessage(userMessage = userMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                InputMessage(toolResponseMessage = toolResponseMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown InputMessage: $json")
            }
        }

        class Deserializer : BaseDeserializer<InputMessage>(InputMessage::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputMessage {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(toolResponseMessage = it, _json = json)
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
                    value.userMessage != null -> generator.writeObject(value.userMessage)
                    value.toolResponseMessage != null ->
                        generator.writeObject(value.toolResponseMessage)
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
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("data")
                @ExcludeMissing
                private val data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url")
                @ExcludeMissing
                private val url: JsonField<Url> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun type(): Type = type.getRequired("type")

                fun data(): String? = data.getNullable("data")

                fun url(): Url? = url.getNullable("url")

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

                @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<Url> = url

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ImageContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    type()
                    data()
                    url()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type>? = null
                    private var data: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<Url> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(imageContentItem: ImageContentItem) = apply {
                        type = imageContentItem.type
                        data = imageContentItem.data
                        url = imageContentItem.url
                        additionalProperties = imageContentItem.additionalProperties.toMutableMap()
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun data(data: String) = data(JsonField.of(data))

                    fun data(data: JsonField<String>) = apply { this.data = data }

                    fun url(url: Url) = url(JsonField.of(url))

                    fun url(url: JsonField<Url>) = apply { this.url = url }

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
                            checkRequired("type", type),
                            data,
                            url,
                            additionalProperties.toImmutable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val IMAGE = of("image")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        IMAGE,
                    }

                    enum class Value {
                        IMAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            IMAGE -> Value.IMAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            IMAGE -> Known.IMAGE
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is ImageContentItem && type == other.type && data == other.data && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(type, data, url, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImageContentItem{type=$type, data=$data, url=$url, additionalProperties=$additionalProperties}"
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
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun text(): String = text.getRequired("text")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TextContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var text: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(textContentItem: TextContentItem) = apply {
                        text = textContentItem.text
                        type = textContentItem.type
                        additionalProperties = textContentItem.additionalProperties.toMutableMap()
                    }

                    fun text(text: String) = text(JsonField.of(text))

                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val TEXT = of("text")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        TEXT,
                    }

                    enum class Value {
                        TEXT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TEXT -> Value.TEXT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TEXT -> Known.TEXT
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

    @NoAutoDetect
    class OutputMessage
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
        @JsonProperty("stop_reason")
        @ExcludeMissing
        private val stopReason: JsonField<StopReason> = JsonMissing.of(),
        @JsonProperty("tool_calls")
        @ExcludeMissing
        private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): InterleavedContent = content.getRequired("content")

        fun role(): Role = role.getRequired("role")

        fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

        fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

        @JsonProperty("stop_reason")
        @ExcludeMissing
        fun _stopReason(): JsonField<StopReason> = stopReason

        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OutputMessage = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            role()
            stopReason()
            toolCalls().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<InterleavedContent>? = null
            private var role: JsonField<Role>? = null
            private var stopReason: JsonField<StopReason>? = null
            private var toolCalls: JsonField<MutableList<ToolCall>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(outputMessage: OutputMessage) = apply {
                content = outputMessage.content
                role = outputMessage.role
                stopReason = outputMessage.stopReason
                toolCalls = outputMessage.toolCalls.map { it.toMutableList() }
                additionalProperties = outputMessage.additionalProperties.toMutableMap()
            }

            fun content(content: InterleavedContent) = content(JsonField.of(content))

            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            fun content(string: String) = content(InterleavedContent.ofString(string))

            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

            fun role(role: Role) = role(JsonField.of(role))

            fun role(role: JsonField<Role>) = apply { this.role = role }

            fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

            fun stopReason(stopReason: JsonField<StopReason>) = apply {
                this.stopReason = stopReason
            }

            fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                this.toolCalls = toolCalls.map { it.toMutableList() }
            }

            fun addToolCall(toolCall: ToolCall) = apply {
                toolCalls =
                    (toolCalls ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(toolCall)
                    }
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

            fun build(): OutputMessage =
                OutputMessage(
                    checkRequired("content", content),
                    checkRequired("role", role),
                    checkRequired("stopReason", stopReason),
                    checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class Role
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ASSISTANT = of("assistant")

                fun of(value: String) = Role(JsonField.of(value))
            }

            enum class Known {
                ASSISTANT,
            }

            enum class Value {
                ASSISTANT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASSISTANT -> Value.ASSISTANT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASSISTANT -> Known.ASSISTANT
                    else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Role && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class StopReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val END_OF_TURN = of("end_of_turn")

                val END_OF_MESSAGE = of("end_of_message")

                val OUT_OF_TOKENS = of("out_of_tokens")

                fun of(value: String) = StopReason(JsonField.of(value))
            }

            enum class Known {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
            }

            enum class Value {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    END_OF_TURN -> Value.END_OF_TURN
                    END_OF_MESSAGE -> Value.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    END_OF_TURN -> Known.END_OF_TURN
                    END_OF_MESSAGE -> Known.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                    else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OutputMessage && content == other.content && role == other.role && stopReason == other.stopReason && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, role, stopReason, toolCalls, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutputMessage{content=$content, role=$role, stopReason=$stopReason, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Step.Deserializer::class)
    @JsonSerialize(using = Step.Serializer::class)
    class Step
    private constructor(
        private val inferenceStep: InferenceStep? = null,
        private val toolExecutionStep: ToolExecutionStep? = null,
        private val shieldCallStep: ShieldCallStep? = null,
        private val memoryRetrievalStep: MemoryRetrievalStep? = null,
        private val _json: JsonValue? = null,
    ) {

        fun inferenceStep(): InferenceStep? = inferenceStep

        fun toolExecutionStep(): ToolExecutionStep? = toolExecutionStep

        fun shieldCallStep(): ShieldCallStep? = shieldCallStep

        fun memoryRetrievalStep(): MemoryRetrievalStep? = memoryRetrievalStep

        fun isInferenceStep(): Boolean = inferenceStep != null

        fun isToolExecutionStep(): Boolean = toolExecutionStep != null

        fun isShieldCallStep(): Boolean = shieldCallStep != null

        fun isMemoryRetrievalStep(): Boolean = memoryRetrievalStep != null

        fun asInferenceStep(): InferenceStep = inferenceStep.getOrThrow("inferenceStep")

        fun asToolExecutionStep(): ToolExecutionStep =
            toolExecutionStep.getOrThrow("toolExecutionStep")

        fun asShieldCallStep(): ShieldCallStep = shieldCallStep.getOrThrow("shieldCallStep")

        fun asMemoryRetrievalStep(): MemoryRetrievalStep =
            memoryRetrievalStep.getOrThrow("memoryRetrievalStep")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                inferenceStep != null -> visitor.visitInferenceStep(inferenceStep)
                toolExecutionStep != null -> visitor.visitToolExecutionStep(toolExecutionStep)
                shieldCallStep != null -> visitor.visitShieldCallStep(shieldCallStep)
                memoryRetrievalStep != null -> visitor.visitMemoryRetrievalStep(memoryRetrievalStep)
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
                    override fun visitInferenceStep(inferenceStep: InferenceStep) {
                        inferenceStep.validate()
                    }

                    override fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep) {
                        toolExecutionStep.validate()
                    }

                    override fun visitShieldCallStep(shieldCallStep: ShieldCallStep) {
                        shieldCallStep.validate()
                    }

                    override fun visitMemoryRetrievalStep(
                        memoryRetrievalStep: MemoryRetrievalStep
                    ) {
                        memoryRetrievalStep.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Step && inferenceStep == other.inferenceStep && toolExecutionStep == other.toolExecutionStep && shieldCallStep == other.shieldCallStep && memoryRetrievalStep == other.memoryRetrievalStep /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferenceStep, toolExecutionStep, shieldCallStep, memoryRetrievalStep) /* spotless:on */

        override fun toString(): String =
            when {
                inferenceStep != null -> "Step{inferenceStep=$inferenceStep}"
                toolExecutionStep != null -> "Step{toolExecutionStep=$toolExecutionStep}"
                shieldCallStep != null -> "Step{shieldCallStep=$shieldCallStep}"
                memoryRetrievalStep != null -> "Step{memoryRetrievalStep=$memoryRetrievalStep}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }

        companion object {

            fun ofInferenceStep(inferenceStep: InferenceStep) = Step(inferenceStep = inferenceStep)

            fun ofToolExecutionStep(toolExecutionStep: ToolExecutionStep) =
                Step(toolExecutionStep = toolExecutionStep)

            fun ofShieldCallStep(shieldCallStep: ShieldCallStep) =
                Step(shieldCallStep = shieldCallStep)

            fun ofMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep) =
                Step(memoryRetrievalStep = memoryRetrievalStep)
        }

        interface Visitor<out T> {

            fun visitInferenceStep(inferenceStep: InferenceStep): T

            fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep): T

            fun visitShieldCallStep(shieldCallStep: ShieldCallStep): T

            fun visitMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Step: $json")
            }
        }

        class Deserializer : BaseDeserializer<Step>(Step::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Step {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                    ?.let {
                        return Step(inferenceStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) { it.validate() }
                    ?.let {
                        return Step(toolExecutionStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                    ?.let {
                        return Step(shieldCallStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) { it.validate() }
                    ?.let {
                        return Step(memoryRetrievalStep = it, _json = json)
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
                    value.inferenceStep != null -> generator.writeObject(value.inferenceStep)
                    value.toolExecutionStep != null ->
                        generator.writeObject(value.toolExecutionStep)
                    value.shieldCallStep != null -> generator.writeObject(value.shieldCallStep)
                    value.memoryRetrievalStep != null ->
                        generator.writeObject(value.memoryRetrievalStep)
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
