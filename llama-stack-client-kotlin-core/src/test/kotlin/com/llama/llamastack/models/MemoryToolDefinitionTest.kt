// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryToolDefinitionTest {

    @Test
    fun createMemoryToolDefinition() {
        val memoryToolDefinition =
            MemoryToolDefinition.builder()
                .maxChunks(0L)
                .maxTokensInContext(0L)
                .memoryBankConfigs(
                    listOf(
                        MemoryToolDefinition.MemoryBankConfig.ofVector(
                            MemoryToolDefinition.MemoryBankConfig.Vector.builder()
                                .bankId("bank_id")
                                .type(MemoryToolDefinition.MemoryBankConfig.Vector.Type.VECTOR)
                                .build()
                        )
                    )
                )
                .queryGeneratorConfig(
                    MemoryToolDefinition.QueryGeneratorConfig.ofDefault(
                        MemoryToolDefinition.QueryGeneratorConfig.Default.builder()
                            .sep("sep")
                            .type(MemoryToolDefinition.QueryGeneratorConfig.Default.Type.DEFAULT)
                            .build()
                    )
                )
                .type(MemoryToolDefinition.Type.MEMORY)
                .inputShields(listOf("string"))
                .outputShields(listOf("string"))
                .build()
        assertThat(memoryToolDefinition).isNotNull
        assertThat(memoryToolDefinition.maxChunks()).isEqualTo(0L)
        assertThat(memoryToolDefinition.maxTokensInContext()).isEqualTo(0L)
        assertThat(memoryToolDefinition.memoryBankConfigs())
            .containsExactly(
                MemoryToolDefinition.MemoryBankConfig.ofVector(
                    MemoryToolDefinition.MemoryBankConfig.Vector.builder()
                        .bankId("bank_id")
                        .type(MemoryToolDefinition.MemoryBankConfig.Vector.Type.VECTOR)
                        .build()
                )
            )
        assertThat(memoryToolDefinition.queryGeneratorConfig())
            .isEqualTo(
                MemoryToolDefinition.QueryGeneratorConfig.ofDefault(
                    MemoryToolDefinition.QueryGeneratorConfig.Default.builder()
                        .sep("sep")
                        .type(MemoryToolDefinition.QueryGeneratorConfig.Default.Type.DEFAULT)
                        .build()
                )
            )
        assertThat(memoryToolDefinition.type()).isEqualTo(MemoryToolDefinition.Type.MEMORY)
        assertThat(memoryToolDefinition.inputShields()).containsExactly("string")
        assertThat(memoryToolDefinition.outputShields()).containsExactly("string")
    }
}
