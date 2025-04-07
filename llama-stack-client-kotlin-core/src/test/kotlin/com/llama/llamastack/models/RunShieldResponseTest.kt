// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunShieldResponseTest {

    @Test
    fun create() {
        val runShieldResponse =
            RunShieldResponse.builder()
                .violation(
                    SafetyViolation.builder()
                        .metadata(
                            SafetyViolation.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .violationLevel(SafetyViolation.ViolationLevel.INFO)
                        .userMessage("user_message")
                        .build()
                )
                .build()

        assertThat(runShieldResponse.violation())
            .isEqualTo(
                SafetyViolation.builder()
                    .metadata(
                        SafetyViolation.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .violationLevel(SafetyViolation.ViolationLevel.INFO)
                    .userMessage("user_message")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runShieldResponse =
            RunShieldResponse.builder()
                .violation(
                    SafetyViolation.builder()
                        .metadata(
                            SafetyViolation.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .violationLevel(SafetyViolation.ViolationLevel.INFO)
                        .userMessage("user_message")
                        .build()
                )
                .build()

        val roundtrippedRunShieldResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runShieldResponse),
                jacksonTypeRef<RunShieldResponse>(),
            )

        assertThat(roundtrippedRunShieldResponse).isEqualTo(runShieldResponse)
    }
}
