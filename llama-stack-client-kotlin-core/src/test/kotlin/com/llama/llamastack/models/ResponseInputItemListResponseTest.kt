// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseInputItemListResponseTest {

    @Test
    fun create() {
        val responseInputItemListResponse =
            ResponseInputItemListResponse.builder()
                .addData(
                    ResponseInputItemListResponse.Data.OpenAIResponseOutputMessageWebSearchToolCall
                        .builder()
                        .id("id")
                        .status("status")
                        .build()
                )
                .build()

        assertThat(responseInputItemListResponse.data())
            .containsExactly(
                ResponseInputItemListResponse.Data.ofOpenAIResponseOutputMessageWebSearchToolCall(
                    ResponseInputItemListResponse.Data.OpenAIResponseOutputMessageWebSearchToolCall
                        .builder()
                        .id("id")
                        .status("status")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseInputItemListResponse =
            ResponseInputItemListResponse.builder()
                .addData(
                    ResponseInputItemListResponse.Data.OpenAIResponseOutputMessageWebSearchToolCall
                        .builder()
                        .id("id")
                        .status("status")
                        .build()
                )
                .build()

        val roundtrippedResponseInputItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseInputItemListResponse),
                jacksonTypeRef<ResponseInputItemListResponse>(),
            )

        assertThat(roundtrippedResponseInputItemListResponse)
            .isEqualTo(responseInputItemListResponse)
    }
}
