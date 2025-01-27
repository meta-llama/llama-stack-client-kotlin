// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class SyntheticDataGenerationGenerateParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: SyntheticDataGenerationGenerateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun dialogs(): List<Message> = body.dialogs()

    fun filteringFunction(): FilteringFunction = body.filteringFunction()

    fun model(): String? = body.model()

    fun _dialogs(): JsonField<List<Message>> = body._dialogs()

    fun _filteringFunction(): JsonField<FilteringFunction> = body._filteringFunction()

    fun _model(): JsonField<String> = body._model()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): SyntheticDataGenerationGenerateBody = body

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

    @NoAutoDetect
    class SyntheticDataGenerationGenerateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("dialogs")
        @ExcludeMissing
        private val dialogs: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("filtering_function")
        @ExcludeMissing
        private val filteringFunction: JsonField<FilteringFunction> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun dialogs(): List<Message> = dialogs.getRequired("dialogs")

        fun filteringFunction(): FilteringFunction =
            filteringFunction.getRequired("filtering_function")

        fun model(): String? = model.getNullable("model")

        @JsonProperty("dialogs") @ExcludeMissing fun _dialogs(): JsonField<List<Message>> = dialogs

        @JsonProperty("filtering_function")
        @ExcludeMissing
        fun _filteringFunction(): JsonField<FilteringFunction> = filteringFunction

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SyntheticDataGenerationGenerateBody = apply {
            if (validated) {
                return@apply
            }

            dialogs().forEach { it.validate() }
            filteringFunction()
            model()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var dialogs: JsonField<MutableList<Message>>? = null
            private var filteringFunction: JsonField<FilteringFunction>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                syntheticDataGenerationGenerateBody: SyntheticDataGenerationGenerateBody
            ) = apply {
                dialogs = syntheticDataGenerationGenerateBody.dialogs.map { it.toMutableList() }
                filteringFunction = syntheticDataGenerationGenerateBody.filteringFunction
                model = syntheticDataGenerationGenerateBody.model
                additionalProperties =
                    syntheticDataGenerationGenerateBody.additionalProperties.toMutableMap()
            }

            fun dialogs(dialogs: List<Message>) = dialogs(JsonField.of(dialogs))

            fun dialogs(dialogs: JsonField<List<Message>>) = apply {
                this.dialogs = dialogs.map { it.toMutableList() }
            }

            fun addDialog(dialog: Message) = apply {
                dialogs =
                    (dialogs ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(dialog)
                    }
            }

            fun addDialog(user: UserMessage) = addDialog(Message.ofUser(user))

            fun addDialog(system: SystemMessage) = addDialog(Message.ofSystem(system))

            fun addDialog(toolResponse: ToolResponseMessage) =
                addDialog(Message.ofToolResponse(toolResponse))

            fun addDialog(completion: CompletionMessage) =
                addDialog(Message.ofCompletion(completion))

            fun filteringFunction(filteringFunction: FilteringFunction) =
                filteringFunction(JsonField.of(filteringFunction))

            fun filteringFunction(filteringFunction: JsonField<FilteringFunction>) = apply {
                this.filteringFunction = filteringFunction
            }

            fun model(model: String) = model(JsonField.of(model))

            fun model(model: JsonField<String>) = apply { this.model = model }

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

            fun build(): SyntheticDataGenerationGenerateBody =
                SyntheticDataGenerationGenerateBody(
                    checkRequired("dialogs", dialogs).map { it.toImmutable() },
                    checkRequired("filteringFunction", filteringFunction),
                    model,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SyntheticDataGenerationGenerateBody && dialogs == other.dialogs && filteringFunction == other.filteringFunction && model == other.model && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dialogs, filteringFunction, model, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SyntheticDataGenerationGenerateBody{dialogs=$dialogs, filteringFunction=$filteringFunction, model=$model, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: SyntheticDataGenerationGenerateBody.Builder =
            SyntheticDataGenerationGenerateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            syntheticDataGenerationGenerateParams: SyntheticDataGenerationGenerateParams
        ) = apply {
            xLlamaStackClientVersion =
                syntheticDataGenerationGenerateParams.xLlamaStackClientVersion
            xLlamaStackProviderData = syntheticDataGenerationGenerateParams.xLlamaStackProviderData
            body = syntheticDataGenerationGenerateParams.body.toBuilder()
            additionalHeaders = syntheticDataGenerationGenerateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                syntheticDataGenerationGenerateParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun dialogs(dialogs: List<Message>) = apply { body.dialogs(dialogs) }

        fun dialogs(dialogs: JsonField<List<Message>>) = apply { body.dialogs(dialogs) }

        fun addDialog(dialog: Message) = apply { body.addDialog(dialog) }

        fun addDialog(user: UserMessage) = apply { body.addDialog(user) }

        fun addDialog(system: SystemMessage) = apply { body.addDialog(system) }

        fun addDialog(toolResponse: ToolResponseMessage) = apply { body.addDialog(toolResponse) }

        fun addDialog(completion: CompletionMessage) = apply { body.addDialog(completion) }

        fun filteringFunction(filteringFunction: FilteringFunction) = apply {
            body.filteringFunction(filteringFunction)
        }

        fun filteringFunction(filteringFunction: JsonField<FilteringFunction>) = apply {
            body.filteringFunction(filteringFunction)
        }

        fun model(model: String) = apply { body.model(model) }

        fun model(model: JsonField<String>) = apply { body.model(model) }

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

        fun build(): SyntheticDataGenerationGenerateParams =
            SyntheticDataGenerationGenerateParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class FilteringFunction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val NONE = of("none")

            val RANDOM = of("random")

            val TOP_K = of("top_k")

            val TOP_P = of("top_p")

            val TOP_K_TOP_P = of("top_k_top_p")

            val SIGMOID = of("sigmoid")

            fun of(value: String) = FilteringFunction(JsonField.of(value))
        }

        enum class Known {
            NONE,
            RANDOM,
            TOP_K,
            TOP_P,
            TOP_K_TOP_P,
            SIGMOID,
        }

        enum class Value {
            NONE,
            RANDOM,
            TOP_K,
            TOP_P,
            TOP_K_TOP_P,
            SIGMOID,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NONE -> Value.NONE
                RANDOM -> Value.RANDOM
                TOP_K -> Value.TOP_K
                TOP_P -> Value.TOP_P
                TOP_K_TOP_P -> Value.TOP_K_TOP_P
                SIGMOID -> Value.SIGMOID
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NONE -> Known.NONE
                RANDOM -> Known.RANDOM
                TOP_K -> Known.TOP_K
                TOP_P -> Known.TOP_P
                TOP_K_TOP_P -> Known.TOP_K_TOP_P
                SIGMOID -> Known.SIGMOID
                else ->
                    throw LlamaStackClientInvalidDataException("Unknown FilteringFunction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FilteringFunction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SyntheticDataGenerationGenerateParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SyntheticDataGenerationGenerateParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
