// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

interface BatchInferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * A view of [BatchInferenceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse
}
