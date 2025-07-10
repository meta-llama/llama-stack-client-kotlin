// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreSearchResponseTest {

    @Test
    fun create() {
        val vectorStoreSearchResponse =
            VectorStoreSearchResponse.builder()
                .addData(
                    VectorStoreSearchResponse.Data.builder()
                        .addContent(
                            VectorStoreSearchResponse.Data.Content.builder().text("text").build()
                        )
                        .fileId("file_id")
                        .filename("filename")
                        .score(0.0)
                        .attributes(
                            VectorStoreSearchResponse.Data.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .object_("object")
                .searchQuery("search_query")
                .nextPage("next_page")
                .build()

        assertThat(vectorStoreSearchResponse.data())
            .containsExactly(
                VectorStoreSearchResponse.Data.builder()
                    .addContent(
                        VectorStoreSearchResponse.Data.Content.builder().text("text").build()
                    )
                    .fileId("file_id")
                    .filename("filename")
                    .score(0.0)
                    .attributes(
                        VectorStoreSearchResponse.Data.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(vectorStoreSearchResponse.hasMore()).isEqualTo(true)
        assertThat(vectorStoreSearchResponse.object_()).isEqualTo("object")
        assertThat(vectorStoreSearchResponse.searchQuery()).isEqualTo("search_query")
        assertThat(vectorStoreSearchResponse.nextPage()).isEqualTo("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorStoreSearchResponse =
            VectorStoreSearchResponse.builder()
                .addData(
                    VectorStoreSearchResponse.Data.builder()
                        .addContent(
                            VectorStoreSearchResponse.Data.Content.builder().text("text").build()
                        )
                        .fileId("file_id")
                        .filename("filename")
                        .score(0.0)
                        .attributes(
                            VectorStoreSearchResponse.Data.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .object_("object")
                .searchQuery("search_query")
                .nextPage("next_page")
                .build()

        val roundtrippedVectorStoreSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorStoreSearchResponse),
                jacksonTypeRef<VectorStoreSearchResponse>(),
            )

        assertThat(roundtrippedVectorStoreSearchResponse).isEqualTo(vectorStoreSearchResponse)
    }
}
