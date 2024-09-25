// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class MemoryBankGetParams
constructor(
    private val bankType: BankType,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun bankType(): BankType = bankType

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.bankType.let { params.put("bank_type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemoryBankGetParams &&
            this.bankType == other.bankType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bankType,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "MemoryBankGetParams{bankType=$bankType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bankType: BankType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(memoryBankGetParams: MemoryBankGetParams) = apply {
            this.bankType = memoryBankGetParams.bankType
            additionalQueryParams(memoryBankGetParams.additionalQueryParams)
            additionalHeaders(memoryBankGetParams.additionalHeaders)
        }

        fun bankType(bankType: BankType) = apply { this.bankType = bankType }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): MemoryBankGetParams =
            MemoryBankGetParams(
                checkNotNull(bankType) { "`bankType` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class BankType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BankType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val VECTOR = BankType(JsonField.of("vector"))

            val KEYVALUE = BankType(JsonField.of("keyvalue"))

            val KEYWORD = BankType(JsonField.of("keyword"))

            val GRAPH = BankType(JsonField.of("graph"))

            fun of(value: String) = BankType(JsonField.of(value))
        }

        enum class Known {
            VECTOR,
            KEYVALUE,
            KEYWORD,
            GRAPH,
        }

        enum class Value {
            VECTOR,
            KEYVALUE,
            KEYWORD,
            GRAPH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                VECTOR -> Value.VECTOR
                KEYVALUE -> Value.KEYVALUE
                KEYWORD -> Value.KEYWORD
                GRAPH -> Value.GRAPH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                VECTOR -> Known.VECTOR
                KEYVALUE -> Known.KEYVALUE
                KEYWORD -> Known.KEYWORD
                GRAPH -> Known.GRAPH
                else -> throw LlamaStackClientInvalidDataException("Unknown BankType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
