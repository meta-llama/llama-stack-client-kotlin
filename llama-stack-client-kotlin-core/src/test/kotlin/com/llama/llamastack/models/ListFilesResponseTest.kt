// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListFilesResponseTest {

    @Test
    fun create() {
        val listFilesResponse =
            ListFilesResponse.builder()
                .addData(
                    File.builder()
                        .id("id")
                        .bytes(0L)
                        .createdAt(0L)
                        .expiresAt(0L)
                        .filename("filename")
                        .purpose(File.Purpose.ASSISTANTS)
                        .build()
                )
                .firstId("first_id")
                .hasMore(true)
                .lastId("last_id")
                .build()

        assertThat(listFilesResponse.data())
            .containsExactly(
                File.builder()
                    .id("id")
                    .bytes(0L)
                    .createdAt(0L)
                    .expiresAt(0L)
                    .filename("filename")
                    .purpose(File.Purpose.ASSISTANTS)
                    .build()
            )
        assertThat(listFilesResponse.firstId()).isEqualTo("first_id")
        assertThat(listFilesResponse.hasMore()).isEqualTo(true)
        assertThat(listFilesResponse.lastId()).isEqualTo("last_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listFilesResponse =
            ListFilesResponse.builder()
                .addData(
                    File.builder()
                        .id("id")
                        .bytes(0L)
                        .createdAt(0L)
                        .expiresAt(0L)
                        .filename("filename")
                        .purpose(File.Purpose.ASSISTANTS)
                        .build()
                )
                .firstId("first_id")
                .hasMore(true)
                .lastId("last_id")
                .build()

        val roundtrippedListFilesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listFilesResponse),
                jacksonTypeRef<ListFilesResponse>(),
            )

        assertThat(roundtrippedListFilesResponse).isEqualTo(listFilesResponse)
    }
}
