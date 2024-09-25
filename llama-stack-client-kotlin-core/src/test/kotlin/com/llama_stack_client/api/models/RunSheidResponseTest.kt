// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunSheidResponseTest {

    @Test
    fun createRunSheidResponse() {
        val runSheidResponse =
            RunSheidResponse.builder()
                .violation(
                    RunSheidResponse.Violation.builder()
                        .metadata(RunSheidResponse.Violation.Metadata.builder().build())
                        .violationLevel(RunSheidResponse.Violation.ViolationLevel.INFO)
                        .userMessage("user_message")
                        .build()
                )
                .build()
        assertThat(runSheidResponse).isNotNull
        assertThat(runSheidResponse.violation())
            .isEqualTo(
                RunSheidResponse.Violation.builder()
                    .metadata(RunSheidResponse.Violation.Metadata.builder().build())
                    .violationLevel(RunSheidResponse.Violation.ViolationLevel.INFO)
                    .userMessage("user_message")
                    .build()
            )
    }
}
