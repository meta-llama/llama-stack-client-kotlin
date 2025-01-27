// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VectorDbRetrieveParamsTest {

    @Test
    fun createVectorDbRetrieveParams() {
        VectorDbRetrieveParams.builder()
            .vectorDbId("vector_db_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getPathParam() {
        val params = VectorDbRetrieveParams.builder().vectorDbId("vector_db_id").build()
        assertThat(params).isNotNull
        // path param "vectorDbId"
        assertThat(params.getPathParam(0)).isEqualTo("vector_db_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
