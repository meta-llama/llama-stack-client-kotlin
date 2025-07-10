// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TurnService

    /** Create a new turn for an agent. */
    fun create(
        sessionId: String,
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn = create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn

    /** Create a new turn for an agent. */
    @MustBeClosed
    fun createStreaming(
        sessionId: String,
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<AgentTurnResponseStreamChunk> =
        createStreaming(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see [createStreaming] */
    @MustBeClosed
    fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<AgentTurnResponseStreamChunk>

    /** Retrieve an agent turn by its ID. */
    fun retrieve(
        turnId: String,
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn = retrieve(params.toBuilder().turnId(turnId).build(), requestOptions)

    /** @see [retrieve] */
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
        turnId: String,
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn = resume(params.toBuilder().turnId(turnId).build(), requestOptions)

    /** @see [resume] */
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
        turnId: String,
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<AgentTurnResponseStreamChunk> =
        resumeStreaming(params.toBuilder().turnId(turnId).build(), requestOptions)

    /** @see [resumeStreaming] */
    @MustBeClosed
    fun resumeStreaming(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<AgentTurnResponseStreamChunk>

    /** A view of [TurnService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TurnService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agents/{agent_id}/session/{session_id}/turn`,
         * but is otherwise the same as [TurnService.create].
         */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: AgentTurnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Turn> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see [create] */
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
            sessionId: String,
            params: AgentTurnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>> =
            createStreaming(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see [createStreaming] */
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
            turnId: String,
            params: AgentTurnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Turn> =
            retrieve(params.toBuilder().turnId(turnId).build(), requestOptions)

        /** @see [retrieve] */
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
            turnId: String,
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Turn> = resume(params.toBuilder().turnId(turnId).build(), requestOptions)

        /** @see [resume] */
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
            turnId: String,
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>> =
            resumeStreaming(params.toBuilder().turnId(turnId).build(), requestOptions)

        /** @see [resumeStreaming] */
        @MustBeClosed
        fun resumeStreaming(
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>>
    }
}
