// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalTaskRetrieveParamsTest {

    @Test
    fun create() {
        EvalTaskRetrieveParams.builder().evalTaskId("eval_task_id").build()
    }

    @Test
    fun getPathParam() {
        val params = EvalTaskRetrieveParams.builder().evalTaskId("eval_task_id").build()
        assertThat(params).isNotNull
        // path param "evalTaskId"
        assertThat(params.getPathParam(0)).isEqualTo("eval_task_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
