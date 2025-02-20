package com.llama.llamastack.core.handlers

import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.SseMessage
import com.llama.llamastack.core.jsonMapper
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.charset.StandardCharsets
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.catchThrowable
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

class SseHandlerTest {

    enum class TestCase(
        internal val body: String,
        internal val expectedMessages: List<SseMessage>? = null,
        internal val expectedException: Exception? = null,
    ) {
        EVENT_AND_DATA(
            buildString {
                append("event: event\n")
                append("data: {\"foo\":true}\n")
                append("\n")
            },
            listOf(sseMessageBuilder().event("event").data("{\"foo\":true}").build()),
        ),
        DATA_MISSING_EVENT(
            buildString {
                append("data: {\"foo\":true}\n")
                append("\n")
            },
            listOf(sseMessageBuilder().data("{\"foo\":true}").build()),
        ),
        EVENT_MISSING_DATA(
            buildString {
                append("event: event\n")
                append("\n")
            },
            listOf(sseMessageBuilder().event("event").build()),
        ),
        MULTIPLE_EVENTS_AND_DATA(
            buildString {
                append("event: event\n")
                append("data: {\"foo\":true}\n")
                append("\n")
                append("event: event\n")
                append("data: {\"bar\":false}\n")
                append("\n")
            },
            listOf(
                sseMessageBuilder().event("event").data("{\"foo\":true}").build(),
                sseMessageBuilder().event("event").data("{\"bar\":false}").build(),
            ),
        ),
        MULTIPLE_EVENTS_MISSING_DATA(
            buildString {
                append("event: event\n")
                append("\n")
                append("event: event\n")
                append("\n")
            },
            listOf(
                sseMessageBuilder().event("event").build(),
                sseMessageBuilder().event("event").build(),
            ),
        ),
        MULTIPLE_DATA_MISSING_EVENT(
            buildString {
                append("data: {\"foo\":true}\n")
                append("\n")
                append("data: {\"bar\":false}\n")
                append("\n")
            },
            listOf(
                sseMessageBuilder().data("{\"foo\":true}").build(),
                sseMessageBuilder().data("{\"bar\":false}").build(),
            ),
        ),
        DATA_JSON_ESCAPED_DOUBLE_NEW_LINE(
            buildString {
                append("event: event\n")
                append("data: {\n")
                append("data: \"foo\":\n")
                append("data: true}\n")
                append("\n\n")
            },
            listOf(sseMessageBuilder().event("event").data("{\n\"foo\":\ntrue}").build()),
        ),
        MULTIPLE_DATA_LINES(
            buildString {
                append("event: event\n")
                append("data: {\n")
                append("data: \"foo\":\n")
                append("data: true}\n")
                append("\n\n")
            },
            listOf(sseMessageBuilder().event("event").data("{\n\"foo\":\ntrue}").build()),
        ),
        SPECIAL_NEW_LINE_CHARACTER(
            buildString {
                append("event: event\n")
                append("data: {\"content\":\" culpa\"}\n")
                append("\n")
                append("event: event\n")
                append("data: {\"content\":\" \u2028\"}\n")
                append("\n")
                append("event: event\n")
                append("data: {\"content\":\"foo\"}\n")
                append("\n")
            },
            listOf(
                sseMessageBuilder().event("event").data("{\"content\":\" culpa\"}").build(),
                sseMessageBuilder().event("event").data("{\"content\":\" \u2028\"}").build(),
                sseMessageBuilder().event("event").data("{\"content\":\"foo\"}").build(),
            ),
        ),
        MULTI_BYTE_CHARACTER(
            buildString {
                append("event: event\n")
                append("data: {\"content\":\"\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u0438\"}\n")
                append("\n")
            },
            listOf(sseMessageBuilder().event("event").data("{\"content\":\"известни\"}").build()),
        ),
    }

    @ParameterizedTest
    @EnumSource
    fun handle(testCase: TestCase) {
        val response = httpResponse(testCase.body)
        var messages: List<SseMessage>? = null
        var exception: Exception? = null

        try {
            messages = sseHandler(jsonMapper()).handle(response).use { it.asSequence().toList() }
        } catch (e: Exception) {
            exception = e
        }

        if (testCase.expectedMessages != null) {
            assertThat(messages).containsExactlyElementsOf(testCase.expectedMessages)
        }
        if (testCase.expectedException != null) {
            assertThat(exception).isInstanceOf(testCase.expectedException.javaClass)
            assertThat(exception).hasMessage(testCase.expectedException.message)
        }
    }

    @Test
    fun cannotReuseSequence() {
        val response = httpResponse("body")
        val streamResponse = sseHandler(jsonMapper()).handle(response)

        val throwable =
            streamResponse.use {
                it.asSequence().toList()
                catchThrowable { it.asSequence().toList() }
            }

        assertThat(throwable).isInstanceOf(IllegalStateException::class.java)
    }
}

private fun httpResponse(body: String): HttpResponse =
    object : HttpResponse {
        override fun statusCode(): Int = 0

        override fun headers(): Headers = Headers.builder().build()

        override fun body(): InputStream =
            ByteArrayInputStream(body.toByteArray(StandardCharsets.UTF_8))

        override fun close() {}
    }

private fun sseMessageBuilder() = SseMessage.builder().jsonMapper(jsonMapper())
