// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListToolsResponseTest {

    @Test
    fun create() {
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
                                .default(true)
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
                            .default(true)
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                                .default(true)
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

        val roundtrippedListToolsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listToolsResponse),
                jacksonTypeRef<ListToolsResponse>(),
            )

        assertThat(roundtrippedListToolsResponse).isEqualTo(listToolsResponse)
    }
}
