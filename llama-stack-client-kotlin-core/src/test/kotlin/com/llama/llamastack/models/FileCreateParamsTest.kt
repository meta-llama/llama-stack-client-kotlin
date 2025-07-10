// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCreateParamsTest {

    @Test
    fun create() {
        FileCreateParams.builder()
            .file("some content".byteInputStream())
            .purpose(FileCreateParams.Purpose.ASSISTANTS)
            .build()
    }

    @Test
    fun body() {
        val params =
            FileCreateParams.builder()
                .file("some content".byteInputStream())
                .purpose(FileCreateParams.Purpose.ASSISTANTS)
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "purpose" to MultipartField.of(FileCreateParams.Purpose.ASSISTANTS),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
