// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrainEvalDatasetTest {

    @Test
    fun createTrainEvalDataset() {
        val trainEvalDataset =
            TrainEvalDataset.builder()
                .columns(TrainEvalDataset.Columns.builder().build())
                .contentUrl("https://example.com")
                .metadata(TrainEvalDataset.Metadata.builder().build())
                .build()
        assertThat(trainEvalDataset).isNotNull
        assertThat(trainEvalDataset.columns()).isEqualTo(TrainEvalDataset.Columns.builder().build())
        assertThat(trainEvalDataset.contentUrl()).isEqualTo("https://example.com")
        assertThat(trainEvalDataset.metadata())
            .isEqualTo(TrainEvalDataset.Metadata.builder().build())
    }
}
