// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EvalCandidateTest {

    @Test
    fun ofModel() {
        val model =
            EvalCandidate.ModelCandidate.builder()
                .model("model")
                .samplingParams(
                    SamplingParams.builder()
                        .strategyObject()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .addStop("string")
                        .build()
                )
                .systemMessage(SystemMessage.builder().content("string").build())
                .build()

        val evalCandidate = EvalCandidate.ofModel(model)

        assertThat(evalCandidate.model()).isEqualTo(model)
        assertThat(evalCandidate.agent()).isNull()
    }

    @Test
    fun ofModelRoundtrip() {
        val jsonMapper = jsonMapper()
        val evalCandidate =
            EvalCandidate.ofModel(
                EvalCandidate.ModelCandidate.builder()
                    .model("model")
                    .samplingParams(
                        SamplingParams.builder()
                            .strategyObject()
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .addStop("string")
                            .build()
                    )
                    .systemMessage(SystemMessage.builder().content("string").build())
                    .build()
            )

        val roundtrippedEvalCandidate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evalCandidate),
                jacksonTypeRef<EvalCandidate>(),
            )

        assertThat(roundtrippedEvalCandidate).isEqualTo(evalCandidate)
    }

    @Test
    fun ofAgent() {
        val agent =
            EvalCandidate.AgentCandidate.builder()
                .config(
                    AgentConfig.builder()
                        .instructions("instructions")
                        .model("model")
                        .addClientTool(
                            ToolDef.builder()
                                .name("name")
                                .description("description")
                                .metadata(
                                    ToolDef.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .addParameter(
                                    ToolDef.Parameter.builder()
                                        .description("description")
                                        .name("name")
                                        .parameterType("parameter_type")
                                        .required(true)
                                        .default(true)
                                        .build()
                                )
                                .build()
                        )
                        .enableSessionPersistence(true)
                        .addInputShield("string")
                        .maxInferIters(0L)
                        .addOutputShield("string")
                        .jsonSchemaResponseFormat(
                            ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyObject()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .addStop("string")
                                .build()
                        )
                        .toolChoice(AgentConfig.ToolChoice.AUTO)
                        .toolConfig(
                            AgentConfig.ToolConfig.builder()
                                .systemMessageBehavior(
                                    AgentConfig.ToolConfig.SystemMessageBehavior.APPEND
                                )
                                .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                                .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                                .build()
                        )
                        .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                        .addToolgroup("string")
                        .build()
                )
                .build()

        val evalCandidate = EvalCandidate.ofAgent(agent)

        assertThat(evalCandidate.model()).isNull()
        assertThat(evalCandidate.agent()).isEqualTo(agent)
    }

    @Test
    fun ofAgentRoundtrip() {
        val jsonMapper = jsonMapper()
        val evalCandidate =
            EvalCandidate.ofAgent(
                EvalCandidate.AgentCandidate.builder()
                    .config(
                        AgentConfig.builder()
                            .instructions("instructions")
                            .model("model")
                            .addClientTool(
                                ToolDef.builder()
                                    .name("name")
                                    .description("description")
                                    .metadata(
                                        ToolDef.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(true))
                                            .build()
                                    )
                                    .addParameter(
                                        ToolDef.Parameter.builder()
                                            .description("description")
                                            .name("name")
                                            .parameterType("parameter_type")
                                            .required(true)
                                            .default(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .enableSessionPersistence(true)
                            .addInputShield("string")
                            .maxInferIters(0L)
                            .addOutputShield("string")
                            .jsonSchemaResponseFormat(
                                ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .samplingParams(
                                SamplingParams.builder()
                                    .strategyObject()
                                    .maxTokens(0L)
                                    .repetitionPenalty(0.0)
                                    .addStop("string")
                                    .build()
                            )
                            .toolChoice(AgentConfig.ToolChoice.AUTO)
                            .toolConfig(
                                AgentConfig.ToolConfig.builder()
                                    .systemMessageBehavior(
                                        AgentConfig.ToolConfig.SystemMessageBehavior.APPEND
                                    )
                                    .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                                    .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                                    .build()
                            )
                            .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                            .addToolgroup("string")
                            .build()
                    )
                    .build()
            )

        val roundtrippedEvalCandidate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evalCandidate),
                jacksonTypeRef<EvalCandidate>(),
            )

        assertThat(roundtrippedEvalCandidate).isEqualTo(evalCandidate)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val evalCandidate =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<EvalCandidate>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { evalCandidate.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
