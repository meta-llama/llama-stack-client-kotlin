// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalTaskRetrieveParamsTest {

    @Test
    fun createEvalTaskRetrieveParams() {
        EvalTaskRetrieveParams.builder()
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .name("name")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EvalTaskRetrieveParams.builder()
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .name("name")
                .build()
        val expected = QueryParams.builder()
        expected.put("name", "name")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EvalTaskRetrieveParams.builder().name("name").build()
        val expected = QueryParams.builder()
        expected.put("name", "name")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
