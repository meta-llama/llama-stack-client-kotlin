// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SyntheticDataGenerationResponseTest {

    @Test
    fun createSyntheticDataGenerationResponse() {
        val syntheticDataGenerationResponse =
            SyntheticDataGenerationResponse.builder()
                .syntheticData(
                    listOf(SyntheticDataGenerationResponse.SyntheticData.builder().build())
                )
                .statistics(SyntheticDataGenerationResponse.Statistics.builder().build())
                .build()
        assertThat(syntheticDataGenerationResponse).isNotNull
        assertThat(syntheticDataGenerationResponse.syntheticData())
            .containsExactly(SyntheticDataGenerationResponse.SyntheticData.builder().build())
        assertThat(syntheticDataGenerationResponse.statistics())
            .isEqualTo(SyntheticDataGenerationResponse.Statistics.builder().build())
    }
}
