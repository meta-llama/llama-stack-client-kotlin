// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenLogProbsTest {

    @Test
    fun createTokenLogProbs() {
        val tokenLogProbs =
            TokenLogProbs.builder()
                .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                .build()
        assertThat(tokenLogProbs).isNotNull
        assertThat(tokenLogProbs.logprobsByToken())
            .isEqualTo(TokenLogProbs.LogprobsByToken.builder().build())
    }
}
