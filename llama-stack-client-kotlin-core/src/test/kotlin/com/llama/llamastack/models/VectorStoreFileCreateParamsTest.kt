// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreFileCreateParamsTest {

    @Test
    fun create() {
        VectorStoreFileCreateParams.builder()
            .vectorStoreId("vector_store_id")
            .fileId("file_id")
            .attributes(
                VectorStoreFileCreateParams.Attributes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .chunkingStrategyAuto()
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VectorStoreFileCreateParams.builder()
                .vectorStoreId("vector_store_id")
                .fileId("file_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("vector_store_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VectorStoreFileCreateParams.builder()
                .vectorStoreId("vector_store_id")
                .fileId("file_id")
                .attributes(
                    VectorStoreFileCreateParams.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .chunkingStrategyAuto()
                .build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
        assertThat(body.attributes())
            .isEqualTo(
                VectorStoreFileCreateParams.Attributes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.chunkingStrategy())
            .isEqualTo(VectorStoreFileCreateParams.ChunkingStrategy.ofAuto())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VectorStoreFileCreateParams.builder()
                .vectorStoreId("vector_store_id")
                .fileId("file_id")
                .build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
    }
}
