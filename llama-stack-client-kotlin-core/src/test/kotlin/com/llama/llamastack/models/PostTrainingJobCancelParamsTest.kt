// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobCancelParamsTest {

    @Test
    fun create() {
        PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build()
    }

    @Test
    fun body() {
        val params = PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }
}
