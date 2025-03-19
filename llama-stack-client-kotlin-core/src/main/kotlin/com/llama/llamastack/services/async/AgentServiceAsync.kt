// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.async.agents.SessionServiceAsync
import com.llama.llamastack.services.async.agents.StepServiceAsync
import com.llama.llamastack.services.async.agents.TurnServiceAsync

interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun session(): SessionServiceAsync

    fun steps(): StepServiceAsync

    fun turn(): TurnServiceAsync

    /** Create an agent with the given configuration. */
    suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** Delete an agent by its ID. */
    suspend fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun session(): SessionServiceAsync.WithRawResponse

        fun steps(): StepServiceAsync.WithRawResponse

        fun turn(): TurnServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/agents/{agent_id}`, but is otherwise the same
         * as [AgentServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
