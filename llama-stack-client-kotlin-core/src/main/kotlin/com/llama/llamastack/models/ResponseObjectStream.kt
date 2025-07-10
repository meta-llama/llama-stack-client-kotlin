// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.allMaxBy
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ResponseObjectStream.Deserializer::class)
@JsonSerialize(using = ResponseObjectStream.Serializer::class)
class ResponseObjectStream
private constructor(
    private val created: ResponseCreated? = null,
    private val outputItemAdded: ResponseOutputItemAdded? = null,
    private val outputItemDone: ResponseOutputItemDone? = null,
    private val outputTextDelta: ResponseOutputTextDelta? = null,
    private val outputTextDone: ResponseOutputTextDone? = null,
    private val functionCallArgumentsDelta: ResponseFunctionCallArgumentsDelta? = null,
    private val functionCallArgumentsDone: ResponseFunctionCallArgumentsDone? = null,
    private val webSearchCallInProgress: ResponseWebSearchCallInProgress? = null,
    private val webSearchCallSearching: ResponseWebSearchCallSearching? = null,
    private val webSearchCallCompleted: ResponseWebSearchCallCompleted? = null,
    private val mcpListToolsInProgress: ResponseMcpListToolsInProgress? = null,
    private val mcpListToolsFailed: ResponseMcpListToolsFailed? = null,
    private val mcpListToolsCompleted: ResponseMcpListToolsCompleted? = null,
    private val mcpCallArgumentsDelta: ResponseMcpCallArgumentsDelta? = null,
    private val mcpCallArgumentsDone: ResponseMcpCallArgumentsDone? = null,
    private val mcpCallInProgress: ResponseMcpCallInProgress? = null,
    private val mcpCallFailed: ResponseMcpCallFailed? = null,
    private val mcpCallCompleted: ResponseMcpCallCompleted? = null,
    private val completed: ResponseCompleted? = null,
    private val _json: JsonValue? = null,
) {

    fun created(): ResponseCreated? = created

    fun outputItemAdded(): ResponseOutputItemAdded? = outputItemAdded

    fun outputItemDone(): ResponseOutputItemDone? = outputItemDone

    fun outputTextDelta(): ResponseOutputTextDelta? = outputTextDelta

    fun outputTextDone(): ResponseOutputTextDone? = outputTextDone

    fun functionCallArgumentsDelta(): ResponseFunctionCallArgumentsDelta? =
        functionCallArgumentsDelta

    fun functionCallArgumentsDone(): ResponseFunctionCallArgumentsDone? = functionCallArgumentsDone

    fun webSearchCallInProgress(): ResponseWebSearchCallInProgress? = webSearchCallInProgress

    fun webSearchCallSearching(): ResponseWebSearchCallSearching? = webSearchCallSearching

    fun webSearchCallCompleted(): ResponseWebSearchCallCompleted? = webSearchCallCompleted

    fun mcpListToolsInProgress(): ResponseMcpListToolsInProgress? = mcpListToolsInProgress

    fun mcpListToolsFailed(): ResponseMcpListToolsFailed? = mcpListToolsFailed

    fun mcpListToolsCompleted(): ResponseMcpListToolsCompleted? = mcpListToolsCompleted

    fun mcpCallArgumentsDelta(): ResponseMcpCallArgumentsDelta? = mcpCallArgumentsDelta

    fun mcpCallArgumentsDone(): ResponseMcpCallArgumentsDone? = mcpCallArgumentsDone

    fun mcpCallInProgress(): ResponseMcpCallInProgress? = mcpCallInProgress

    fun mcpCallFailed(): ResponseMcpCallFailed? = mcpCallFailed

    fun mcpCallCompleted(): ResponseMcpCallCompleted? = mcpCallCompleted

    fun completed(): ResponseCompleted? = completed

    fun isCreated(): Boolean = created != null

    fun isOutputItemAdded(): Boolean = outputItemAdded != null

    fun isOutputItemDone(): Boolean = outputItemDone != null

    fun isOutputTextDelta(): Boolean = outputTextDelta != null

    fun isOutputTextDone(): Boolean = outputTextDone != null

    fun isFunctionCallArgumentsDelta(): Boolean = functionCallArgumentsDelta != null

    fun isFunctionCallArgumentsDone(): Boolean = functionCallArgumentsDone != null

    fun isWebSearchCallInProgress(): Boolean = webSearchCallInProgress != null

    fun isWebSearchCallSearching(): Boolean = webSearchCallSearching != null

    fun isWebSearchCallCompleted(): Boolean = webSearchCallCompleted != null

    fun isMcpListToolsInProgress(): Boolean = mcpListToolsInProgress != null

    fun isMcpListToolsFailed(): Boolean = mcpListToolsFailed != null

    fun isMcpListToolsCompleted(): Boolean = mcpListToolsCompleted != null

    fun isMcpCallArgumentsDelta(): Boolean = mcpCallArgumentsDelta != null

    fun isMcpCallArgumentsDone(): Boolean = mcpCallArgumentsDone != null

    fun isMcpCallInProgress(): Boolean = mcpCallInProgress != null

    fun isMcpCallFailed(): Boolean = mcpCallFailed != null

    fun isMcpCallCompleted(): Boolean = mcpCallCompleted != null

    fun isCompleted(): Boolean = completed != null

    fun asCreated(): ResponseCreated = created.getOrThrow("created")

    fun asOutputItemAdded(): ResponseOutputItemAdded = outputItemAdded.getOrThrow("outputItemAdded")

    fun asOutputItemDone(): ResponseOutputItemDone = outputItemDone.getOrThrow("outputItemDone")

    fun asOutputTextDelta(): ResponseOutputTextDelta = outputTextDelta.getOrThrow("outputTextDelta")

    fun asOutputTextDone(): ResponseOutputTextDone = outputTextDone.getOrThrow("outputTextDone")

    fun asFunctionCallArgumentsDelta(): ResponseFunctionCallArgumentsDelta =
        functionCallArgumentsDelta.getOrThrow("functionCallArgumentsDelta")

    fun asFunctionCallArgumentsDone(): ResponseFunctionCallArgumentsDone =
        functionCallArgumentsDone.getOrThrow("functionCallArgumentsDone")

    fun asWebSearchCallInProgress(): ResponseWebSearchCallInProgress =
        webSearchCallInProgress.getOrThrow("webSearchCallInProgress")

    fun asWebSearchCallSearching(): ResponseWebSearchCallSearching =
        webSearchCallSearching.getOrThrow("webSearchCallSearching")

    fun asWebSearchCallCompleted(): ResponseWebSearchCallCompleted =
        webSearchCallCompleted.getOrThrow("webSearchCallCompleted")

    fun asMcpListToolsInProgress(): ResponseMcpListToolsInProgress =
        mcpListToolsInProgress.getOrThrow("mcpListToolsInProgress")

    fun asMcpListToolsFailed(): ResponseMcpListToolsFailed =
        mcpListToolsFailed.getOrThrow("mcpListToolsFailed")

    fun asMcpListToolsCompleted(): ResponseMcpListToolsCompleted =
        mcpListToolsCompleted.getOrThrow("mcpListToolsCompleted")

    fun asMcpCallArgumentsDelta(): ResponseMcpCallArgumentsDelta =
        mcpCallArgumentsDelta.getOrThrow("mcpCallArgumentsDelta")

    fun asMcpCallArgumentsDone(): ResponseMcpCallArgumentsDone =
        mcpCallArgumentsDone.getOrThrow("mcpCallArgumentsDone")

    fun asMcpCallInProgress(): ResponseMcpCallInProgress =
        mcpCallInProgress.getOrThrow("mcpCallInProgress")

    fun asMcpCallFailed(): ResponseMcpCallFailed = mcpCallFailed.getOrThrow("mcpCallFailed")

    fun asMcpCallCompleted(): ResponseMcpCallCompleted =
        mcpCallCompleted.getOrThrow("mcpCallCompleted")

    fun asCompleted(): ResponseCompleted = completed.getOrThrow("completed")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            created != null -> visitor.visitCreated(created)
            outputItemAdded != null -> visitor.visitOutputItemAdded(outputItemAdded)
            outputItemDone != null -> visitor.visitOutputItemDone(outputItemDone)
            outputTextDelta != null -> visitor.visitOutputTextDelta(outputTextDelta)
            outputTextDone != null -> visitor.visitOutputTextDone(outputTextDone)
            functionCallArgumentsDelta != null ->
                visitor.visitFunctionCallArgumentsDelta(functionCallArgumentsDelta)
            functionCallArgumentsDone != null ->
                visitor.visitFunctionCallArgumentsDone(functionCallArgumentsDone)
            webSearchCallInProgress != null ->
                visitor.visitWebSearchCallInProgress(webSearchCallInProgress)
            webSearchCallSearching != null ->
                visitor.visitWebSearchCallSearching(webSearchCallSearching)
            webSearchCallCompleted != null ->
                visitor.visitWebSearchCallCompleted(webSearchCallCompleted)
            mcpListToolsInProgress != null ->
                visitor.visitMcpListToolsInProgress(mcpListToolsInProgress)
            mcpListToolsFailed != null -> visitor.visitMcpListToolsFailed(mcpListToolsFailed)
            mcpListToolsCompleted != null ->
                visitor.visitMcpListToolsCompleted(mcpListToolsCompleted)
            mcpCallArgumentsDelta != null ->
                visitor.visitMcpCallArgumentsDelta(mcpCallArgumentsDelta)
            mcpCallArgumentsDone != null -> visitor.visitMcpCallArgumentsDone(mcpCallArgumentsDone)
            mcpCallInProgress != null -> visitor.visitMcpCallInProgress(mcpCallInProgress)
            mcpCallFailed != null -> visitor.visitMcpCallFailed(mcpCallFailed)
            mcpCallCompleted != null -> visitor.visitMcpCallCompleted(mcpCallCompleted)
            completed != null -> visitor.visitCompleted(completed)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ResponseObjectStream = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCreated(created: ResponseCreated) {
                    created.validate()
                }

                override fun visitOutputItemAdded(outputItemAdded: ResponseOutputItemAdded) {
                    outputItemAdded.validate()
                }

                override fun visitOutputItemDone(outputItemDone: ResponseOutputItemDone) {
                    outputItemDone.validate()
                }

                override fun visitOutputTextDelta(outputTextDelta: ResponseOutputTextDelta) {
                    outputTextDelta.validate()
                }

                override fun visitOutputTextDone(outputTextDone: ResponseOutputTextDone) {
                    outputTextDone.validate()
                }

                override fun visitFunctionCallArgumentsDelta(
                    functionCallArgumentsDelta: ResponseFunctionCallArgumentsDelta
                ) {
                    functionCallArgumentsDelta.validate()
                }

                override fun visitFunctionCallArgumentsDone(
                    functionCallArgumentsDone: ResponseFunctionCallArgumentsDone
                ) {
                    functionCallArgumentsDone.validate()
                }

                override fun visitWebSearchCallInProgress(
                    webSearchCallInProgress: ResponseWebSearchCallInProgress
                ) {
                    webSearchCallInProgress.validate()
                }

                override fun visitWebSearchCallSearching(
                    webSearchCallSearching: ResponseWebSearchCallSearching
                ) {
                    webSearchCallSearching.validate()
                }

                override fun visitWebSearchCallCompleted(
                    webSearchCallCompleted: ResponseWebSearchCallCompleted
                ) {
                    webSearchCallCompleted.validate()
                }

                override fun visitMcpListToolsInProgress(
                    mcpListToolsInProgress: ResponseMcpListToolsInProgress
                ) {
                    mcpListToolsInProgress.validate()
                }

                override fun visitMcpListToolsFailed(
                    mcpListToolsFailed: ResponseMcpListToolsFailed
                ) {
                    mcpListToolsFailed.validate()
                }

                override fun visitMcpListToolsCompleted(
                    mcpListToolsCompleted: ResponseMcpListToolsCompleted
                ) {
                    mcpListToolsCompleted.validate()
                }

                override fun visitMcpCallArgumentsDelta(
                    mcpCallArgumentsDelta: ResponseMcpCallArgumentsDelta
                ) {
                    mcpCallArgumentsDelta.validate()
                }

                override fun visitMcpCallArgumentsDone(
                    mcpCallArgumentsDone: ResponseMcpCallArgumentsDone
                ) {
                    mcpCallArgumentsDone.validate()
                }

                override fun visitMcpCallInProgress(mcpCallInProgress: ResponseMcpCallInProgress) {
                    mcpCallInProgress.validate()
                }

                override fun visitMcpCallFailed(mcpCallFailed: ResponseMcpCallFailed) {
                    mcpCallFailed.validate()
                }

                override fun visitMcpCallCompleted(mcpCallCompleted: ResponseMcpCallCompleted) {
                    mcpCallCompleted.validate()
                }

                override fun visitCompleted(completed: ResponseCompleted) {
                    completed.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitCreated(created: ResponseCreated) = created.validity()

                override fun visitOutputItemAdded(outputItemAdded: ResponseOutputItemAdded) =
                    outputItemAdded.validity()

                override fun visitOutputItemDone(outputItemDone: ResponseOutputItemDone) =
                    outputItemDone.validity()

                override fun visitOutputTextDelta(outputTextDelta: ResponseOutputTextDelta) =
                    outputTextDelta.validity()

                override fun visitOutputTextDone(outputTextDone: ResponseOutputTextDone) =
                    outputTextDone.validity()

                override fun visitFunctionCallArgumentsDelta(
                    functionCallArgumentsDelta: ResponseFunctionCallArgumentsDelta
                ) = functionCallArgumentsDelta.validity()

                override fun visitFunctionCallArgumentsDone(
                    functionCallArgumentsDone: ResponseFunctionCallArgumentsDone
                ) = functionCallArgumentsDone.validity()

                override fun visitWebSearchCallInProgress(
                    webSearchCallInProgress: ResponseWebSearchCallInProgress
                ) = webSearchCallInProgress.validity()

                override fun visitWebSearchCallSearching(
                    webSearchCallSearching: ResponseWebSearchCallSearching
                ) = webSearchCallSearching.validity()

                override fun visitWebSearchCallCompleted(
                    webSearchCallCompleted: ResponseWebSearchCallCompleted
                ) = webSearchCallCompleted.validity()

                override fun visitMcpListToolsInProgress(
                    mcpListToolsInProgress: ResponseMcpListToolsInProgress
                ) = mcpListToolsInProgress.validity()

                override fun visitMcpListToolsFailed(
                    mcpListToolsFailed: ResponseMcpListToolsFailed
                ) = mcpListToolsFailed.validity()

                override fun visitMcpListToolsCompleted(
                    mcpListToolsCompleted: ResponseMcpListToolsCompleted
                ) = mcpListToolsCompleted.validity()

                override fun visitMcpCallArgumentsDelta(
                    mcpCallArgumentsDelta: ResponseMcpCallArgumentsDelta
                ) = mcpCallArgumentsDelta.validity()

                override fun visitMcpCallArgumentsDone(
                    mcpCallArgumentsDone: ResponseMcpCallArgumentsDone
                ) = mcpCallArgumentsDone.validity()

                override fun visitMcpCallInProgress(mcpCallInProgress: ResponseMcpCallInProgress) =
                    mcpCallInProgress.validity()

                override fun visitMcpCallFailed(mcpCallFailed: ResponseMcpCallFailed) =
                    mcpCallFailed.validity()

                override fun visitMcpCallCompleted(mcpCallCompleted: ResponseMcpCallCompleted) =
                    mcpCallCompleted.validity()

                override fun visitCompleted(completed: ResponseCompleted) = completed.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseObjectStream && created == other.created && outputItemAdded == other.outputItemAdded && outputItemDone == other.outputItemDone && outputTextDelta == other.outputTextDelta && outputTextDone == other.outputTextDone && functionCallArgumentsDelta == other.functionCallArgumentsDelta && functionCallArgumentsDone == other.functionCallArgumentsDone && webSearchCallInProgress == other.webSearchCallInProgress && webSearchCallSearching == other.webSearchCallSearching && webSearchCallCompleted == other.webSearchCallCompleted && mcpListToolsInProgress == other.mcpListToolsInProgress && mcpListToolsFailed == other.mcpListToolsFailed && mcpListToolsCompleted == other.mcpListToolsCompleted && mcpCallArgumentsDelta == other.mcpCallArgumentsDelta && mcpCallArgumentsDone == other.mcpCallArgumentsDone && mcpCallInProgress == other.mcpCallInProgress && mcpCallFailed == other.mcpCallFailed && mcpCallCompleted == other.mcpCallCompleted && completed == other.completed /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(created, outputItemAdded, outputItemDone, outputTextDelta, outputTextDone, functionCallArgumentsDelta, functionCallArgumentsDone, webSearchCallInProgress, webSearchCallSearching, webSearchCallCompleted, mcpListToolsInProgress, mcpListToolsFailed, mcpListToolsCompleted, mcpCallArgumentsDelta, mcpCallArgumentsDone, mcpCallInProgress, mcpCallFailed, mcpCallCompleted, completed) /* spotless:on */

    override fun toString(): String =
        when {
            created != null -> "ResponseObjectStream{created=$created}"
            outputItemAdded != null -> "ResponseObjectStream{outputItemAdded=$outputItemAdded}"
            outputItemDone != null -> "ResponseObjectStream{outputItemDone=$outputItemDone}"
            outputTextDelta != null -> "ResponseObjectStream{outputTextDelta=$outputTextDelta}"
            outputTextDone != null -> "ResponseObjectStream{outputTextDone=$outputTextDone}"
            functionCallArgumentsDelta != null ->
                "ResponseObjectStream{functionCallArgumentsDelta=$functionCallArgumentsDelta}"
            functionCallArgumentsDone != null ->
                "ResponseObjectStream{functionCallArgumentsDone=$functionCallArgumentsDone}"
            webSearchCallInProgress != null ->
                "ResponseObjectStream{webSearchCallInProgress=$webSearchCallInProgress}"
            webSearchCallSearching != null ->
                "ResponseObjectStream{webSearchCallSearching=$webSearchCallSearching}"
            webSearchCallCompleted != null ->
                "ResponseObjectStream{webSearchCallCompleted=$webSearchCallCompleted}"
            mcpListToolsInProgress != null ->
                "ResponseObjectStream{mcpListToolsInProgress=$mcpListToolsInProgress}"
            mcpListToolsFailed != null ->
                "ResponseObjectStream{mcpListToolsFailed=$mcpListToolsFailed}"
            mcpListToolsCompleted != null ->
                "ResponseObjectStream{mcpListToolsCompleted=$mcpListToolsCompleted}"
            mcpCallArgumentsDelta != null ->
                "ResponseObjectStream{mcpCallArgumentsDelta=$mcpCallArgumentsDelta}"
            mcpCallArgumentsDone != null ->
                "ResponseObjectStream{mcpCallArgumentsDone=$mcpCallArgumentsDone}"
            mcpCallInProgress != null ->
                "ResponseObjectStream{mcpCallInProgress=$mcpCallInProgress}"
            mcpCallFailed != null -> "ResponseObjectStream{mcpCallFailed=$mcpCallFailed}"
            mcpCallCompleted != null -> "ResponseObjectStream{mcpCallCompleted=$mcpCallCompleted}"
            completed != null -> "ResponseObjectStream{completed=$completed}"
            _json != null -> "ResponseObjectStream{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ResponseObjectStream")
        }

    companion object {

        fun ofCreated(created: ResponseCreated) = ResponseObjectStream(created = created)

        fun ofOutputItemAdded(outputItemAdded: ResponseOutputItemAdded) =
            ResponseObjectStream(outputItemAdded = outputItemAdded)

        fun ofOutputItemDone(outputItemDone: ResponseOutputItemDone) =
            ResponseObjectStream(outputItemDone = outputItemDone)

        fun ofOutputTextDelta(outputTextDelta: ResponseOutputTextDelta) =
            ResponseObjectStream(outputTextDelta = outputTextDelta)

        fun ofOutputTextDone(outputTextDone: ResponseOutputTextDone) =
            ResponseObjectStream(outputTextDone = outputTextDone)

        fun ofFunctionCallArgumentsDelta(
            functionCallArgumentsDelta: ResponseFunctionCallArgumentsDelta
        ) = ResponseObjectStream(functionCallArgumentsDelta = functionCallArgumentsDelta)

        fun ofFunctionCallArgumentsDone(
            functionCallArgumentsDone: ResponseFunctionCallArgumentsDone
        ) = ResponseObjectStream(functionCallArgumentsDone = functionCallArgumentsDone)

        fun ofWebSearchCallInProgress(webSearchCallInProgress: ResponseWebSearchCallInProgress) =
            ResponseObjectStream(webSearchCallInProgress = webSearchCallInProgress)

        fun ofWebSearchCallSearching(webSearchCallSearching: ResponseWebSearchCallSearching) =
            ResponseObjectStream(webSearchCallSearching = webSearchCallSearching)

        fun ofWebSearchCallCompleted(webSearchCallCompleted: ResponseWebSearchCallCompleted) =
            ResponseObjectStream(webSearchCallCompleted = webSearchCallCompleted)

        fun ofMcpListToolsInProgress(mcpListToolsInProgress: ResponseMcpListToolsInProgress) =
            ResponseObjectStream(mcpListToolsInProgress = mcpListToolsInProgress)

        fun ofMcpListToolsFailed(mcpListToolsFailed: ResponseMcpListToolsFailed) =
            ResponseObjectStream(mcpListToolsFailed = mcpListToolsFailed)

        fun ofMcpListToolsCompleted(mcpListToolsCompleted: ResponseMcpListToolsCompleted) =
            ResponseObjectStream(mcpListToolsCompleted = mcpListToolsCompleted)

        fun ofMcpCallArgumentsDelta(mcpCallArgumentsDelta: ResponseMcpCallArgumentsDelta) =
            ResponseObjectStream(mcpCallArgumentsDelta = mcpCallArgumentsDelta)

        fun ofMcpCallArgumentsDone(mcpCallArgumentsDone: ResponseMcpCallArgumentsDone) =
            ResponseObjectStream(mcpCallArgumentsDone = mcpCallArgumentsDone)

        fun ofMcpCallInProgress(mcpCallInProgress: ResponseMcpCallInProgress) =
            ResponseObjectStream(mcpCallInProgress = mcpCallInProgress)

        fun ofMcpCallFailed(mcpCallFailed: ResponseMcpCallFailed) =
            ResponseObjectStream(mcpCallFailed = mcpCallFailed)

        fun ofMcpCallCompleted(mcpCallCompleted: ResponseMcpCallCompleted) =
            ResponseObjectStream(mcpCallCompleted = mcpCallCompleted)

        fun ofCompleted(completed: ResponseCompleted) = ResponseObjectStream(completed = completed)
    }

    /**
     * An interface that defines how to map each variant of [ResponseObjectStream] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitCreated(created: ResponseCreated): T

        fun visitOutputItemAdded(outputItemAdded: ResponseOutputItemAdded): T

        fun visitOutputItemDone(outputItemDone: ResponseOutputItemDone): T

        fun visitOutputTextDelta(outputTextDelta: ResponseOutputTextDelta): T

        fun visitOutputTextDone(outputTextDone: ResponseOutputTextDone): T

        fun visitFunctionCallArgumentsDelta(
            functionCallArgumentsDelta: ResponseFunctionCallArgumentsDelta
        ): T

        fun visitFunctionCallArgumentsDone(
            functionCallArgumentsDone: ResponseFunctionCallArgumentsDone
        ): T

        fun visitWebSearchCallInProgress(
            webSearchCallInProgress: ResponseWebSearchCallInProgress
        ): T

        fun visitWebSearchCallSearching(webSearchCallSearching: ResponseWebSearchCallSearching): T

        fun visitWebSearchCallCompleted(webSearchCallCompleted: ResponseWebSearchCallCompleted): T

        fun visitMcpListToolsInProgress(mcpListToolsInProgress: ResponseMcpListToolsInProgress): T

        fun visitMcpListToolsFailed(mcpListToolsFailed: ResponseMcpListToolsFailed): T

        fun visitMcpListToolsCompleted(mcpListToolsCompleted: ResponseMcpListToolsCompleted): T

        fun visitMcpCallArgumentsDelta(mcpCallArgumentsDelta: ResponseMcpCallArgumentsDelta): T

        fun visitMcpCallArgumentsDone(mcpCallArgumentsDone: ResponseMcpCallArgumentsDone): T

        fun visitMcpCallInProgress(mcpCallInProgress: ResponseMcpCallInProgress): T

        fun visitMcpCallFailed(mcpCallFailed: ResponseMcpCallFailed): T

        fun visitMcpCallCompleted(mcpCallCompleted: ResponseMcpCallCompleted): T

        fun visitCompleted(completed: ResponseCompleted): T

        /**
         * Maps an unknown variant of [ResponseObjectStream] to a value of type [T].
         *
         * An instance of [ResponseObjectStream] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ResponseObjectStream: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ResponseObjectStream>(ResponseObjectStream::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ResponseObjectStream {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "response.created" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseCreated>())?.let {
                        ResponseObjectStream(created = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.output_item.added" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseOutputItemAdded>())?.let {
                        ResponseObjectStream(outputItemAdded = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.output_item.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseOutputItemDone>())?.let {
                        ResponseObjectStream(outputItemDone = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.output_text.delta" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseOutputTextDelta>())?.let {
                        ResponseObjectStream(outputTextDelta = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.output_text.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseOutputTextDone>())?.let {
                        ResponseObjectStream(outputTextDone = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.function_call_arguments.delta" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseFunctionCallArgumentsDelta>(),
                        )
                        ?.let {
                            ResponseObjectStream(functionCallArgumentsDelta = it, _json = json)
                        } ?: ResponseObjectStream(_json = json)
                }
                "response.function_call_arguments.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseFunctionCallArgumentsDone>())
                        ?.let { ResponseObjectStream(functionCallArgumentsDone = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.web_search_call.in_progress" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseWebSearchCallInProgress>())
                        ?.let { ResponseObjectStream(webSearchCallInProgress = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.web_search_call.searching" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseWebSearchCallSearching>())
                        ?.let { ResponseObjectStream(webSearchCallSearching = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.web_search_call.completed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseWebSearchCallCompleted>())
                        ?.let { ResponseObjectStream(webSearchCallCompleted = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_list_tools.in_progress" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpListToolsInProgress>())
                        ?.let { ResponseObjectStream(mcpListToolsInProgress = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_list_tools.failed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpListToolsFailed>())?.let {
                        ResponseObjectStream(mcpListToolsFailed = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_list_tools.completed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpListToolsCompleted>())
                        ?.let { ResponseObjectStream(mcpListToolsCompleted = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_call.arguments.delta" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpCallArgumentsDelta>())
                        ?.let { ResponseObjectStream(mcpCallArgumentsDelta = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_call.arguments.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpCallArgumentsDone>())
                        ?.let { ResponseObjectStream(mcpCallArgumentsDone = it, _json = json) }
                        ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_call.in_progress" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpCallInProgress>())?.let {
                        ResponseObjectStream(mcpCallInProgress = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_call.failed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpCallFailed>())?.let {
                        ResponseObjectStream(mcpCallFailed = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.mcp_call.completed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseMcpCallCompleted>())?.let {
                        ResponseObjectStream(mcpCallCompleted = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
                "response.completed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseCompleted>())?.let {
                        ResponseObjectStream(completed = it, _json = json)
                    } ?: ResponseObjectStream(_json = json)
                }
            }

            return ResponseObjectStream(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ResponseObjectStream>(ResponseObjectStream::class) {

        override fun serialize(
            value: ResponseObjectStream,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.created != null -> generator.writeObject(value.created)
                value.outputItemAdded != null -> generator.writeObject(value.outputItemAdded)
                value.outputItemDone != null -> generator.writeObject(value.outputItemDone)
                value.outputTextDelta != null -> generator.writeObject(value.outputTextDelta)
                value.outputTextDone != null -> generator.writeObject(value.outputTextDone)
                value.functionCallArgumentsDelta != null ->
                    generator.writeObject(value.functionCallArgumentsDelta)
                value.functionCallArgumentsDone != null ->
                    generator.writeObject(value.functionCallArgumentsDone)
                value.webSearchCallInProgress != null ->
                    generator.writeObject(value.webSearchCallInProgress)
                value.webSearchCallSearching != null ->
                    generator.writeObject(value.webSearchCallSearching)
                value.webSearchCallCompleted != null ->
                    generator.writeObject(value.webSearchCallCompleted)
                value.mcpListToolsInProgress != null ->
                    generator.writeObject(value.mcpListToolsInProgress)
                value.mcpListToolsFailed != null -> generator.writeObject(value.mcpListToolsFailed)
                value.mcpListToolsCompleted != null ->
                    generator.writeObject(value.mcpListToolsCompleted)
                value.mcpCallArgumentsDelta != null ->
                    generator.writeObject(value.mcpCallArgumentsDelta)
                value.mcpCallArgumentsDone != null ->
                    generator.writeObject(value.mcpCallArgumentsDone)
                value.mcpCallInProgress != null -> generator.writeObject(value.mcpCallInProgress)
                value.mcpCallFailed != null -> generator.writeObject(value.mcpCallFailed)
                value.mcpCallCompleted != null -> generator.writeObject(value.mcpCallCompleted)
                value.completed != null -> generator.writeObject(value.completed)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ResponseObjectStream")
            }
        }
    }

    class ResponseCreated
    private constructor(
        private val response: JsonField<ResponseObject>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("response")
            @ExcludeMissing
            response: JsonField<ResponseObject> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(response, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun response(): ResponseObject = response.getRequired("response")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.created")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [response].
         *
         * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("response")
        @ExcludeMissing
        fun _response(): JsonField<ResponseObject> = response

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseCreated].
             *
             * The following fields are required:
             * ```kotlin
             * .response()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseCreated]. */
        class Builder internal constructor() {

            private var response: JsonField<ResponseObject>? = null
            private var type: JsonValue = JsonValue.from("response.created")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseCreated: ResponseCreated) = apply {
                response = responseCreated.response
                type = responseCreated.type
                additionalProperties = responseCreated.additionalProperties.toMutableMap()
            }

            fun response(response: ResponseObject) = response(JsonField.of(response))

            /**
             * Sets [Builder.response] to an arbitrary JSON value.
             *
             * You should usually call [Builder.response] with a well-typed [ResponseObject] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun response(response: JsonField<ResponseObject>) = apply { this.response = response }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.created")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseCreated].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .response()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseCreated =
                ResponseCreated(
                    checkRequired("response", response),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseCreated = apply {
            if (validated) {
                return@apply
            }

            response().validate()
            _type().let {
                if (it != JsonValue.from("response.created")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (response.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("response.created")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseCreated && response == other.response && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(response, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseCreated{response=$response, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseOutputItemAdded
    private constructor(
        private val item: JsonField<Item>,
        private val outputIndex: JsonField<Long>,
        private val responseId: JsonField<String>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("item") @ExcludeMissing item: JsonField<Item> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("response_id")
            @ExcludeMissing
            responseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(item, outputIndex, responseId, sequenceNumber, type, mutableMapOf())

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun item(): Item = item.getRequired("item")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun responseId(): String = responseId.getRequired("response_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.output_item.added")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [item].
         *
         * Unlike [item], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item") @ExcludeMissing fun _item(): JsonField<Item> = item

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [responseId].
         *
         * Unlike [responseId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("response_id")
        @ExcludeMissing
        fun _responseId(): JsonField<String> = responseId

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseOutputItemAdded].
             *
             * The following fields are required:
             * ```kotlin
             * .item()
             * .outputIndex()
             * .responseId()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseOutputItemAdded]. */
        class Builder internal constructor() {

            private var item: JsonField<Item>? = null
            private var outputIndex: JsonField<Long>? = null
            private var responseId: JsonField<String>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.output_item.added")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseOutputItemAdded: ResponseOutputItemAdded) = apply {
                item = responseOutputItemAdded.item
                outputIndex = responseOutputItemAdded.outputIndex
                responseId = responseOutputItemAdded.responseId
                sequenceNumber = responseOutputItemAdded.sequenceNumber
                type = responseOutputItemAdded.type
                additionalProperties = responseOutputItemAdded.additionalProperties.toMutableMap()
            }

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun item(item: Item) = item(JsonField.of(item))

            /**
             * Sets [Builder.item] to an arbitrary JSON value.
             *
             * You should usually call [Builder.item] with a well-typed [Item] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun item(item: JsonField<Item>) = apply { this.item = item }

            /** Alias for calling [item] with `Item.ofMessage(message)`. */
            fun item(message: Item.Message) = item(Item.ofMessage(message))

            /** Alias for calling [item] with `Item.ofWebSearchCall(webSearchCall)`. */
            fun item(webSearchCall: Item.WebSearchCall) = item(Item.ofWebSearchCall(webSearchCall))

            /** Alias for calling [item] with `Item.ofFileSearchCall(fileSearchCall)`. */
            fun item(fileSearchCall: Item.FileSearchCall) =
                item(Item.ofFileSearchCall(fileSearchCall))

            /** Alias for calling [item] with `Item.ofFunctionCall(functionCall)`. */
            fun item(functionCall: Item.FunctionCall) = item(Item.ofFunctionCall(functionCall))

            /** Alias for calling [item] with `Item.ofMcpCall(mcpCall)`. */
            fun item(mcpCall: Item.McpCall) = item(Item.ofMcpCall(mcpCall))

            /** Alias for calling [item] with `Item.ofMcpListTools(mcpListTools)`. */
            fun item(mcpListTools: Item.McpListTools) = item(Item.ofMcpListTools(mcpListTools))

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun responseId(responseId: String) = responseId(JsonField.of(responseId))

            /**
             * Sets [Builder.responseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseId(responseId: JsonField<String>) = apply { this.responseId = responseId }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.output_item.added")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseOutputItemAdded].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .item()
             * .outputIndex()
             * .responseId()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseOutputItemAdded =
                ResponseOutputItemAdded(
                    checkRequired("item", item),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("responseId", responseId),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseOutputItemAdded = apply {
            if (validated) {
                return@apply
            }

            item().validate()
            outputIndex()
            responseId()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.output_item.added")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (item.asKnown()?.validity() ?: 0) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (responseId.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.output_item.added")) 1 else 0 }

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        @JsonDeserialize(using = Item.Deserializer::class)
        @JsonSerialize(using = Item.Serializer::class)
        class Item
        private constructor(
            private val message: Message? = null,
            private val webSearchCall: WebSearchCall? = null,
            private val fileSearchCall: FileSearchCall? = null,
            private val functionCall: FunctionCall? = null,
            private val mcpCall: McpCall? = null,
            private val mcpListTools: McpListTools? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun message(): Message? = message

            fun webSearchCall(): WebSearchCall? = webSearchCall

            fun fileSearchCall(): FileSearchCall? = fileSearchCall

            fun functionCall(): FunctionCall? = functionCall

            fun mcpCall(): McpCall? = mcpCall

            fun mcpListTools(): McpListTools? = mcpListTools

            fun isMessage(): Boolean = message != null

            fun isWebSearchCall(): Boolean = webSearchCall != null

            fun isFileSearchCall(): Boolean = fileSearchCall != null

            fun isFunctionCall(): Boolean = functionCall != null

            fun isMcpCall(): Boolean = mcpCall != null

            fun isMcpListTools(): Boolean = mcpListTools != null

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun asMessage(): Message = message.getOrThrow("message")

            fun asWebSearchCall(): WebSearchCall = webSearchCall.getOrThrow("webSearchCall")

            fun asFileSearchCall(): FileSearchCall = fileSearchCall.getOrThrow("fileSearchCall")

            fun asFunctionCall(): FunctionCall = functionCall.getOrThrow("functionCall")

            fun asMcpCall(): McpCall = mcpCall.getOrThrow("mcpCall")

            fun asMcpListTools(): McpListTools = mcpListTools.getOrThrow("mcpListTools")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    message != null -> visitor.visitMessage(message)
                    webSearchCall != null -> visitor.visitWebSearchCall(webSearchCall)
                    fileSearchCall != null -> visitor.visitFileSearchCall(fileSearchCall)
                    functionCall != null -> visitor.visitFunctionCall(functionCall)
                    mcpCall != null -> visitor.visitMcpCall(mcpCall)
                    mcpListTools != null -> visitor.visitMcpListTools(mcpListTools)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Item = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitMessage(message: Message) {
                            message.validate()
                        }

                        override fun visitWebSearchCall(webSearchCall: WebSearchCall) {
                            webSearchCall.validate()
                        }

                        override fun visitFileSearchCall(fileSearchCall: FileSearchCall) {
                            fileSearchCall.validate()
                        }

                        override fun visitFunctionCall(functionCall: FunctionCall) {
                            functionCall.validate()
                        }

                        override fun visitMcpCall(mcpCall: McpCall) {
                            mcpCall.validate()
                        }

                        override fun visitMcpListTools(mcpListTools: McpListTools) {
                            mcpListTools.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitMessage(message: Message) = message.validity()

                        override fun visitWebSearchCall(webSearchCall: WebSearchCall) =
                            webSearchCall.validity()

                        override fun visitFileSearchCall(fileSearchCall: FileSearchCall) =
                            fileSearchCall.validity()

                        override fun visitFunctionCall(functionCall: FunctionCall) =
                            functionCall.validity()

                        override fun visitMcpCall(mcpCall: McpCall) = mcpCall.validity()

                        override fun visitMcpListTools(mcpListTools: McpListTools) =
                            mcpListTools.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Item && message == other.message && webSearchCall == other.webSearchCall && fileSearchCall == other.fileSearchCall && functionCall == other.functionCall && mcpCall == other.mcpCall && mcpListTools == other.mcpListTools /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(message, webSearchCall, fileSearchCall, functionCall, mcpCall, mcpListTools) /* spotless:on */

            override fun toString(): String =
                when {
                    message != null -> "Item{message=$message}"
                    webSearchCall != null -> "Item{webSearchCall=$webSearchCall}"
                    fileSearchCall != null -> "Item{fileSearchCall=$fileSearchCall}"
                    functionCall != null -> "Item{functionCall=$functionCall}"
                    mcpCall != null -> "Item{mcpCall=$mcpCall}"
                    mcpListTools != null -> "Item{mcpListTools=$mcpListTools}"
                    _json != null -> "Item{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Item")
                }

            companion object {

                /**
                 * Corresponds to the various Message types in the Responses API. They are all under
                 * one type because the Responses API gives them all the same "type" value, and
                 * there is no way to tell them apart in certain scenarios.
                 */
                fun ofMessage(message: Message) = Item(message = message)

                fun ofWebSearchCall(webSearchCall: WebSearchCall) =
                    Item(webSearchCall = webSearchCall)

                fun ofFileSearchCall(fileSearchCall: FileSearchCall) =
                    Item(fileSearchCall = fileSearchCall)

                fun ofFunctionCall(functionCall: FunctionCall) = Item(functionCall = functionCall)

                fun ofMcpCall(mcpCall: McpCall) = Item(mcpCall = mcpCall)

                fun ofMcpListTools(mcpListTools: McpListTools) = Item(mcpListTools = mcpListTools)
            }

            /**
             * An interface that defines how to map each variant of [Item] to a value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * Corresponds to the various Message types in the Responses API. They are all under
                 * one type because the Responses API gives them all the same "type" value, and
                 * there is no way to tell them apart in certain scenarios.
                 */
                fun visitMessage(message: Message): T

                fun visitWebSearchCall(webSearchCall: WebSearchCall): T

                fun visitFileSearchCall(fileSearchCall: FileSearchCall): T

                fun visitFunctionCall(functionCall: FunctionCall): T

                fun visitMcpCall(mcpCall: McpCall): T

                fun visitMcpListTools(mcpListTools: McpListTools): T

                /**
                 * Maps an unknown variant of [Item] to a value of type [T].
                 *
                 * An instance of [Item] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LlamaStackClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Item: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Item>(Item::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Item {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "message" -> {
                            return tryDeserialize(node, jacksonTypeRef<Message>())?.let {
                                Item(message = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "web_search_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<WebSearchCall>())?.let {
                                Item(webSearchCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "file_search_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<FileSearchCall>())?.let {
                                Item(fileSearchCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "function_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<FunctionCall>())?.let {
                                Item(functionCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "mcp_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<McpCall>())?.let {
                                Item(mcpCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "mcp_list_tools" -> {
                            return tryDeserialize(node, jacksonTypeRef<McpListTools>())?.let {
                                Item(mcpListTools = it, _json = json)
                            } ?: Item(_json = json)
                        }
                    }

                    return Item(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Item>(Item::class) {

                override fun serialize(
                    value: Item,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.message != null -> generator.writeObject(value.message)
                        value.webSearchCall != null -> generator.writeObject(value.webSearchCall)
                        value.fileSearchCall != null -> generator.writeObject(value.fileSearchCall)
                        value.functionCall != null -> generator.writeObject(value.functionCall)
                        value.mcpCall != null -> generator.writeObject(value.mcpCall)
                        value.mcpListTools != null -> generator.writeObject(value.mcpListTools)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Item")
                    }
                }
            }

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            class Message
            private constructor(
                private val content: JsonField<Content>,
                private val role: JsonField<Role>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<Content> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): Content = content.getRequired("content")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun role(): Role = role.getRequired("role")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("message")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content")
                @ExcludeMissing
                fun _content(): JsonField<Content> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<Content>? = null
                    private var role: JsonField<Role>? = null
                    private var type: JsonValue = JsonValue.from("message")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        type = message.type
                        id = message.id
                        status = message.status
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    fun content(content: Content) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [Content] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<Content>) = apply { this.content = content }

                    /** Alias for calling [content] with `Content.ofString(string)`. */
                    fun content(string: String) = content(Content.ofString(string))

                    /**
                     * Alias for calling [content] with
                     * `Content.ofOpenAIResponseInputMessageContents(openaiResponseInputMessageContents)`.
                     */
                    fun contentOfOpenAIResponseInputMessageContents(
                        openaiResponseInputMessageContents:
                            List<Content.OpenAIResponseInputMessageContent>
                    ) =
                        content(
                            Content.ofOpenAIResponseInputMessageContents(
                                openaiResponseInputMessageContents
                            )
                        )

                    /**
                     * Alias for calling [content] with
                     * `Content.ofOpenAIResponseOutputMessageContents(openaiResponseOutputMessageContents)`.
                     */
                    fun contentOfOpenAIResponseOutputMessageContents(
                        openaiResponseOutputMessageContents:
                            List<Content.OpenAIResponseOutputMessageContent>
                    ) =
                        content(
                            Content.ofOpenAIResponseOutputMessageContents(
                                openaiResponseOutputMessageContents
                            )
                        )

                    fun role(role: Role) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [Role] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<Role>) = apply { this.role = role }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("message")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            checkRequired("role", role),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content().validate()
                    role().validate()
                    _type().let {
                        if (it != JsonValue.from("message")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (content.asKnown()?.validity() ?: 0) +
                        (role.asKnown()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("message")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                @JsonDeserialize(using = Content.Deserializer::class)
                @JsonSerialize(using = Content.Serializer::class)
                class Content
                private constructor(
                    private val string: String? = null,
                    private val openaiResponseInputMessageContents:
                        List<OpenAIResponseInputMessageContent>? =
                        null,
                    private val openaiResponseOutputMessageContents:
                        List<OpenAIResponseOutputMessageContent>? =
                        null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): String? = string

                    fun openaiResponseInputMessageContents():
                        List<OpenAIResponseInputMessageContent>? =
                        openaiResponseInputMessageContents

                    fun openaiResponseOutputMessageContents():
                        List<OpenAIResponseOutputMessageContent>? =
                        openaiResponseOutputMessageContents

                    fun isString(): Boolean = string != null

                    fun isOpenAIResponseInputMessageContents(): Boolean =
                        openaiResponseInputMessageContents != null

                    fun isOpenAIResponseOutputMessageContents(): Boolean =
                        openaiResponseOutputMessageContents != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asOpenAIResponseInputMessageContents():
                        List<OpenAIResponseInputMessageContent> =
                        openaiResponseInputMessageContents.getOrThrow(
                            "openaiResponseInputMessageContents"
                        )

                    fun asOpenAIResponseOutputMessageContents():
                        List<OpenAIResponseOutputMessageContent> =
                        openaiResponseOutputMessageContents.getOrThrow(
                            "openaiResponseOutputMessageContents"
                        )

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            openaiResponseInputMessageContents != null ->
                                visitor.visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents
                                )
                            openaiResponseOutputMessageContents != null ->
                                visitor.visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents
                                )
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): Content = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents:
                                        List<OpenAIResponseInputMessageContent>
                                ) {
                                    openaiResponseInputMessageContents.forEach { it.validate() }
                                }

                                override fun visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents:
                                        List<OpenAIResponseOutputMessageContent>
                                ) {
                                    openaiResponseOutputMessageContents.forEach { it.validate() }
                                }
                            }
                        )
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents:
                                        List<OpenAIResponseInputMessageContent>
                                ) =
                                    openaiResponseInputMessageContents.sumOf {
                                        it.validity().toInt()
                                    }

                                override fun visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents:
                                        List<OpenAIResponseOutputMessageContent>
                                ) =
                                    openaiResponseOutputMessageContents.sumOf {
                                        it.validity().toInt()
                                    }

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Content && string == other.string && openaiResponseInputMessageContents == other.openaiResponseInputMessageContents && openaiResponseOutputMessageContents == other.openaiResponseOutputMessageContents /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiResponseInputMessageContents, openaiResponseOutputMessageContents) /* spotless:on */

                    override fun toString(): String =
                        when {
                            string != null -> "Content{string=$string}"
                            openaiResponseInputMessageContents != null ->
                                "Content{openaiResponseInputMessageContents=$openaiResponseInputMessageContents}"
                            openaiResponseOutputMessageContents != null ->
                                "Content{openaiResponseOutputMessageContents=$openaiResponseOutputMessageContents}"
                            _json != null -> "Content{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Content")
                        }

                    companion object {

                        fun ofString(string: String) = Content(string = string)

                        fun ofOpenAIResponseInputMessageContents(
                            openaiResponseInputMessageContents:
                                List<OpenAIResponseInputMessageContent>
                        ) =
                            Content(
                                openaiResponseInputMessageContents =
                                    openaiResponseInputMessageContents
                            )

                        fun ofOpenAIResponseOutputMessageContents(
                            openaiResponseOutputMessageContents:
                                List<OpenAIResponseOutputMessageContent>
                        ) =
                            Content(
                                openaiResponseOutputMessageContents =
                                    openaiResponseOutputMessageContents
                            )
                    }

                    /**
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitOpenAIResponseInputMessageContents(
                            openaiResponseInputMessageContents:
                                List<OpenAIResponseInputMessageContent>
                        ): T

                        fun visitOpenAIResponseOutputMessageContents(
                            openaiResponseOutputMessageContents:
                                List<OpenAIResponseOutputMessageContent>
                        ): T

                        /**
                         * Maps an unknown variant of [Content] to a value of type [T].
                         *
                         * An instance of [Content] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Content {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            Content(string = it, _json = json)
                                        },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<
                                                    List<OpenAIResponseInputMessageContent>
                                                >(),
                                            )
                                            ?.let {
                                                Content(
                                                    openaiResponseInputMessageContents = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<
                                                    List<OpenAIResponseOutputMessageContent>
                                                >(),
                                            )
                                            ?.let {
                                                Content(
                                                    openaiResponseOutputMessageContents = it,
                                                    _json = json,
                                                )
                                            },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> Content(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Content>(Content::class) {

                        override fun serialize(
                            value: Content,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.openaiResponseInputMessageContents != null ->
                                    generator.writeObject(value.openaiResponseInputMessageContents)
                                value.openaiResponseOutputMessageContents != null ->
                                    generator.writeObject(value.openaiResponseOutputMessageContents)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(using = OpenAIResponseInputMessageContent.Deserializer::class)
                    @JsonSerialize(using = OpenAIResponseInputMessageContent.Serializer::class)
                    class OpenAIResponseInputMessageContent
                    private constructor(
                        private val inputText: InputText? = null,
                        private val inputImage: InputImage? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun inputText(): InputText? = inputText

                        fun inputImage(): InputImage? = inputImage

                        fun isInputText(): Boolean = inputText != null

                        fun isInputImage(): Boolean = inputImage != null

                        fun asInputText(): InputText = inputText.getOrThrow("inputText")

                        fun asInputImage(): InputImage = inputImage.getOrThrow("inputImage")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                inputText != null -> visitor.visitInputText(inputText)
                                inputImage != null -> visitor.visitInputImage(inputImage)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): OpenAIResponseInputMessageContent = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitInputText(inputText: InputText) {
                                        inputText.validate()
                                    }

                                    override fun visitInputImage(inputImage: InputImage) {
                                        inputImage.validate()
                                    }
                                }
                            )
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitInputText(inputText: InputText) =
                                        inputText.validity()

                                    override fun visitInputImage(inputImage: InputImage) =
                                        inputImage.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is OpenAIResponseInputMessageContent && inputText == other.inputText && inputImage == other.inputImage /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inputText, inputImage) /* spotless:on */

                        override fun toString(): String =
                            when {
                                inputText != null ->
                                    "OpenAIResponseInputMessageContent{inputText=$inputText}"
                                inputImage != null ->
                                    "OpenAIResponseInputMessageContent{inputImage=$inputImage}"
                                _json != null ->
                                    "OpenAIResponseInputMessageContent{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIResponseInputMessageContent"
                                    )
                            }

                        companion object {

                            fun ofInputText(inputText: InputText) =
                                OpenAIResponseInputMessageContent(inputText = inputText)

                            fun ofInputImage(inputImage: InputImage) =
                                OpenAIResponseInputMessageContent(inputImage = inputImage)
                        }

                        /**
                         * An interface that defines how to map each variant of
                         * [OpenAIResponseInputMessageContent] to a value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitInputText(inputText: InputText): T

                            fun visitInputImage(inputImage: InputImage): T

                            /**
                             * Maps an unknown variant of [OpenAIResponseInputMessageContent] to a
                             * value of type [T].
                             *
                             * An instance of [OpenAIResponseInputMessageContent] can contain an
                             * unknown variant if it was deserialized from data that doesn't match
                             * any known variant. For example, if the SDK is on an older version
                             * than the API, then the API may respond with new variants that the SDK
                             * is unaware of.
                             *
                             * @throws LlamaStackClientInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown OpenAIResponseInputMessageContent: $json"
                                )
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<OpenAIResponseInputMessageContent>(
                                OpenAIResponseInputMessageContent::class
                            ) {

                            override fun ObjectCodec.deserialize(
                                node: JsonNode
                            ): OpenAIResponseInputMessageContent {
                                val json = JsonValue.fromJsonNode(node)
                                val type = json.asObject()?.get("type")?.asString()

                                when (type) {
                                    "input_text" -> {
                                        return tryDeserialize(node, jacksonTypeRef<InputText>())
                                            ?.let {
                                                OpenAIResponseInputMessageContent(
                                                    inputText = it,
                                                    _json = json,
                                                )
                                            } ?: OpenAIResponseInputMessageContent(_json = json)
                                    }
                                    "input_image" -> {
                                        return tryDeserialize(node, jacksonTypeRef<InputImage>())
                                            ?.let {
                                                OpenAIResponseInputMessageContent(
                                                    inputImage = it,
                                                    _json = json,
                                                )
                                            } ?: OpenAIResponseInputMessageContent(_json = json)
                                    }
                                }

                                return OpenAIResponseInputMessageContent(_json = json)
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<OpenAIResponseInputMessageContent>(
                                OpenAIResponseInputMessageContent::class
                            ) {

                            override fun serialize(
                                value: OpenAIResponseInputMessageContent,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.inputText != null ->
                                        generator.writeObject(value.inputText)
                                    value.inputImage != null ->
                                        generator.writeObject(value.inputImage)
                                    value._json != null -> generator.writeObject(value._json)
                                    else ->
                                        throw IllegalStateException(
                                            "Invalid OpenAIResponseInputMessageContent"
                                        )
                                }
                            }
                        }

                        class InputText
                        private constructor(
                            private val text: JsonField<String>,
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("text")
                                @ExcludeMissing
                                text: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(text, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun text(): String = text.getRequired("text")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("input_text")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [text].
                             *
                             * Unlike [text], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("text")
                            @ExcludeMissing
                            fun _text(): JsonField<String> = text

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputText].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .text()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputText]. */
                            class Builder internal constructor() {

                                private var text: JsonField<String>? = null
                                private var type: JsonValue = JsonValue.from("input_text")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputText: InputText) = apply {
                                    text = inputText.text
                                    type = inputText.type
                                    additionalProperties =
                                        inputText.additionalProperties.toMutableMap()
                                }

                                fun text(text: String) = text(JsonField.of(text))

                                /**
                                 * Sets [Builder.text] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.text] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun text(text: JsonField<String>) = apply { this.text = text }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("input_text")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputText].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .text()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputText =
                                    InputText(
                                        checkRequired("text", text),
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputText = apply {
                                if (validated) {
                                    return@apply
                                }

                                text()
                                _type().let {
                                    if (it != JsonValue.from("input_text")) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (text.asKnown() == null) 0 else 1) +
                                    type.let { if (it == JsonValue.from("input_text")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InputText && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputText{text=$text, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class InputImage
                        private constructor(
                            private val detail: JsonField<Detail>,
                            private val type: JsonValue,
                            private val imageUrl: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<Detail> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("image_url")
                                @ExcludeMissing
                                imageUrl: JsonField<String> = JsonMissing.of(),
                            ) : this(detail, type, imageUrl, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun detail(): Detail = detail.getRequired("detail")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("input_image")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun imageUrl(): String? = imageUrl.getNullable("image_url")

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<Detail> = detail

                            /**
                             * Returns the raw JSON value of [imageUrl].
                             *
                             * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            fun _imageUrl(): JsonField<String> = imageUrl

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputImage].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .detail()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputImage]. */
                            class Builder internal constructor() {

                                private var detail: JsonField<Detail>? = null
                                private var type: JsonValue = JsonValue.from("input_image")
                                private var imageUrl: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputImage: InputImage) = apply {
                                    detail = inputImage.detail
                                    type = inputImage.type
                                    imageUrl = inputImage.imageUrl
                                    additionalProperties =
                                        inputImage.additionalProperties.toMutableMap()
                                }

                                fun detail(detail: Detail) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [Detail] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<Detail>) = apply {
                                    this.detail = detail
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("input_image")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun imageUrl(imageUrl: JsonField<String>) = apply {
                                    this.imageUrl = imageUrl
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputImage].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .detail()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputImage =
                                    InputImage(
                                        checkRequired("detail", detail),
                                        type,
                                        imageUrl,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputImage = apply {
                                if (validated) {
                                    return@apply
                                }

                                detail().validate()
                                _type().let {
                                    if (it != JsonValue.from("input_image")) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                imageUrl()
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (detail.asKnown()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("input_image")) 1 else 0 } +
                                    (if (imageUrl.asKnown() == null) 0 else 1)

                            class Detail
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    val LOW = of("low")

                                    val HIGH = of("high")

                                    val AUTO = of("auto")

                                    fun of(value: String) = Detail(JsonField.of(value))
                                }

                                /** An enum containing [Detail]'s known values. */
                                enum class Known {
                                    LOW,
                                    HIGH,
                                    AUTO,
                                }

                                /**
                                 * An enum containing [Detail]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Detail] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LOW,
                                    HIGH,
                                    AUTO,
                                    /**
                                     * An enum member indicating that [Detail] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LOW -> Value.LOW
                                        HIGH -> Value.HIGH
                                        AUTO -> Value.AUTO
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaStackClientInvalidDataException if this class
                                 *   instance's value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LOW -> Known.LOW
                                        HIGH -> Known.HIGH
                                        AUTO -> Known.AUTO
                                        else ->
                                            throw LlamaStackClientInvalidDataException(
                                                "Unknown Detail: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaStackClientInvalidDataException if this class
                                 *   instance's value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString()
                                        ?: throw LlamaStackClientInvalidDataException(
                                            "Value is not a String"
                                        )

                                private var validated: Boolean = false

                                fun validate(): Detail = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is Detail && value == other.value /* spotless:on */
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InputImage && detail == other.detail && type == other.type && imageUrl == other.imageUrl && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(detail, type, imageUrl, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputImage{detail=$detail, type=$type, imageUrl=$imageUrl, additionalProperties=$additionalProperties}"
                        }
                    }

                    class OpenAIResponseOutputMessageContent
                    private constructor(
                        private val annotations: JsonField<List<Annotation>>,
                        private val text: JsonField<String>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("annotations")
                            @ExcludeMissing
                            annotations: JsonField<List<Annotation>> = JsonMissing.of(),
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(annotations, text, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun annotations(): List<Annotation> = annotations.getRequired("annotations")

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("output_text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [annotations].
                         *
                         * Unlike [annotations], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("annotations")
                        @ExcludeMissing
                        fun _annotations(): JsonField<List<Annotation>> = annotations

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [OpenAIResponseOutputMessageContent].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .annotations()
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [OpenAIResponseOutputMessageContent]. */
                        class Builder internal constructor() {

                            private var annotations: JsonField<MutableList<Annotation>>? = null
                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("output_text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                openaiResponseOutputMessageContent:
                                    OpenAIResponseOutputMessageContent
                            ) = apply {
                                annotations =
                                    openaiResponseOutputMessageContent.annotations.map {
                                        it.toMutableList()
                                    }
                                text = openaiResponseOutputMessageContent.text
                                type = openaiResponseOutputMessageContent.type
                                additionalProperties =
                                    openaiResponseOutputMessageContent.additionalProperties
                                        .toMutableMap()
                            }

                            fun annotations(annotations: List<Annotation>) =
                                annotations(JsonField.of(annotations))

                            /**
                             * Sets [Builder.annotations] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.annotations] with a well-typed
                             * `List<Annotation>` value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun annotations(annotations: JsonField<List<Annotation>>) = apply {
                                this.annotations = annotations.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [Annotation] to [annotations].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addAnnotation(annotation: Annotation) = apply {
                                annotations =
                                    (annotations ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("annotations", it).add(annotation)
                                    }
                            }

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofFileCitation(fileCitation)`.
                             */
                            fun addAnnotation(fileCitation: Annotation.FileCitation) =
                                addAnnotation(Annotation.ofFileCitation(fileCitation))

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofUrlCitation(urlCitation)`.
                             */
                            fun addAnnotation(urlCitation: Annotation.UrlCitation) =
                                addAnnotation(Annotation.ofUrlCitation(urlCitation))

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofContainerFileCitation(containerFileCitation)`.
                             */
                            fun addAnnotation(
                                containerFileCitation: Annotation.ContainerFileCitation
                            ) =
                                addAnnotation(
                                    Annotation.ofContainerFileCitation(containerFileCitation)
                                )

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofFilePath(filePath)`.
                             */
                            fun addAnnotation(filePath: Annotation.FilePath) =
                                addAnnotation(Annotation.ofFilePath(filePath))

                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("output_text")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of
                             * [OpenAIResponseOutputMessageContent].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .annotations()
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): OpenAIResponseOutputMessageContent =
                                OpenAIResponseOutputMessageContent(
                                    checkRequired("annotations", annotations).map {
                                        it.toImmutable()
                                    },
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): OpenAIResponseOutputMessageContent = apply {
                            if (validated) {
                                return@apply
                            }

                            annotations().forEach { it.validate() }
                            text()
                            _type().let {
                                if (it != JsonValue.from("output_text")) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (annotations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                (if (text.asKnown() == null) 0 else 1) +
                                type.let { if (it == JsonValue.from("output_text")) 1 else 0 }

                        @JsonDeserialize(using = Annotation.Deserializer::class)
                        @JsonSerialize(using = Annotation.Serializer::class)
                        class Annotation
                        private constructor(
                            private val fileCitation: FileCitation? = null,
                            private val urlCitation: UrlCitation? = null,
                            private val containerFileCitation: ContainerFileCitation? = null,
                            private val filePath: FilePath? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun fileCitation(): FileCitation? = fileCitation

                            fun urlCitation(): UrlCitation? = urlCitation

                            fun containerFileCitation(): ContainerFileCitation? =
                                containerFileCitation

                            fun filePath(): FilePath? = filePath

                            fun isFileCitation(): Boolean = fileCitation != null

                            fun isUrlCitation(): Boolean = urlCitation != null

                            fun isContainerFileCitation(): Boolean = containerFileCitation != null

                            fun isFilePath(): Boolean = filePath != null

                            fun asFileCitation(): FileCitation =
                                fileCitation.getOrThrow("fileCitation")

                            fun asUrlCitation(): UrlCitation = urlCitation.getOrThrow("urlCitation")

                            fun asContainerFileCitation(): ContainerFileCitation =
                                containerFileCitation.getOrThrow("containerFileCitation")

                            fun asFilePath(): FilePath = filePath.getOrThrow("filePath")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    fileCitation != null -> visitor.visitFileCitation(fileCitation)
                                    urlCitation != null -> visitor.visitUrlCitation(urlCitation)
                                    containerFileCitation != null ->
                                        visitor.visitContainerFileCitation(containerFileCitation)
                                    filePath != null -> visitor.visitFilePath(filePath)
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): Annotation = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitFileCitation(fileCitation: FileCitation) {
                                            fileCitation.validate()
                                        }

                                        override fun visitUrlCitation(urlCitation: UrlCitation) {
                                            urlCitation.validate()
                                        }

                                        override fun visitContainerFileCitation(
                                            containerFileCitation: ContainerFileCitation
                                        ) {
                                            containerFileCitation.validate()
                                        }

                                        override fun visitFilePath(filePath: FilePath) {
                                            filePath.validate()
                                        }
                                    }
                                )
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitFileCitation(fileCitation: FileCitation) =
                                            fileCitation.validity()

                                        override fun visitUrlCitation(urlCitation: UrlCitation) =
                                            urlCitation.validity()

                                        override fun visitContainerFileCitation(
                                            containerFileCitation: ContainerFileCitation
                                        ) = containerFileCitation.validity()

                                        override fun visitFilePath(filePath: FilePath) =
                                            filePath.validity()

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Annotation && fileCitation == other.fileCitation && urlCitation == other.urlCitation && containerFileCitation == other.containerFileCitation && filePath == other.filePath /* spotless:on */
                            }

                            override fun hashCode(): Int = /* spotless:off */ Objects.hash(fileCitation, urlCitation, containerFileCitation, filePath) /* spotless:on */

                            override fun toString(): String =
                                when {
                                    fileCitation != null -> "Annotation{fileCitation=$fileCitation}"
                                    urlCitation != null -> "Annotation{urlCitation=$urlCitation}"
                                    containerFileCitation != null ->
                                        "Annotation{containerFileCitation=$containerFileCitation}"
                                    filePath != null -> "Annotation{filePath=$filePath}"
                                    _json != null -> "Annotation{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Annotation")
                                }

                            companion object {

                                fun ofFileCitation(fileCitation: FileCitation) =
                                    Annotation(fileCitation = fileCitation)

                                fun ofUrlCitation(urlCitation: UrlCitation) =
                                    Annotation(urlCitation = urlCitation)

                                fun ofContainerFileCitation(
                                    containerFileCitation: ContainerFileCitation
                                ) = Annotation(containerFileCitation = containerFileCitation)

                                fun ofFilePath(filePath: FilePath) = Annotation(filePath = filePath)
                            }

                            /**
                             * An interface that defines how to map each variant of [Annotation] to
                             * a value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitFileCitation(fileCitation: FileCitation): T

                                fun visitUrlCitation(urlCitation: UrlCitation): T

                                fun visitContainerFileCitation(
                                    containerFileCitation: ContainerFileCitation
                                ): T

                                fun visitFilePath(filePath: FilePath): T

                                /**
                                 * Maps an unknown variant of [Annotation] to a value of type [T].
                                 *
                                 * An instance of [Annotation] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant.
                                 * For example, if the SDK is on an older version than the API, then
                                 * the API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws LlamaStackClientInvalidDataException in the default
                                 *   implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Annotation: $json"
                                    )
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<Annotation>(Annotation::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Annotation {
                                    val json = JsonValue.fromJsonNode(node)
                                    val type = json.asObject()?.get("type")?.asString()

                                    when (type) {
                                        "file_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<FileCitation>(),
                                                )
                                                ?.let {
                                                    Annotation(fileCitation = it, _json = json)
                                                } ?: Annotation(_json = json)
                                        }
                                        "url_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<UrlCitation>(),
                                                )
                                                ?.let { Annotation(urlCitation = it, _json = json) }
                                                ?: Annotation(_json = json)
                                        }
                                        "container_file_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<ContainerFileCitation>(),
                                                )
                                                ?.let {
                                                    Annotation(
                                                        containerFileCitation = it,
                                                        _json = json,
                                                    )
                                                } ?: Annotation(_json = json)
                                        }
                                        "file_path" -> {
                                            return tryDeserialize(node, jacksonTypeRef<FilePath>())
                                                ?.let { Annotation(filePath = it, _json = json) }
                                                ?: Annotation(_json = json)
                                        }
                                    }

                                    return Annotation(_json = json)
                                }
                            }

                            internal class Serializer :
                                BaseSerializer<Annotation>(Annotation::class) {

                                override fun serialize(
                                    value: Annotation,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.fileCitation != null ->
                                            generator.writeObject(value.fileCitation)
                                        value.urlCitation != null ->
                                            generator.writeObject(value.urlCitation)
                                        value.containerFileCitation != null ->
                                            generator.writeObject(value.containerFileCitation)
                                        value.filePath != null ->
                                            generator.writeObject(value.filePath)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Annotation")
                                    }
                                }
                            }

                            class FileCitation
                            private constructor(
                                private val fileId: JsonField<String>,
                                private val filename: JsonField<String>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("filename")
                                    @ExcludeMissing
                                    filename: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(fileId, filename, index, type, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun filename(): String = filename.getRequired("filename")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("file_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [filename].
                                 *
                                 * Unlike [filename], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("filename")
                                @ExcludeMissing
                                fun _filename(): JsonField<String> = filename

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [FileCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .filename()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FileCitation]. */
                                class Builder internal constructor() {

                                    private var fileId: JsonField<String>? = null
                                    private var filename: JsonField<String>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("file_citation")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(fileCitation: FileCitation) = apply {
                                        fileId = fileCitation.fileId
                                        filename = fileCitation.filename
                                        index = fileCitation.index
                                        type = fileCitation.type
                                        additionalProperties =
                                            fileCitation.additionalProperties.toMutableMap()
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun filename(filename: String) =
                                        filename(JsonField.of(filename))

                                    /**
                                     * Sets [Builder.filename] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.filename] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun filename(filename: JsonField<String>) = apply {
                                        this.filename = filename
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("file_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FileCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .filename()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FileCitation =
                                        FileCitation(
                                            checkRequired("fileId", fileId),
                                            checkRequired("filename", filename),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FileCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    fileId()
                                    filename()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("file_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (filename.asKnown() == null) 0 else 1) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("file_citation")) 1 else 0
                                        }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is FileCitation && fileId == other.fileId && filename == other.filename && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(fileId, filename, index, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FileCitation{fileId=$fileId, filename=$filename, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class UrlCitation
                            private constructor(
                                private val endIndex: JsonField<Long>,
                                private val startIndex: JsonField<Long>,
                                private val title: JsonField<String>,
                                private val type: JsonValue,
                                private val url: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    endIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    startIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("title")
                                    @ExcludeMissing
                                    title: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    url: JsonField<String> = JsonMissing.of(),
                                ) : this(endIndex, startIndex, title, type, url, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun endIndex(): Long = endIndex.getRequired("end_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun startIndex(): Long = startIndex.getRequired("start_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun title(): String = title.getRequired("title")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("url_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * Returns the raw JSON value of [endIndex].
                                 *
                                 * Unlike [endIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("end_index")
                                @ExcludeMissing
                                fun _endIndex(): JsonField<Long> = endIndex

                                /**
                                 * Returns the raw JSON value of [startIndex].
                                 *
                                 * Unlike [startIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("start_index")
                                @ExcludeMissing
                                fun _startIndex(): JsonField<Long> = startIndex

                                /**
                                 * Returns the raw JSON value of [title].
                                 *
                                 * Unlike [title], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("title")
                                @ExcludeMissing
                                fun _title(): JsonField<String> = title

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [UrlCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .endIndex()
                                     * .startIndex()
                                     * .title()
                                     * .url()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [UrlCitation]. */
                                class Builder internal constructor() {

                                    private var endIndex: JsonField<Long>? = null
                                    private var startIndex: JsonField<Long>? = null
                                    private var title: JsonField<String>? = null
                                    private var type: JsonValue = JsonValue.from("url_citation")
                                    private var url: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(urlCitation: UrlCitation) = apply {
                                        endIndex = urlCitation.endIndex
                                        startIndex = urlCitation.startIndex
                                        title = urlCitation.title
                                        type = urlCitation.type
                                        url = urlCitation.url
                                        additionalProperties =
                                            urlCitation.additionalProperties.toMutableMap()
                                    }

                                    fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                    /**
                                     * Sets [Builder.endIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.endIndex] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun endIndex(endIndex: JsonField<Long>) = apply {
                                        this.endIndex = endIndex
                                    }

                                    fun startIndex(startIndex: Long) =
                                        startIndex(JsonField.of(startIndex))

                                    /**
                                     * Sets [Builder.startIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.startIndex] with a
                                     * well-typed [Long] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun startIndex(startIndex: JsonField<Long>) = apply {
                                        this.startIndex = startIndex
                                    }

                                    fun title(title: String) = title(JsonField.of(title))

                                    /**
                                     * Sets [Builder.title] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.title] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun title(title: JsonField<String>) = apply {
                                        this.title = title
                                    }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("url_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun url(url: String) = url(JsonField.of(url))

                                    /**
                                     * Sets [Builder.url] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [UrlCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .endIndex()
                                     * .startIndex()
                                     * .title()
                                     * .url()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): UrlCitation =
                                        UrlCitation(
                                            checkRequired("endIndex", endIndex),
                                            checkRequired("startIndex", startIndex),
                                            checkRequired("title", title),
                                            type,
                                            checkRequired("url", url),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): UrlCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    endIndex()
                                    startIndex()
                                    title()
                                    _type().let {
                                        if (it != JsonValue.from("url_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    url()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (endIndex.asKnown() == null) 0 else 1) +
                                        (if (startIndex.asKnown() == null) 0 else 1) +
                                        (if (title.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("url_citation")) 1 else 0
                                        } +
                                        (if (url.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is UrlCitation && endIndex == other.endIndex && startIndex == other.startIndex && title == other.title && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(endIndex, startIndex, title, type, url, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "UrlCitation{endIndex=$endIndex, startIndex=$startIndex, title=$title, type=$type, url=$url, additionalProperties=$additionalProperties}"
                            }

                            class ContainerFileCitation
                            private constructor(
                                private val containerId: JsonField<String>,
                                private val endIndex: JsonField<Long>,
                                private val fileId: JsonField<String>,
                                private val filename: JsonField<String>,
                                private val startIndex: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("container_id")
                                    @ExcludeMissing
                                    containerId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    endIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("filename")
                                    @ExcludeMissing
                                    filename: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    startIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(
                                    containerId,
                                    endIndex,
                                    fileId,
                                    filename,
                                    startIndex,
                                    type,
                                    mutableMapOf(),
                                )

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun containerId(): String = containerId.getRequired("container_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun endIndex(): Long = endIndex.getRequired("end_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun filename(): String = filename.getRequired("filename")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun startIndex(): Long = startIndex.getRequired("start_index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("container_file_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [containerId].
                                 *
                                 * Unlike [containerId], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("container_id")
                                @ExcludeMissing
                                fun _containerId(): JsonField<String> = containerId

                                /**
                                 * Returns the raw JSON value of [endIndex].
                                 *
                                 * Unlike [endIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("end_index")
                                @ExcludeMissing
                                fun _endIndex(): JsonField<Long> = endIndex

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [filename].
                                 *
                                 * Unlike [filename], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("filename")
                                @ExcludeMissing
                                fun _filename(): JsonField<String> = filename

                                /**
                                 * Returns the raw JSON value of [startIndex].
                                 *
                                 * Unlike [startIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("start_index")
                                @ExcludeMissing
                                fun _startIndex(): JsonField<Long> = startIndex

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [ContainerFileCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .containerId()
                                     * .endIndex()
                                     * .fileId()
                                     * .filename()
                                     * .startIndex()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ContainerFileCitation]. */
                                class Builder internal constructor() {

                                    private var containerId: JsonField<String>? = null
                                    private var endIndex: JsonField<Long>? = null
                                    private var fileId: JsonField<String>? = null
                                    private var filename: JsonField<String>? = null
                                    private var startIndex: JsonField<Long>? = null
                                    private var type: JsonValue =
                                        JsonValue.from("container_file_citation")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(
                                        containerFileCitation: ContainerFileCitation
                                    ) = apply {
                                        containerId = containerFileCitation.containerId
                                        endIndex = containerFileCitation.endIndex
                                        fileId = containerFileCitation.fileId
                                        filename = containerFileCitation.filename
                                        startIndex = containerFileCitation.startIndex
                                        type = containerFileCitation.type
                                        additionalProperties =
                                            containerFileCitation.additionalProperties
                                                .toMutableMap()
                                    }

                                    fun containerId(containerId: String) =
                                        containerId(JsonField.of(containerId))

                                    /**
                                     * Sets [Builder.containerId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.containerId] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun containerId(containerId: JsonField<String>) = apply {
                                        this.containerId = containerId
                                    }

                                    fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                    /**
                                     * Sets [Builder.endIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.endIndex] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun endIndex(endIndex: JsonField<Long>) = apply {
                                        this.endIndex = endIndex
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun filename(filename: String) =
                                        filename(JsonField.of(filename))

                                    /**
                                     * Sets [Builder.filename] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.filename] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun filename(filename: JsonField<String>) = apply {
                                        this.filename = filename
                                    }

                                    fun startIndex(startIndex: Long) =
                                        startIndex(JsonField.of(startIndex))

                                    /**
                                     * Sets [Builder.startIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.startIndex] with a
                                     * well-typed [Long] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun startIndex(startIndex: JsonField<Long>) = apply {
                                        this.startIndex = startIndex
                                    }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("container_file_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ContainerFileCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .containerId()
                                     * .endIndex()
                                     * .fileId()
                                     * .filename()
                                     * .startIndex()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): ContainerFileCitation =
                                        ContainerFileCitation(
                                            checkRequired("containerId", containerId),
                                            checkRequired("endIndex", endIndex),
                                            checkRequired("fileId", fileId),
                                            checkRequired("filename", filename),
                                            checkRequired("startIndex", startIndex),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): ContainerFileCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    containerId()
                                    endIndex()
                                    fileId()
                                    filename()
                                    startIndex()
                                    _type().let {
                                        if (it != JsonValue.from("container_file_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (containerId.asKnown() == null) 0 else 1) +
                                        (if (endIndex.asKnown() == null) 0 else 1) +
                                        (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (filename.asKnown() == null) 0 else 1) +
                                        (if (startIndex.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("container_file_citation")) 1
                                            else 0
                                        }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is ContainerFileCitation && containerId == other.containerId && endIndex == other.endIndex && fileId == other.fileId && filename == other.filename && startIndex == other.startIndex && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(containerId, endIndex, fileId, filename, startIndex, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ContainerFileCitation{containerId=$containerId, endIndex=$endIndex, fileId=$fileId, filename=$filename, startIndex=$startIndex, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class FilePath
                            private constructor(
                                private val fileId: JsonField<String>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(fileId, index, type, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("file_path")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [FilePath].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FilePath]. */
                                class Builder internal constructor() {

                                    private var fileId: JsonField<String>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("file_path")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(filePath: FilePath) = apply {
                                        fileId = filePath.fileId
                                        index = filePath.index
                                        type = filePath.type
                                        additionalProperties =
                                            filePath.additionalProperties.toMutableMap()
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("file_path")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FilePath].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FilePath =
                                        FilePath(
                                            checkRequired("fileId", fileId),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FilePath = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    fileId()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("file_path")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let { if (it == JsonValue.from("file_path")) 1 else 0 }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is FilePath && fileId == other.fileId && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(fileId, index, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FilePath{fileId=$fileId, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is OpenAIResponseOutputMessageContent && annotations == other.annotations && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(annotations, text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "OpenAIResponseOutputMessageContent{annotations=$annotations, text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }
                }

                class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val SYSTEM = of("system")

                        val DEVELOPER = of("developer")

                        val USER = of("user")

                        val ASSISTANT = of("assistant")

                        fun of(value: String) = Role(JsonField.of(value))
                    }

                    /** An enum containing [Role]'s known values. */
                    enum class Known {
                        SYSTEM,
                        DEVELOPER,
                        USER,
                        ASSISTANT,
                    }

                    /**
                     * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Role] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SYSTEM,
                        DEVELOPER,
                        USER,
                        ASSISTANT,
                        /**
                         * An enum member indicating that [Role] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SYSTEM -> Value.SYSTEM
                            DEVELOPER -> Value.DEVELOPER
                            USER -> Value.USER
                            ASSISTANT -> Value.ASSISTANT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   is a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SYSTEM -> Known.SYSTEM
                            DEVELOPER -> Known.DEVELOPER
                            USER -> Known.USER
                            ASSISTANT -> Known.ASSISTANT
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Role: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Role = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Message && content == other.content && role == other.role && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(content, role, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }

            class WebSearchCall
            private constructor(
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(id, status, type, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("web_search_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [WebSearchCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .status()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [WebSearchCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var status: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("web_search_call")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(webSearchCall: WebSearchCall) = apply {
                        id = webSearchCall.id
                        status = webSearchCall.status
                        type = webSearchCall.type
                        additionalProperties = webSearchCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("web_search_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [WebSearchCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WebSearchCall =
                        WebSearchCall(
                            checkRequired("id", id),
                            checkRequired("status", status),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebSearchCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    status()
                    _type().let {
                        if (it != JsonValue.from("web_search_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("web_search_call")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is WebSearchCall && id == other.id && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, status, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebSearchCall{id=$id, status=$status, type=$type, additionalProperties=$additionalProperties}"
            }

            class FileSearchCall
            private constructor(
                private val id: JsonField<String>,
                private val queries: JsonField<List<String>>,
                private val status: JsonField<String>,
                private val type: JsonValue,
                private val results: JsonField<List<Result>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("queries")
                    @ExcludeMissing
                    queries: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("results")
                    @ExcludeMissing
                    results: JsonField<List<Result>> = JsonMissing.of(),
                ) : this(id, queries, status, type, results, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun queries(): List<String> = queries.getRequired("queries")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("file_search_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun results(): List<Result>? = results.getNullable("results")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [queries].
                 *
                 * Unlike [queries], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("queries")
                @ExcludeMissing
                fun _queries(): JsonField<List<String>> = queries

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /**
                 * Returns the raw JSON value of [results].
                 *
                 * Unlike [results], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("results")
                @ExcludeMissing
                fun _results(): JsonField<List<Result>> = results

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [FileSearchCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .queries()
                     * .status()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FileSearchCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var queries: JsonField<MutableList<String>>? = null
                    private var status: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("file_search_call")
                    private var results: JsonField<MutableList<Result>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(fileSearchCall: FileSearchCall) = apply {
                        id = fileSearchCall.id
                        queries = fileSearchCall.queries.map { it.toMutableList() }
                        status = fileSearchCall.status
                        type = fileSearchCall.type
                        results = fileSearchCall.results.map { it.toMutableList() }
                        additionalProperties = fileSearchCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun queries(queries: List<String>) = queries(JsonField.of(queries))

                    /**
                     * Sets [Builder.queries] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.queries] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun queries(queries: JsonField<List<String>>) = apply {
                        this.queries = queries.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [queries].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addQuery(query: String) = apply {
                        queries =
                            (queries ?: JsonField.of(mutableListOf())).also {
                                checkKnown("queries", it).add(query)
                            }
                    }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("file_search_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun results(results: List<Result>) = results(JsonField.of(results))

                    /**
                     * Sets [Builder.results] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.results] with a well-typed `List<Result>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun results(results: JsonField<List<Result>>) = apply {
                        this.results = results.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Result] to [results].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addResult(result: Result) = apply {
                        results =
                            (results ?: JsonField.of(mutableListOf())).also {
                                checkKnown("results", it).add(result)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [FileSearchCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .queries()
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FileSearchCall =
                        FileSearchCall(
                            checkRequired("id", id),
                            checkRequired("queries", queries).map { it.toImmutable() },
                            checkRequired("status", status),
                            type,
                            (results ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FileSearchCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    queries()
                    status()
                    _type().let {
                        if (it != JsonValue.from("file_search_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    results()?.forEach { it.validate() }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (queries.asKnown()?.size ?: 0) +
                        (if (status.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("file_search_call")) 1 else 0 } +
                        (results.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class Result
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Result]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Result]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(result: Result) = apply {
                            additionalProperties = result.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Result].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Result = Result(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Result = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Result{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FileSearchCall && id == other.id && queries == other.queries && status == other.status && type == other.type && results == other.results && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, queries, status, type, results, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FileSearchCall{id=$id, queries=$queries, status=$status, type=$type, results=$results, additionalProperties=$additionalProperties}"
            }

            class FunctionCall
            private constructor(
                private val arguments: JsonField<String>,
                private val callId: JsonField<String>,
                private val name: JsonField<String>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("call_id")
                    @ExcludeMissing
                    callId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(arguments, callId, name, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun arguments(): String = arguments.getRequired("arguments")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun callId(): String = callId.getRequired("call_id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("function_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                /**
                 * Returns the raw JSON value of [callId].
                 *
                 * Unlike [callId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [FunctionCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .arguments()
                     * .callId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FunctionCall]. */
                class Builder internal constructor() {

                    private var arguments: JsonField<String>? = null
                    private var callId: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("function_call")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(functionCall: FunctionCall) = apply {
                        arguments = functionCall.arguments
                        callId = functionCall.callId
                        name = functionCall.name
                        type = functionCall.type
                        id = functionCall.id
                        status = functionCall.status
                        additionalProperties = functionCall.additionalProperties.toMutableMap()
                    }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun callId(callId: String) = callId(JsonField.of(callId))

                    /**
                     * Sets [Builder.callId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("function_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [FunctionCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .arguments()
                     * .callId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FunctionCall =
                        FunctionCall(
                            checkRequired("arguments", arguments),
                            checkRequired("callId", callId),
                            checkRequired("name", name),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FunctionCall = apply {
                    if (validated) {
                        return@apply
                    }

                    arguments()
                    callId()
                    name()
                    _type().let {
                        if (it != JsonValue.from("function_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (arguments.asKnown() == null) 0 else 1) +
                        (if (callId.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("function_call")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && arguments == other.arguments && callId == other.callId && name == other.name && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(arguments, callId, name, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FunctionCall{arguments=$arguments, callId=$callId, name=$name, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }

            class McpCall
            private constructor(
                private val id: JsonField<String>,
                private val arguments: JsonField<String>,
                private val name: JsonField<String>,
                private val serverLabel: JsonField<String>,
                private val type: JsonValue,
                private val error: JsonField<String>,
                private val output: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("server_label")
                    @ExcludeMissing
                    serverLabel: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("output")
                    @ExcludeMissing
                    output: JsonField<String> = JsonMissing.of(),
                ) : this(id, arguments, name, serverLabel, type, error, output, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun arguments(): String = arguments.getRequired("arguments")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serverLabel(): String = serverLabel.getRequired("server_label")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("mcp_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun error(): String? = error.getNullable("error")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun output(): String? = output.getNullable("output")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [serverLabel].
                 *
                 * Unlike [serverLabel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("server_label")
                @ExcludeMissing
                fun _serverLabel(): JsonField<String> = serverLabel

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

                /**
                 * Returns the raw JSON value of [output].
                 *
                 * Unlike [output], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [McpCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .arguments()
                     * .name()
                     * .serverLabel()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [McpCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var arguments: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var serverLabel: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("mcp_call")
                    private var error: JsonField<String> = JsonMissing.of()
                    private var output: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(mcpCall: McpCall) = apply {
                        id = mcpCall.id
                        arguments = mcpCall.arguments
                        name = mcpCall.name
                        serverLabel = mcpCall.serverLabel
                        type = mcpCall.type
                        error = mcpCall.error
                        output = mcpCall.output
                        additionalProperties = mcpCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun serverLabel(serverLabel: String) = serverLabel(JsonField.of(serverLabel))

                    /**
                     * Sets [Builder.serverLabel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serverLabel] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun serverLabel(serverLabel: JsonField<String>) = apply {
                        this.serverLabel = serverLabel
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("mcp_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun error(error: String) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<String>) = apply { this.error = error }

                    fun output(output: String) = output(JsonField.of(output))

                    /**
                     * Sets [Builder.output] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.output] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun output(output: JsonField<String>) = apply { this.output = output }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [McpCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .arguments()
                     * .name()
                     * .serverLabel()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): McpCall =
                        McpCall(
                            checkRequired("id", id),
                            checkRequired("arguments", arguments),
                            checkRequired("name", name),
                            checkRequired("serverLabel", serverLabel),
                            type,
                            error,
                            output,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): McpCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    arguments()
                    name()
                    serverLabel()
                    _type().let {
                        if (it != JsonValue.from("mcp_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    error()
                    output()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (arguments.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (serverLabel.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("mcp_call")) 1 else 0 } +
                        (if (error.asKnown() == null) 0 else 1) +
                        (if (output.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is McpCall && id == other.id && arguments == other.arguments && name == other.name && serverLabel == other.serverLabel && type == other.type && error == other.error && output == other.output && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, arguments, name, serverLabel, type, error, output, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "McpCall{id=$id, arguments=$arguments, name=$name, serverLabel=$serverLabel, type=$type, error=$error, output=$output, additionalProperties=$additionalProperties}"
            }

            class McpListTools
            private constructor(
                private val id: JsonField<String>,
                private val serverLabel: JsonField<String>,
                private val tools: JsonField<List<Tool>>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("server_label")
                    @ExcludeMissing
                    serverLabel: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tools")
                    @ExcludeMissing
                    tools: JsonField<List<Tool>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(id, serverLabel, tools, type, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serverLabel(): String = serverLabel.getRequired("server_label")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tools(): List<Tool> = tools.getRequired("tools")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("mcp_list_tools")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [serverLabel].
                 *
                 * Unlike [serverLabel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("server_label")
                @ExcludeMissing
                fun _serverLabel(): JsonField<String> = serverLabel

                /**
                 * Returns the raw JSON value of [tools].
                 *
                 * Unlike [tools], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [McpListTools].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .serverLabel()
                     * .tools()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [McpListTools]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var serverLabel: JsonField<String>? = null
                    private var tools: JsonField<MutableList<Tool>>? = null
                    private var type: JsonValue = JsonValue.from("mcp_list_tools")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(mcpListTools: McpListTools) = apply {
                        id = mcpListTools.id
                        serverLabel = mcpListTools.serverLabel
                        tools = mcpListTools.tools.map { it.toMutableList() }
                        type = mcpListTools.type
                        additionalProperties = mcpListTools.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun serverLabel(serverLabel: String) = serverLabel(JsonField.of(serverLabel))

                    /**
                     * Sets [Builder.serverLabel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serverLabel] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun serverLabel(serverLabel: JsonField<String>) = apply {
                        this.serverLabel = serverLabel
                    }

                    fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

                    /**
                     * Sets [Builder.tools] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tools] with a well-typed `List<Tool>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tools(tools: JsonField<List<Tool>>) = apply {
                        this.tools = tools.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Tool] to [tools].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTool(tool: Tool) = apply {
                        tools =
                            (tools ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tools", it).add(tool)
                            }
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("mcp_list_tools")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [McpListTools].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .serverLabel()
                     * .tools()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): McpListTools =
                        McpListTools(
                            checkRequired("id", id),
                            checkRequired("serverLabel", serverLabel),
                            checkRequired("tools", tools).map { it.toImmutable() },
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): McpListTools = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    serverLabel()
                    tools().forEach { it.validate() }
                    _type().let {
                        if (it != JsonValue.from("mcp_list_tools")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (serverLabel.asKnown() == null) 0 else 1) +
                        (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        type.let { if (it == JsonValue.from("mcp_list_tools")) 1 else 0 }

                class Tool
                private constructor(
                    private val inputSchema: JsonField<InputSchema>,
                    private val name: JsonField<String>,
                    private val description: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("input_schema")
                        @ExcludeMissing
                        inputSchema: JsonField<InputSchema> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                    ) : this(inputSchema, name, description, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun inputSchema(): InputSchema = inputSchema.getRequired("input_schema")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): String? = description.getNullable("description")

                    /**
                     * Returns the raw JSON value of [inputSchema].
                     *
                     * Unlike [inputSchema], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("input_schema")
                    @ExcludeMissing
                    fun _inputSchema(): JsonField<InputSchema> = inputSchema

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Tool].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .inputSchema()
                         * .name()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Tool]. */
                    class Builder internal constructor() {

                        private var inputSchema: JsonField<InputSchema>? = null
                        private var name: JsonField<String>? = null
                        private var description: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tool: Tool) = apply {
                            inputSchema = tool.inputSchema
                            name = tool.name
                            description = tool.description
                            additionalProperties = tool.additionalProperties.toMutableMap()
                        }

                        fun inputSchema(inputSchema: InputSchema) =
                            inputSchema(JsonField.of(inputSchema))

                        /**
                         * Sets [Builder.inputSchema] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.inputSchema] with a well-typed
                         * [InputSchema] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun inputSchema(inputSchema: JsonField<InputSchema>) = apply {
                            this.inputSchema = inputSchema
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun description(description: String) =
                            description(JsonField.of(description))

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Tool].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .inputSchema()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Tool =
                            Tool(
                                checkRequired("inputSchema", inputSchema),
                                checkRequired("name", name),
                                description,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Tool = apply {
                        if (validated) {
                            return@apply
                        }

                        inputSchema().validate()
                        name()
                        description()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (inputSchema.asKnown()?.validity() ?: 0) +
                            (if (name.asKnown() == null) 0 else 1) +
                            (if (description.asKnown() == null) 0 else 1)

                    class InputSchema
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InputSchema].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [InputSchema]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(inputSchema: InputSchema) = apply {
                                additionalProperties =
                                    inputSchema.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InputSchema].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InputSchema =
                                InputSchema(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): InputSchema = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InputSchema && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InputSchema{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tool && inputSchema == other.inputSchema && name == other.name && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(inputSchema, name, description, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Tool{inputSchema=$inputSchema, name=$name, description=$description, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is McpListTools && id == other.id && serverLabel == other.serverLabel && tools == other.tools && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, serverLabel, tools, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "McpListTools{id=$id, serverLabel=$serverLabel, tools=$tools, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseOutputItemAdded && item == other.item && outputIndex == other.outputIndex && responseId == other.responseId && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(item, outputIndex, responseId, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseOutputItemAdded{item=$item, outputIndex=$outputIndex, responseId=$responseId, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseOutputItemDone
    private constructor(
        private val item: JsonField<Item>,
        private val outputIndex: JsonField<Long>,
        private val responseId: JsonField<String>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("item") @ExcludeMissing item: JsonField<Item> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("response_id")
            @ExcludeMissing
            responseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(item, outputIndex, responseId, sequenceNumber, type, mutableMapOf())

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun item(): Item = item.getRequired("item")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun responseId(): String = responseId.getRequired("response_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.output_item.done")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [item].
         *
         * Unlike [item], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item") @ExcludeMissing fun _item(): JsonField<Item> = item

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [responseId].
         *
         * Unlike [responseId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("response_id")
        @ExcludeMissing
        fun _responseId(): JsonField<String> = responseId

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseOutputItemDone].
             *
             * The following fields are required:
             * ```kotlin
             * .item()
             * .outputIndex()
             * .responseId()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseOutputItemDone]. */
        class Builder internal constructor() {

            private var item: JsonField<Item>? = null
            private var outputIndex: JsonField<Long>? = null
            private var responseId: JsonField<String>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.output_item.done")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseOutputItemDone: ResponseOutputItemDone) = apply {
                item = responseOutputItemDone.item
                outputIndex = responseOutputItemDone.outputIndex
                responseId = responseOutputItemDone.responseId
                sequenceNumber = responseOutputItemDone.sequenceNumber
                type = responseOutputItemDone.type
                additionalProperties = responseOutputItemDone.additionalProperties.toMutableMap()
            }

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun item(item: Item) = item(JsonField.of(item))

            /**
             * Sets [Builder.item] to an arbitrary JSON value.
             *
             * You should usually call [Builder.item] with a well-typed [Item] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun item(item: JsonField<Item>) = apply { this.item = item }

            /** Alias for calling [item] with `Item.ofMessage(message)`. */
            fun item(message: Item.Message) = item(Item.ofMessage(message))

            /** Alias for calling [item] with `Item.ofWebSearchCall(webSearchCall)`. */
            fun item(webSearchCall: Item.WebSearchCall) = item(Item.ofWebSearchCall(webSearchCall))

            /** Alias for calling [item] with `Item.ofFileSearchCall(fileSearchCall)`. */
            fun item(fileSearchCall: Item.FileSearchCall) =
                item(Item.ofFileSearchCall(fileSearchCall))

            /** Alias for calling [item] with `Item.ofFunctionCall(functionCall)`. */
            fun item(functionCall: Item.FunctionCall) = item(Item.ofFunctionCall(functionCall))

            /** Alias for calling [item] with `Item.ofMcpCall(mcpCall)`. */
            fun item(mcpCall: Item.McpCall) = item(Item.ofMcpCall(mcpCall))

            /** Alias for calling [item] with `Item.ofMcpListTools(mcpListTools)`. */
            fun item(mcpListTools: Item.McpListTools) = item(Item.ofMcpListTools(mcpListTools))

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun responseId(responseId: String) = responseId(JsonField.of(responseId))

            /**
             * Sets [Builder.responseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseId(responseId: JsonField<String>) = apply { this.responseId = responseId }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.output_item.done")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseOutputItemDone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .item()
             * .outputIndex()
             * .responseId()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseOutputItemDone =
                ResponseOutputItemDone(
                    checkRequired("item", item),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("responseId", responseId),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseOutputItemDone = apply {
            if (validated) {
                return@apply
            }

            item().validate()
            outputIndex()
            responseId()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.output_item.done")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (item.asKnown()?.validity() ?: 0) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (responseId.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.output_item.done")) 1 else 0 }

        /**
         * Corresponds to the various Message types in the Responses API. They are all under one
         * type because the Responses API gives them all the same "type" value, and there is no way
         * to tell them apart in certain scenarios.
         */
        @JsonDeserialize(using = Item.Deserializer::class)
        @JsonSerialize(using = Item.Serializer::class)
        class Item
        private constructor(
            private val message: Message? = null,
            private val webSearchCall: WebSearchCall? = null,
            private val fileSearchCall: FileSearchCall? = null,
            private val functionCall: FunctionCall? = null,
            private val mcpCall: McpCall? = null,
            private val mcpListTools: McpListTools? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun message(): Message? = message

            fun webSearchCall(): WebSearchCall? = webSearchCall

            fun fileSearchCall(): FileSearchCall? = fileSearchCall

            fun functionCall(): FunctionCall? = functionCall

            fun mcpCall(): McpCall? = mcpCall

            fun mcpListTools(): McpListTools? = mcpListTools

            fun isMessage(): Boolean = message != null

            fun isWebSearchCall(): Boolean = webSearchCall != null

            fun isFileSearchCall(): Boolean = fileSearchCall != null

            fun isFunctionCall(): Boolean = functionCall != null

            fun isMcpCall(): Boolean = mcpCall != null

            fun isMcpListTools(): Boolean = mcpListTools != null

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            fun asMessage(): Message = message.getOrThrow("message")

            fun asWebSearchCall(): WebSearchCall = webSearchCall.getOrThrow("webSearchCall")

            fun asFileSearchCall(): FileSearchCall = fileSearchCall.getOrThrow("fileSearchCall")

            fun asFunctionCall(): FunctionCall = functionCall.getOrThrow("functionCall")

            fun asMcpCall(): McpCall = mcpCall.getOrThrow("mcpCall")

            fun asMcpListTools(): McpListTools = mcpListTools.getOrThrow("mcpListTools")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    message != null -> visitor.visitMessage(message)
                    webSearchCall != null -> visitor.visitWebSearchCall(webSearchCall)
                    fileSearchCall != null -> visitor.visitFileSearchCall(fileSearchCall)
                    functionCall != null -> visitor.visitFunctionCall(functionCall)
                    mcpCall != null -> visitor.visitMcpCall(mcpCall)
                    mcpListTools != null -> visitor.visitMcpListTools(mcpListTools)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Item = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitMessage(message: Message) {
                            message.validate()
                        }

                        override fun visitWebSearchCall(webSearchCall: WebSearchCall) {
                            webSearchCall.validate()
                        }

                        override fun visitFileSearchCall(fileSearchCall: FileSearchCall) {
                            fileSearchCall.validate()
                        }

                        override fun visitFunctionCall(functionCall: FunctionCall) {
                            functionCall.validate()
                        }

                        override fun visitMcpCall(mcpCall: McpCall) {
                            mcpCall.validate()
                        }

                        override fun visitMcpListTools(mcpListTools: McpListTools) {
                            mcpListTools.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitMessage(message: Message) = message.validity()

                        override fun visitWebSearchCall(webSearchCall: WebSearchCall) =
                            webSearchCall.validity()

                        override fun visitFileSearchCall(fileSearchCall: FileSearchCall) =
                            fileSearchCall.validity()

                        override fun visitFunctionCall(functionCall: FunctionCall) =
                            functionCall.validity()

                        override fun visitMcpCall(mcpCall: McpCall) = mcpCall.validity()

                        override fun visitMcpListTools(mcpListTools: McpListTools) =
                            mcpListTools.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Item && message == other.message && webSearchCall == other.webSearchCall && fileSearchCall == other.fileSearchCall && functionCall == other.functionCall && mcpCall == other.mcpCall && mcpListTools == other.mcpListTools /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(message, webSearchCall, fileSearchCall, functionCall, mcpCall, mcpListTools) /* spotless:on */

            override fun toString(): String =
                when {
                    message != null -> "Item{message=$message}"
                    webSearchCall != null -> "Item{webSearchCall=$webSearchCall}"
                    fileSearchCall != null -> "Item{fileSearchCall=$fileSearchCall}"
                    functionCall != null -> "Item{functionCall=$functionCall}"
                    mcpCall != null -> "Item{mcpCall=$mcpCall}"
                    mcpListTools != null -> "Item{mcpListTools=$mcpListTools}"
                    _json != null -> "Item{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Item")
                }

            companion object {

                /**
                 * Corresponds to the various Message types in the Responses API. They are all under
                 * one type because the Responses API gives them all the same "type" value, and
                 * there is no way to tell them apart in certain scenarios.
                 */
                fun ofMessage(message: Message) = Item(message = message)

                fun ofWebSearchCall(webSearchCall: WebSearchCall) =
                    Item(webSearchCall = webSearchCall)

                fun ofFileSearchCall(fileSearchCall: FileSearchCall) =
                    Item(fileSearchCall = fileSearchCall)

                fun ofFunctionCall(functionCall: FunctionCall) = Item(functionCall = functionCall)

                fun ofMcpCall(mcpCall: McpCall) = Item(mcpCall = mcpCall)

                fun ofMcpListTools(mcpListTools: McpListTools) = Item(mcpListTools = mcpListTools)
            }

            /**
             * An interface that defines how to map each variant of [Item] to a value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * Corresponds to the various Message types in the Responses API. They are all under
                 * one type because the Responses API gives them all the same "type" value, and
                 * there is no way to tell them apart in certain scenarios.
                 */
                fun visitMessage(message: Message): T

                fun visitWebSearchCall(webSearchCall: WebSearchCall): T

                fun visitFileSearchCall(fileSearchCall: FileSearchCall): T

                fun visitFunctionCall(functionCall: FunctionCall): T

                fun visitMcpCall(mcpCall: McpCall): T

                fun visitMcpListTools(mcpListTools: McpListTools): T

                /**
                 * Maps an unknown variant of [Item] to a value of type [T].
                 *
                 * An instance of [Item] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LlamaStackClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Item: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Item>(Item::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Item {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "message" -> {
                            return tryDeserialize(node, jacksonTypeRef<Message>())?.let {
                                Item(message = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "web_search_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<WebSearchCall>())?.let {
                                Item(webSearchCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "file_search_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<FileSearchCall>())?.let {
                                Item(fileSearchCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "function_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<FunctionCall>())?.let {
                                Item(functionCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "mcp_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<McpCall>())?.let {
                                Item(mcpCall = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "mcp_list_tools" -> {
                            return tryDeserialize(node, jacksonTypeRef<McpListTools>())?.let {
                                Item(mcpListTools = it, _json = json)
                            } ?: Item(_json = json)
                        }
                    }

                    return Item(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Item>(Item::class) {

                override fun serialize(
                    value: Item,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.message != null -> generator.writeObject(value.message)
                        value.webSearchCall != null -> generator.writeObject(value.webSearchCall)
                        value.fileSearchCall != null -> generator.writeObject(value.fileSearchCall)
                        value.functionCall != null -> generator.writeObject(value.functionCall)
                        value.mcpCall != null -> generator.writeObject(value.mcpCall)
                        value.mcpListTools != null -> generator.writeObject(value.mcpListTools)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Item")
                    }
                }
            }

            /**
             * Corresponds to the various Message types in the Responses API. They are all under one
             * type because the Responses API gives them all the same "type" value, and there is no
             * way to tell them apart in certain scenarios.
             */
            class Message
            private constructor(
                private val content: JsonField<Content>,
                private val role: JsonField<Role>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<Content> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): Content = content.getRequired("content")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun role(): Role = role.getRequired("role")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("message")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content")
                @ExcludeMissing
                fun _content(): JsonField<Content> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<Content>? = null
                    private var role: JsonField<Role>? = null
                    private var type: JsonValue = JsonValue.from("message")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        type = message.type
                        id = message.id
                        status = message.status
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    fun content(content: Content) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [Content] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<Content>) = apply { this.content = content }

                    /** Alias for calling [content] with `Content.ofString(string)`. */
                    fun content(string: String) = content(Content.ofString(string))

                    /**
                     * Alias for calling [content] with
                     * `Content.ofOpenAIResponseInputMessageContents(openaiResponseInputMessageContents)`.
                     */
                    fun contentOfOpenAIResponseInputMessageContents(
                        openaiResponseInputMessageContents:
                            List<Content.OpenAIResponseInputMessageContent>
                    ) =
                        content(
                            Content.ofOpenAIResponseInputMessageContents(
                                openaiResponseInputMessageContents
                            )
                        )

                    /**
                     * Alias for calling [content] with
                     * `Content.ofOpenAIResponseOutputMessageContents(openaiResponseOutputMessageContents)`.
                     */
                    fun contentOfOpenAIResponseOutputMessageContents(
                        openaiResponseOutputMessageContents:
                            List<Content.OpenAIResponseOutputMessageContent>
                    ) =
                        content(
                            Content.ofOpenAIResponseOutputMessageContents(
                                openaiResponseOutputMessageContents
                            )
                        )

                    fun role(role: Role) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [Role] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<Role>) = apply { this.role = role }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("message")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            checkRequired("role", role),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content().validate()
                    role().validate()
                    _type().let {
                        if (it != JsonValue.from("message")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (content.asKnown()?.validity() ?: 0) +
                        (role.asKnown()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("message")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                @JsonDeserialize(using = Content.Deserializer::class)
                @JsonSerialize(using = Content.Serializer::class)
                class Content
                private constructor(
                    private val string: String? = null,
                    private val openaiResponseInputMessageContents:
                        List<OpenAIResponseInputMessageContent>? =
                        null,
                    private val openaiResponseOutputMessageContents:
                        List<OpenAIResponseOutputMessageContent>? =
                        null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): String? = string

                    fun openaiResponseInputMessageContents():
                        List<OpenAIResponseInputMessageContent>? =
                        openaiResponseInputMessageContents

                    fun openaiResponseOutputMessageContents():
                        List<OpenAIResponseOutputMessageContent>? =
                        openaiResponseOutputMessageContents

                    fun isString(): Boolean = string != null

                    fun isOpenAIResponseInputMessageContents(): Boolean =
                        openaiResponseInputMessageContents != null

                    fun isOpenAIResponseOutputMessageContents(): Boolean =
                        openaiResponseOutputMessageContents != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asOpenAIResponseInputMessageContents():
                        List<OpenAIResponseInputMessageContent> =
                        openaiResponseInputMessageContents.getOrThrow(
                            "openaiResponseInputMessageContents"
                        )

                    fun asOpenAIResponseOutputMessageContents():
                        List<OpenAIResponseOutputMessageContent> =
                        openaiResponseOutputMessageContents.getOrThrow(
                            "openaiResponseOutputMessageContents"
                        )

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            openaiResponseInputMessageContents != null ->
                                visitor.visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents
                                )
                            openaiResponseOutputMessageContents != null ->
                                visitor.visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents
                                )
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): Content = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents:
                                        List<OpenAIResponseInputMessageContent>
                                ) {
                                    openaiResponseInputMessageContents.forEach { it.validate() }
                                }

                                override fun visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents:
                                        List<OpenAIResponseOutputMessageContent>
                                ) {
                                    openaiResponseOutputMessageContents.forEach { it.validate() }
                                }
                            }
                        )
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitOpenAIResponseInputMessageContents(
                                    openaiResponseInputMessageContents:
                                        List<OpenAIResponseInputMessageContent>
                                ) =
                                    openaiResponseInputMessageContents.sumOf {
                                        it.validity().toInt()
                                    }

                                override fun visitOpenAIResponseOutputMessageContents(
                                    openaiResponseOutputMessageContents:
                                        List<OpenAIResponseOutputMessageContent>
                                ) =
                                    openaiResponseOutputMessageContents.sumOf {
                                        it.validity().toInt()
                                    }

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Content && string == other.string && openaiResponseInputMessageContents == other.openaiResponseInputMessageContents && openaiResponseOutputMessageContents == other.openaiResponseOutputMessageContents /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, openaiResponseInputMessageContents, openaiResponseOutputMessageContents) /* spotless:on */

                    override fun toString(): String =
                        when {
                            string != null -> "Content{string=$string}"
                            openaiResponseInputMessageContents != null ->
                                "Content{openaiResponseInputMessageContents=$openaiResponseInputMessageContents}"
                            openaiResponseOutputMessageContents != null ->
                                "Content{openaiResponseOutputMessageContents=$openaiResponseOutputMessageContents}"
                            _json != null -> "Content{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Content")
                        }

                    companion object {

                        fun ofString(string: String) = Content(string = string)

                        fun ofOpenAIResponseInputMessageContents(
                            openaiResponseInputMessageContents:
                                List<OpenAIResponseInputMessageContent>
                        ) =
                            Content(
                                openaiResponseInputMessageContents =
                                    openaiResponseInputMessageContents
                            )

                        fun ofOpenAIResponseOutputMessageContents(
                            openaiResponseOutputMessageContents:
                                List<OpenAIResponseOutputMessageContent>
                        ) =
                            Content(
                                openaiResponseOutputMessageContents =
                                    openaiResponseOutputMessageContents
                            )
                    }

                    /**
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitOpenAIResponseInputMessageContents(
                            openaiResponseInputMessageContents:
                                List<OpenAIResponseInputMessageContent>
                        ): T

                        fun visitOpenAIResponseOutputMessageContents(
                            openaiResponseOutputMessageContents:
                                List<OpenAIResponseOutputMessageContent>
                        ): T

                        /**
                         * Maps an unknown variant of [Content] to a value of type [T].
                         *
                         * An instance of [Content] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws LlamaStackClientInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Content {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            Content(string = it, _json = json)
                                        },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<
                                                    List<OpenAIResponseInputMessageContent>
                                                >(),
                                            )
                                            ?.let {
                                                Content(
                                                    openaiResponseInputMessageContents = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<
                                                    List<OpenAIResponseOutputMessageContent>
                                                >(),
                                            )
                                            ?.let {
                                                Content(
                                                    openaiResponseOutputMessageContents = it,
                                                    _json = json,
                                                )
                                            },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> Content(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Content>(Content::class) {

                        override fun serialize(
                            value: Content,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.openaiResponseInputMessageContents != null ->
                                    generator.writeObject(value.openaiResponseInputMessageContents)
                                value.openaiResponseOutputMessageContents != null ->
                                    generator.writeObject(value.openaiResponseOutputMessageContents)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    @JsonDeserialize(using = OpenAIResponseInputMessageContent.Deserializer::class)
                    @JsonSerialize(using = OpenAIResponseInputMessageContent.Serializer::class)
                    class OpenAIResponseInputMessageContent
                    private constructor(
                        private val inputText: InputText? = null,
                        private val inputImage: InputImage? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun inputText(): InputText? = inputText

                        fun inputImage(): InputImage? = inputImage

                        fun isInputText(): Boolean = inputText != null

                        fun isInputImage(): Boolean = inputImage != null

                        fun asInputText(): InputText = inputText.getOrThrow("inputText")

                        fun asInputImage(): InputImage = inputImage.getOrThrow("inputImage")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                inputText != null -> visitor.visitInputText(inputText)
                                inputImage != null -> visitor.visitInputImage(inputImage)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): OpenAIResponseInputMessageContent = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitInputText(inputText: InputText) {
                                        inputText.validate()
                                    }

                                    override fun visitInputImage(inputImage: InputImage) {
                                        inputImage.validate()
                                    }
                                }
                            )
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitInputText(inputText: InputText) =
                                        inputText.validity()

                                    override fun visitInputImage(inputImage: InputImage) =
                                        inputImage.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is OpenAIResponseInputMessageContent && inputText == other.inputText && inputImage == other.inputImage /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inputText, inputImage) /* spotless:on */

                        override fun toString(): String =
                            when {
                                inputText != null ->
                                    "OpenAIResponseInputMessageContent{inputText=$inputText}"
                                inputImage != null ->
                                    "OpenAIResponseInputMessageContent{inputImage=$inputImage}"
                                _json != null ->
                                    "OpenAIResponseInputMessageContent{_unknown=$_json}"
                                else ->
                                    throw IllegalStateException(
                                        "Invalid OpenAIResponseInputMessageContent"
                                    )
                            }

                        companion object {

                            fun ofInputText(inputText: InputText) =
                                OpenAIResponseInputMessageContent(inputText = inputText)

                            fun ofInputImage(inputImage: InputImage) =
                                OpenAIResponseInputMessageContent(inputImage = inputImage)
                        }

                        /**
                         * An interface that defines how to map each variant of
                         * [OpenAIResponseInputMessageContent] to a value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitInputText(inputText: InputText): T

                            fun visitInputImage(inputImage: InputImage): T

                            /**
                             * Maps an unknown variant of [OpenAIResponseInputMessageContent] to a
                             * value of type [T].
                             *
                             * An instance of [OpenAIResponseInputMessageContent] can contain an
                             * unknown variant if it was deserialized from data that doesn't match
                             * any known variant. For example, if the SDK is on an older version
                             * than the API, then the API may respond with new variants that the SDK
                             * is unaware of.
                             *
                             * @throws LlamaStackClientInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown OpenAIResponseInputMessageContent: $json"
                                )
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<OpenAIResponseInputMessageContent>(
                                OpenAIResponseInputMessageContent::class
                            ) {

                            override fun ObjectCodec.deserialize(
                                node: JsonNode
                            ): OpenAIResponseInputMessageContent {
                                val json = JsonValue.fromJsonNode(node)
                                val type = json.asObject()?.get("type")?.asString()

                                when (type) {
                                    "input_text" -> {
                                        return tryDeserialize(node, jacksonTypeRef<InputText>())
                                            ?.let {
                                                OpenAIResponseInputMessageContent(
                                                    inputText = it,
                                                    _json = json,
                                                )
                                            } ?: OpenAIResponseInputMessageContent(_json = json)
                                    }
                                    "input_image" -> {
                                        return tryDeserialize(node, jacksonTypeRef<InputImage>())
                                            ?.let {
                                                OpenAIResponseInputMessageContent(
                                                    inputImage = it,
                                                    _json = json,
                                                )
                                            } ?: OpenAIResponseInputMessageContent(_json = json)
                                    }
                                }

                                return OpenAIResponseInputMessageContent(_json = json)
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<OpenAIResponseInputMessageContent>(
                                OpenAIResponseInputMessageContent::class
                            ) {

                            override fun serialize(
                                value: OpenAIResponseInputMessageContent,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.inputText != null ->
                                        generator.writeObject(value.inputText)
                                    value.inputImage != null ->
                                        generator.writeObject(value.inputImage)
                                    value._json != null -> generator.writeObject(value._json)
                                    else ->
                                        throw IllegalStateException(
                                            "Invalid OpenAIResponseInputMessageContent"
                                        )
                                }
                            }
                        }

                        class InputText
                        private constructor(
                            private val text: JsonField<String>,
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("text")
                                @ExcludeMissing
                                text: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(text, type, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun text(): String = text.getRequired("text")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("input_text")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [text].
                             *
                             * Unlike [text], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("text")
                            @ExcludeMissing
                            fun _text(): JsonField<String> = text

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputText].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .text()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputText]. */
                            class Builder internal constructor() {

                                private var text: JsonField<String>? = null
                                private var type: JsonValue = JsonValue.from("input_text")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputText: InputText) = apply {
                                    text = inputText.text
                                    type = inputText.type
                                    additionalProperties =
                                        inputText.additionalProperties.toMutableMap()
                                }

                                fun text(text: String) = text(JsonField.of(text))

                                /**
                                 * Sets [Builder.text] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.text] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun text(text: JsonField<String>) = apply { this.text = text }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("input_text")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputText].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .text()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputText =
                                    InputText(
                                        checkRequired("text", text),
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputText = apply {
                                if (validated) {
                                    return@apply
                                }

                                text()
                                _type().let {
                                    if (it != JsonValue.from("input_text")) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (text.asKnown() == null) 0 else 1) +
                                    type.let { if (it == JsonValue.from("input_text")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InputText && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputText{text=$text, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class InputImage
                        private constructor(
                            private val detail: JsonField<Detail>,
                            private val type: JsonValue,
                            private val imageUrl: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("detail")
                                @ExcludeMissing
                                detail: JsonField<Detail> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("image_url")
                                @ExcludeMissing
                                imageUrl: JsonField<String> = JsonMissing.of(),
                            ) : this(detail, type, imageUrl, mutableMapOf())

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun detail(): Detail = detail.getRequired("detail")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("input_image")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LlamaStackClientInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun imageUrl(): String? = imageUrl.getNullable("image_url")

                            /**
                             * Returns the raw JSON value of [detail].
                             *
                             * Unlike [detail], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("detail")
                            @ExcludeMissing
                            fun _detail(): JsonField<Detail> = detail

                            /**
                             * Returns the raw JSON value of [imageUrl].
                             *
                             * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            fun _imageUrl(): JsonField<String> = imageUrl

                            @JsonAnySetter
                            private fun putAdditionalProperty(key: String, value: JsonValue) {
                                additionalProperties.put(key, value)
                            }

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                Collections.unmodifiableMap(additionalProperties)

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputImage].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .detail()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputImage]. */
                            class Builder internal constructor() {

                                private var detail: JsonField<Detail>? = null
                                private var type: JsonValue = JsonValue.from("input_image")
                                private var imageUrl: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputImage: InputImage) = apply {
                                    detail = inputImage.detail
                                    type = inputImage.type
                                    imageUrl = inputImage.imageUrl
                                    additionalProperties =
                                        inputImage.additionalProperties.toMutableMap()
                                }

                                fun detail(detail: Detail) = detail(JsonField.of(detail))

                                /**
                                 * Sets [Builder.detail] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.detail] with a well-typed
                                 * [Detail] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun detail(detail: JsonField<Detail>) = apply {
                                    this.detail = detail
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("input_image")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                                /**
                                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.imageUrl] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun imageUrl(imageUrl: JsonField<String>) = apply {
                                    this.imageUrl = imageUrl
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputImage].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .detail()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputImage =
                                    InputImage(
                                        checkRequired("detail", detail),
                                        type,
                                        imageUrl,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputImage = apply {
                                if (validated) {
                                    return@apply
                                }

                                detail().validate()
                                _type().let {
                                    if (it != JsonValue.from("input_image")) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                imageUrl()
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (detail.asKnown()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("input_image")) 1 else 0 } +
                                    (if (imageUrl.asKnown() == null) 0 else 1)

                            class Detail
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    val LOW = of("low")

                                    val HIGH = of("high")

                                    val AUTO = of("auto")

                                    fun of(value: String) = Detail(JsonField.of(value))
                                }

                                /** An enum containing [Detail]'s known values. */
                                enum class Known {
                                    LOW,
                                    HIGH,
                                    AUTO,
                                }

                                /**
                                 * An enum containing [Detail]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Detail] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LOW,
                                    HIGH,
                                    AUTO,
                                    /**
                                     * An enum member indicating that [Detail] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LOW -> Value.LOW
                                        HIGH -> Value.HIGH
                                        AUTO -> Value.AUTO
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaStackClientInvalidDataException if this class
                                 *   instance's value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LOW -> Known.LOW
                                        HIGH -> Known.HIGH
                                        AUTO -> Known.AUTO
                                        else ->
                                            throw LlamaStackClientInvalidDataException(
                                                "Unknown Detail: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaStackClientInvalidDataException if this class
                                 *   instance's value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString()
                                        ?: throw LlamaStackClientInvalidDataException(
                                            "Value is not a String"
                                        )

                                private var validated: Boolean = false

                                fun validate(): Detail = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is Detail && value == other.value /* spotless:on */
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is InputImage && detail == other.detail && type == other.type && imageUrl == other.imageUrl && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(detail, type, imageUrl, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputImage{detail=$detail, type=$type, imageUrl=$imageUrl, additionalProperties=$additionalProperties}"
                        }
                    }

                    class OpenAIResponseOutputMessageContent
                    private constructor(
                        private val annotations: JsonField<List<Annotation>>,
                        private val text: JsonField<String>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("annotations")
                            @ExcludeMissing
                            annotations: JsonField<List<Annotation>> = JsonMissing.of(),
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(annotations, text, type, mutableMapOf())

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun annotations(): List<Annotation> = annotations.getRequired("annotations")

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("output_text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [annotations].
                         *
                         * Unlike [annotations], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("annotations")
                        @ExcludeMissing
                        fun _annotations(): JsonField<List<Annotation>> = annotations

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [OpenAIResponseOutputMessageContent].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .annotations()
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [OpenAIResponseOutputMessageContent]. */
                        class Builder internal constructor() {

                            private var annotations: JsonField<MutableList<Annotation>>? = null
                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("output_text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                openaiResponseOutputMessageContent:
                                    OpenAIResponseOutputMessageContent
                            ) = apply {
                                annotations =
                                    openaiResponseOutputMessageContent.annotations.map {
                                        it.toMutableList()
                                    }
                                text = openaiResponseOutputMessageContent.text
                                type = openaiResponseOutputMessageContent.type
                                additionalProperties =
                                    openaiResponseOutputMessageContent.additionalProperties
                                        .toMutableMap()
                            }

                            fun annotations(annotations: List<Annotation>) =
                                annotations(JsonField.of(annotations))

                            /**
                             * Sets [Builder.annotations] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.annotations] with a well-typed
                             * `List<Annotation>` value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun annotations(annotations: JsonField<List<Annotation>>) = apply {
                                this.annotations = annotations.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [Annotation] to [annotations].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addAnnotation(annotation: Annotation) = apply {
                                annotations =
                                    (annotations ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("annotations", it).add(annotation)
                                    }
                            }

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofFileCitation(fileCitation)`.
                             */
                            fun addAnnotation(fileCitation: Annotation.FileCitation) =
                                addAnnotation(Annotation.ofFileCitation(fileCitation))

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofUrlCitation(urlCitation)`.
                             */
                            fun addAnnotation(urlCitation: Annotation.UrlCitation) =
                                addAnnotation(Annotation.ofUrlCitation(urlCitation))

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofContainerFileCitation(containerFileCitation)`.
                             */
                            fun addAnnotation(
                                containerFileCitation: Annotation.ContainerFileCitation
                            ) =
                                addAnnotation(
                                    Annotation.ofContainerFileCitation(containerFileCitation)
                                )

                            /**
                             * Alias for calling [addAnnotation] with
                             * `Annotation.ofFilePath(filePath)`.
                             */
                            fun addAnnotation(filePath: Annotation.FilePath) =
                                addAnnotation(Annotation.ofFilePath(filePath))

                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("output_text")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of
                             * [OpenAIResponseOutputMessageContent].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .annotations()
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): OpenAIResponseOutputMessageContent =
                                OpenAIResponseOutputMessageContent(
                                    checkRequired("annotations", annotations).map {
                                        it.toImmutable()
                                    },
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): OpenAIResponseOutputMessageContent = apply {
                            if (validated) {
                                return@apply
                            }

                            annotations().forEach { it.validate() }
                            text()
                            _type().let {
                                if (it != JsonValue.from("output_text")) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (annotations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                (if (text.asKnown() == null) 0 else 1) +
                                type.let { if (it == JsonValue.from("output_text")) 1 else 0 }

                        @JsonDeserialize(using = Annotation.Deserializer::class)
                        @JsonSerialize(using = Annotation.Serializer::class)
                        class Annotation
                        private constructor(
                            private val fileCitation: FileCitation? = null,
                            private val urlCitation: UrlCitation? = null,
                            private val containerFileCitation: ContainerFileCitation? = null,
                            private val filePath: FilePath? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun fileCitation(): FileCitation? = fileCitation

                            fun urlCitation(): UrlCitation? = urlCitation

                            fun containerFileCitation(): ContainerFileCitation? =
                                containerFileCitation

                            fun filePath(): FilePath? = filePath

                            fun isFileCitation(): Boolean = fileCitation != null

                            fun isUrlCitation(): Boolean = urlCitation != null

                            fun isContainerFileCitation(): Boolean = containerFileCitation != null

                            fun isFilePath(): Boolean = filePath != null

                            fun asFileCitation(): FileCitation =
                                fileCitation.getOrThrow("fileCitation")

                            fun asUrlCitation(): UrlCitation = urlCitation.getOrThrow("urlCitation")

                            fun asContainerFileCitation(): ContainerFileCitation =
                                containerFileCitation.getOrThrow("containerFileCitation")

                            fun asFilePath(): FilePath = filePath.getOrThrow("filePath")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    fileCitation != null -> visitor.visitFileCitation(fileCitation)
                                    urlCitation != null -> visitor.visitUrlCitation(urlCitation)
                                    containerFileCitation != null ->
                                        visitor.visitContainerFileCitation(containerFileCitation)
                                    filePath != null -> visitor.visitFilePath(filePath)
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): Annotation = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitFileCitation(fileCitation: FileCitation) {
                                            fileCitation.validate()
                                        }

                                        override fun visitUrlCitation(urlCitation: UrlCitation) {
                                            urlCitation.validate()
                                        }

                                        override fun visitContainerFileCitation(
                                            containerFileCitation: ContainerFileCitation
                                        ) {
                                            containerFileCitation.validate()
                                        }

                                        override fun visitFilePath(filePath: FilePath) {
                                            filePath.validate()
                                        }
                                    }
                                )
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: LlamaStackClientInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitFileCitation(fileCitation: FileCitation) =
                                            fileCitation.validity()

                                        override fun visitUrlCitation(urlCitation: UrlCitation) =
                                            urlCitation.validity()

                                        override fun visitContainerFileCitation(
                                            containerFileCitation: ContainerFileCitation
                                        ) = containerFileCitation.validity()

                                        override fun visitFilePath(filePath: FilePath) =
                                            filePath.validity()

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Annotation && fileCitation == other.fileCitation && urlCitation == other.urlCitation && containerFileCitation == other.containerFileCitation && filePath == other.filePath /* spotless:on */
                            }

                            override fun hashCode(): Int = /* spotless:off */ Objects.hash(fileCitation, urlCitation, containerFileCitation, filePath) /* spotless:on */

                            override fun toString(): String =
                                when {
                                    fileCitation != null -> "Annotation{fileCitation=$fileCitation}"
                                    urlCitation != null -> "Annotation{urlCitation=$urlCitation}"
                                    containerFileCitation != null ->
                                        "Annotation{containerFileCitation=$containerFileCitation}"
                                    filePath != null -> "Annotation{filePath=$filePath}"
                                    _json != null -> "Annotation{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Annotation")
                                }

                            companion object {

                                fun ofFileCitation(fileCitation: FileCitation) =
                                    Annotation(fileCitation = fileCitation)

                                fun ofUrlCitation(urlCitation: UrlCitation) =
                                    Annotation(urlCitation = urlCitation)

                                fun ofContainerFileCitation(
                                    containerFileCitation: ContainerFileCitation
                                ) = Annotation(containerFileCitation = containerFileCitation)

                                fun ofFilePath(filePath: FilePath) = Annotation(filePath = filePath)
                            }

                            /**
                             * An interface that defines how to map each variant of [Annotation] to
                             * a value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitFileCitation(fileCitation: FileCitation): T

                                fun visitUrlCitation(urlCitation: UrlCitation): T

                                fun visitContainerFileCitation(
                                    containerFileCitation: ContainerFileCitation
                                ): T

                                fun visitFilePath(filePath: FilePath): T

                                /**
                                 * Maps an unknown variant of [Annotation] to a value of type [T].
                                 *
                                 * An instance of [Annotation] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant.
                                 * For example, if the SDK is on an older version than the API, then
                                 * the API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws LlamaStackClientInvalidDataException in the default
                                 *   implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Annotation: $json"
                                    )
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<Annotation>(Annotation::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Annotation {
                                    val json = JsonValue.fromJsonNode(node)
                                    val type = json.asObject()?.get("type")?.asString()

                                    when (type) {
                                        "file_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<FileCitation>(),
                                                )
                                                ?.let {
                                                    Annotation(fileCitation = it, _json = json)
                                                } ?: Annotation(_json = json)
                                        }
                                        "url_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<UrlCitation>(),
                                                )
                                                ?.let { Annotation(urlCitation = it, _json = json) }
                                                ?: Annotation(_json = json)
                                        }
                                        "container_file_citation" -> {
                                            return tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<ContainerFileCitation>(),
                                                )
                                                ?.let {
                                                    Annotation(
                                                        containerFileCitation = it,
                                                        _json = json,
                                                    )
                                                } ?: Annotation(_json = json)
                                        }
                                        "file_path" -> {
                                            return tryDeserialize(node, jacksonTypeRef<FilePath>())
                                                ?.let { Annotation(filePath = it, _json = json) }
                                                ?: Annotation(_json = json)
                                        }
                                    }

                                    return Annotation(_json = json)
                                }
                            }

                            internal class Serializer :
                                BaseSerializer<Annotation>(Annotation::class) {

                                override fun serialize(
                                    value: Annotation,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.fileCitation != null ->
                                            generator.writeObject(value.fileCitation)
                                        value.urlCitation != null ->
                                            generator.writeObject(value.urlCitation)
                                        value.containerFileCitation != null ->
                                            generator.writeObject(value.containerFileCitation)
                                        value.filePath != null ->
                                            generator.writeObject(value.filePath)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Annotation")
                                    }
                                }
                            }

                            class FileCitation
                            private constructor(
                                private val fileId: JsonField<String>,
                                private val filename: JsonField<String>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("filename")
                                    @ExcludeMissing
                                    filename: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(fileId, filename, index, type, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun filename(): String = filename.getRequired("filename")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("file_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [filename].
                                 *
                                 * Unlike [filename], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("filename")
                                @ExcludeMissing
                                fun _filename(): JsonField<String> = filename

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [FileCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .filename()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FileCitation]. */
                                class Builder internal constructor() {

                                    private var fileId: JsonField<String>? = null
                                    private var filename: JsonField<String>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("file_citation")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(fileCitation: FileCitation) = apply {
                                        fileId = fileCitation.fileId
                                        filename = fileCitation.filename
                                        index = fileCitation.index
                                        type = fileCitation.type
                                        additionalProperties =
                                            fileCitation.additionalProperties.toMutableMap()
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun filename(filename: String) =
                                        filename(JsonField.of(filename))

                                    /**
                                     * Sets [Builder.filename] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.filename] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun filename(filename: JsonField<String>) = apply {
                                        this.filename = filename
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("file_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FileCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .filename()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FileCitation =
                                        FileCitation(
                                            checkRequired("fileId", fileId),
                                            checkRequired("filename", filename),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FileCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    fileId()
                                    filename()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("file_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (filename.asKnown() == null) 0 else 1) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("file_citation")) 1 else 0
                                        }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is FileCitation && fileId == other.fileId && filename == other.filename && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(fileId, filename, index, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FileCitation{fileId=$fileId, filename=$filename, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class UrlCitation
                            private constructor(
                                private val endIndex: JsonField<Long>,
                                private val startIndex: JsonField<Long>,
                                private val title: JsonField<String>,
                                private val type: JsonValue,
                                private val url: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    endIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    startIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("title")
                                    @ExcludeMissing
                                    title: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    url: JsonField<String> = JsonMissing.of(),
                                ) : this(endIndex, startIndex, title, type, url, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun endIndex(): Long = endIndex.getRequired("end_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun startIndex(): Long = startIndex.getRequired("start_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun title(): String = title.getRequired("title")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("url_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * Returns the raw JSON value of [endIndex].
                                 *
                                 * Unlike [endIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("end_index")
                                @ExcludeMissing
                                fun _endIndex(): JsonField<Long> = endIndex

                                /**
                                 * Returns the raw JSON value of [startIndex].
                                 *
                                 * Unlike [startIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("start_index")
                                @ExcludeMissing
                                fun _startIndex(): JsonField<Long> = startIndex

                                /**
                                 * Returns the raw JSON value of [title].
                                 *
                                 * Unlike [title], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("title")
                                @ExcludeMissing
                                fun _title(): JsonField<String> = title

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [UrlCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .endIndex()
                                     * .startIndex()
                                     * .title()
                                     * .url()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [UrlCitation]. */
                                class Builder internal constructor() {

                                    private var endIndex: JsonField<Long>? = null
                                    private var startIndex: JsonField<Long>? = null
                                    private var title: JsonField<String>? = null
                                    private var type: JsonValue = JsonValue.from("url_citation")
                                    private var url: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(urlCitation: UrlCitation) = apply {
                                        endIndex = urlCitation.endIndex
                                        startIndex = urlCitation.startIndex
                                        title = urlCitation.title
                                        type = urlCitation.type
                                        url = urlCitation.url
                                        additionalProperties =
                                            urlCitation.additionalProperties.toMutableMap()
                                    }

                                    fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                    /**
                                     * Sets [Builder.endIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.endIndex] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun endIndex(endIndex: JsonField<Long>) = apply {
                                        this.endIndex = endIndex
                                    }

                                    fun startIndex(startIndex: Long) =
                                        startIndex(JsonField.of(startIndex))

                                    /**
                                     * Sets [Builder.startIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.startIndex] with a
                                     * well-typed [Long] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun startIndex(startIndex: JsonField<Long>) = apply {
                                        this.startIndex = startIndex
                                    }

                                    fun title(title: String) = title(JsonField.of(title))

                                    /**
                                     * Sets [Builder.title] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.title] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun title(title: JsonField<String>) = apply {
                                        this.title = title
                                    }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("url_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun url(url: String) = url(JsonField.of(url))

                                    /**
                                     * Sets [Builder.url] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [UrlCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .endIndex()
                                     * .startIndex()
                                     * .title()
                                     * .url()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): UrlCitation =
                                        UrlCitation(
                                            checkRequired("endIndex", endIndex),
                                            checkRequired("startIndex", startIndex),
                                            checkRequired("title", title),
                                            type,
                                            checkRequired("url", url),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): UrlCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    endIndex()
                                    startIndex()
                                    title()
                                    _type().let {
                                        if (it != JsonValue.from("url_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    url()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (endIndex.asKnown() == null) 0 else 1) +
                                        (if (startIndex.asKnown() == null) 0 else 1) +
                                        (if (title.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("url_citation")) 1 else 0
                                        } +
                                        (if (url.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is UrlCitation && endIndex == other.endIndex && startIndex == other.startIndex && title == other.title && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(endIndex, startIndex, title, type, url, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "UrlCitation{endIndex=$endIndex, startIndex=$startIndex, title=$title, type=$type, url=$url, additionalProperties=$additionalProperties}"
                            }

                            class ContainerFileCitation
                            private constructor(
                                private val containerId: JsonField<String>,
                                private val endIndex: JsonField<Long>,
                                private val fileId: JsonField<String>,
                                private val filename: JsonField<String>,
                                private val startIndex: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("container_id")
                                    @ExcludeMissing
                                    containerId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    endIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("filename")
                                    @ExcludeMissing
                                    filename: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    startIndex: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(
                                    containerId,
                                    endIndex,
                                    fileId,
                                    filename,
                                    startIndex,
                                    type,
                                    mutableMapOf(),
                                )

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun containerId(): String = containerId.getRequired("container_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun endIndex(): Long = endIndex.getRequired("end_index")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun filename(): String = filename.getRequired("filename")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun startIndex(): Long = startIndex.getRequired("start_index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("container_file_citation")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [containerId].
                                 *
                                 * Unlike [containerId], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("container_id")
                                @ExcludeMissing
                                fun _containerId(): JsonField<String> = containerId

                                /**
                                 * Returns the raw JSON value of [endIndex].
                                 *
                                 * Unlike [endIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("end_index")
                                @ExcludeMissing
                                fun _endIndex(): JsonField<Long> = endIndex

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [filename].
                                 *
                                 * Unlike [filename], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("filename")
                                @ExcludeMissing
                                fun _filename(): JsonField<String> = filename

                                /**
                                 * Returns the raw JSON value of [startIndex].
                                 *
                                 * Unlike [startIndex], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("start_index")
                                @ExcludeMissing
                                fun _startIndex(): JsonField<Long> = startIndex

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [ContainerFileCitation].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .containerId()
                                     * .endIndex()
                                     * .fileId()
                                     * .filename()
                                     * .startIndex()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ContainerFileCitation]. */
                                class Builder internal constructor() {

                                    private var containerId: JsonField<String>? = null
                                    private var endIndex: JsonField<Long>? = null
                                    private var fileId: JsonField<String>? = null
                                    private var filename: JsonField<String>? = null
                                    private var startIndex: JsonField<Long>? = null
                                    private var type: JsonValue =
                                        JsonValue.from("container_file_citation")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(
                                        containerFileCitation: ContainerFileCitation
                                    ) = apply {
                                        containerId = containerFileCitation.containerId
                                        endIndex = containerFileCitation.endIndex
                                        fileId = containerFileCitation.fileId
                                        filename = containerFileCitation.filename
                                        startIndex = containerFileCitation.startIndex
                                        type = containerFileCitation.type
                                        additionalProperties =
                                            containerFileCitation.additionalProperties
                                                .toMutableMap()
                                    }

                                    fun containerId(containerId: String) =
                                        containerId(JsonField.of(containerId))

                                    /**
                                     * Sets [Builder.containerId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.containerId] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun containerId(containerId: JsonField<String>) = apply {
                                        this.containerId = containerId
                                    }

                                    fun endIndex(endIndex: Long) = endIndex(JsonField.of(endIndex))

                                    /**
                                     * Sets [Builder.endIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.endIndex] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun endIndex(endIndex: JsonField<Long>) = apply {
                                        this.endIndex = endIndex
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun filename(filename: String) =
                                        filename(JsonField.of(filename))

                                    /**
                                     * Sets [Builder.filename] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.filename] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun filename(filename: JsonField<String>) = apply {
                                        this.filename = filename
                                    }

                                    fun startIndex(startIndex: Long) =
                                        startIndex(JsonField.of(startIndex))

                                    /**
                                     * Sets [Builder.startIndex] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.startIndex] with a
                                     * well-typed [Long] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun startIndex(startIndex: JsonField<Long>) = apply {
                                        this.startIndex = startIndex
                                    }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("container_file_citation")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ContainerFileCitation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .containerId()
                                     * .endIndex()
                                     * .fileId()
                                     * .filename()
                                     * .startIndex()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): ContainerFileCitation =
                                        ContainerFileCitation(
                                            checkRequired("containerId", containerId),
                                            checkRequired("endIndex", endIndex),
                                            checkRequired("fileId", fileId),
                                            checkRequired("filename", filename),
                                            checkRequired("startIndex", startIndex),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): ContainerFileCitation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    containerId()
                                    endIndex()
                                    fileId()
                                    filename()
                                    startIndex()
                                    _type().let {
                                        if (it != JsonValue.from("container_file_citation")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (containerId.asKnown() == null) 0 else 1) +
                                        (if (endIndex.asKnown() == null) 0 else 1) +
                                        (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (filename.asKnown() == null) 0 else 1) +
                                        (if (startIndex.asKnown() == null) 0 else 1) +
                                        type.let {
                                            if (it == JsonValue.from("container_file_citation")) 1
                                            else 0
                                        }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is ContainerFileCitation && containerId == other.containerId && endIndex == other.endIndex && fileId == other.fileId && filename == other.filename && startIndex == other.startIndex && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(containerId, endIndex, fileId, filename, startIndex, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ContainerFileCitation{containerId=$containerId, endIndex=$endIndex, fileId=$fileId, filename=$filename, startIndex=$startIndex, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class FilePath
                            private constructor(
                                private val fileId: JsonField<String>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("file_id")
                                    @ExcludeMissing
                                    fileId: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(fileId, index, type, mutableMapOf())

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun fileId(): String = fileId.getRequired("file_id")

                                /**
                                 * @throws LlamaStackClientInvalidDataException if the JSON field
                                 *   has an unexpected type or is unexpectedly missing or null (e.g.
                                 *   if the server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("file_path")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [fileId].
                                 *
                                 * Unlike [fileId], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fun _fileId(): JsonField<String> = fileId

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

                                @JsonAnySetter
                                private fun putAdditionalProperty(key: String, value: JsonValue) {
                                    additionalProperties.put(key, value)
                                }

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    Collections.unmodifiableMap(additionalProperties)

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [FilePath].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FilePath]. */
                                class Builder internal constructor() {

                                    private var fileId: JsonField<String>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("file_path")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(filePath: FilePath) = apply {
                                        fileId = filePath.fileId
                                        index = filePath.index
                                        type = filePath.type
                                        additionalProperties =
                                            filePath.additionalProperties.toMutableMap()
                                    }

                                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                    /**
                                     * Sets [Builder.fileId] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.fileId] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun fileId(fileId: JsonField<String>) = apply {
                                        this.fileId = fileId
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("file_path")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FilePath].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .fileId()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FilePath =
                                        FilePath(
                                            checkRequired("fileId", fileId),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FilePath = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    fileId()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("file_path")) {
                                            throw LlamaStackClientInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: LlamaStackClientInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let { if (it == JsonValue.from("file_path")) 1 else 0 }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is FilePath && fileId == other.fileId && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(fileId, index, type, additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FilePath{fileId=$fileId, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is OpenAIResponseOutputMessageContent && annotations == other.annotations && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(annotations, text, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "OpenAIResponseOutputMessageContent{annotations=$annotations, text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }
                }

                class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val SYSTEM = of("system")

                        val DEVELOPER = of("developer")

                        val USER = of("user")

                        val ASSISTANT = of("assistant")

                        fun of(value: String) = Role(JsonField.of(value))
                    }

                    /** An enum containing [Role]'s known values. */
                    enum class Known {
                        SYSTEM,
                        DEVELOPER,
                        USER,
                        ASSISTANT,
                    }

                    /**
                     * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Role] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SYSTEM,
                        DEVELOPER,
                        USER,
                        ASSISTANT,
                        /**
                         * An enum member indicating that [Role] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SYSTEM -> Value.SYSTEM
                            DEVELOPER -> Value.DEVELOPER
                            USER -> Value.USER
                            ASSISTANT -> Value.ASSISTANT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   is a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SYSTEM -> Known.SYSTEM
                            DEVELOPER -> Known.DEVELOPER
                            USER -> Known.USER
                            ASSISTANT -> Known.ASSISTANT
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Role: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Role = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Message && content == other.content && role == other.role && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(content, role, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }

            class WebSearchCall
            private constructor(
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(id, status, type, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("web_search_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [WebSearchCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .status()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [WebSearchCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var status: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("web_search_call")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(webSearchCall: WebSearchCall) = apply {
                        id = webSearchCall.id
                        status = webSearchCall.status
                        type = webSearchCall.type
                        additionalProperties = webSearchCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("web_search_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [WebSearchCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WebSearchCall =
                        WebSearchCall(
                            checkRequired("id", id),
                            checkRequired("status", status),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebSearchCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    status()
                    _type().let {
                        if (it != JsonValue.from("web_search_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("web_search_call")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is WebSearchCall && id == other.id && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, status, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebSearchCall{id=$id, status=$status, type=$type, additionalProperties=$additionalProperties}"
            }

            class FileSearchCall
            private constructor(
                private val id: JsonField<String>,
                private val queries: JsonField<List<String>>,
                private val status: JsonField<String>,
                private val type: JsonValue,
                private val results: JsonField<List<Result>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("queries")
                    @ExcludeMissing
                    queries: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("results")
                    @ExcludeMissing
                    results: JsonField<List<Result>> = JsonMissing.of(),
                ) : this(id, queries, status, type, results, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun queries(): List<String> = queries.getRequired("queries")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("file_search_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun results(): List<Result>? = results.getNullable("results")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [queries].
                 *
                 * Unlike [queries], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("queries")
                @ExcludeMissing
                fun _queries(): JsonField<List<String>> = queries

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /**
                 * Returns the raw JSON value of [results].
                 *
                 * Unlike [results], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("results")
                @ExcludeMissing
                fun _results(): JsonField<List<Result>> = results

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [FileSearchCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .queries()
                     * .status()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FileSearchCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var queries: JsonField<MutableList<String>>? = null
                    private var status: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("file_search_call")
                    private var results: JsonField<MutableList<Result>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(fileSearchCall: FileSearchCall) = apply {
                        id = fileSearchCall.id
                        queries = fileSearchCall.queries.map { it.toMutableList() }
                        status = fileSearchCall.status
                        type = fileSearchCall.type
                        results = fileSearchCall.results.map { it.toMutableList() }
                        additionalProperties = fileSearchCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun queries(queries: List<String>) = queries(JsonField.of(queries))

                    /**
                     * Sets [Builder.queries] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.queries] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun queries(queries: JsonField<List<String>>) = apply {
                        this.queries = queries.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [queries].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addQuery(query: String) = apply {
                        queries =
                            (queries ?: JsonField.of(mutableListOf())).also {
                                checkKnown("queries", it).add(query)
                            }
                    }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("file_search_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun results(results: List<Result>) = results(JsonField.of(results))

                    /**
                     * Sets [Builder.results] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.results] with a well-typed `List<Result>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun results(results: JsonField<List<Result>>) = apply {
                        this.results = results.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Result] to [results].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addResult(result: Result) = apply {
                        results =
                            (results ?: JsonField.of(mutableListOf())).also {
                                checkKnown("results", it).add(result)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [FileSearchCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .queries()
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FileSearchCall =
                        FileSearchCall(
                            checkRequired("id", id),
                            checkRequired("queries", queries).map { it.toImmutable() },
                            checkRequired("status", status),
                            type,
                            (results ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FileSearchCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    queries()
                    status()
                    _type().let {
                        if (it != JsonValue.from("file_search_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    results()?.forEach { it.validate() }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (queries.asKnown()?.size ?: 0) +
                        (if (status.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("file_search_call")) 1 else 0 } +
                        (results.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class Result
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Result]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Result]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(result: Result) = apply {
                            additionalProperties = result.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Result].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Result = Result(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Result = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Result{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FileSearchCall && id == other.id && queries == other.queries && status == other.status && type == other.type && results == other.results && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, queries, status, type, results, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FileSearchCall{id=$id, queries=$queries, status=$status, type=$type, results=$results, additionalProperties=$additionalProperties}"
            }

            class FunctionCall
            private constructor(
                private val arguments: JsonField<String>,
                private val callId: JsonField<String>,
                private val name: JsonField<String>,
                private val type: JsonValue,
                private val id: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("call_id")
                    @ExcludeMissing
                    callId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(arguments, callId, name, type, id, status, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun arguments(): String = arguments.getRequired("arguments")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun callId(): String = callId.getRequired("call_id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("function_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): String? = status.getNullable("status")

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                /**
                 * Returns the raw JSON value of [callId].
                 *
                 * Unlike [callId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [FunctionCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .arguments()
                     * .callId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FunctionCall]. */
                class Builder internal constructor() {

                    private var arguments: JsonField<String>? = null
                    private var callId: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("function_call")
                    private var id: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(functionCall: FunctionCall) = apply {
                        arguments = functionCall.arguments
                        callId = functionCall.callId
                        name = functionCall.name
                        type = functionCall.type
                        id = functionCall.id
                        status = functionCall.status
                        additionalProperties = functionCall.additionalProperties.toMutableMap()
                    }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun callId(callId: String) = callId(JsonField.of(callId))

                    /**
                     * Sets [Builder.callId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("function_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [FunctionCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .arguments()
                     * .callId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FunctionCall =
                        FunctionCall(
                            checkRequired("arguments", arguments),
                            checkRequired("callId", callId),
                            checkRequired("name", name),
                            type,
                            id,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FunctionCall = apply {
                    if (validated) {
                        return@apply
                    }

                    arguments()
                    callId()
                    name()
                    _type().let {
                        if (it != JsonValue.from("function_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    id()
                    status()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (arguments.asKnown() == null) 0 else 1) +
                        (if (callId.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("function_call")) 1 else 0 } +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (status.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && arguments == other.arguments && callId == other.callId && name == other.name && type == other.type && id == other.id && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(arguments, callId, name, type, id, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FunctionCall{arguments=$arguments, callId=$callId, name=$name, type=$type, id=$id, status=$status, additionalProperties=$additionalProperties}"
            }

            class McpCall
            private constructor(
                private val id: JsonField<String>,
                private val arguments: JsonField<String>,
                private val name: JsonField<String>,
                private val serverLabel: JsonField<String>,
                private val type: JsonValue,
                private val error: JsonField<String>,
                private val output: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("server_label")
                    @ExcludeMissing
                    serverLabel: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("output")
                    @ExcludeMissing
                    output: JsonField<String> = JsonMissing.of(),
                ) : this(id, arguments, name, serverLabel, type, error, output, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun arguments(): String = arguments.getRequired("arguments")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serverLabel(): String = serverLabel.getRequired("server_label")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("mcp_call")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun error(): String? = error.getNullable("error")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun output(): String? = output.getNullable("output")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [serverLabel].
                 *
                 * Unlike [serverLabel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("server_label")
                @ExcludeMissing
                fun _serverLabel(): JsonField<String> = serverLabel

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

                /**
                 * Returns the raw JSON value of [output].
                 *
                 * Unlike [output], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [McpCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .arguments()
                     * .name()
                     * .serverLabel()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [McpCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var arguments: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var serverLabel: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("mcp_call")
                    private var error: JsonField<String> = JsonMissing.of()
                    private var output: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(mcpCall: McpCall) = apply {
                        id = mcpCall.id
                        arguments = mcpCall.arguments
                        name = mcpCall.name
                        serverLabel = mcpCall.serverLabel
                        type = mcpCall.type
                        error = mcpCall.error
                        output = mcpCall.output
                        additionalProperties = mcpCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun serverLabel(serverLabel: String) = serverLabel(JsonField.of(serverLabel))

                    /**
                     * Sets [Builder.serverLabel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serverLabel] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun serverLabel(serverLabel: JsonField<String>) = apply {
                        this.serverLabel = serverLabel
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("mcp_call")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun error(error: String) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<String>) = apply { this.error = error }

                    fun output(output: String) = output(JsonField.of(output))

                    /**
                     * Sets [Builder.output] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.output] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun output(output: JsonField<String>) = apply { this.output = output }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [McpCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .arguments()
                     * .name()
                     * .serverLabel()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): McpCall =
                        McpCall(
                            checkRequired("id", id),
                            checkRequired("arguments", arguments),
                            checkRequired("name", name),
                            checkRequired("serverLabel", serverLabel),
                            type,
                            error,
                            output,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): McpCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    arguments()
                    name()
                    serverLabel()
                    _type().let {
                        if (it != JsonValue.from("mcp_call")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    error()
                    output()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (arguments.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (serverLabel.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("mcp_call")) 1 else 0 } +
                        (if (error.asKnown() == null) 0 else 1) +
                        (if (output.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is McpCall && id == other.id && arguments == other.arguments && name == other.name && serverLabel == other.serverLabel && type == other.type && error == other.error && output == other.output && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, arguments, name, serverLabel, type, error, output, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "McpCall{id=$id, arguments=$arguments, name=$name, serverLabel=$serverLabel, type=$type, error=$error, output=$output, additionalProperties=$additionalProperties}"
            }

            class McpListTools
            private constructor(
                private val id: JsonField<String>,
                private val serverLabel: JsonField<String>,
                private val tools: JsonField<List<Tool>>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("server_label")
                    @ExcludeMissing
                    serverLabel: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tools")
                    @ExcludeMissing
                    tools: JsonField<List<Tool>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(id, serverLabel, tools, type, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serverLabel(): String = serverLabel.getRequired("server_label")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tools(): List<Tool> = tools.getRequired("tools")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("mcp_list_tools")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [serverLabel].
                 *
                 * Unlike [serverLabel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("server_label")
                @ExcludeMissing
                fun _serverLabel(): JsonField<String> = serverLabel

                /**
                 * Returns the raw JSON value of [tools].
                 *
                 * Unlike [tools], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [McpListTools].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .serverLabel()
                     * .tools()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [McpListTools]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var serverLabel: JsonField<String>? = null
                    private var tools: JsonField<MutableList<Tool>>? = null
                    private var type: JsonValue = JsonValue.from("mcp_list_tools")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(mcpListTools: McpListTools) = apply {
                        id = mcpListTools.id
                        serverLabel = mcpListTools.serverLabel
                        tools = mcpListTools.tools.map { it.toMutableList() }
                        type = mcpListTools.type
                        additionalProperties = mcpListTools.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun serverLabel(serverLabel: String) = serverLabel(JsonField.of(serverLabel))

                    /**
                     * Sets [Builder.serverLabel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serverLabel] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun serverLabel(serverLabel: JsonField<String>) = apply {
                        this.serverLabel = serverLabel
                    }

                    fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

                    /**
                     * Sets [Builder.tools] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tools] with a well-typed `List<Tool>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tools(tools: JsonField<List<Tool>>) = apply {
                        this.tools = tools.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Tool] to [tools].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTool(tool: Tool) = apply {
                        tools =
                            (tools ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tools", it).add(tool)
                            }
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("mcp_list_tools")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [McpListTools].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .serverLabel()
                     * .tools()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): McpListTools =
                        McpListTools(
                            checkRequired("id", id),
                            checkRequired("serverLabel", serverLabel),
                            checkRequired("tools", tools).map { it.toImmutable() },
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): McpListTools = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    serverLabel()
                    tools().forEach { it.validate() }
                    _type().let {
                        if (it != JsonValue.from("mcp_list_tools")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (serverLabel.asKnown() == null) 0 else 1) +
                        (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        type.let { if (it == JsonValue.from("mcp_list_tools")) 1 else 0 }

                class Tool
                private constructor(
                    private val inputSchema: JsonField<InputSchema>,
                    private val name: JsonField<String>,
                    private val description: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("input_schema")
                        @ExcludeMissing
                        inputSchema: JsonField<InputSchema> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                    ) : this(inputSchema, name, description, mutableMapOf())

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun inputSchema(): InputSchema = inputSchema.getRequired("input_schema")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): String? = description.getNullable("description")

                    /**
                     * Returns the raw JSON value of [inputSchema].
                     *
                     * Unlike [inputSchema], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("input_schema")
                    @ExcludeMissing
                    fun _inputSchema(): JsonField<InputSchema> = inputSchema

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Tool].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .inputSchema()
                         * .name()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Tool]. */
                    class Builder internal constructor() {

                        private var inputSchema: JsonField<InputSchema>? = null
                        private var name: JsonField<String>? = null
                        private var description: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tool: Tool) = apply {
                            inputSchema = tool.inputSchema
                            name = tool.name
                            description = tool.description
                            additionalProperties = tool.additionalProperties.toMutableMap()
                        }

                        fun inputSchema(inputSchema: InputSchema) =
                            inputSchema(JsonField.of(inputSchema))

                        /**
                         * Sets [Builder.inputSchema] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.inputSchema] with a well-typed
                         * [InputSchema] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun inputSchema(inputSchema: JsonField<InputSchema>) = apply {
                            this.inputSchema = inputSchema
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun description(description: String) =
                            description(JsonField.of(description))

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Tool].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .inputSchema()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Tool =
                            Tool(
                                checkRequired("inputSchema", inputSchema),
                                checkRequired("name", name),
                                description,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Tool = apply {
                        if (validated) {
                            return@apply
                        }

                        inputSchema().validate()
                        name()
                        description()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaStackClientInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (inputSchema.asKnown()?.validity() ?: 0) +
                            (if (name.asKnown() == null) 0 else 1) +
                            (if (description.asKnown() == null) 0 else 1)

                    class InputSchema
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InputSchema].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [InputSchema]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(inputSchema: InputSchema) = apply {
                                additionalProperties =
                                    inputSchema.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InputSchema].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InputSchema =
                                InputSchema(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): InputSchema = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LlamaStackClientInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InputSchema && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InputSchema{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tool && inputSchema == other.inputSchema && name == other.name && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(inputSchema, name, description, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Tool{inputSchema=$inputSchema, name=$name, description=$description, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is McpListTools && id == other.id && serverLabel == other.serverLabel && tools == other.tools && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, serverLabel, tools, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "McpListTools{id=$id, serverLabel=$serverLabel, tools=$tools, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseOutputItemDone && item == other.item && outputIndex == other.outputIndex && responseId == other.responseId && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(item, outputIndex, responseId, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseOutputItemDone{item=$item, outputIndex=$outputIndex, responseId=$responseId, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseOutputTextDelta
    private constructor(
        private val contentIndex: JsonField<Long>,
        private val delta: JsonField<String>,
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_index")
            @ExcludeMissing
            contentIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("delta") @ExcludeMissing delta: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(contentIndex, delta, itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun contentIndex(): Long = contentIndex.getRequired("content_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun delta(): String = delta.getRequired("delta")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.output_text.delta")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [contentIndex].
         *
         * Unlike [contentIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("content_index")
        @ExcludeMissing
        fun _contentIndex(): JsonField<Long> = contentIndex

        /**
         * Returns the raw JSON value of [delta].
         *
         * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<String> = delta

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseOutputTextDelta].
             *
             * The following fields are required:
             * ```kotlin
             * .contentIndex()
             * .delta()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseOutputTextDelta]. */
        class Builder internal constructor() {

            private var contentIndex: JsonField<Long>? = null
            private var delta: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.output_text.delta")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseOutputTextDelta: ResponseOutputTextDelta) = apply {
                contentIndex = responseOutputTextDelta.contentIndex
                delta = responseOutputTextDelta.delta
                itemId = responseOutputTextDelta.itemId
                outputIndex = responseOutputTextDelta.outputIndex
                sequenceNumber = responseOutputTextDelta.sequenceNumber
                type = responseOutputTextDelta.type
                additionalProperties = responseOutputTextDelta.additionalProperties.toMutableMap()
            }

            fun contentIndex(contentIndex: Long) = contentIndex(JsonField.of(contentIndex))

            /**
             * Sets [Builder.contentIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentIndex(contentIndex: JsonField<Long>) = apply {
                this.contentIndex = contentIndex
            }

            fun delta(delta: String) = delta(JsonField.of(delta))

            /**
             * Sets [Builder.delta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delta] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delta(delta: JsonField<String>) = apply { this.delta = delta }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.output_text.delta")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseOutputTextDelta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .contentIndex()
             * .delta()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseOutputTextDelta =
                ResponseOutputTextDelta(
                    checkRequired("contentIndex", contentIndex),
                    checkRequired("delta", delta),
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseOutputTextDelta = apply {
            if (validated) {
                return@apply
            }

            contentIndex()
            delta()
            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.output_text.delta")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (contentIndex.asKnown() == null) 0 else 1) +
                (if (delta.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.output_text.delta")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseOutputTextDelta && contentIndex == other.contentIndex && delta == other.delta && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentIndex, delta, itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseOutputTextDelta{contentIndex=$contentIndex, delta=$delta, itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseOutputTextDone
    private constructor(
        private val contentIndex: JsonField<Long>,
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val text: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_index")
            @ExcludeMissing
            contentIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(contentIndex, itemId, outputIndex, sequenceNumber, text, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun contentIndex(): Long = contentIndex.getRequired("content_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.output_text.done")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [contentIndex].
         *
         * Unlike [contentIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("content_index")
        @ExcludeMissing
        fun _contentIndex(): JsonField<Long> = contentIndex

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseOutputTextDone].
             *
             * The following fields are required:
             * ```kotlin
             * .contentIndex()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * .text()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseOutputTextDone]. */
        class Builder internal constructor() {

            private var contentIndex: JsonField<Long>? = null
            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var text: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("response.output_text.done")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseOutputTextDone: ResponseOutputTextDone) = apply {
                contentIndex = responseOutputTextDone.contentIndex
                itemId = responseOutputTextDone.itemId
                outputIndex = responseOutputTextDone.outputIndex
                sequenceNumber = responseOutputTextDone.sequenceNumber
                text = responseOutputTextDone.text
                type = responseOutputTextDone.type
                additionalProperties = responseOutputTextDone.additionalProperties.toMutableMap()
            }

            fun contentIndex(contentIndex: Long) = contentIndex(JsonField.of(contentIndex))

            /**
             * Sets [Builder.contentIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentIndex(contentIndex: JsonField<Long>) = apply {
                this.contentIndex = contentIndex
            }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.output_text.done")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseOutputTextDone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .contentIndex()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseOutputTextDone =
                ResponseOutputTextDone(
                    checkRequired("contentIndex", contentIndex),
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    checkRequired("text", text),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseOutputTextDone = apply {
            if (validated) {
                return@apply
            }

            contentIndex()
            itemId()
            outputIndex()
            sequenceNumber()
            text()
            _type().let {
                if (it != JsonValue.from("response.output_text.done")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (contentIndex.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                (if (text.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.output_text.done")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseOutputTextDone && contentIndex == other.contentIndex && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentIndex, itemId, outputIndex, sequenceNumber, text, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseOutputTextDone{contentIndex=$contentIndex, itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, text=$text, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseFunctionCallArgumentsDelta
    private constructor(
        private val delta: JsonField<String>,
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delta") @ExcludeMissing delta: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(delta, itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun delta(): String = delta.getRequired("delta")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.function_call_arguments.delta")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [delta].
         *
         * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<String> = delta

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseFunctionCallArgumentsDelta].
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseFunctionCallArgumentsDelta]. */
        class Builder internal constructor() {

            private var delta: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.function_call_arguments.delta")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                responseFunctionCallArgumentsDelta: ResponseFunctionCallArgumentsDelta
            ) = apply {
                delta = responseFunctionCallArgumentsDelta.delta
                itemId = responseFunctionCallArgumentsDelta.itemId
                outputIndex = responseFunctionCallArgumentsDelta.outputIndex
                sequenceNumber = responseFunctionCallArgumentsDelta.sequenceNumber
                type = responseFunctionCallArgumentsDelta.type
                additionalProperties =
                    responseFunctionCallArgumentsDelta.additionalProperties.toMutableMap()
            }

            fun delta(delta: String) = delta(JsonField.of(delta))

            /**
             * Sets [Builder.delta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delta] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delta(delta: JsonField<String>) = apply { this.delta = delta }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.function_call_arguments.delta")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseFunctionCallArgumentsDelta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseFunctionCallArgumentsDelta =
                ResponseFunctionCallArgumentsDelta(
                    checkRequired("delta", delta),
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseFunctionCallArgumentsDelta = apply {
            if (validated) {
                return@apply
            }

            delta()
            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.function_call_arguments.delta")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (delta.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let {
                    if (it == JsonValue.from("response.function_call_arguments.delta")) 1 else 0
                }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFunctionCallArgumentsDelta && delta == other.delta && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(delta, itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseFunctionCallArgumentsDelta{delta=$delta, itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseFunctionCallArgumentsDone
    private constructor(
        private val arguments: JsonField<String>,
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("arguments")
            @ExcludeMissing
            arguments: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(arguments, itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun arguments(): String = arguments.getRequired("arguments")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.function_call_arguments.done")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [arguments].
         *
         * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arguments") @ExcludeMissing fun _arguments(): JsonField<String> = arguments

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseFunctionCallArgumentsDone].
             *
             * The following fields are required:
             * ```kotlin
             * .arguments()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseFunctionCallArgumentsDone]. */
        class Builder internal constructor() {

            private var arguments: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.function_call_arguments.done")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                responseFunctionCallArgumentsDone: ResponseFunctionCallArgumentsDone
            ) = apply {
                arguments = responseFunctionCallArgumentsDone.arguments
                itemId = responseFunctionCallArgumentsDone.itemId
                outputIndex = responseFunctionCallArgumentsDone.outputIndex
                sequenceNumber = responseFunctionCallArgumentsDone.sequenceNumber
                type = responseFunctionCallArgumentsDone.type
                additionalProperties =
                    responseFunctionCallArgumentsDone.additionalProperties.toMutableMap()
            }

            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

            /**
             * Sets [Builder.arguments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arguments] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.function_call_arguments.done")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseFunctionCallArgumentsDone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .arguments()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseFunctionCallArgumentsDone =
                ResponseFunctionCallArgumentsDone(
                    checkRequired("arguments", arguments),
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseFunctionCallArgumentsDone = apply {
            if (validated) {
                return@apply
            }

            arguments()
            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.function_call_arguments.done")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (arguments.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let {
                    if (it == JsonValue.from("response.function_call_arguments.done")) 1 else 0
                }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFunctionCallArgumentsDone && arguments == other.arguments && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(arguments, itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseFunctionCallArgumentsDone{arguments=$arguments, itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseWebSearchCallInProgress
    private constructor(
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.web_search_call.in_progress")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseWebSearchCallInProgress].
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseWebSearchCallInProgress]. */
        class Builder internal constructor() {

            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.web_search_call.in_progress")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseWebSearchCallInProgress: ResponseWebSearchCallInProgress) =
                apply {
                    itemId = responseWebSearchCallInProgress.itemId
                    outputIndex = responseWebSearchCallInProgress.outputIndex
                    sequenceNumber = responseWebSearchCallInProgress.sequenceNumber
                    type = responseWebSearchCallInProgress.type
                    additionalProperties =
                        responseWebSearchCallInProgress.additionalProperties.toMutableMap()
                }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.web_search_call.in_progress")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseWebSearchCallInProgress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseWebSearchCallInProgress =
                ResponseWebSearchCallInProgress(
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseWebSearchCallInProgress = apply {
            if (validated) {
                return@apply
            }

            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.web_search_call.in_progress")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let {
                    if (it == JsonValue.from("response.web_search_call.in_progress")) 1 else 0
                }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseWebSearchCallInProgress && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseWebSearchCallInProgress{itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseWebSearchCallSearching
    private constructor(
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.web_search_call.searching")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseWebSearchCallSearching].
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseWebSearchCallSearching]. */
        class Builder internal constructor() {

            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.web_search_call.searching")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseWebSearchCallSearching: ResponseWebSearchCallSearching) =
                apply {
                    itemId = responseWebSearchCallSearching.itemId
                    outputIndex = responseWebSearchCallSearching.outputIndex
                    sequenceNumber = responseWebSearchCallSearching.sequenceNumber
                    type = responseWebSearchCallSearching.type
                    additionalProperties =
                        responseWebSearchCallSearching.additionalProperties.toMutableMap()
                }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.web_search_call.searching")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseWebSearchCallSearching].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseWebSearchCallSearching =
                ResponseWebSearchCallSearching(
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseWebSearchCallSearching = apply {
            if (validated) {
                return@apply
            }

            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.web_search_call.searching")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let {
                    if (it == JsonValue.from("response.web_search_call.searching")) 1 else 0
                }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseWebSearchCallSearching && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseWebSearchCallSearching{itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseWebSearchCallCompleted
    private constructor(
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.web_search_call.completed")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseWebSearchCallCompleted].
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseWebSearchCallCompleted]. */
        class Builder internal constructor() {

            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.web_search_call.completed")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseWebSearchCallCompleted: ResponseWebSearchCallCompleted) =
                apply {
                    itemId = responseWebSearchCallCompleted.itemId
                    outputIndex = responseWebSearchCallCompleted.outputIndex
                    sequenceNumber = responseWebSearchCallCompleted.sequenceNumber
                    type = responseWebSearchCallCompleted.type
                    additionalProperties =
                        responseWebSearchCallCompleted.additionalProperties.toMutableMap()
                }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.web_search_call.completed")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseWebSearchCallCompleted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseWebSearchCallCompleted =
                ResponseWebSearchCallCompleted(
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseWebSearchCallCompleted = apply {
            if (validated) {
                return@apply
            }

            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.web_search_call.completed")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let {
                    if (it == JsonValue.from("response.web_search_call.completed")) 1 else 0
                }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseWebSearchCallCompleted && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseWebSearchCallCompleted{itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpListToolsInProgress
    private constructor(
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_list_tools.in_progress")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseMcpListToolsInProgress].
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpListToolsInProgress]. */
        class Builder internal constructor() {

            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_list_tools.in_progress")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpListToolsInProgress: ResponseMcpListToolsInProgress) =
                apply {
                    sequenceNumber = responseMcpListToolsInProgress.sequenceNumber
                    type = responseMcpListToolsInProgress.type
                    additionalProperties =
                        responseMcpListToolsInProgress.additionalProperties.toMutableMap()
                }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_list_tools.in_progress")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpListToolsInProgress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpListToolsInProgress =
                ResponseMcpListToolsInProgress(
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpListToolsInProgress = apply {
            if (validated) {
                return@apply
            }

            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_list_tools.in_progress")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let {
                    if (it == JsonValue.from("response.mcp_list_tools.in_progress")) 1 else 0
                }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpListToolsInProgress && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpListToolsInProgress{sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpListToolsFailed
    private constructor(
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_list_tools.failed")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseMcpListToolsFailed].
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpListToolsFailed]. */
        class Builder internal constructor() {

            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_list_tools.failed")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpListToolsFailed: ResponseMcpListToolsFailed) = apply {
                sequenceNumber = responseMcpListToolsFailed.sequenceNumber
                type = responseMcpListToolsFailed.type
                additionalProperties =
                    responseMcpListToolsFailed.additionalProperties.toMutableMap()
            }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_list_tools.failed")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpListToolsFailed].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpListToolsFailed =
                ResponseMcpListToolsFailed(
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpListToolsFailed = apply {
            if (validated) {
                return@apply
            }

            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_list_tools.failed")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_list_tools.failed")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpListToolsFailed && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpListToolsFailed{sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpListToolsCompleted
    private constructor(
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_list_tools.completed")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseMcpListToolsCompleted].
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpListToolsCompleted]. */
        class Builder internal constructor() {

            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_list_tools.completed")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpListToolsCompleted: ResponseMcpListToolsCompleted) =
                apply {
                    sequenceNumber = responseMcpListToolsCompleted.sequenceNumber
                    type = responseMcpListToolsCompleted.type
                    additionalProperties =
                        responseMcpListToolsCompleted.additionalProperties.toMutableMap()
                }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_list_tools.completed")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpListToolsCompleted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpListToolsCompleted =
                ResponseMcpListToolsCompleted(
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpListToolsCompleted = apply {
            if (validated) {
                return@apply
            }

            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_list_tools.completed")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_list_tools.completed")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpListToolsCompleted && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpListToolsCompleted{sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpCallArgumentsDelta
    private constructor(
        private val delta: JsonField<String>,
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delta") @ExcludeMissing delta: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(delta, itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun delta(): String = delta.getRequired("delta")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_call.arguments.delta")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [delta].
         *
         * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<String> = delta

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseMcpCallArgumentsDelta].
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpCallArgumentsDelta]. */
        class Builder internal constructor() {

            private var delta: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_call.arguments.delta")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpCallArgumentsDelta: ResponseMcpCallArgumentsDelta) =
                apply {
                    delta = responseMcpCallArgumentsDelta.delta
                    itemId = responseMcpCallArgumentsDelta.itemId
                    outputIndex = responseMcpCallArgumentsDelta.outputIndex
                    sequenceNumber = responseMcpCallArgumentsDelta.sequenceNumber
                    type = responseMcpCallArgumentsDelta.type
                    additionalProperties =
                        responseMcpCallArgumentsDelta.additionalProperties.toMutableMap()
                }

            fun delta(delta: String) = delta(JsonField.of(delta))

            /**
             * Sets [Builder.delta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delta] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delta(delta: JsonField<String>) = apply { this.delta = delta }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_call.arguments.delta")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpCallArgumentsDelta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpCallArgumentsDelta =
                ResponseMcpCallArgumentsDelta(
                    checkRequired("delta", delta),
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpCallArgumentsDelta = apply {
            if (validated) {
                return@apply
            }

            delta()
            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_call.arguments.delta")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (delta.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_call.arguments.delta")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpCallArgumentsDelta && delta == other.delta && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(delta, itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpCallArgumentsDelta{delta=$delta, itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpCallArgumentsDone
    private constructor(
        private val arguments: JsonField<String>,
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("arguments")
            @ExcludeMissing
            arguments: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(arguments, itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun arguments(): String = arguments.getRequired("arguments")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_call.arguments.done")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [arguments].
         *
         * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arguments") @ExcludeMissing fun _arguments(): JsonField<String> = arguments

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseMcpCallArgumentsDone].
             *
             * The following fields are required:
             * ```kotlin
             * .arguments()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpCallArgumentsDone]. */
        class Builder internal constructor() {

            private var arguments: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_call.arguments.done")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpCallArgumentsDone: ResponseMcpCallArgumentsDone) = apply {
                arguments = responseMcpCallArgumentsDone.arguments
                itemId = responseMcpCallArgumentsDone.itemId
                outputIndex = responseMcpCallArgumentsDone.outputIndex
                sequenceNumber = responseMcpCallArgumentsDone.sequenceNumber
                type = responseMcpCallArgumentsDone.type
                additionalProperties =
                    responseMcpCallArgumentsDone.additionalProperties.toMutableMap()
            }

            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

            /**
             * Sets [Builder.arguments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arguments] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_call.arguments.done")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpCallArgumentsDone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .arguments()
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpCallArgumentsDone =
                ResponseMcpCallArgumentsDone(
                    checkRequired("arguments", arguments),
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpCallArgumentsDone = apply {
            if (validated) {
                return@apply
            }

            arguments()
            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_call.arguments.done")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (arguments.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_call.arguments.done")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpCallArgumentsDone && arguments == other.arguments && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(arguments, itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpCallArgumentsDone{arguments=$arguments, itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpCallInProgress
    private constructor(
        private val itemId: JsonField<String>,
        private val outputIndex: JsonField<Long>,
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_index")
            @ExcludeMissing
            outputIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(itemId, outputIndex, sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outputIndex(): Long = outputIndex.getRequired("output_index")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_call.in_progress")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [outputIndex].
         *
         * Unlike [outputIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_index")
        @ExcludeMissing
        fun _outputIndex(): JsonField<Long> = outputIndex

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResponseMcpCallInProgress].
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpCallInProgress]. */
        class Builder internal constructor() {

            private var itemId: JsonField<String>? = null
            private var outputIndex: JsonField<Long>? = null
            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_call.in_progress")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpCallInProgress: ResponseMcpCallInProgress) = apply {
                itemId = responseMcpCallInProgress.itemId
                outputIndex = responseMcpCallInProgress.outputIndex
                sequenceNumber = responseMcpCallInProgress.sequenceNumber
                type = responseMcpCallInProgress.type
                additionalProperties = responseMcpCallInProgress.additionalProperties.toMutableMap()
            }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun outputIndex(outputIndex: Long) = outputIndex(JsonField.of(outputIndex))

            /**
             * Sets [Builder.outputIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputIndex(outputIndex: JsonField<Long>) = apply { this.outputIndex = outputIndex }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_call.in_progress")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpCallInProgress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .itemId()
             * .outputIndex()
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpCallInProgress =
                ResponseMcpCallInProgress(
                    checkRequired("itemId", itemId),
                    checkRequired("outputIndex", outputIndex),
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpCallInProgress = apply {
            if (validated) {
                return@apply
            }

            itemId()
            outputIndex()
            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_call.in_progress")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (itemId.asKnown() == null) 0 else 1) +
                (if (outputIndex.asKnown() == null) 0 else 1) +
                (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_call.in_progress")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpCallInProgress && itemId == other.itemId && outputIndex == other.outputIndex && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(itemId, outputIndex, sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpCallInProgress{itemId=$itemId, outputIndex=$outputIndex, sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpCallFailed
    private constructor(
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_call.failed")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseMcpCallFailed].
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpCallFailed]. */
        class Builder internal constructor() {

            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_call.failed")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpCallFailed: ResponseMcpCallFailed) = apply {
                sequenceNumber = responseMcpCallFailed.sequenceNumber
                type = responseMcpCallFailed.type
                additionalProperties = responseMcpCallFailed.additionalProperties.toMutableMap()
            }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_call.failed")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpCallFailed].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpCallFailed =
                ResponseMcpCallFailed(
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpCallFailed = apply {
            if (validated) {
                return@apply
            }

            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_call.failed")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_call.failed")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpCallFailed && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpCallFailed{sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseMcpCallCompleted
    private constructor(
        private val sequenceNumber: JsonField<Long>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sequence_number")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(sequenceNumber, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun sequenceNumber(): Long = sequenceNumber.getRequired("sequence_number")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.mcp_call.completed")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequence_number")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseMcpCallCompleted].
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseMcpCallCompleted]. */
        class Builder internal constructor() {

            private var sequenceNumber: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("response.mcp_call.completed")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseMcpCallCompleted: ResponseMcpCallCompleted) = apply {
                sequenceNumber = responseMcpCallCompleted.sequenceNumber
                type = responseMcpCallCompleted.type
                additionalProperties = responseMcpCallCompleted.additionalProperties.toMutableMap()
            }

            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.mcp_call.completed")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseMcpCallCompleted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sequenceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseMcpCallCompleted =
                ResponseMcpCallCompleted(
                    checkRequired("sequenceNumber", sequenceNumber),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseMcpCallCompleted = apply {
            if (validated) {
                return@apply
            }

            sequenceNumber()
            _type().let {
                if (it != JsonValue.from("response.mcp_call.completed")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (sequenceNumber.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("response.mcp_call.completed")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseMcpCallCompleted && sequenceNumber == other.sequenceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(sequenceNumber, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseMcpCallCompleted{sequenceNumber=$sequenceNumber, type=$type, additionalProperties=$additionalProperties}"
    }

    class ResponseCompleted
    private constructor(
        private val response: JsonField<ResponseObject>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("response")
            @ExcludeMissing
            response: JsonField<ResponseObject> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(response, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun response(): ResponseObject = response.getRequired("response")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("response.completed")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [response].
         *
         * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("response")
        @ExcludeMissing
        fun _response(): JsonField<ResponseObject> = response

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResponseCompleted].
             *
             * The following fields are required:
             * ```kotlin
             * .response()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ResponseCompleted]. */
        class Builder internal constructor() {

            private var response: JsonField<ResponseObject>? = null
            private var type: JsonValue = JsonValue.from("response.completed")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseCompleted: ResponseCompleted) = apply {
                response = responseCompleted.response
                type = responseCompleted.type
                additionalProperties = responseCompleted.additionalProperties.toMutableMap()
            }

            fun response(response: ResponseObject) = response(JsonField.of(response))

            /**
             * Sets [Builder.response] to an arbitrary JSON value.
             *
             * You should usually call [Builder.response] with a well-typed [ResponseObject] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun response(response: JsonField<ResponseObject>) = apply { this.response = response }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("response.completed")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResponseCompleted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .response()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResponseCompleted =
                ResponseCompleted(
                    checkRequired("response", response),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseCompleted = apply {
            if (validated) {
                return@apply
            }

            response().validate()
            _type().let {
                if (it != JsonValue.from("response.completed")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (response.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("response.completed")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseCompleted && response == other.response && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(response, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseCompleted{response=$response, type=$type, additionalProperties=$additionalProperties}"
    }
}
