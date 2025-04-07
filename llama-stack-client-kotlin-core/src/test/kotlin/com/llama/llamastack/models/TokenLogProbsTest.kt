// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenLogProbsTest {

    @Test
    fun create() {
        val tokenLogProbs =
            TokenLogProbs.builder()
                .logprobsByToken(
                    TokenLogProbs.LogprobsByToken.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(tokenLogProbs.logprobsByToken())
            .isEqualTo(
                TokenLogProbs.LogprobsByToken.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenLogProbs =
            TokenLogProbs.builder()
                .logprobsByToken(
                    TokenLogProbs.LogprobsByToken.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedTokenLogProbs =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenLogProbs),
                jacksonTypeRef<TokenLogProbs>(),
            )

        assertThat(roundtrippedTokenLogProbs).isEqualTo(tokenLogProbs)
    }
}
