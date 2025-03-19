// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** The response from an evaluation. */
@NoAutoDetect
class EvaluateResponse
@JsonCreator
private constructor(
    @JsonProperty("generations")
    @ExcludeMissing
    private val generations: JsonField<List<Generation>> = JsonMissing.of(),
    @JsonProperty("scores")
    @ExcludeMissing
    private val scores: JsonField<Scores> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The generations from the evaluation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun generations(): List<Generation> = generations.getRequired("generations")

    /**
     * The scores from the evaluation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scores(): Scores = scores.getRequired("scores")

    /**
     * Returns the raw JSON value of [generations].
     *
     * Unlike [generations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("generations")
    @ExcludeMissing
    fun _generations(): JsonField<List<Generation>> = generations

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<Scores> = scores

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EvaluateResponse = apply {
        if (validated) {
            return@apply
        }

        generations().forEach { it.validate() }
        scores().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvaluateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .generations()
         * .scores()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EvaluateResponse]. */
    class Builder internal constructor() {

        private var generations: JsonField<MutableList<Generation>>? = null
        private var scores: JsonField<Scores>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(evaluateResponse: EvaluateResponse) = apply {
            generations = evaluateResponse.generations.map { it.toMutableList() }
            scores = evaluateResponse.scores
            additionalProperties = evaluateResponse.additionalProperties.toMutableMap()
        }

        /** The generations from the evaluation. */
        fun generations(generations: List<Generation>) = generations(JsonField.of(generations))

        /**
         * Sets [Builder.generations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generations] with a well-typed `List<Generation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun generations(generations: JsonField<List<Generation>>) = apply {
            this.generations = generations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Generation] to [generations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeneration(generation: Generation) = apply {
            generations =
                (generations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("generations", it).add(generation)
                }
        }

        /** The scores from the evaluation. */
        fun scores(scores: Scores) = scores(JsonField.of(scores))

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed [Scores] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

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

        fun build(): EvaluateResponse =
            EvaluateResponse(
                checkRequired("generations", generations).map { it.toImmutable() },
                checkRequired("scores", scores),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Generation
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Generation = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Generation]. */
            fun builder() = Builder()
        }

        /** A builder for [Generation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(generation: Generation) = apply {
                additionalProperties = generation.additionalProperties.toMutableMap()
            }

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

            fun build(): Generation = Generation(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Generation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Generation{additionalProperties=$additionalProperties}"
    }

    /** The scores from the evaluation. */
    @NoAutoDetect
    class Scores
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Scores = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Scores]. */
            fun builder() = Builder()
        }

        /** A builder for [Scores]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scores: Scores) = apply {
                additionalProperties = scores.additionalProperties.toMutableMap()
            }

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

            fun build(): Scores = Scores(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Scores && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Scores{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvaluateResponse && generations == other.generations && scores == other.scores && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(generations, scores, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EvaluateResponse{generations=$generations, scores=$scores, additionalProperties=$additionalProperties}"
}
