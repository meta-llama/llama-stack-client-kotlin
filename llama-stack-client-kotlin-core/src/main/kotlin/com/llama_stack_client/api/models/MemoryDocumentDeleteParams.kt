// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.models.*
import java.util.Objects

class MemoryDocumentDeleteParams
constructor(
    private val bankId: String,
    private val documentIds: List<String>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun bankId(): String = bankId

    fun documentIds(): List<String> = documentIds

    internal fun getBody(): MemoryDocumentDeleteBody {
        return MemoryDocumentDeleteBody(
            bankId,
            documentIds,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = MemoryDocumentDeleteBody.Builder::class)
    @NoAutoDetect
    class MemoryDocumentDeleteBody
    internal constructor(
        private val bankId: String?,
        private val documentIds: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("bank_id") fun bankId(): String? = bankId

        @JsonProperty("document_ids") fun documentIds(): List<String>? = documentIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MemoryDocumentDeleteBody &&
                this.bankId == other.bankId &&
                this.documentIds == other.documentIds &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        bankId,
                        documentIds,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "MemoryDocumentDeleteBody{bankId=$bankId, documentIds=$documentIds, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bankId: String? = null
            private var documentIds: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(memoryDocumentDeleteBody: MemoryDocumentDeleteBody) = apply {
                this.bankId = memoryDocumentDeleteBody.bankId
                this.documentIds = memoryDocumentDeleteBody.documentIds
                additionalProperties(memoryDocumentDeleteBody.additionalProperties)
            }

            @JsonProperty("bank_id") fun bankId(bankId: String) = apply { this.bankId = bankId }

            @JsonProperty("document_ids")
            fun documentIds(documentIds: List<String>) = apply { this.documentIds = documentIds }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): MemoryDocumentDeleteBody =
                MemoryDocumentDeleteBody(
                    checkNotNull(bankId) { "`bankId` is required but was not set" },
                    checkNotNull(documentIds) { "`documentIds` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemoryDocumentDeleteParams &&
            this.bankId == other.bankId &&
            this.documentIds == other.documentIds &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bankId,
            documentIds,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "MemoryDocumentDeleteParams{bankId=$bankId, documentIds=$documentIds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bankId: String? = null
        private var documentIds: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryDocumentDeleteParams: MemoryDocumentDeleteParams) = apply {
            this.bankId = memoryDocumentDeleteParams.bankId
            this.documentIds(memoryDocumentDeleteParams.documentIds)
            additionalQueryParams(memoryDocumentDeleteParams.additionalQueryParams)
            additionalHeaders(memoryDocumentDeleteParams.additionalHeaders)
            additionalBodyProperties(memoryDocumentDeleteParams.additionalBodyProperties)
        }

        fun bankId(bankId: String) = apply { this.bankId = bankId }

        fun documentIds(documentIds: List<String>) = apply {
            this.documentIds.clear()
            this.documentIds.addAll(documentIds)
        }

        fun addDocumentId(documentId: String) = apply { this.documentIds.add(documentId) }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): MemoryDocumentDeleteParams =
            MemoryDocumentDeleteParams(
                checkNotNull(bankId) { "`bankId` is required but was not set" },
                checkNotNull(documentIds) { "`documentIds` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
