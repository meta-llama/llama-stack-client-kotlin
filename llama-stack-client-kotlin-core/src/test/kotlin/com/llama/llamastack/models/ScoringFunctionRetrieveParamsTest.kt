// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringFunctionRetrieveParamsTest {

    @Test
    fun createScoringFunctionRetrieveParams() {
        ScoringFunctionRetrieveParams.builder()
            .scoringFnId("scoring_fn_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getPathParam() {
        val params = ScoringFunctionRetrieveParams.builder().scoringFnId("scoring_fn_id").build()
        assertThat(params).isNotNull
        // path param "scoringFnId"
        assertThat(params.getPathParam(0)).isEqualTo("scoring_fn_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
