// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ProviderInfo
import com.llama.llamastack.models.ProviderListParams
import com.llama.llamastack.models.ProviderRetrieveParams

interface ProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProviderService

    /** Get detailed information about a specific provider. */
    fun retrieve(
        providerId: String,
        params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderInfo = retrieve(params.toBuilder().providerId(providerId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ProviderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderInfo

    /** @see [retrieve] */
    fun retrieve(providerId: String, requestOptions: RequestOptions): ProviderInfo =
        retrieve(providerId, ProviderRetrieveParams.none(), requestOptions)

    /** List all available providers. */
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProviderInfo>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ProviderInfo> =
        list(ProviderListParams.none(), requestOptions)

    /** A view of [ProviderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/providers/{provider_id}`, but is otherwise the
         * same as [ProviderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            providerId: String,
            params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderInfo> =
            retrieve(params.toBuilder().providerId(providerId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProviderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderInfo>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            providerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProviderInfo> =
            retrieve(providerId, ProviderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/providers`, but is otherwise the same as
         * [ProviderService.list].
         */
        @MustBeClosed
        fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProviderInfo>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ProviderInfo>> =
            list(ProviderListParams.none(), requestOptions)
    }
}
