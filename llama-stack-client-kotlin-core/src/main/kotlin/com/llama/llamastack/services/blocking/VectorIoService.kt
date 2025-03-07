// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.QueryChunksResponse
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams

interface VectorIoService {

    fun insert(params: VectorIoInsertParams, requestOptions: RequestOptions = RequestOptions.none())

    fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryChunksResponse
}
