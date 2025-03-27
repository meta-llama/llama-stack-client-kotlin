package com.llama.llamastack.client.local.services

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.services.vectordb.objectbox.MyObjectBox
import com.llama.llamastack.client.local.services.vectordb.objectbox.RagVectorDb
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRegisterResponse
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbRetrieveResponse
import com.llama.llamastack.models.VectorDbUnregisterParams
import com.llama.llamastack.services.blocking.VectorDbService
import io.objectbox.BoxStore
import io.objectbox.kotlin.boxFor

class VectorDbServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    VectorDbService {

    lateinit var boxStore: BoxStore

    override fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions,
    ): VectorDbRetrieveResponse? {
        TODO("Not yet implemented")
    }

    override fun list(
        params: VectorDbListParams,
        requestOptions: RequestOptions,
    ): List<ListVectorDbsResponse.Data> {
        TODO("Not yet implemented")
    }

    override fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions,
    ): VectorDbRegisterResponse {
        // Add vectorDb here
        val vectorDbId = params.vectorDbId()

        // create VectorDB
        val store = MyObjectBox.builder().inMemory(vectorDbId).build()
        val box = store.boxFor(RagVectorDb::class)
        clientOptions.setVectorDb(box)

        return VectorDbRegisterResponse.builder()
            .embeddingDimension(0)
            .embeddingModel(params.embeddingModel())
            .identifier(vectorDbId)
            .providerId("local")
            .providerResourceId("0")
            .build()
    }

    override fun unregister(params: VectorDbUnregisterParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented")
    }
}
