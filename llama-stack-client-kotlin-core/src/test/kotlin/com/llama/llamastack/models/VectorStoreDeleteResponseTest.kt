// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreDeleteResponseTest {

    @Test
    fun create() {
        val vectorStoreDeleteResponse =
            VectorStoreDeleteResponse.builder().id("id").deleted(true).object_("object").build()

        assertThat(vectorStoreDeleteResponse.id()).isEqualTo("id")
        assertThat(vectorStoreDeleteResponse.deleted()).isEqualTo(true)
        assertThat(vectorStoreDeleteResponse.object_()).isEqualTo("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorStoreDeleteResponse =
            VectorStoreDeleteResponse.builder().id("id").deleted(true).object_("object").build()

        val roundtrippedVectorStoreDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorStoreDeleteResponse),
                jacksonTypeRef<VectorStoreDeleteResponse>(),
            )

        assertThat(roundtrippedVectorStoreDeleteResponse).isEqualTo(vectorStoreDeleteResponse)
    }
}
