// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobLogStreamTest {

    @Test
    fun createPostTrainingJobLogStream() {
        val postTrainingJobLogStream =
            PostTrainingJobLogStream.builder()
                .jobUuid("job_uuid")
                .logLines(listOf("string"))
                .build()
        assertThat(postTrainingJobLogStream).isNotNull
        assertThat(postTrainingJobLogStream.jobUuid()).isEqualTo("job_uuid")
        assertThat(postTrainingJobLogStream.logLines()).containsExactly("string")
    }
}
