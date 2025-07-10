// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteFileResponseTest {

    @Test
    fun create() {
        val deleteFileResponse = DeleteFileResponse.builder().id("id").deleted(true).build()

        assertThat(deleteFileResponse.id()).isEqualTo("id")
        assertThat(deleteFileResponse.deleted()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteFileResponse = DeleteFileResponse.builder().id("id").deleted(true).build()

        val roundtrippedDeleteFileResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteFileResponse),
                jacksonTypeRef<DeleteFileResponse>(),
            )

        assertThat(roundtrippedDeleteFileResponse).isEqualTo(deleteFileResponse)
    }
}
