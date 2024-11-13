// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluateResponseTest {

    @Test
    fun createEvaluateResponse() {
        val evaluateResponse =
            EvaluateResponse.builder()
                .generations(listOf(EvaluateResponse.Generation.builder().build()))
                .scores(EvaluateResponse.Scores.builder().build())
                .build()
        assertThat(evaluateResponse).isNotNull
        assertThat(evaluateResponse.generations())
            .containsExactly(EvaluateResponse.Generation.builder().build())
        assertThat(evaluateResponse.scores()).isEqualTo(EvaluateResponse.Scores.builder().build())
    }
}
