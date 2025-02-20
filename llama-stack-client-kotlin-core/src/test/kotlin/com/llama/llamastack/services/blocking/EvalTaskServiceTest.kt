// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.EvalTaskListParams
import com.llama.llamastack.models.EvalTaskRegisterParams
import com.llama.llamastack.models.EvalTaskRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EvalTaskServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalTaskService = client.evalTasks()
        val benchmark =
            evalTaskService.retrieve(
                EvalTaskRetrieveParams.builder().evalTaskId("eval_task_id").build()
            )
        println(benchmark)
        benchmark?.validate()
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalTaskService = client.evalTasks()
        val listBenchmarksResponse = evalTaskService.list(EvalTaskListParams.builder().build())
        println(listBenchmarksResponse)
        for (benchmark: Benchmark in listBenchmarksResponse) {
            benchmark.validate()
        }
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalTaskService = client.evalTasks()
        evalTaskService.register(
            EvalTaskRegisterParams.builder()
                .datasetId("dataset_id")
                .evalTaskId("eval_task_id")
                .addScoringFunction("string")
                .metadata(
                    EvalTaskRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerBenchmarkId("provider_benchmark_id")
                .providerId("provider_id")
                .build()
        )
    }
}
