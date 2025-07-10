// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreSearchParamsTest {

    @Test
    fun create() {
        VectorStoreSearchParams.builder()
            .vectorStoreId("vector_store_id")
            .query("string")
            .filters(
                VectorStoreSearchParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .maxNumResults(0L)
            .rankingOptions(
                VectorStoreSearchParams.RankingOptions.builder()
                    .ranker("ranker")
                    .scoreThreshold(0.0)
                    .build()
            )
            .rewriteQuery(true)
            .searchMode("search_mode")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VectorStoreSearchParams.builder()
                .vectorStoreId("vector_store_id")
                .query("string")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("vector_store_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VectorStoreSearchParams.builder()
                .vectorStoreId("vector_store_id")
                .query("string")
                .filters(
                    VectorStoreSearchParams.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .maxNumResults(0L)
                .rankingOptions(
                    VectorStoreSearchParams.RankingOptions.builder()
                        .ranker("ranker")
                        .scoreThreshold(0.0)
                        .build()
                )
                .rewriteQuery(true)
                .searchMode("search_mode")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo(VectorStoreSearchParams.Query.ofString("string"))
        assertThat(body.filters())
            .isEqualTo(
                VectorStoreSearchParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.maxNumResults()).isEqualTo(0L)
        assertThat(body.rankingOptions())
            .isEqualTo(
                VectorStoreSearchParams.RankingOptions.builder()
                    .ranker("ranker")
                    .scoreThreshold(0.0)
                    .build()
            )
        assertThat(body.rewriteQuery()).isEqualTo(true)
        assertThat(body.searchMode()).isEqualTo("search_mode")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VectorStoreSearchParams.builder()
                .vectorStoreId("vector_store_id")
                .query("string")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo(VectorStoreSearchParams.Query.ofString("string"))
    }
}
