// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthInfoTest {

    @Test
    fun create() {
        val healthInfo = HealthInfo.builder().status(HealthInfo.Status.OK).build()

        assertThat(healthInfo.status()).isEqualTo(HealthInfo.Status.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthInfo = HealthInfo.builder().status(HealthInfo.Status.OK).build()

        val roundtrippedHealthInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthInfo),
                jacksonTypeRef<HealthInfo>(),
            )

        assertThat(roundtrippedHealthInfo).isEqualTo(healthInfo)
    }
}
