// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRoutesResponseTest {

    @Test
    fun create() {
        val listRoutesResponse =
            ListRoutesResponse.builder()
                .addData(
                    RouteInfo.builder()
                        .method("method")
                        .addProviderType("string")
                        .route("route")
                        .build()
                )
                .build()

        assertThat(listRoutesResponse.data())
            .containsExactly(
                RouteInfo.builder()
                    .method("method")
                    .addProviderType("string")
                    .route("route")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listRoutesResponse =
            ListRoutesResponse.builder()
                .addData(
                    RouteInfo.builder()
                        .method("method")
                        .addProviderType("string")
                        .route("route")
                        .build()
                )
                .build()

        val roundtrippedListRoutesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listRoutesResponse),
                jacksonTypeRef<ListRoutesResponse>(),
            )

        assertThat(roundtrippedListRoutesResponse).isEqualTo(listRoutesResponse)
    }
}
