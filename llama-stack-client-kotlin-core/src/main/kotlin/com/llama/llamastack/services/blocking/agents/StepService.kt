// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.AgentStepRetrieveParams
import com.llama.llamastack.models.AgentStepRetrieveResponse

interface StepService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StepService

    /** Retrieve an agent step by its ID. */
    fun retrieve(
        stepId: String,
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentStepRetrieveResponse =
        retrieve(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentStepRetrieveResponse

    /** A view of [StepService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StepService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/step/{step_id}`, but is
         * otherwise the same as [StepService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            stepId: String,
            params: AgentStepRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentStepRetrieveResponse> =
            retrieve(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AgentStepRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentStepRetrieveResponse>
    }
}
