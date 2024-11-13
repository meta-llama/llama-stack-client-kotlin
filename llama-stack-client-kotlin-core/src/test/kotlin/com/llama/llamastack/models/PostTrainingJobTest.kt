// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobTest {

    @Test
    fun createPostTrainingJob() {
        val postTrainingJob = PostTrainingJob.builder().jobUuid("job_uuid").build()
        assertThat(postTrainingJob).isNotNull
        assertThat(postTrainingJob.jobUuid()).isEqualTo("job_uuid")
    }
}
