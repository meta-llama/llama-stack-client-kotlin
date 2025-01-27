// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunShieldResponseTest {

    @Test
    fun createRunShieldResponse() {
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
        assertThat(runShieldResponse).isNotNull
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
}
