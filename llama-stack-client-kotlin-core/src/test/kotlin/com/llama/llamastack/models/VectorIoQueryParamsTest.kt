// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VectorIoQueryParamsTest {

    @Test
    fun createVectorIoQueryParams() {
        VectorIoQueryParams.builder()
            .query("string")
            .vectorDbId("vector_db_id")
            .params(
                VectorIoQueryParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            VectorIoQueryParams.builder()
                .query("string")
                .vectorDbId("vector_db_id")
                .params(
                    VectorIoQueryParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.query()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
        assertThat(body.params())
            .isEqualTo(
                VectorIoQueryParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            VectorIoQueryParams.builder().query("string").vectorDbId("vector_db_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.query()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
    }
}
