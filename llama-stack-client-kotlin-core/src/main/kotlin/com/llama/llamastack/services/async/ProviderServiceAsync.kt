// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ProviderInfo
import com.llama.llamastack.models.ProviderListParams
import com.llama.llamastack.models.ProviderRetrieveParams

interface ProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: ProviderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderInfo

    suspend fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProviderInfo>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ProviderInfo> =
        list(ProviderListParams.none(), requestOptions)

    /**
     * A view of [ProviderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/providers/{provider_id}`, but is otherwise the
         * same as [ProviderServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ProviderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderInfo>

        /**
         * Returns a raw HTTP response for `get /v1/providers`, but is otherwise the same as
         * [ProviderServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProviderInfo>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<ProviderInfo>> =
            list(ProviderListParams.none(), requestOptions)
    }
}
