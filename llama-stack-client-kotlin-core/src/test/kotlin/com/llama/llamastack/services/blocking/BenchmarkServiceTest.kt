// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.BenchmarkListParams
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BenchmarkServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val benchmarkService = client.benchmarks()
        val benchmark =
            benchmarkService.retrieve(
                BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()
            )
        println(benchmark)
        benchmark?.validate()
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val benchmarkService = client.benchmarks()
        val listBenchmarksResponse = benchmarkService.list(BenchmarkListParams.builder().build())
        println(listBenchmarksResponse)
        for (benchmark: Benchmark in listBenchmarksResponse) {
            benchmark.validate()
        }
    }

    @Test
    fun callRegister() {
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
