// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreUpdateParamsTest {

    @Test
    fun create() {
        VectorStoreUpdateParams.builder()
            .vectorStoreId("vector_store_id")
            .expiresAfter(
                VectorStoreUpdateParams.ExpiresAfter.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .metadata(
                VectorStoreUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = VectorStoreUpdateParams.builder().vectorStoreId("vector_store_id").build()

        assertThat(params._pathParam(0)).isEqualTo("vector_store_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VectorStoreUpdateParams.builder()
                .vectorStoreId("vector_store_id")
                .expiresAfter(
                    VectorStoreUpdateParams.ExpiresAfter.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .metadata(
                    VectorStoreUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.expiresAfter())
            .isEqualTo(
                VectorStoreUpdateParams.ExpiresAfter.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                VectorStoreUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VectorStoreUpdateParams.builder().vectorStoreId("vector_store_id").build()

        val body = params._body()
    }
}
