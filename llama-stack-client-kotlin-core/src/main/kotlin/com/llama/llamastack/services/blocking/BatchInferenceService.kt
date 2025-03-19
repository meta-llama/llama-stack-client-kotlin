// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

interface BatchInferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchInferenceChatCompletionResponse

    fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCompletion

    /**
     * A view of [BatchInferenceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/batch-inference/chat-completion`, but is
         * otherwise the same as [BatchInferenceService.chatCompletion].
         */
        @MustBeClosed
        fun chatCompletion(
            params: BatchInferenceChatCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchInferenceChatCompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/batch-inference/completion`, but is otherwise
         * the same as [BatchInferenceService.completion].
         */
        @MustBeClosed
        fun completion(
            params: BatchInferenceCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCompletion>
    }
}
