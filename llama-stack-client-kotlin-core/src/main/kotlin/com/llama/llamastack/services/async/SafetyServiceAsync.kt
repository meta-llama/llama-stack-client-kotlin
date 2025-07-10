// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.RunShieldResponse
import com.llama.llamastack.models.SafetyRunShieldParams

interface SafetyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SafetyServiceAsync

    /** Run a shield. */
    suspend fun runShield(
        params: SafetyRunShieldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunShieldResponse

    /**
     * A view of [SafetyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SafetyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/safety/run-shield`, but is otherwise the same
         * as [SafetyServiceAsync.runShield].
         */
        @MustBeClosed
        suspend fun runShield(
            params: SafetyRunShieldParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunShieldResponse>
    }
}
