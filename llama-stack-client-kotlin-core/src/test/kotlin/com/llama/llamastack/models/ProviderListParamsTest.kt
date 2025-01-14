// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.junit.jupiter.api.Test

class ProviderListParamsTest {

    @Test
    fun createProviderListParams() {
        ProviderListParams.builder()
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }
}
