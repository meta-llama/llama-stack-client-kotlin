// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluationSummarizationParamsTest {

    @Test
    fun createEvaluationSummarizationParams() {
        EvaluationSummarizationParams.builder()
            .metrics(listOf(EvaluationSummarizationParams.Metric.ROUGE))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EvaluationSummarizationParams.builder()
                .metrics(listOf(EvaluationSummarizationParams.Metric.ROUGE))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metrics()).isEqualTo(listOf(EvaluationSummarizationParams.Metric.ROUGE))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EvaluationSummarizationParams.builder()
                .metrics(listOf(EvaluationSummarizationParams.Metric.ROUGE))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metrics()).isEqualTo(listOf(EvaluationSummarizationParams.Metric.ROUGE))
    }
}
