// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams

interface ScoringFunctionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScoringFunctionService

    /** Get a scoring function by its ID. */
    fun retrieve(
        scoringFnId: String,
        params: ScoringFunctionRetrieveParams = ScoringFunctionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringFn = retrieve(params.toBuilder().scoringFnId(scoringFnId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ScoringFunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringFn

    /** @see [retrieve] */
    fun retrieve(scoringFnId: String, requestOptions: RequestOptions): ScoringFn =
        retrieve(scoringFnId, ScoringFunctionRetrieveParams.none(), requestOptions)

    /** List all scoring functions. */
    fun list(
        params: ScoringFunctionListParams = ScoringFunctionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScoringFn>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ScoringFn> =
        list(ScoringFunctionListParams.none(), requestOptions)

    /** Register a scoring function. */
    fun register(
        params: ScoringFunctionRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ScoringFunctionService] that provides access to raw HTTP responses for each
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
        ): ScoringFunctionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/scoring-functions/{scoring_fn_id}`, but is
         * otherwise the same as [ScoringFunctionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            scoringFnId: String,
            params: ScoringFunctionRetrieveParams = ScoringFunctionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringFn> =
            retrieve(params.toBuilder().scoringFnId(scoringFnId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScoringFunctionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringFn>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            scoringFnId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScoringFn> =
            retrieve(scoringFnId, ScoringFunctionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/scoring-functions`, but is otherwise the same as
         * [ScoringFunctionService.list].
         */
        @MustBeClosed
        fun list(
            params: ScoringFunctionListParams = ScoringFunctionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScoringFn>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ScoringFn>> =
            list(ScoringFunctionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/scoring-functions`, but is otherwise the same
         * as [ScoringFunctionService.register].
         */
        @MustBeClosed
        fun register(
            params: ScoringFunctionRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
