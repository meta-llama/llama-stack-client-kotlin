// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ScoringScoreBatchParams
import com.llama.llamastack.models.ScoringScoreBatchResponse
import com.llama.llamastack.models.ScoringScoreParams
import com.llama.llamastack.models.ScoringScoreResponse

interface ScoringServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Score a list of rows. */
    suspend fun score(
        params: ScoringScoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringScoreResponse

    suspend fun scoreBatch(
        params: ScoringScoreBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringScoreBatchResponse

    /**
     * A view of [ScoringServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/scoring/score`, but is otherwise the same as
         * [ScoringServiceAsync.score].
         */
        @MustBeClosed
        suspend fun score(
            params: ScoringScoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringScoreResponse>

        /**
         * Returns a raw HTTP response for `post /v1/scoring/score-batch`, but is otherwise the same
         * as [ScoringServiceAsync.scoreBatch].
         */
        @MustBeClosed
        suspend fun scoreBatch(
            params: ScoringScoreBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringScoreBatchResponse>
    }
}
