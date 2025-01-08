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
class PaginatedRowsResult
@JsonCreator
private constructor(
    @JsonProperty("next_page_token")
    @ExcludeMissing
    private val nextPageToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("rows") @ExcludeMissing private val rows: JsonField<List<Row>> = JsonMissing.of(),
    @JsonProperty("total_count")
    @ExcludeMissing
    private val totalCount: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun nextPageToken(): String? = nextPageToken.getNullable("next_page_token")

    fun rows(): List<Row> = rows.getRequired("rows")

    fun totalCount(): Long = totalCount.getRequired("total_count")

    @JsonProperty("next_page_token") @ExcludeMissing fun _nextPageToken() = nextPageToken

    @JsonProperty("rows") @ExcludeMissing fun _rows() = rows

    @JsonProperty("total_count") @ExcludeMissing fun _totalCount() = totalCount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaginatedRowsResult = apply {
        if (!validated) {
            nextPageToken()
            rows().forEach { it.validate() }
            totalCount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var rows: JsonField<List<Row>> = JsonMissing.of()
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paginatedRowsResult: PaginatedRowsResult) = apply {
            nextPageToken = paginatedRowsResult.nextPageToken
            rows = paginatedRowsResult.rows
            totalCount = paginatedRowsResult.totalCount
            additionalProperties = paginatedRowsResult.additionalProperties.toMutableMap()
        }

        fun nextPageToken(nextPageToken: String) = nextPageToken(JsonField.of(nextPageToken))

        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
        }

        fun rows(rows: List<Row>) = rows(JsonField.of(rows))

        fun rows(rows: JsonField<List<Row>>) = apply { this.rows = rows }

        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

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

        fun build(): PaginatedRowsResult =
            PaginatedRowsResult(
                nextPageToken,
                rows.map { it.toImmutable() },
                totalCount,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Row
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Row = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(row: Row) = apply {
                additionalProperties = row.additionalProperties.toMutableMap()
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

            fun build(): Row = Row(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Row && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Row{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaginatedRowsResult && nextPageToken == other.nextPageToken && rows == other.rows && totalCount == other.totalCount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(nextPageToken, rows, totalCount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaginatedRowsResult{nextPageToken=$nextPageToken, rows=$rows, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
