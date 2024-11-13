// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HealthInfoTest {

    @Test
    fun createHealthInfo() {
        val healthInfo = HealthInfo.builder().status("status").build()
        assertThat(healthInfo).isNotNull
        assertThat(healthInfo.status()).isEqualTo("status")
    }
}
