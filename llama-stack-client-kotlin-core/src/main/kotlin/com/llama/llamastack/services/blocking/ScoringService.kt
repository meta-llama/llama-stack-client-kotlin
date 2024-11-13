// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ScoringScoreBatchParams
import com.llama.llamastack.models.ScoringScoreBatchResponse
import com.llama.llamastack.models.ScoringScoreParams
import com.llama.llamastack.models.ScoringScoreResponse

interface ScoringService {

    fun score(
        params: ScoringScoreParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScoringScoreResponse

    fun scoreBatch(
        params: ScoringScoreBatchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScoringScoreBatchResponse
}
