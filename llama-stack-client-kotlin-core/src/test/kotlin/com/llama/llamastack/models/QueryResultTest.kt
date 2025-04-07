// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryResultTest {

    @Test
    fun create() {
        val queryResult =
            QueryResult.builder()
                .metadata(
                    QueryResult.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .content("string")
                .build()

        assertThat(queryResult.metadata())
            .isEqualTo(
                QueryResult.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(queryResult.content()).isEqualTo(InterleavedContent.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryResult =
            QueryResult.builder()
                .metadata(
                    QueryResult.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .content("string")
                .build()

        val roundtrippedQueryResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryResult),
                jacksonTypeRef<QueryResult>(),
            )

        assertThat(roundtrippedQueryResult).isEqualTo(queryResult)
    }
}
