// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldCallStepTest {

    @Test
    fun createShieldCallStep() {
        val shieldCallStep =
            ShieldCallStep.builder()
                .stepId("step_id")
                .stepType(ShieldCallStep.StepType.SHIELD_CALL)
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        assertThat(shieldCallStep).isNotNull
        assertThat(shieldCallStep.stepId()).isEqualTo("step_id")
        assertThat(shieldCallStep.stepType()).isEqualTo(ShieldCallStep.StepType.SHIELD_CALL)
        assertThat(shieldCallStep.turnId()).isEqualTo("turn_id")
        assertThat(shieldCallStep.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(shieldCallStep.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(shieldCallStep.violation())
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
