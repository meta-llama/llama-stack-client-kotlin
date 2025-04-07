// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SafetyViolationTest {

    @Test
    fun create() {
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

        assertThat(safetyViolation.metadata())
            .isEqualTo(
                SafetyViolation.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(safetyViolation.violationLevel()).isEqualTo(SafetyViolation.ViolationLevel.INFO)
        assertThat(safetyViolation.userMessage()).isEqualTo("user_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedSafetyViolation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(safetyViolation),
                jacksonTypeRef<SafetyViolation>(),
            )

        assertThat(roundtrippedSafetyViolation).isEqualTo(safetyViolation)
    }
}
