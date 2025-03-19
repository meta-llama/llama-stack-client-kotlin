// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

interface BatchInferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchInferenceChatCompletionResponse

    suspend fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCompletion

    /**
     * A view of [BatchInferenceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/batch-inference/chat-completion`, but is
         * otherwise the same as [BatchInferenceServiceAsync.chatCompletion].
         */
        @MustBeClosed
        suspend fun chatCompletion(
            params: BatchInferenceChatCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchInferenceChatCompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/batch-inference/completion`, but is otherwise
         * the same as [BatchInferenceServiceAsync.completion].
         */
        @MustBeClosed
        suspend fun completion(
            params: BatchInferenceCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCompletion>
    }
}
