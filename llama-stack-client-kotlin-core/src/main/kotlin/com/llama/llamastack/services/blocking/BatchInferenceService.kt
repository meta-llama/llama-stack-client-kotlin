// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

interface BatchInferenceService {

    fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BatchInferenceChatCompletionResponse

    fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BatchCompletion
}
