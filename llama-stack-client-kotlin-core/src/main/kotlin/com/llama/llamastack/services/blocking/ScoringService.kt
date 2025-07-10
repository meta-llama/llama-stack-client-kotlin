// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ScoringScoreBatchParams
import com.llama.llamastack.models.ScoringScoreBatchResponse
import com.llama.llamastack.models.ScoringScoreParams
import com.llama.llamastack.models.ScoringScoreResponse

interface ScoringService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScoringService

    /** Score a list of rows. */
    fun score(
        params: ScoringScoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringScoreResponse

    /** Score a batch of rows. */
    fun scoreBatch(
        params: ScoringScoreBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScoringScoreBatchResponse

    /** A view of [ScoringService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScoringService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/scoring/score`, but is otherwise the same as
         * [ScoringService.score].
         */
        @MustBeClosed
        fun score(
            params: ScoringScoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringScoreResponse>

        /**
         * Returns a raw HTTP response for `post /v1/scoring/score-batch`, but is otherwise the same
         * as [ScoringService.scoreBatch].
         */
        @MustBeClosed
        fun scoreBatch(
            params: ScoringScoreBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScoringScoreBatchResponse>
    }
}
