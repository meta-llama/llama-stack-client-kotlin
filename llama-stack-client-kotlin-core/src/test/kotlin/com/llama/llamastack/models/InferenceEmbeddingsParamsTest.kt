// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceEmbeddingsParamsTest {

    @Test
    fun create() {
        InferenceEmbeddingsParams.builder()
            .contentsOfStrings(listOf("string"))
            .modelId("model_id")
            .outputDimension(0L)
            .taskType(InferenceEmbeddingsParams.TaskType.QUERY)
            .textTruncation(InferenceEmbeddingsParams.TextTruncation.NONE)
            .build()
    }

    @Test
    fun body() {
        val params =
            InferenceEmbeddingsParams.builder()
                .contentsOfStrings(listOf("string"))
                .modelId("model_id")
                .outputDimension(0L)
                .taskType(InferenceEmbeddingsParams.TaskType.QUERY)
                .textTruncation(InferenceEmbeddingsParams.TextTruncation.NONE)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contents())
            .isEqualTo(InferenceEmbeddingsParams.Contents.ofStrings(listOf("string")))
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.outputDimension()).isEqualTo(0L)
        assertThat(body.taskType()).isEqualTo(InferenceEmbeddingsParams.TaskType.QUERY)
        assertThat(body.textTruncation()).isEqualTo(InferenceEmbeddingsParams.TextTruncation.NONE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferenceEmbeddingsParams.builder()
                .contentsOfStrings(listOf("string"))
                .modelId("model_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contents())
            .isEqualTo(InferenceEmbeddingsParams.Contents.ofStrings(listOf("string")))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
