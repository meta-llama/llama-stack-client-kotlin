// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteInfoTest {

    @Test
    fun createRouteInfo() {
        val routeInfo =
            RouteInfo.builder().method("method").addProviderType("string").route("route").build()
        assertThat(routeInfo).isNotNull
        assertThat(routeInfo.method()).isEqualTo("method")
        assertThat(routeInfo.providerTypes()).containsExactly("string")
        assertThat(routeInfo.route()).isEqualTo("route")
    }
}
