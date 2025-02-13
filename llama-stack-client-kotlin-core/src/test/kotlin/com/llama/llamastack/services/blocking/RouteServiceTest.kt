// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.RouteInfo
import com.llama.llamastack.models.RouteListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RouteServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val routeService = client.routes()
        val listRoutesResponse = routeService.list(RouteListParams.builder().build())
        println(listRoutesResponse)
        for (routeInfo: RouteInfo in listRoutesResponse) {
            routeInfo.validate()
        }
    }
}
