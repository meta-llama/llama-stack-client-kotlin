// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryRetrievalStepTest {

    @Test
    fun createMemoryRetrievalStep() {
        val memoryRetrievalStep =
            MemoryRetrievalStep.builder()
                .insertedContext("string")
                .addMemoryBankId("string")
                .stepId("step_id")
                .stepType(MemoryRetrievalStep.StepType.MEMORY_RETRIEVAL)
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(memoryRetrievalStep).isNotNull
        assertThat(memoryRetrievalStep.insertedContext())
            .isEqualTo(InterleavedContent.ofString("string"))
        assertThat(memoryRetrievalStep.memoryBankIds()).containsExactly("string")
        assertThat(memoryRetrievalStep.stepId()).isEqualTo("step_id")
        assertThat(memoryRetrievalStep.stepType())
            .isEqualTo(MemoryRetrievalStep.StepType.MEMORY_RETRIEVAL)
        assertThat(memoryRetrievalStep.turnId()).isEqualTo("turn_id")
        assertThat(memoryRetrievalStep.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(memoryRetrievalStep.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
