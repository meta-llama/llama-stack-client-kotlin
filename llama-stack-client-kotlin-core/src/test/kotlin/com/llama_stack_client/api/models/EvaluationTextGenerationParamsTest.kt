// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluationTextGenerationParamsTest {

    @Test
    fun createEvaluationTextGenerationParams() {
        EvaluationTextGenerationParams.builder()
            .metrics(listOf(EvaluationTextGenerationParams.Metric.PERPLEXITY))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EvaluationTextGenerationParams.builder()
                .metrics(listOf(EvaluationTextGenerationParams.Metric.PERPLEXITY))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metrics())
            .isEqualTo(listOf(EvaluationTextGenerationParams.Metric.PERPLEXITY))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EvaluationTextGenerationParams.builder()
                .metrics(listOf(EvaluationTextGenerationParams.Metric.PERPLEXITY))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metrics())
            .isEqualTo(listOf(EvaluationTextGenerationParams.Metric.PERPLEXITY))
    }
}
