// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EvaluationServiceTest {

    @Test
    fun callSummarization() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evaluationService = client.evaluations()
        val evaluationJob =
            evaluationService.summarization(
                EvaluationSummarizationParams.builder()
                    .metrics(listOf(EvaluationSummarizationParams.Metric.ROUGE))
                    .build()
            )
        println(evaluationJob)
        evaluationJob.validate()
    }

    @Test
    fun callTextGeneration() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evaluationService = client.evaluations()
        val evaluationJob =
            evaluationService.textGeneration(
                EvaluationTextGenerationParams.builder()
                    .metrics(listOf(EvaluationTextGenerationParams.Metric.PERPLEXITY))
                    .build()
            )
        println(evaluationJob)
        evaluationJob.validate()
    }
}
