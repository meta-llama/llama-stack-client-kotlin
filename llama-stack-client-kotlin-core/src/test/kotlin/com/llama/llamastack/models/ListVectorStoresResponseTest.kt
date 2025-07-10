// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListVectorStoresResponseTest {

    @Test
    fun create() {
        val listVectorStoresResponse =
            ListVectorStoresResponse.builder()
                .addData(
                    VectorStore.builder()
                        .id("id")
                        .createdAt(0L)
                        .fileCounts(
                            VectorStore.FileCounts.builder()
                                .cancelled(0L)
                                .completed(0L)
                                .failed(0L)
                                .inProgress(0L)
                                .total(0L)
                                .build()
                        )
                        .metadata(
                            VectorStore.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .object_("object")
                        .status("status")
                        .usageBytes(0L)
                        .expiresAfter(
                            VectorStore.ExpiresAfter.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .expiresAt(0L)
                        .lastActiveAt(0L)
                        .name("name")
                        .build()
                )
                .hasMore(true)
                .object_("object")
                .firstId("first_id")
                .lastId("last_id")
                .build()

        assertThat(listVectorStoresResponse.data())
            .containsExactly(
                VectorStore.builder()
                    .id("id")
                    .createdAt(0L)
                    .fileCounts(
                        VectorStore.FileCounts.builder()
                            .cancelled(0L)
                            .completed(0L)
                            .failed(0L)
                            .inProgress(0L)
                            .total(0L)
                            .build()
                    )
                    .metadata(
                        VectorStore.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .object_("object")
                    .status("status")
                    .usageBytes(0L)
                    .expiresAfter(
                        VectorStore.ExpiresAfter.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .expiresAt(0L)
                    .lastActiveAt(0L)
                    .name("name")
                    .build()
            )
        assertThat(listVectorStoresResponse.hasMore()).isEqualTo(true)
        assertThat(listVectorStoresResponse.object_()).isEqualTo("object")
        assertThat(listVectorStoresResponse.firstId()).isEqualTo("first_id")
        assertThat(listVectorStoresResponse.lastId()).isEqualTo("last_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listVectorStoresResponse =
            ListVectorStoresResponse.builder()
                .addData(
                    VectorStore.builder()
                        .id("id")
                        .createdAt(0L)
                        .fileCounts(
                            VectorStore.FileCounts.builder()
                                .cancelled(0L)
                                .completed(0L)
                                .failed(0L)
                                .inProgress(0L)
                                .total(0L)
                                .build()
                        )
                        .metadata(
                            VectorStore.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .object_("object")
                        .status("status")
                        .usageBytes(0L)
                        .expiresAfter(
                            VectorStore.ExpiresAfter.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .expiresAt(0L)
                        .lastActiveAt(0L)
                        .name("name")
                        .build()
                )
                .hasMore(true)
                .object_("object")
                .firstId("first_id")
                .lastId("last_id")
                .build()

        val roundtrippedListVectorStoresResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listVectorStoresResponse),
                jacksonTypeRef<ListVectorStoresResponse>(),
            )

        assertThat(roundtrippedListVectorStoresResponse).isEqualTo(listVectorStoresResponse)
    }
}
