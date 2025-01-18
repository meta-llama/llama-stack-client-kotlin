// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListShieldsResponseTest {

    @Test
    fun createListShieldsResponse() {
        val listShieldsResponse =
            ListShieldsResponse.builder()
                .data(
                    listOf(
                        Shield.builder()
                            .identifier("identifier")
                            .providerId("provider_id")
                            .providerResourceId("provider_resource_id")
                            .type(Shield.Type.SHIELD)
                            .params(
                                Shield.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .build()
                    )
                )
                .build()
        assertThat(listShieldsResponse).isNotNull
        assertThat(listShieldsResponse.data())
            .containsExactly(
                Shield.builder()
                    .identifier("identifier")
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .type(Shield.Type.SHIELD)
                    .params(
                        Shield.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
    }
}
