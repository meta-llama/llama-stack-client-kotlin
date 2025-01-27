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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class DataEnvelope<T : Any>
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<T> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): T = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<T> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DataEnvelope<T> = apply {
        if (validated) {
            return@apply
        }

        data()
        validated = true
    }

    fun toBuilder() = Builder<T>().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataEnvelope<*> && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, additionalProperties) /* spotless:on */

    override fun toString() = "DataEnvelope{data=$data, additionalProperties=$additionalProperties}"

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

        fun build() = DataEnvelope(data, additionalProperties.toImmutable())
    }
}
