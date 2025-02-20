// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.DatasetioAppendRowsParams
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import com.llama.llamastack.models.PaginatedRowsResult

interface DatasetioService {

    fun appendRows(
        params: DatasetioAppendRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun getRowsPaginated(
        params: DatasetioGetRowsPaginatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaginatedRowsResult
}
