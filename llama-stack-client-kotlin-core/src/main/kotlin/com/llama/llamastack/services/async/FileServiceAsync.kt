// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.DeleteFileResponse
import com.llama.llamastack.models.File
import com.llama.llamastack.models.FileContentParams
import com.llama.llamastack.models.FileContentResponse
import com.llama.llamastack.models.FileCreateParams
import com.llama.llamastack.models.FileDeleteParams
import com.llama.llamastack.models.FileListParams
import com.llama.llamastack.models.FileRetrieveParams
import com.llama.llamastack.models.ListFilesResponse

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync

    /**
     * Upload a file that can be used across various endpoints. The file upload should be a
     * multipart form request with:
     * - file: The File object (not file name) to be uploaded.
     * - purpose: The intended purpose of the uploaded file.
     */
    suspend fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Returns information about a specific file. */
    suspend fun retrieve(
        fileId: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see [retrieve] */
    suspend fun retrieve(fileId: String, requestOptions: RequestOptions): File =
        retrieve(fileId, FileRetrieveParams.none(), requestOptions)

    /** Returns a list of files that belong to the user's organization. */
    suspend fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFilesResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ListFilesResponse =
        list(FileListParams.none(), requestOptions)

    /** Delete a file. */
    suspend fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteFileResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteFileResponse

    /** @see [delete] */
    suspend fun delete(fileId: String, requestOptions: RequestOptions): DeleteFileResponse =
        delete(fileId, FileDeleteParams.none(), requestOptions)

    /** Returns the contents of the specified file. */
    suspend fun content(
        fileId: String,
        params: FileContentParams = FileContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileContentResponse = content(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [content] */
    suspend fun content(
        params: FileContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileContentResponse

    /** @see [content] */
    suspend fun content(fileId: String, requestOptions: RequestOptions): FileContentResponse =
        content(fileId, FileContentParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/files/{file_id}`, but is otherwise the
         * same as [FileServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> = retrieve(fileId, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFilesResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ListFilesResponse> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/openai/v1/files/{file_id}`, but is otherwise
         * the same as [FileServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteFileResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteFileResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteFileResponse> =
            delete(fileId, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/files/{file_id}/content`, but is
         * otherwise the same as [FileServiceAsync.content].
         */
        @MustBeClosed
        suspend fun content(
            fileId: String,
            params: FileContentParams = FileContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileContentResponse> =
            content(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [content] */
        @MustBeClosed
        suspend fun content(
            params: FileContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileContentResponse>

        /** @see [content] */
        @MustBeClosed
        suspend fun content(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileContentResponse> =
            content(fileId, FileContentParams.none(), requestOptions)
    }
}
