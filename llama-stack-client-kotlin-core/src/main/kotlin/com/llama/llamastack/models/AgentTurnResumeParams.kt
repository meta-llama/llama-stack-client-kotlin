// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/**
 * Resume an agent turn with executed tool call responses. When a Turn has the status
 * `awaiting_input` due to pending input from client side tool calls, this endpoint can be used to
 * submit the outputs from the tool calls once they are ready.
 */
class AgentTurnResumeParams
private constructor(
    private val agentId: String,
    private val sessionId: String,
    private val turnId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun agentId(): String = agentId

    fun sessionId(): String = sessionId

    fun turnId(): String = turnId

    /**
     * The tool call responses to resume the turn with.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolResponses(): List<ToolResponse> = body.toolResponses()

    /**
     * Returns the raw JSON value of [toolResponses].
     *
     * Unlike [toolResponses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolResponses(): JsonField<List<ToolResponse>> = body._toolResponses()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> agentId
            1 -> sessionId
            2 -> turnId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("tool_responses")
        @ExcludeMissing
        private val toolResponses: JsonField<List<ToolResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The tool call responses to resume the turn with.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun toolResponses(): List<ToolResponse> = toolResponses.getRequired("tool_responses")

        /**
         * Returns the raw JSON value of [toolResponses].
         *
         * Unlike [toolResponses], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tool_responses")
        @ExcludeMissing
        fun _toolResponses(): JsonField<List<ToolResponse>> = toolResponses

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            toolResponses().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .toolResponses()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var toolResponses: JsonField<MutableList<ToolResponse>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                toolResponses = body.toolResponses.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The tool call responses to resume the turn with. */
            fun toolResponses(toolResponses: List<ToolResponse>) =
                toolResponses(JsonField.of(toolResponses))

            /**
             * Sets [Builder.toolResponses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolResponses] with a well-typed
             * `List<ToolResponse>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
                this.toolResponses = toolResponses.map { it.toMutableList() }
            }

            /**
             * Adds a single [ToolResponse] to [toolResponses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addToolResponse(toolResponse: ToolResponse) = apply {
                toolResponses =
                    (toolResponses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("toolResponses", it).add(toolResponse)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("toolResponses", toolResponses).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && toolResponses == other.toolResponses && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(toolResponses, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{toolResponses=$toolResponses, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentTurnResumeParams].
         *
         * The following fields are required:
         * ```kotlin
         * .agentId()
         * .sessionId()
         * .turnId()
         * .toolResponses()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentTurnResumeParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var agentId: String? = null
        private var sessionId: String? = null
        private var turnId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentTurnResumeParams: AgentTurnResumeParams) = apply {
            agentId = agentTurnResumeParams.agentId
            sessionId = agentTurnResumeParams.sessionId
            turnId = agentTurnResumeParams.turnId
            body = agentTurnResumeParams.body.toBuilder()
            additionalHeaders = agentTurnResumeParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentTurnResumeParams.additionalQueryParams.toBuilder()
        }

        fun agentId(agentId: String) = apply { this.agentId = agentId }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun turnId(turnId: String) = apply { this.turnId = turnId }

        /** The tool call responses to resume the turn with. */
        fun toolResponses(toolResponses: List<ToolResponse>) = apply {
            body.toolResponses(toolResponses)
        }

        /**
         * Sets [Builder.toolResponses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolResponses] with a well-typed `List<ToolResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
            body.toolResponses(toolResponses)
        }

        /**
         * Adds a single [ToolResponse] to [toolResponses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolResponse(toolResponse: ToolResponse) = apply {
            body.addToolResponse(toolResponse)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): AgentTurnResumeParams =
            AgentTurnResumeParams(
                checkRequired("agentId", agentId),
                checkRequired("sessionId", sessionId),
                checkRequired("turnId", turnId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentTurnResumeParams && agentId == other.agentId && sessionId == other.sessionId && turnId == other.turnId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(agentId, sessionId, turnId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AgentTurnResumeParams{agentId=$agentId, sessionId=$sessionId, turnId=$turnId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
