// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.llama_stack_client.api.client.LlamaStackClientClient
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.core.JsonString
import com.llama_stack_client.api.core.jsonMapper
import com.llama_stack_client.api.errors.BadRequestException
import com.llama_stack_client.api.errors.InternalServerException
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.errors.LlamaStackClientException
import com.llama_stack_client.api.errors.NotFoundException
import com.llama_stack_client.api.errors.PermissionDeniedException
import com.llama_stack_client.api.errors.RateLimitException
import com.llama_stack_client.api.errors.UnauthorizedException
import com.llama_stack_client.api.errors.UnexpectedStatusCodeException
import com.llama_stack_client.api.errors.UnprocessableEntityException
import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val LLAMA_STACK_CLIENT_ERROR: LlamaStackClientError =
        LlamaStackClientError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: LlamaStackClientClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LlamaStackClientOkHttpClient.builder().baseUrl(wmRuntimeInfo.getHttpBaseUrl()).build()
    }

    @Test
    fun sessionsCreate200() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        val expected = AgentSessionCreateResponse.builder().sessionId("session_id").build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.agents().sessions().create(params)).isEqualTo(expected)
    }

    @Test
    fun sessionsCreate400() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun sessionsCreate401() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertUnauthorized(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun sessionsCreate403() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun sessionsCreate404() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), LLAMA_STACK_CLIENT_ERROR)
            })
    }

    @Test
    fun sessionsCreate422() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun sessionsCreate429() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), LLAMA_STACK_CLIENT_ERROR)
            })
    }

    @Test
    fun sessionsCreate500() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(LLAMA_STACK_CLIENT_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(LlamaStackClientException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.agents().sessions().create(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    ImmutableListMultimap.of(),
                    LlamaStackClientError.builder().build()
                )
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
