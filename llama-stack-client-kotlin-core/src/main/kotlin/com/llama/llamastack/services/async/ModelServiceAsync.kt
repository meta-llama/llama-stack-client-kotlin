// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Model
import com.llama.llamastack.models.ModelListParams
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ModelRetrieveParams
import com.llama.llamastack.models.ModelUnregisterParams

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModelServiceAsync

    /** Get a model by its identifier. */
    suspend fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model = retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model

    /** @see [retrieve] */
    suspend fun retrieve(modelId: String, requestOptions: RequestOptions): Model =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /** List all models. */
    suspend fun list(
        params: ModelListParams = ModelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Model>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<Model> =
        list(ModelListParams.none(), requestOptions)

    /** Register a model. */
    suspend fun register(
        params: ModelRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model

    /** Unregister a model. */
    suspend fun unregister(
        modelId: String,
        params: ModelUnregisterParams = ModelUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see [unregister] */
    suspend fun unregister(
        params: ModelUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    suspend fun unregister(modelId: String, requestOptions: RequestOptions) =
        unregister(modelId, ModelUnregisterParams.none(), requestOptions)

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}`, but is otherwise the same as
         * [ModelServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            modelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Model> = retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models`, but is otherwise the same as
         * [ModelServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ModelListParams = ModelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Model>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Model>> =
            list(ModelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/models`, but is otherwise the same as
         * [ModelServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: ModelRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model>

        /**
         * Returns a raw HTTP response for `delete /v1/models/{model_id}`, but is otherwise the same
         * as [ModelServiceAsync.unregister].
         */
        @MustBeClosed
        suspend fun unregister(
            modelId: String,
            params: ModelUnregisterParams = ModelUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unregister(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        suspend fun unregister(
            params: ModelUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        suspend fun unregister(modelId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(modelId, ModelUnregisterParams.none(), requestOptions)
    }
}
