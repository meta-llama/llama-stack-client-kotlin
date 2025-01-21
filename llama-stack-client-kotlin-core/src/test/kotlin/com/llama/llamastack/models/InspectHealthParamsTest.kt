// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.junit.jupiter.api.Test

class InspectHealthParamsTest {

    @Test
    fun createInspectHealthParams() {
        InspectHealthParams.builder()
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }
}
