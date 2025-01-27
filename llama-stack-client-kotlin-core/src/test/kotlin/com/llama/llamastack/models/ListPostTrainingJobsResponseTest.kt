// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListPostTrainingJobsResponseTest {

    @Test
    fun createListPostTrainingJobsResponse() {
        val listPostTrainingJobsResponse =
            ListPostTrainingJobsResponse.builder()
                .addData(ListPostTrainingJobsResponse.Data.builder().jobUuid("job_uuid").build())
                .build()
        assertThat(listPostTrainingJobsResponse).isNotNull
        assertThat(listPostTrainingJobsResponse.data())
            .containsExactly(
                ListPostTrainingJobsResponse.Data.builder().jobUuid("job_uuid").build()
            )
    }
}
