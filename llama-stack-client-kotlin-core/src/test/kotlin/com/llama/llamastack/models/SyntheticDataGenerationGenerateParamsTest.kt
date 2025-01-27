// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SyntheticDataGenerationGenerateParamsTest {

    @Test
    fun createSyntheticDataGenerationGenerateParams() {
        SyntheticDataGenerationGenerateParams.builder()
            .addDialog(UserMessage.builder().content("string").context("string").build())
            .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
            .model("model")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SyntheticDataGenerationGenerateParams.builder()
                .addDialog(UserMessage.builder().content("string").context("string").build())
                .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                .model("model")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dialogs())
            .isEqualTo(
                listOf(
                    Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
        assertThat(body.filteringFunction())
            .isEqualTo(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SyntheticDataGenerationGenerateParams.builder()
                .addDialog(UserMessage.builder().content("string").build())
                .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dialogs())
            .isEqualTo(listOf(Message.ofUser(UserMessage.builder().content("string").build())))
        assertThat(body.filteringFunction())
            .isEqualTo(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
    }
}
