// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.FileCreateParams
import com.llama.llamastack.models.FileListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val file =
            fileService.create(
                FileCreateParams.builder()
                    .file("some content".byteInputStream())
                    .purpose(FileCreateParams.Purpose.ASSISTANTS)
                    .build()
            )

        file.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val file = fileService.retrieve("file_id")

        file.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val listFilesResponse =
            fileService.list(
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
    fun delete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val deleteFileResponse = fileService.delete("file_id")

        deleteFileResponse.validate()
    }

    @Test
    fun content() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val response = fileService.content("file_id")

        response.validate()
    }
}
