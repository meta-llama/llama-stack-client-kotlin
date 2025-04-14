// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions

class BatchInferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BatchInferenceServiceAsync {

    private val withRawResponse: BatchInferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchInferenceServiceAsync.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchInferenceServiceAsync.WithRawResponse
}
