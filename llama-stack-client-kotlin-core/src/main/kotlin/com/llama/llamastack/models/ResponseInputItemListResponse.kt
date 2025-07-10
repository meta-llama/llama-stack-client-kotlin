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

class ResponseInputItemListResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val object_: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonValue = JsonMissing.of(),
    ) : this(data, object_, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("list")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [ResponseInputItemListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ResponseInputItemListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var object_: JsonValue = JsonValue.from("list")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(responseInputItemListResponse: ResponseInputItemListResponse) = apply {
            data = responseInputItemListResponse.data.map { it.toMutableList() }
            object_ = responseInputItemListResponse.object_
            additionalProperties = responseInputItemListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * Alias for calling [addData] with
         * `Data.ofOpenAIResponseOutputMessageWebSearchToolCall(openaiResponseOutputMessageWebSearchToolCall)`.
         */
        fun addData(
            openaiResponseOutputMessageWebSearchToolCall:
                Data.OpenAIResponseOutputMessageWebSearchToolCall
        ) =
            addData(
                Data.ofOpenAIResponseOutputMessageWebSearchToolCall(
                    openaiResponseOutputMessageWebSearchToolCall
                )
            )

        /**
         * Alias for calling [addData] with
         * `Data.ofOpenAIResponseOutputMessageFileSearchToolCall(openaiResponseOutputMessageFileSearchToolCall)`.
         */
        fun addData(
            openaiResponseOutputMessageFileSearchToolCall:
                Data.OpenAIResponseOutputMessageFileSearchToolCall
        ) =
            addData(
                Data.ofOpenAIResponseOutputMessageFileSearchToolCall(
                    openaiResponseOutputMessageFileSearchToolCall
                )
            )

        /**
         * Alias for calling [addData] with
         * `Data.ofOpenAIResponseOutputMessageFunctionToolCall(openaiResponseOutputMessageFunctionToolCall)`.
         */
        fun addData(
            openaiResponseOutputMessageFunctionToolCall:
                Data.OpenAIResponseOutputMessageFunctionToolCall
        ) =
            addData(
                Data.ofOpenAIResponseOutputMessageFunctionToolCall(
                    openaiResponseOutputMessageFunctionToolCall
                )
            )

        /**
         * Alias for calling [addData] with
         * `Data.ofOpenAIResponseInputFunctionToolCallOutput(openaiResponseInputFunctionToolCallOutput)`.
         */
        fun addData(
            openaiResponseInputFunctionToolCallOutput:
                Data.OpenAIResponseInputFunctionToolCallOutput
        ) =
            addData(
                Data.ofOpenAIResponseInputFunctionToolCallOutput(
                    openaiResponseInputFunctionToolCallOutput
                )
            )

        /**
         * Alias for calling [addData] with `Data.ofOpenAIResponseMessage(openaiResponseMessage)`.
         */
        fun addData(openaiResponseMessage: Data.OpenAIResponseMessage) =
            addData(Data.ofOpenAIResponseMessage(openaiResponseMessage))

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("list")
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
         * Returns an immutable instance of [ResponseInputItemListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResponseInputItemListResponse =
            ResponseInputItemListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                object_,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ResponseInputItemListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        _object_().let {
            if (it != JsonValue.from("list")) {
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
        (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            object_.let { if (it == JsonValue.from("list")) 1 else 0 }

    /** This represents the output of a function call that gets passed back to the model. */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val openaiResponseOutputMessageWebSearchToolCall:
            OpenAIResponseOutputMessageWebSearchToolCall? =
            null,
        private val openaiResponseOutputMessageFileSearchToolCall:
            OpenAIResponseOutputMessageFileSearchToolCall? =
            null,
        private val openaiResponseOutputMessageFunctionToolCall:
            OpenAIResponseOutputMessageFunctionToolCall? =
            null,
        private val openaiResponseInputFunctionToolCallOutput:
            OpenAIResponseInputFunctionToolCallOutput? =
            null,
        private val openaiResponseMessage: OpenAIResponseMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun openaiResponseOutputMessageWebSearchToolCall():
            OpenAIResponseOutputMessageWebSearchToolCall? =
            openaiResponseOutputMessageWebSearchToolCall

        fun openaiResponseOutputMessageFileSearchToolCall():
            OpenAIResponseOutputMessageFileSearchToolCall? =
            openaiResponseOutputMessageFileSearchToolCall

        fun openaiResponseOutputMessageFunctionToolCall():
            OpenAIResponseOutputMessageFunctionToolCall? =
            openaiResponseOutputMessageFunctionToolCall

        /** This represents the output of a function call that gets passed back to the model. */
        fun openaiResponseInputFunctionToolCallOutput():
            OpenAIResponseInputFunctionToolCallOutput? = openaiResponseInputFunctionToolCallOutput

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        fun openaiResponseMessage(): OpenAIResponseMessage? = openaiResponseMessage

        fun isOpenAIResponseOutputMessageWebSearchToolCall(): Boolean =
            openaiResponseOutputMessageWebSearchToolCall != null

        fun isOpenAIResponseOutputMessageFileSearchToolCall(): Boolean =
            openaiResponseOutputMessageFileSearchToolCall != null

        fun isOpenAIResponseOutputMessageFunctionToolCall(): Boolean =
            openaiResponseOutputMessageFunctionToolCall != null

        fun isOpenAIResponseInputFunctionToolCallOutput(): Boolean =
            openaiResponseInputFunctionToolCallOutput != null

        fun isOpenAIResponseMessage(): Boolean = openaiResponseMessage != null

        fun asOpenAIResponseOutputMessageWebSearchToolCall():
            OpenAIResponseOutputMessageWebSearchToolCall =
            openaiResponseOutputMessageWebSearchToolCall.getOrThrow(
                "openaiResponseOutputMessageWebSearchToolCall"
            )

        fun asOpenAIResponseOutputMessageFileSearchToolCall():
            OpenAIResponseOutputMessageFileSearchToolCall =
            openaiResponseOutputMessageFileSearchToolCall.getOrThrow(
                "openaiResponseOutputMessageFileSearchToolCall"
            )

        fun asOpenAIResponseOutputMessageFunctionToolCall():
            OpenAIResponseOutputMessageFunctionToolCall =
            openaiResponseOutputMessageFunctionToolCall.getOrThrow(
                "openaiResponseOutputMessageFunctionToolCall"
            )

        /** This represents the output of a function call that gets passed back to the model. */
        fun asOpenAIResponseInputFunctionToolCallOutput():
            OpenAIResponseInputFunctionToolCallOutput =
            openaiResponseInputFunctionToolCallOutput.getOrThrow(
                "openaiResponseInputFunctionToolCallOutput"
            )

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        fun asOpenAIResponseMessage(): OpenAIResponseMessage =
            openaiResponseMessage.getOrThrow("openaiResponseMessage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                openaiResponseOutputMessageWebSearchToolCall != null ->
                    visitor.visitOpenAIResponseOutputMessageWebSearchToolCall(
                        openaiResponseOutputMessageWebSearchToolCall
                    )
                openaiResponseOutputMessageFileSearchToolCall != null ->
                    visitor.visitOpenAIResponseOutputMessageFileSearchToolCall(
                        openaiResponseOutputMessageFileSearchToolCall
                    )
                openaiResponseOutputMessageFunctionToolCall != null ->
                    visitor.visitOpenAIResponseOutputMessageFunctionToolCall(
                        openaiResponseOutputMessageFunctionToolCall
                    )
                openaiResponseInputFunctionToolCallOutput != null ->
                    visitor.visitOpenAIResponseInputFunctionToolCallOutput(
                        openaiResponseInputFunctionToolCallOutput
                    )
                openaiResponseMessage != null ->
                    visitor.visitOpenAIResponseMessage(openaiResponseMessage)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOpenAIResponseOutputMessageWebSearchToolCall(
                        openaiResponseOutputMessageWebSearchToolCall:
                            OpenAIResponseOutputMessageWebSearchToolCall
                    ) {
                        openaiResponseOutputMessageWebSearchToolCall.validate()
                    }

                    override fun visitOpenAIResponseOutputMessageFileSearchToolCall(
                        openaiResponseOutputMessageFileSearchToolCall:
                            OpenAIResponseOutputMessageFileSearchToolCall
                    ) {
                        openaiResponseOutputMessageFileSearchToolCall.validate()
                    }

                    override fun visitOpenAIResponseOutputMessageFunctionToolCall(
                        openaiResponseOutputMessageFunctionToolCall:
                            OpenAIResponseOutputMessageFunctionToolCall
                    ) {
                        openaiResponseOutputMessageFunctionToolCall.validate()
                    }

                    override fun visitOpenAIResponseInputFunctionToolCallOutput(
                        openaiResponseInputFunctionToolCallOutput:
                            OpenAIResponseInputFunctionToolCallOutput
                    ) {
                        openaiResponseInputFunctionToolCallOutput.validate()
                    }

                    override fun visitOpenAIResponseMessage(
                        openaiResponseMessage: OpenAIResponseMessage
                    ) {
                        openaiResponseMessage.validate()
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
                    override fun visitOpenAIResponseOutputMessageWebSearchToolCall(
                        openaiResponseOutputMessageWebSearchToolCall:
                            OpenAIResponseOutputMessageWebSearchToolCall
                    ) = openaiResponseOutputMessageWebSearchToolCall.validity()

                    override fun visitOpenAIResponseOutputMessageFileSearchToolCall(
                        openaiResponseOutputMessageFileSearchToolCall:
                            OpenAIResponseOutputMessageFileSearchToolCall
                    ) = openaiResponseOutputMessageFileSearchToolCall.validity()

                    override fun visitOpenAIResponseOutputMessageFunctionToolCall(
                        openaiResponseOutputMessageFunctionToolCall:
                            OpenAIResponseOutputMessageFunctionToolCall
                    ) = openaiResponseOutputMessageFunctionToolCall.validity()

                    override fun visitOpenAIResponseInputFunctionToolCallOutput(
                        openaiResponseInputFunctionToolCallOutput:
                            OpenAIResponseInputFunctionToolCallOutput
                    ) = openaiResponseInputFunctionToolCallOutput.validity()

                    override fun visitOpenAIResponseMessage(
                        openaiResponseMessage: OpenAIResponseMessage
                    ) = openaiResponseMessage.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && openaiResponseOutputMessageWebSearchToolCall == other.openaiResponseOutputMessageWebSearchToolCall && openaiResponseOutputMessageFileSearchToolCall == other.openaiResponseOutputMessageFileSearchToolCall && openaiResponseOutputMessageFunctionToolCall == other.openaiResponseOutputMessageFunctionToolCall && openaiResponseInputFunctionToolCallOutput == other.openaiResponseInputFunctionToolCallOutput && openaiResponseMessage == other.openaiResponseMessage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(openaiResponseOutputMessageWebSearchToolCall, openaiResponseOutputMessageFileSearchToolCall, openaiResponseOutputMessageFunctionToolCall, openaiResponseInputFunctionToolCallOutput, openaiResponseMessage) /* spotless:on */

        override fun toString(): String =
            when {
                openaiResponseOutputMessageWebSearchToolCall != null ->
                    "Data{openaiResponseOutputMessageWebSearchToolCall=$openaiResponseOutputMessageWebSearchToolCall}"
                openaiResponseOutputMessageFileSearchToolCall != null ->
                    "Data{openaiResponseOutputMessageFileSearchToolCall=$openaiResponseOutputMessageFileSearchToolCall}"
                openaiResponseOutputMessageFunctionToolCall != null ->
                    "Data{openaiResponseOutputMessageFunctionToolCall=$openaiResponseOutputMessageFunctionToolCall}"
                openaiResponseInputFunctionToolCallOutput != null ->
                    "Data{openaiResponseInputFunctionToolCallOutput=$openaiResponseInputFunctionToolCallOutput}"
                openaiResponseMessage != null ->
                    "Data{openaiResponseMessage=$openaiResponseMessage}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            fun ofOpenAIResponseOutputMessageWebSearchToolCall(
                openaiResponseOutputMessageWebSearchToolCall:
                    OpenAIResponseOutputMessageWebSearchToolCall
            ) =
                Data(
                    openaiResponseOutputMessageWebSearchToolCall =
                        openaiResponseOutputMessageWebSearchToolCall
                )

            fun ofOpenAIResponseOutputMessageFileSearchToolCall(
                openaiResponseOutputMessageFileSearchToolCall:
                    OpenAIResponseOutputMessageFileSearchToolCall
            ) =
                Data(
                    openaiResponseOutputMessageFileSearchToolCall =
                        openaiResponseOutputMessageFileSearchToolCall
                )

            fun ofOpenAIResponseOutputMessageFunctionToolCall(
                openaiResponseOutputMessageFunctionToolCall:
                    OpenAIResponseOutputMessageFunctionToolCall
            ) =
                Data(
                    openaiResponseOutputMessageFunctionToolCall =
                        openaiResponseOutputMessageFunctionToolCall
                )

            /** This represents the output of a function call that gets passed back to the model. */
            fun ofOpenAIResponseInputFunctionToolCallOutput(
                openaiResponseInputFunctionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput
            ) =
                Data(
                    openaiResponseInputFunctionToolCallOutput =
                        openaiResponseInputFunctionToolCallOutput
                )

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun ofOpenAIResponseMessage(openaiResponseMessage: OpenAIResponseMessage) =
                Data(openaiResponseMessage = openaiResponseMessage)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOpenAIResponseOutputMessageWebSearchToolCall(
                openaiResponseOutputMessageWebSearchToolCall:
                    OpenAIResponseOutputMessageWebSearchToolCall
            ): T

            fun visitOpenAIResponseOutputMessageFileSearchToolCall(
                openaiResponseOutputMessageFileSearchToolCall:
                    OpenAIResponseOutputMessageFileSearchToolCall
            ): T

            fun visitOpenAIResponseOutputMessageFunctionToolCall(
                openaiResponseOutputMessageFunctionToolCall:
                    OpenAIResponseOutputMessageFunctionToolCall
            ): T

            /** This represents the output of a function call that gets passed back to the model. */
            fun visitOpenAIResponseInputFunctionToolCallOutput(
                openaiResponseInputFunctionToolCallOutput: OpenAIResponseInputFunctionToolCallOutput
            ): T

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun visitOpenAIResponseMessage(openaiResponseMessage: OpenAIResponseMessage): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<OpenAIResponseOutputMessageWebSearchToolCall>(),
                                )
                                ?.let {
                                    Data(
                                        openaiResponseOutputMessageWebSearchToolCall = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<OpenAIResponseOutputMessageFileSearchToolCall>(),
                                )
                                ?.let {
                                    Data(
                                        openaiResponseOutputMessageFileSearchToolCall = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<OpenAIResponseOutputMessageFunctionToolCall>(),
                                )
                                ?.let {
                                    Data(
                                        openaiResponseOutputMessageFunctionToolCall = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<OpenAIResponseInputFunctionToolCallOutput>(),
                                )
                                ?.let {
                                    Data(
                                        openaiResponseInputFunctionToolCallOutput = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<OpenAIResponseMessage>())?.let {
                                Data(openaiResponseMessage = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.openaiResponseOutputMessageWebSearchToolCall != null ->
                        generator.writeObject(value.openaiResponseOutputMessageWebSearchToolCall)
                    value.openaiResponseOutputMessageFileSearchToolCall != null ->
                        generator.writeObject(value.openaiResponseOutputMessageFileSearchToolCall)
                    value.openaiResponseOutputMessageFunctionToolCall != null ->
                        generator.writeObject(value.openaiResponseOutputMessageFunctionToolCall)
                    value.openaiResponseInputFunctionToolCallOutput != null ->
                        generator.writeObject(value.openaiResponseInputFunctionToolCallOutput)
                    value.openaiResponseMessage != null ->
                        generator.writeObject(value.openaiResponseMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
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
                 * Returns an immutable instance of [OpenAIResponseOutputMessageWebSearchToolCall].
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
                 * Returns an immutable instance of [OpenAIResponseOutputMessageFileSearchToolCall].
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
                 * Returns an immutable instance of [OpenAIResponseOutputMessageFunctionToolCall].
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
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(callId, output, type, id, status, mutableMapOf())

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
             * Returns the raw JSON value of [callId].
             *
             * Unlike [callId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

            /**
             * Returns the raw JSON value of [output].
             *
             * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                fun output(output: String) = output(JsonField.of(output))

                /**
                 * Sets [Builder.output] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.output] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun output(output: JsonField<String>) = apply { this.output = output }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
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
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
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
                    additionalProperties = openaiResponseMessage.additionalProperties.toMutableMap()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseInputItemListResponse && data == other.data && object_ == other.object_ && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, object_, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponseInputItemListResponse{data=$data, object_=$object_, additionalProperties=$additionalProperties}"
}
