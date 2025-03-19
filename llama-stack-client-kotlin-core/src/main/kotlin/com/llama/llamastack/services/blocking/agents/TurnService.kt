// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResponseStreamChunk
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

interface TurnService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new turn for an agent. */
    fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn

    /** Create a new turn for an agent. */
    @MustBeClosed
    fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<AgentTurnResponseStreamChunk>

    /** Retrieve an agent turn by its ID. */
    fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn

    /**
     * Resume an agent turn with executed tool call responses. When a Turn has the status
     * `awaiting_input` due to pending input from client side tool calls, this endpoint can be used
     * to submit the outputs from the tool calls once they are ready.
     */
    fun resume(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn

    /**
     * Resume an agent turn with executed tool call responses. When a Turn has the status
     * `awaiting_input` due to pending input from client side tool calls, this endpoint can be used
     * to submit the outputs from the tool calls once they are ready.
     */
    @MustBeClosed
    fun resumeStreaming(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<AgentTurnResponseStreamChunk>

    /** A view of [TurnService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/agents/{agent_id}/session/{session_id}/turn`,
         * but is otherwise the same as [TurnService.create].
         */
        @MustBeClosed
        fun create(
            params: AgentTurnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Turn>

        /**
         * Returns a raw HTTP response for `post /v1/agents/{agent_id}/session/{session_id}/turn`,
         * but is otherwise the same as [TurnService.createStreaming].
         */
        @MustBeClosed
        fun createStreaming(
            params: AgentTurnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}`, but is otherwise the same as
         * [TurnService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AgentTurnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Turn>

        /**
         * Returns a raw HTTP response for `post
         * /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/resume`, but is otherwise the
         * same as [TurnService.resume].
         */
        @MustBeClosed
        fun resume(
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Turn>

        /**
         * Returns a raw HTTP response for `post
         * /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/resume`, but is otherwise the
         * same as [TurnService.resumeStreaming].
         */
        @MustBeClosed
        fun resumeStreaming(
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>>
    }
}
