// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryQueryTracesParamsTest {

    @Test
    fun createTelemetryQueryTracesParams() {
        TelemetryQueryTracesParams.builder()
            .addAttributeFilter(
                QueryCondition.builder()
                    .key("key")
                    .op(QueryCondition.Op.EQ)
                    .value(QueryCondition.Value.ofBoolean(true))
                    .build()
            )
            .limit(0L)
            .offset(0L)
            .addOrderBy("string")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TelemetryQueryTracesParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
