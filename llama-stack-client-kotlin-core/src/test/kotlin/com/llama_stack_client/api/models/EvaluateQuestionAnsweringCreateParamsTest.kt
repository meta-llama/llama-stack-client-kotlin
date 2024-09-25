// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluateQuestionAnsweringCreateParamsTest {

    @Test
    fun createEvaluateQuestionAnsweringCreateParams() {
        EvaluateQuestionAnsweringCreateParams.builder()
            .metrics(listOf(EvaluateQuestionAnsweringCreateParams.Metric.EM))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EvaluateQuestionAnsweringCreateParams.builder()
                .metrics(listOf(EvaluateQuestionAnsweringCreateParams.Metric.EM))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metrics())
            .isEqualTo(listOf(EvaluateQuestionAnsweringCreateParams.Metric.EM))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EvaluateQuestionAnsweringCreateParams.builder()
                .metrics(listOf(EvaluateQuestionAnsweringCreateParams.Metric.EM))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metrics())
            .isEqualTo(listOf(EvaluateQuestionAnsweringCreateParams.Metric.EM))
    }
}
