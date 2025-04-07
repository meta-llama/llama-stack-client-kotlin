// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListPostTrainingJobsResponseTest {

    @Test
    fun create() {
        val listPostTrainingJobsResponse =
            ListPostTrainingJobsResponse.builder()
                .addData(ListPostTrainingJobsResponse.Data.builder().jobUuid("job_uuid").build())
                .build()

        assertThat(listPostTrainingJobsResponse.data())
            .containsExactly(
                ListPostTrainingJobsResponse.Data.builder().jobUuid("job_uuid").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listPostTrainingJobsResponse =
            ListPostTrainingJobsResponse.builder()
                .addData(ListPostTrainingJobsResponse.Data.builder().jobUuid("job_uuid").build())
                .build()

        val roundtrippedListPostTrainingJobsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listPostTrainingJobsResponse),
                jacksonTypeRef<ListPostTrainingJobsResponse>(),
            )

        assertThat(roundtrippedListPostTrainingJobsResponse).isEqualTo(listPostTrainingJobsResponse)
    }
}
