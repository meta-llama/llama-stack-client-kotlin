// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.DatasetCreateParams
import com.llama_stack_client.api.models.DatasetDeleteParams
import com.llama_stack_client.api.models.DatasetGetParams
import com.llama_stack_client.api.models.TrainEvalDataset

interface DatasetService {

    fun create(params: DatasetCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    fun delete(params: DatasetDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    fun get(
        params: DatasetGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TrainEvalDataset
}
