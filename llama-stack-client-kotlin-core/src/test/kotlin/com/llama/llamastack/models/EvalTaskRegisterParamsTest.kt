// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalTaskRegisterParamsTest {

    @Test
    fun createEvalTaskRegisterParams() {
        EvalTaskRegisterParams.builder()
            .datasetId("dataset_id")
            .evalTaskId("eval_task_id")
            .scoringFunctions(listOf("string"))
            .metadata(EvalTaskRegisterParams.Metadata.builder().build())
            .providerEvalTaskId("provider_eval_task_id")
            .providerId("provider_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EvalTaskRegisterParams.builder()
                .datasetId("dataset_id")
                .evalTaskId("eval_task_id")
                .scoringFunctions(listOf("string"))
                .metadata(EvalTaskRegisterParams.Metadata.builder().build())
                .providerEvalTaskId("provider_eval_task_id")
                .providerId("provider_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.evalTaskId()).isEqualTo("eval_task_id")
        assertThat(body.scoringFunctions()).isEqualTo(listOf("string"))
        assertThat(body.metadata()).isEqualTo(EvalTaskRegisterParams.Metadata.builder().build())
        assertThat(body.providerEvalTaskId()).isEqualTo("provider_eval_task_id")
        assertThat(body.providerId()).isEqualTo("provider_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EvalTaskRegisterParams.builder()
                .datasetId("dataset_id")
                .evalTaskId("eval_task_id")
                .scoringFunctions(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.evalTaskId()).isEqualTo("eval_task_id")
        assertThat(body.scoringFunctions()).isEqualTo(listOf("string"))
    }
}
