// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobLogsResponseTest {

    @Test
    fun createPostTrainingJobLogsResponse() {
        val postTrainingJobLogsResponse =
            PostTrainingJobLogsResponse.builder()
                .jobUuid("job_uuid")
                .logLines(listOf("string"))
                .build()
        assertThat(postTrainingJobLogsResponse).isNotNull
        assertThat(postTrainingJobLogsResponse.jobUuid()).isEqualTo("job_uuid")
        assertThat(postTrainingJobLogsResponse.logLines()).containsExactly("string")
    }
}
