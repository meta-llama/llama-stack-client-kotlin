// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.HealthInfo
import com.llama.llamastack.models.InspectHealthParams
import com.llama.llamastack.models.InspectVersionParams
import com.llama.llamastack.models.VersionInfo

interface InspectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InspectService

    /** Get the health of the service. */
    fun health(
        params: InspectHealthParams = InspectHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthInfo

    /** @see [health] */
    fun health(requestOptions: RequestOptions): HealthInfo =
        health(InspectHealthParams.none(), requestOptions)

    /** Get the version of the service. */
    fun version(
        params: InspectVersionParams = InspectVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionInfo

    /** @see [version] */
    fun version(requestOptions: RequestOptions): VersionInfo =
        version(InspectVersionParams.none(), requestOptions)

    /** A view of [InspectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InspectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/health`, but is otherwise the same as
         * [InspectService.health].
         */
        @MustBeClosed
        fun health(
            params: InspectHealthParams = InspectHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthInfo>

        /** @see [health] */
        @MustBeClosed
        fun health(requestOptions: RequestOptions): HttpResponseFor<HealthInfo> =
            health(InspectHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/version`, but is otherwise the same as
         * [InspectService.version].
         */
        @MustBeClosed
        fun version(
            params: InspectVersionParams = InspectVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionInfo>

        /** @see [version] */
        @MustBeClosed
        fun version(requestOptions: RequestOptions): HttpResponseFor<VersionInfo> =
            version(InspectVersionParams.none(), requestOptions)
    }
}
