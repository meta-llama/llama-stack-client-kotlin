// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.vectorStores

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.VectorStoreFileCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val fileServiceAsync = client.vectorStores().files()

        val vectorStoreFile =
            fileServiceAsync.create(
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
            )

        vectorStoreFile.validate()
    }
}
