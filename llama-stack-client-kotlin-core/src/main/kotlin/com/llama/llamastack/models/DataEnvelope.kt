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
import com.llama.llamastack.core.contentEquals
import com.llama.llamastack.core.contentHash
import com.llama.llamastack.core.contentToString
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections

class DataEnvelope<T : Any>
private constructor(
    private val data: JsonField<T>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<T> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    fun data(): T = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<T> = data

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    private var validated: Boolean = false

    fun validate(): DataEnvelope<T> = apply {
        if (validated) {
            return@apply
        }

        data()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    fun toBuilder() = Builder<T>().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataEnvelope<*> && data contentEquals other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ contentHash(data, additionalProperties) /* spotless:on */

    override fun toString() =
        "DataEnvelope{data=${data.contentToString()}, additionalProperties=$additionalProperties}"

    companion object {

        fun <T : Any> builder() = Builder<T>()
    }

    class Builder<T : Any> {

        private var data: JsonField<T> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(DataEnvelope: DataEnvelope<T>) = apply {
            this.data = DataEnvelope.data
            this.additionalProperties.putAll(DataEnvelope.additionalProperties)
        }

        fun data(data: T) = data(JsonField.of(data))

        fun data(data: JsonField<T>) = apply { this.data = data }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun build() = DataEnvelope(data, additionalProperties.toMutableMap())
    }
}
