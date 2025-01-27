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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class PaginatedRowsResult
@JsonCreator
private constructor(
    @JsonProperty("rows") @ExcludeMissing private val rows: JsonField<List<Row>> = JsonMissing.of(),
    @JsonProperty("total_count")
    @ExcludeMissing
    private val totalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("next_page_token")
    @ExcludeMissing
    private val nextPageToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun rows(): List<Row> = rows.getRequired("rows")

    fun totalCount(): Long = totalCount.getRequired("total_count")

    fun nextPageToken(): String? = nextPageToken.getNullable("next_page_token")

    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaginatedRowsResult = apply {
        if (validated) {
            return@apply
        }

        rows().forEach { it.validate() }
        totalCount()
        nextPageToken()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var rows: JsonField<MutableList<Row>>? = null
        private var totalCount: JsonField<Long>? = null
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paginatedRowsResult: PaginatedRowsResult) = apply {
            rows = paginatedRowsResult.rows.map { it.toMutableList() }
            totalCount = paginatedRowsResult.totalCount
            nextPageToken = paginatedRowsResult.nextPageToken
            additionalProperties = paginatedRowsResult.additionalProperties.toMutableMap()
        }

        fun rows(rows: List<Row>) = rows(JsonField.of(rows))

        fun rows(rows: JsonField<List<Row>>) = apply { this.rows = rows.map { it.toMutableList() } }

        fun addRow(row: Row) = apply {
            rows =
                (rows ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(row)
                }
        }

        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        fun nextPageToken(nextPageToken: String) = nextPageToken(JsonField.of(nextPageToken))

        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
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

        fun build(): PaginatedRowsResult =
            PaginatedRowsResult(
                checkRequired("rows", rows).map { it.toImmutable() },
                checkRequired("totalCount", totalCount),
                nextPageToken,
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

        return /* spotless:off */ other is PaginatedRowsResult && rows == other.rows && totalCount == other.totalCount && nextPageToken == other.nextPageToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(rows, totalCount, nextPageToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaginatedRowsResult{rows=$rows, totalCount=$totalCount, nextPageToken=$nextPageToken, additionalProperties=$additionalProperties}"
}
