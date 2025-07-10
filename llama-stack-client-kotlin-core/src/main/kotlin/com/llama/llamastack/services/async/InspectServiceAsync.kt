// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.HealthInfo
import com.llama.llamastack.models.InspectHealthParams
import com.llama.llamastack.models.InspectVersionParams
import com.llama.llamastack.models.VersionInfo

interface InspectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InspectServiceAsync

    /** Get the health of the service. */
    suspend fun health(
        params: InspectHealthParams = InspectHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthInfo

    /** @see [health] */
    suspend fun health(requestOptions: RequestOptions): HealthInfo =
        health(InspectHealthParams.none(), requestOptions)

    /** Get the version of the service. */
    suspend fun version(
        params: InspectVersionParams = InspectVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionInfo

    /** @see [version] */
    suspend fun version(requestOptions: RequestOptions): VersionInfo =
        version(InspectVersionParams.none(), requestOptions)

    /**
     * A view of [InspectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InspectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/health`, but is otherwise the same as
         * [InspectServiceAsync.health].
         */
        @MustBeClosed
        suspend fun health(
            params: InspectHealthParams = InspectHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthInfo>

        /** @see [health] */
        @MustBeClosed
        suspend fun health(requestOptions: RequestOptions): HttpResponseFor<HealthInfo> =
            health(InspectHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/version`, but is otherwise the same as
         * [InspectServiceAsync.version].
         */
        @MustBeClosed
        suspend fun version(
            params: InspectVersionParams = InspectVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionInfo>

        /** @see [version] */
        @MustBeClosed
        suspend fun version(requestOptions: RequestOptions): HttpResponseFor<VersionInfo> =
            version(InspectVersionParams.none(), requestOptions)
    }
}
