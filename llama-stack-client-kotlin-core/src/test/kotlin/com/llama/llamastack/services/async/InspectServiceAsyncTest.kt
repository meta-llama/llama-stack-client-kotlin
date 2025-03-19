// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InspectServiceAsyncTest {

    @Test
    suspend fun health() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val inspectServiceAsync = client.inspect()

        val healthInfo = inspectServiceAsync.health()

        healthInfo.validate()
    }

    @Test
    suspend fun version() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val inspectServiceAsync = client.inspect()

        val versionInfo = inspectServiceAsync.version()

        versionInfo.validate()
    }
}
