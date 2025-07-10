// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.responses

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ResponseInputItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InputItemServiceTest {

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inputItemService = client.responses().inputItems()

        val inputItems =
            inputItemService.list(
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
