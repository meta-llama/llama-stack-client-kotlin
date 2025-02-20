// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

interface BatchInferenceServiceAsync {

    suspend fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchInferenceChatCompletionResponse

    suspend fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCompletion
}
