// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.inference

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.Embeddings
import com.llama_stack_client.api.models.InferenceEmbeddingCreateParams

interface EmbeddingService {

    fun create(
        params: InferenceEmbeddingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Embeddings
}
