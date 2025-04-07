// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SyntheticDataGenerationGenerateParamsTest {

    @Test
    fun create() {
        SyntheticDataGenerationGenerateParams.builder()
            .addDialog(UserMessage.builder().content("string").context("string").build())
            .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
            .model("model")
            .build()
    }

    @Test
    fun body() {
        val params =
            SyntheticDataGenerationGenerateParams.builder()
                .addDialog(UserMessage.builder().content("string").context("string").build())
                .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.dialogs())
            .containsExactly(
                Message.ofUser(UserMessage.builder().content("string").context("string").build())
            )
        assertThat(body.filteringFunction())
            .isEqualTo(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SyntheticDataGenerationGenerateParams.builder()
                .addUserDialog("string")
                .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                .build()

        val body = params._body()

        assertThat(body.dialogs())
            .containsExactly(Message.ofUser(UserMessage.builder().content("string").build()))
        assertThat(body.filteringFunction())
            .isEqualTo(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
    }
}
