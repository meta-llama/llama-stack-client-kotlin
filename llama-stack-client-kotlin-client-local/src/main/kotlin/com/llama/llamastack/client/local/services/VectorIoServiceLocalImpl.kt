package com.llama.llamastack.client.local.services

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.QueryChunksResponse
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams
import com.llama.llamastack.services.blocking.VectorIoService

class VectorIoServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    VectorIoService {
    override fun withRawResponse(): VectorIoService.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorIoService {
        TODO("Not yet implemented")
    }

    override fun insert(params: VectorIoInsertParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented")
    }

    override fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions,
    ): QueryChunksResponse {
        TODO("Not yet implemented")
    }
}
