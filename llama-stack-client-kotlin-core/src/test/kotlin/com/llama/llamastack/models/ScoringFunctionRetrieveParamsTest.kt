// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringFunctionRetrieveParamsTest {

    @Test
    fun createScoringFunctionRetrieveParams() {
        ScoringFunctionRetrieveParams.builder().scoringFnId("scoring_fn_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = ScoringFunctionRetrieveParams.builder().scoringFnId("scoring_fn_id").build()
        val expected = QueryParams.builder()
        expected.put("scoring_fn_id", "scoring_fn_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ScoringFunctionRetrieveParams.builder().scoringFnId("scoring_fn_id").build()
        val expected = QueryParams.builder()
        expected.put("scoring_fn_id", "scoring_fn_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
