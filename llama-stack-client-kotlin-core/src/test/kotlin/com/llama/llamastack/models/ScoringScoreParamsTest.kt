// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreParamsTest {

    @Test
    fun createScoringScoreParams() {
        ScoringScoreParams.builder()
            .inputRows(listOf(ScoringScoreParams.InputRow.builder().build()))
            .scoringFunctions(ScoringScoreParams.ScoringFunctions.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ScoringScoreParams.builder()
                .inputRows(listOf(ScoringScoreParams.InputRow.builder().build()))
                .scoringFunctions(ScoringScoreParams.ScoringFunctions.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.inputRows())
            .isEqualTo(listOf(ScoringScoreParams.InputRow.builder().build()))
        assertThat(body.scoringFunctions())
            .isEqualTo(ScoringScoreParams.ScoringFunctions.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ScoringScoreParams.builder()
                .inputRows(listOf(ScoringScoreParams.InputRow.builder().build()))
                .scoringFunctions(ScoringScoreParams.ScoringFunctions.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.inputRows())
            .isEqualTo(listOf(ScoringScoreParams.InputRow.builder().build()))
        assertThat(body.scoringFunctions())
            .isEqualTo(ScoringScoreParams.ScoringFunctions.builder().build())
    }
}
