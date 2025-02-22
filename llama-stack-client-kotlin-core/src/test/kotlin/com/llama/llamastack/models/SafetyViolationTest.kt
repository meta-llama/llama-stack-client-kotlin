// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SafetyViolationTest {

    @Test
    fun createSafetyViolation() {
        val safetyViolation =
            SafetyViolation.builder()
                .metadata(
                    SafetyViolation.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .violationLevel(SafetyViolation.ViolationLevel.INFO)
                .userMessage("user_message")
                .build()
        assertThat(safetyViolation).isNotNull
        assertThat(safetyViolation.metadata())
            .isEqualTo(
                SafetyViolation.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(safetyViolation.violationLevel()).isEqualTo(SafetyViolation.ViolationLevel.INFO)
        assertThat(safetyViolation.userMessage()).isEqualTo("user_message")
    }
}
