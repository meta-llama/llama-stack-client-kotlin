// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScoringServiceTest {

    @Test
    fun callScore() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringService = client.scoring()
        val scoringScoreResponse =
            scoringService.score(
                ScoringScoreParams.builder()
                    .inputRows(listOf(ScoringScoreParams.InputRow.builder().build()))
                    .scoringFunctions(ScoringScoreParams.ScoringFunctions.builder().build())
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(scoringScoreResponse)
        scoringScoreResponse.validate()
    }

    @Test
    fun callScoreBatch() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringService = client.scoring()
        val scoringScoreBatchResponse =
            scoringService.scoreBatch(
                ScoringScoreBatchParams.builder()
                    .datasetId("dataset_id")
                    .saveResultsDataset(true)
                    .scoringFunctions(ScoringScoreBatchParams.ScoringFunctions.builder().build())
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(scoringScoreBatchResponse)
        scoringScoreBatchResponse.validate()
    }
}
