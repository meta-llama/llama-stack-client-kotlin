// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobListResponseTest {

    @Test
    fun createPostTrainingJobListResponse() {
        val postTrainingJobListResponse =
            PostTrainingJobListResponse.builder()
                .data(
                    listOf(PostTrainingJobListResponse.Data.builder().jobUuid("job_uuid").build())
                )
                .build()
        assertThat(postTrainingJobListResponse).isNotNull
        assertThat(postTrainingJobListResponse.data())
            .containsExactly(PostTrainingJobListResponse.Data.builder().jobUuid("job_uuid").build())
    }
}
