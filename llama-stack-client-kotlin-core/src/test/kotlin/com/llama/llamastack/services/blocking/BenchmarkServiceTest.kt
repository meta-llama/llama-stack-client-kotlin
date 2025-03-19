// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BenchmarkServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val benchmarkService = client.benchmarks()

        val benchmark =
            benchmarkService.retrieve(
                BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()
            )

        assertNotNull(benchmark)
        benchmark.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val benchmarkService = client.benchmarks()

        val benchmarks = benchmarkService.list()

        benchmarks.forEach { it.validate() }
    }

    @Test
    fun register() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val benchmarkService = client.benchmarks()

        benchmarkService.register(
            BenchmarkRegisterParams.builder()
                .benchmarkId("benchmark_id")
                .datasetId("dataset_id")
                .addScoringFunction("string")
                .metadata(
                    BenchmarkRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerBenchmarkId("provider_benchmark_id")
                .providerId("provider_id")
                .build()
        )
    }
}
