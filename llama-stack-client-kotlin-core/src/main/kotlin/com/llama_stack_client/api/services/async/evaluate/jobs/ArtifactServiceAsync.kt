// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.evaluate.jobs

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateJobArtifactListParams
import com.llama_stack_client.api.models.EvaluationJobArtifacts

interface ArtifactServiceAsync {

    suspend fun list(
        params: EvaluateJobArtifactListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJobArtifacts
}
