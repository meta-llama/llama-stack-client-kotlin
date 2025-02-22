// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListEvalTasksResponseTest {

    @Test
    fun createListEvalTasksResponse() {
        val listEvalTasksResponse =
            ListEvalTasksResponse.builder()
                .addData(
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
                        .build()
                )
                .build()
        assertThat(listEvalTasksResponse).isNotNull
        assertThat(listEvalTasksResponse.data())
            .containsExactly(
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
                    .build()
            )
    }
}
