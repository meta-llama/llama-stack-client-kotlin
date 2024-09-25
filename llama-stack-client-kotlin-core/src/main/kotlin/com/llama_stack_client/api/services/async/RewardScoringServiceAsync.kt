// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.RewardScoring
import com.llama_stack_client.api.models.RewardScoringScoreParams

interface RewardScoringServiceAsync {

    suspend fun score(
        params: RewardScoringScoreParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RewardScoring
}
