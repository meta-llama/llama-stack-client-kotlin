// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreBatchParamsTest {

    @Test
    fun createScoringScoreBatchParams() {
        ScoringScoreBatchParams.builder()
            .datasetId("dataset_id")
            .saveResultsDataset(true)
            .scoringFunctions(ScoringScoreBatchParams.ScoringFunctions.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ScoringScoreBatchParams.builder()
                .datasetId("dataset_id")
                .saveResultsDataset(true)
                .scoringFunctions(ScoringScoreBatchParams.ScoringFunctions.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.saveResultsDataset()).isEqualTo(true)
        assertThat(body.scoringFunctions())
            .isEqualTo(ScoringScoreBatchParams.ScoringFunctions.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ScoringScoreBatchParams.builder()
                .datasetId("dataset_id")
                .saveResultsDataset(true)
                .scoringFunctions(ScoringScoreBatchParams.ScoringFunctions.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.saveResultsDataset()).isEqualTo(true)
        assertThat(body.scoringFunctions())
            .isEqualTo(ScoringScoreBatchParams.ScoringFunctions.builder().build())
    }
}
