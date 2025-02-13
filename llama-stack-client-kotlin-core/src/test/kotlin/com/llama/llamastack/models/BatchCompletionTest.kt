// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchCompletionTest {

    @Test
    fun createBatchCompletion() {
        val batchCompletion =
            BatchCompletion.builder()
                .addBatch(
                    CompletionResponse.builder()
                        .content("content")
                        .stopReason(CompletionResponse.StopReason.END_OF_TURN)
                        .addLogprob(
                            TokenLogProbs.builder()
                                .logprobsByToken(
                                    TokenLogProbs.LogprobsByToken.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(batchCompletion).isNotNull
        assertThat(batchCompletion.batch())
            .containsExactly(
                CompletionResponse.builder()
                    .content("content")
                    .stopReason(CompletionResponse.StopReason.END_OF_TURN)
                    .addLogprob(
                        TokenLogProbs.builder()
                            .logprobsByToken(
                                TokenLogProbs.LogprobsByToken.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
