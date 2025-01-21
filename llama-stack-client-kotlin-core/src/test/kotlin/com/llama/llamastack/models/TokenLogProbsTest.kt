// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenLogProbsTest {

    @Test
    fun createTokenLogProbs() {
        val tokenLogProbs =
            TokenLogProbs.builder()
                .logprobsByToken(
                    TokenLogProbs.LogprobsByToken.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()
        assertThat(tokenLogProbs).isNotNull
        assertThat(tokenLogProbs.logprobsByToken())
            .isEqualTo(
                TokenLogProbs.LogprobsByToken.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }
}
