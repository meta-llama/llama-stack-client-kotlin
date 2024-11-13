// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderListResponseTest {

    @Test
    fun createProviderListResponse() {
        val providerListResponse = ProviderListResponse.builder().build()
        assertThat(providerListResponse).isNotNull
    }
}
