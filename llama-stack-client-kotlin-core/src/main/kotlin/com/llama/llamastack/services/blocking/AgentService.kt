// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.blocking.agents.SessionService
import com.llama.llamastack.services.blocking.agents.StepService
import com.llama.llamastack.services.blocking.agents.TurnService

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun session(): SessionService

    fun steps(): StepService

    fun turn(): TurnService

    /** Create an agent with the given configuration. */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** Delete an agent by its ID. */
    fun delete(params: AgentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun session(): SessionService.WithRawResponse

        fun steps(): StepService.WithRawResponse

        fun turn(): TurnService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/agents/{agent_id}`, but is otherwise the same
         * as [AgentService.delete].
         */
        @MustBeClosed
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
