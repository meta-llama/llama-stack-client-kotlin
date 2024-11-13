// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.MemoryInsertParams
import com.llama.llamastack.models.MemoryQueryParams
import com.llama.llamastack.models.QueryDocumentsResponse

interface MemoryService {

    fun insert(params: MemoryInsertParams, requestOptions: RequestOptions = RequestOptions.none())

    fun query(
        params: MemoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): QueryDocumentsResponse
}
