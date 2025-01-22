// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListRoutesResponseTest {

    @Test
    fun createListRoutesResponse() {
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
        assertThat(listRoutesResponse).isNotNull
        assertThat(listRoutesResponse.data())
            .containsExactly(
                RouteInfo.builder()
                    .method("method")
                    .addProviderType("string")
                    .route("route")
                    .build()
            )
    }
}
