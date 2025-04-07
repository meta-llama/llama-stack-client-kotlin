// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SyntheticDataGenerationResponseTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedSyntheticDataGenerationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(syntheticDataGenerationResponse),
                jacksonTypeRef<SyntheticDataGenerationResponse>(),
            )

        assertThat(roundtrippedSyntheticDataGenerationResponse)
            .isEqualTo(syntheticDataGenerationResponse)
    }
}
