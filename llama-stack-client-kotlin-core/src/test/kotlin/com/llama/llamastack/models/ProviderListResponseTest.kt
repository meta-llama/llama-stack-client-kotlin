// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderListResponseTest {

    @Test
    fun createProviderListResponse() {
        val providerListResponse =
            ProviderListResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf("provider_id" to "provider_id", "provider_type" to "provider_type")
                    )
                )
                .build()
        assertThat(providerListResponse).isNotNull
    }
}
