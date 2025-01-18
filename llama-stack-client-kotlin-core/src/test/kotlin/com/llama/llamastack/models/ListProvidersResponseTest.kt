// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListProvidersResponseTest {

    @Test
    fun createListProvidersResponse() {
        val listProvidersResponse =
            ListProvidersResponse.builder()
                .data(
                    listOf(
                        ProviderInfo.builder()
                            .api("api")
                            .providerId("provider_id")
                            .providerType("provider_type")
                            .build()
                    )
                )
                .build()
        assertThat(listProvidersResponse).isNotNull
        assertThat(listProvidersResponse.data())
            .containsExactly(
                ProviderInfo.builder()
                    .api("api")
                    .providerId("provider_id")
                    .providerType("provider_type")
                    .build()
            )
    }
}
