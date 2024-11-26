// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SyntheticDataGenerationGenerateParamsTest {

    @Test
    fun createSyntheticDataGenerationGenerateParams() {
        SyntheticDataGenerationGenerateParams.builder()
            .dialogs(
                listOf(
                    SyntheticDataGenerationGenerateParams.Dialog.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(UserMessage.Context.ofString("string"))
                            .build()
                    )
                )
            )
            .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
            .model("model")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SyntheticDataGenerationGenerateParams.builder()
                .dialogs(
                    listOf(
                        SyntheticDataGenerationGenerateParams.Dialog.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                .model("model")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dialogs())
            .isEqualTo(
                listOf(
                    SyntheticDataGenerationGenerateParams.Dialog.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(UserMessage.Context.ofString("string"))
                            .build()
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
                .dialogs(
                    listOf(
                        SyntheticDataGenerationGenerateParams.Dialog.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .build()
                        )
                    )
                )
                .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dialogs())
            .isEqualTo(
                listOf(
                    SyntheticDataGenerationGenerateParams.Dialog.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .build()
                    )
                )
            )
        assertThat(body.filteringFunction())
            .isEqualTo(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
    }
}
