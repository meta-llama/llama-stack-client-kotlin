// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteInfoTest {

    @Test
    fun create() {
        val routeInfo =
            RouteInfo.builder().method("method").addProviderType("string").route("route").build()

        assertThat(routeInfo.method()).isEqualTo("method")
        assertThat(routeInfo.providerTypes()).containsExactly("string")
        assertThat(routeInfo.route()).isEqualTo("route")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeInfo =
            RouteInfo.builder().method("method").addProviderType("string").route("route").build()

        val roundtrippedRouteInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeInfo),
                jacksonTypeRef<RouteInfo>(),
            )

        assertThat(roundtrippedRouteInfo).isEqualTo(routeInfo)
    }
}
