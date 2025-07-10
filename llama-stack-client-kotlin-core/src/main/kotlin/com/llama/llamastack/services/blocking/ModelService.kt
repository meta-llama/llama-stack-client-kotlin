// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModelService

    /** Get a model by its identifier. */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model = retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model

    /** @see [retrieve] */
    fun retrieve(modelId: String, requestOptions: RequestOptions): Model =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /** List all models. */
    fun list(
        params: ModelListParams = ModelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Model>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<Model> =
        list(ModelListParams.none(), requestOptions)

    /** Register a model. */
    fun register(
        params: ModelRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Model

    /** Unregister a model. */
    fun unregister(
        modelId: String,
        params: ModelUnregisterParams = ModelUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see [unregister] */
    fun unregister(
        params: ModelUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    fun unregister(modelId: String, requestOptions: RequestOptions) =
        unregister(modelId, ModelUnregisterParams.none(), requestOptions)

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}`, but is otherwise the same as
         * [ModelService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(modelId: String, requestOptions: RequestOptions): HttpResponseFor<Model> =
            retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models`, but is otherwise the same as
         * [ModelService.list].
         */
        @MustBeClosed
        fun list(
            params: ModelListParams = ModelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Model>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Model>> =
            list(ModelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/models`, but is otherwise the same as
         * [ModelService.register].
         */
        @MustBeClosed
        fun register(
            params: ModelRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Model>

        /**
         * Returns a raw HTTP response for `delete /v1/models/{model_id}`, but is otherwise the same
         * as [ModelService.unregister].
         */
        @MustBeClosed
        fun unregister(
            modelId: String,
            params: ModelUnregisterParams = ModelUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unregister(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(
            params: ModelUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(modelId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(modelId, ModelUnregisterParams.none(), requestOptions)
    }
}
