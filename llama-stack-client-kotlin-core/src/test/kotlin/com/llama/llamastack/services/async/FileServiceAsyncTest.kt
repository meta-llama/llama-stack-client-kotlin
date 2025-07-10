// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.FileCreateParams
import com.llama.llamastack.models.FileListParams
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
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.create(
                FileCreateParams.builder()
                    .file("some content".byteInputStream())
                    .purpose(FileCreateParams.Purpose.ASSISTANTS)
                    .build()
            )

        file.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val fileServiceAsync = client.files()

        val file = fileServiceAsync.retrieve("file_id")

        file.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val fileServiceAsync = client.files()

        val listFilesResponse =
            fileServiceAsync.list(
                FileListParams.builder()
                    .after("after")
                    .limit(0L)
                    .order(FileListParams.Order.ASC)
                    .purpose(FileListParams.Purpose.ASSISTANTS)
                    .build()
            )

        listFilesResponse.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val fileServiceAsync = client.files()

        val deleteFileResponse = fileServiceAsync.delete("file_id")

        deleteFileResponse.validate()
    }

    @Test
    suspend fun content() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val fileServiceAsync = client.files()

        val response = fileServiceAsync.content("file_id")

        response.validate()
    }
}
