// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions

class BatchInferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchInferenceService {

    private val withRawResponse: BatchInferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchInferenceService.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchInferenceService.WithRawResponse
}
