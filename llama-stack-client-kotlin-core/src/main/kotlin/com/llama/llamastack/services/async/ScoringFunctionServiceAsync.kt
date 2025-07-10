// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams

interface ScoringFunctionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScoringFunctionServiceAsync

    /** Get a scoring function by its ID. */
    suspend fun retrieve(
        scoringFnId: String,
        params: ScoringFunctionRetrieveParams = ScoringFunctionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringFn = retrieve(params.toBuilder().scoringFnId(scoringFnId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ScoringFunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringFn

    /** @see [retrieve] */
    suspend fun retrieve(scoringFnId: String, requestOptions: RequestOptions): ScoringFn =
        retrieve(scoringFnId, ScoringFunctionRetrieveParams.none(), requestOptions)

    /** List all scoring functions. */
    suspend fun list(
        params: ScoringFunctionListParams = ScoringFunctionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScoringFn>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ScoringFn> =
        list(ScoringFunctionListParams.none(), requestOptions)

    /** Register a scoring function. */
    suspend fun register(
        params: ScoringFunctionRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ScoringFunctionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ScoringFunctionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/scoring-functions/{scoring_fn_id}`, but is
         * otherwise the same as [ScoringFunctionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            scoringFnId: String,
            params: ScoringFunctionRetrieveParams = ScoringFunctionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringFn> =
            retrieve(params.toBuilder().scoringFnId(scoringFnId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ScoringFunctionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringFn>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            scoringFnId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScoringFn> =
            retrieve(scoringFnId, ScoringFunctionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/scoring-functions`, but is otherwise the same as
         * [ScoringFunctionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ScoringFunctionListParams = ScoringFunctionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScoringFn>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<ScoringFn>> =
            list(ScoringFunctionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/scoring-functions`, but is otherwise the same
         * as [ScoringFunctionServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: ScoringFunctionRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
