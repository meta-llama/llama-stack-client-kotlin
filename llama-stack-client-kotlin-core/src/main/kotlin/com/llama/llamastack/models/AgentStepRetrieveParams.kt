// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import java.util.Objects

class AgentStepRetrieveParams
constructor(
    private val agentId: String,
    private val sessionId: String,
    private val stepId: String,
    private val turnId: String,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun agentId(): String = agentId

    fun sessionId(): String = sessionId

    fun stepId(): String = stepId

    fun turnId(): String = turnId

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.agentId.let { queryParams.put("agent_id", listOf(it.toString())) }
        this.sessionId.let { queryParams.put("session_id", listOf(it.toString())) }
        this.stepId.let { queryParams.put("step_id", listOf(it.toString())) }
        this.turnId.let { queryParams.put("turn_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentStepRetrieveParams && xLlamaStackProviderData == other.xLlamaStackProviderData && agentId == other.agentId && sessionId == other.sessionId && stepId == other.stepId && turnId == other.turnId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackProviderData, agentId, sessionId, stepId, turnId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AgentStepRetrieveParams{xLlamaStackProviderData=$xLlamaStackProviderData, agentId=$agentId, sessionId=$sessionId, stepId=$stepId, turnId=$turnId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var agentId: String? = null
        private var sessionId: String? = null
        private var stepId: String? = null
        private var turnId: String? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentStepRetrieveParams: AgentStepRetrieveParams) = apply {
            this.agentId = agentStepRetrieveParams.agentId
            this.sessionId = agentStepRetrieveParams.sessionId
            this.stepId = agentStepRetrieveParams.stepId
            this.turnId = agentStepRetrieveParams.turnId
            this.xLlamaStackProviderData = agentStepRetrieveParams.xLlamaStackProviderData
            additionalHeaders(agentStepRetrieveParams.additionalHeaders)
            additionalQueryParams(agentStepRetrieveParams.additionalQueryParams)
        }

        fun agentId(agentId: String) = apply { this.agentId = agentId }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun stepId(stepId: String) = apply { this.stepId = stepId }

        fun turnId(turnId: String) = apply { this.turnId = turnId }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
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

        fun build(): AgentStepRetrieveParams =
            AgentStepRetrieveParams(
                checkNotNull(agentId) { "`agentId` is required but was not set" },
                checkNotNull(sessionId) { "`sessionId` is required but was not set" },
                checkNotNull(stepId) { "`stepId` is required but was not set" },
                checkNotNull(turnId) { "`turnId` is required but was not set" },
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }
}
