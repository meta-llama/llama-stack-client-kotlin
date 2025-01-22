// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SyntheticDataGenerationResponseTest {

    @Test
    fun createSyntheticDataGenerationResponse() {
        val syntheticDataGenerationResponse =
            SyntheticDataGenerationResponse.builder()
                .addSyntheticData(
                    SyntheticDataGenerationResponse.SyntheticData.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .statistics(
                    SyntheticDataGenerationResponse.Statistics.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()
        assertThat(syntheticDataGenerationResponse).isNotNull
        assertThat(syntheticDataGenerationResponse.syntheticData())
            .containsExactly(
                SyntheticDataGenerationResponse.SyntheticData.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(syntheticDataGenerationResponse.statistics())
            .isEqualTo(
                SyntheticDataGenerationResponse.Statistics.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }
}
