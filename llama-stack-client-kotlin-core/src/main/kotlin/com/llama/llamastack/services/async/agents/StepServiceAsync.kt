// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.AgentStepRetrieveParams
import com.llama.llamastack.models.AgentStepRetrieveResponse

interface StepServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an agent step by its ID. */
    suspend fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentStepRetrieveResponse

    /** A view of [StepServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/step/{step_id}`, but is
         * otherwise the same as [StepServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AgentStepRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentStepRetrieveResponse>
    }
}
