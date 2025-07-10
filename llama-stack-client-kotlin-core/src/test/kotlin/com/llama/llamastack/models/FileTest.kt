// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun create() {
        val file =
            File.builder()
                .id("id")
                .bytes(0L)
                .createdAt(0L)
                .expiresAt(0L)
                .filename("filename")
                .purpose(File.Purpose.ASSISTANTS)
                .build()

        assertThat(file.id()).isEqualTo("id")
        assertThat(file.bytes()).isEqualTo(0L)
        assertThat(file.createdAt()).isEqualTo(0L)
        assertThat(file.expiresAt()).isEqualTo(0L)
        assertThat(file.filename()).isEqualTo("filename")
        assertThat(file.purpose()).isEqualTo(File.Purpose.ASSISTANTS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val file =
            File.builder()
                .id("id")
                .bytes(0L)
                .createdAt(0L)
                .expiresAt(0L)
                .filename("filename")
                .purpose(File.Purpose.ASSISTANTS)
                .build()

        val roundtrippedFile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(file), jacksonTypeRef<File>())

        assertThat(roundtrippedFile).isEqualTo(file)
    }
}
