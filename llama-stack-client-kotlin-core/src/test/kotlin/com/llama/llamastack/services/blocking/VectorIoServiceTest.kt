// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class VectorIoServiceTest {

    @Test
    fun insert() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorIoService = client.vectorIo()

        vectorIoService.insert(
            VectorIoInsertParams.builder()
                .addChunk(
                    VectorIoInsertParams.Chunk.builder()
                        .content("string")
                        .metadata(
                            VectorIoInsertParams.Chunk.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .vectorDbId("vector_db_id")
                .ttlSeconds(0L)
                .build()
        )
    }

    @Test
    fun query() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorIoService = client.vectorIo()

        val queryChunksResponse =
            vectorIoService.query(
                VectorIoQueryParams.builder()
                    .query("string")
                    .vectorDbId("vector_db_id")
                    .params(
                        VectorIoQueryParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )

        queryChunksResponse.validate()
    }
}
