// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.vectorStores

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.VectorStoreFileCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.vectorStores().files()

        val vectorStoreFile =
            fileService.create(
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
