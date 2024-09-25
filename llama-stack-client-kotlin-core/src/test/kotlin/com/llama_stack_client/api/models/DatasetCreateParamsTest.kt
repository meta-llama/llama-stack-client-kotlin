// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetCreateParamsTest {

    @Test
    fun createDatasetCreateParams() {
        DatasetCreateParams.builder()
            .dataset(
                TrainEvalDataset.builder()
                    .columns(TrainEvalDataset.Columns.builder().build())
                    .contentUrl("https://example.com")
                    .metadata(TrainEvalDataset.Metadata.builder().build())
                    .build()
            )
            .uuid("uuid")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetCreateParams.builder()
                .dataset(
                    TrainEvalDataset.builder()
                        .columns(TrainEvalDataset.Columns.builder().build())
                        .contentUrl("https://example.com")
                        .metadata(TrainEvalDataset.Metadata.builder().build())
                        .build()
                )
                .uuid("uuid")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dataset())
            .isEqualTo(
                TrainEvalDataset.builder()
                    .columns(TrainEvalDataset.Columns.builder().build())
                    .contentUrl("https://example.com")
                    .metadata(TrainEvalDataset.Metadata.builder().build())
                    .build()
            )
        assertThat(body.uuid()).isEqualTo("uuid")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetCreateParams.builder()
                .dataset(
                    TrainEvalDataset.builder()
                        .columns(TrainEvalDataset.Columns.builder().build())
                        .contentUrl("https://example.com")
                        .build()
                )
                .uuid("uuid")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dataset())
            .isEqualTo(
                TrainEvalDataset.builder()
                    .columns(TrainEvalDataset.Columns.builder().build())
                    .contentUrl("https://example.com")
                    .build()
            )
        assertThat(body.uuid()).isEqualTo("uuid")
    }
}
