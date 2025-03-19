// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.SyntheticDataGenerationResponse

interface SyntheticDataGenerationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SyntheticDataGenerationResponse

    /**
     * A view of [SyntheticDataGenerationServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/synthetic-data-generation/generate`, but is
         * otherwise the same as [SyntheticDataGenerationServiceAsync.generate].
         */
        @MustBeClosed
        suspend fun generate(
            params: SyntheticDataGenerationGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SyntheticDataGenerationResponse>
    }
}
