// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalTaskTest {

    @Test
    fun createEvalTask() {
        val evalTask =
            EvalTask.builder()
                .datasetId("dataset_id")
                .identifier("identifier")
                .metadata(
                    EvalTask.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .addScoringFunction("string")
                .type(EvalTask.Type.EVAL_TASK)
                .build()
        assertThat(evalTask).isNotNull
        assertThat(evalTask.datasetId()).isEqualTo("dataset_id")
        assertThat(evalTask.identifier()).isEqualTo("identifier")
        assertThat(evalTask.metadata())
            .isEqualTo(
                EvalTask.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(evalTask.providerId()).isEqualTo("provider_id")
        assertThat(evalTask.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(evalTask.scoringFunctions()).containsExactly("string")
        assertThat(evalTask.type()).isEqualTo(EvalTask.Type.EVAL_TASK)
    }
}
