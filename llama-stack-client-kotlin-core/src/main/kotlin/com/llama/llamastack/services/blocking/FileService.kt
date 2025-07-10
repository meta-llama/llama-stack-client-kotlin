// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService

    /**
     * Upload a file that can be used across various endpoints. The file upload should be a
     * multipart form request with:
     * - file: The File object (not file name) to be uploaded.
     * - purpose: The intended purpose of the uploaded file.
     */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Returns information about a specific file. */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see [retrieve] */
    fun retrieve(fileId: String, requestOptions: RequestOptions): File =
        retrieve(fileId, FileRetrieveParams.none(), requestOptions)

    /** Returns a list of files that belong to the user's organization. */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFilesResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ListFilesResponse =
        list(FileListParams.none(), requestOptions)

    /** Delete a file. */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteFileResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteFileResponse

    /** @see [delete] */
    fun delete(fileId: String, requestOptions: RequestOptions): DeleteFileResponse =
        delete(fileId, FileDeleteParams.none(), requestOptions)

    /** Returns the contents of the specified file. */
    fun content(
        fileId: String,
        params: FileContentParams = FileContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileContentResponse = content(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [content] */
    fun content(
        params: FileContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileContentResponse

    /** @see [content] */
    fun content(fileId: String, requestOptions: RequestOptions): FileContentResponse =
        content(fileId, FileContentParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/files`, but is otherwise the same as
         * [FileService.create].
         */
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/files/{file_id}`, but is otherwise the
         * same as [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            retrieve(fileId, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFilesResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ListFilesResponse> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/openai/v1/files/{file_id}`, but is otherwise
         * the same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteFileResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteFileResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteFileResponse> =
            delete(fileId, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/files/{file_id}/content`, but is
         * otherwise the same as [FileService.content].
         */
        @MustBeClosed
        fun content(
            fileId: String,
            params: FileContentParams = FileContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileContentResponse> =
            content(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [content] */
        @MustBeClosed
        fun content(
            params: FileContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileContentResponse>

        /** @see [content] */
        @MustBeClosed
        fun content(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileContentResponse> =
            content(fileId, FileContentParams.none(), requestOptions)
    }
}
