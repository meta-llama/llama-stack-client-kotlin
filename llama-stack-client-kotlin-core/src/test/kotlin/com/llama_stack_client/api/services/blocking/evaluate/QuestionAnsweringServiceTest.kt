// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.evaluate

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class QuestionAnsweringServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val questionAnsweringService = client.evaluate().questionAnswering()
        val evaluationJob =
            questionAnsweringService.create(
                EvaluateQuestionAnsweringCreateParams.builder()
                    .metrics(listOf(EvaluateQuestionAnsweringCreateParams.Metric.EM))
                    .build()
            )
        println(evaluationJob)
        evaluationJob.validate()
    }
}
