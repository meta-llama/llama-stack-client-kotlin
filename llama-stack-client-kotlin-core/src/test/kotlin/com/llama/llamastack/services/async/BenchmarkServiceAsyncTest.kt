// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BenchmarkServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val benchmarkServiceAsync = client.benchmarks()

        val benchmark =
            benchmarkServiceAsync.retrieve(
                BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()
            )

        assertNotNull(benchmark)
        benchmark.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val benchmarkServiceAsync = client.benchmarks()

        val benchmarks = benchmarkServiceAsync.list()

        benchmarks.forEach { it.validate() }
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val benchmarkServiceAsync = client.benchmarks()

        benchmarkServiceAsync.register(
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
