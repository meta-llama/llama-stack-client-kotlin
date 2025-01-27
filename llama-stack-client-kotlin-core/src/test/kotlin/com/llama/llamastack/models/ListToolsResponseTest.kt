// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListToolsResponseTest {

    @Test
    fun createListToolsResponse() {
        val listToolsResponse =
            ListToolsResponse.builder()
                .addData(
                    Tool.builder()
                        .description("description")
                        .identifier("identifier")
                        .addParameter(
                            Tool.Parameter.builder()
                                .description("description")
                                .name("name")
                                .parameterType("parameter_type")
                                .required(true)
                                .default(Tool.Parameter.Default.ofBoolean(true))
                                .build()
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .toolHost(Tool.ToolHost.DISTRIBUTION)
                        .toolgroupId("toolgroup_id")
                        .metadata(
                            Tool.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(listToolsResponse).isNotNull
        assertThat(listToolsResponse.data())
            .containsExactly(
                Tool.builder()
                    .description("description")
                    .identifier("identifier")
                    .addParameter(
                        Tool.Parameter.builder()
                            .description("description")
                            .name("name")
                            .parameterType("parameter_type")
                            .required(true)
                            .default(Tool.Parameter.Default.ofBoolean(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .toolHost(Tool.ToolHost.DISTRIBUTION)
                    .toolgroupId("toolgroup_id")
                    .metadata(
                        Tool.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
    }
}
