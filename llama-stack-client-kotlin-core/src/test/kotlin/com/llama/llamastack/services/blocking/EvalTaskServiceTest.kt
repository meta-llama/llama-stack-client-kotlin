// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.EvalTaskListParams
import com.llama.llamastack.models.EvalTaskRegisterParams
import com.llama.llamastack.models.EvalTaskRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EvalTaskServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalTaskService = client.evalTasks()
        val evalTask =
            evalTaskService.retrieve(
                EvalTaskRetrieveParams.builder()
                    .name("name")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(evalTask)
        evalTask?.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalTaskService = client.evalTasks()
        val evalTask =
            evalTaskService.list(
                EvalTaskListParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(evalTask)
        evalTask.validate()
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
                .scoringFunctions(listOf("string"))
                .metadata(
                    EvalTaskRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerEvalTaskId("provider_eval_task_id")
                .providerId("provider_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }
}
