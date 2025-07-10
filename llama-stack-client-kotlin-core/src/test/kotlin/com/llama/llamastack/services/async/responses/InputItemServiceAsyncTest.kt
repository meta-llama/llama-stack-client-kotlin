// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.responses

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.ResponseInputItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InputItemServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val inputItemServiceAsync = client.responses().inputItems()

        val inputItems =
            inputItemServiceAsync.list(
                ResponseInputItemListParams.builder()
                    .responseId("response_id")
                    .after("after")
                    .before("before")
                    .addInclude("string")
                    .limit(0L)
                    .order(ResponseInputItemListParams.Order.ASC)
                    .build()
            )

        inputItems.validate()
    }
}
