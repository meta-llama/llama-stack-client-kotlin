// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryResultTest {

    @Test
    fun createQueryResult() {
        val queryResult =
            QueryResult.builder()
                .metadata(
                    QueryResult.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .content("string")
                .build()
        assertThat(queryResult).isNotNull
        assertThat(queryResult.metadata())
            .isEqualTo(
                QueryResult.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(queryResult.content()).isEqualTo(InterleavedContent.ofString("string"))
    }
}
