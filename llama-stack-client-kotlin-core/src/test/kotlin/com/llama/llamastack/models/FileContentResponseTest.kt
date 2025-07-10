// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileContentResponseTest {

    @Test
    fun create() {
        val fileContentResponse = FileContentResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileContentResponse = FileContentResponse.builder().build()

        val roundtrippedFileContentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileContentResponse),
                jacksonTypeRef<FileContentResponse>(),
            )

        assertThat(roundtrippedFileContentResponse).isEqualTo(fileContentResponse)
    }
}
