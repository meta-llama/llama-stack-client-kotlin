// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import com.llama.llamastack.models.PaginatedRowsResult

interface DatasetioServiceAsync {

    suspend fun getRowsPaginated(
        params: DatasetioGetRowsPaginatedParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaginatedRowsResult
}
