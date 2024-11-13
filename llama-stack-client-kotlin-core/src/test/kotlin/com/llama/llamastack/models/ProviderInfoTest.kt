// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderInfoTest {

    @Test
    fun createProviderInfo() {
        val providerInfo =
            ProviderInfo.builder().providerId("provider_id").providerType("provider_type").build()
        assertThat(providerInfo).isNotNull
        assertThat(providerInfo.providerId()).isEqualTo("provider_id")
        assertThat(providerInfo.providerType()).isEqualTo("provider_type")
    }
}
