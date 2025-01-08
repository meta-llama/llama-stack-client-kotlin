// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteListResponseTest {

    @Test
    fun createRouteListResponse() {
        val routeListResponse =
            RouteListResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        listOf(
                            mapOf(
                                "method" to "method",
                                "provider_types" to listOf("string"),
                                "route" to "route",
                            )
                        )
                    )
                )
                .build()
        assertThat(routeListResponse).isNotNull
    }
}
