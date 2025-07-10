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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Artifacts of a finetuning job. */
class PostTrainingJobArtifactsResponse
private constructor(
    private val checkpoints: JsonField<List<Checkpoint>>,
    private val jobUuid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("checkpoints")
        @ExcludeMissing
        checkpoints: JsonField<List<Checkpoint>> = JsonMissing.of(),
        @JsonProperty("job_uuid") @ExcludeMissing jobUuid: JsonField<String> = JsonMissing.of(),
    ) : this(checkpoints, jobUuid, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun checkpoints(): List<Checkpoint> = checkpoints.getRequired("checkpoints")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobUuid(): String = jobUuid.getRequired("job_uuid")

    /**
     * Returns the raw JSON value of [checkpoints].
     *
     * Unlike [checkpoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checkpoints")
    @ExcludeMissing
    fun _checkpoints(): JsonField<List<Checkpoint>> = checkpoints

    /**
     * Returns the raw JSON value of [jobUuid].
     *
     * Unlike [jobUuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid(): JsonField<String> = jobUuid

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
         * [PostTrainingJobArtifactsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .checkpoints()
         * .jobUuid()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PostTrainingJobArtifactsResponse]. */
    class Builder internal constructor() {

        private var checkpoints: JsonField<MutableList<Checkpoint>>? = null
        private var jobUuid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJobArtifactsResponse: PostTrainingJobArtifactsResponse) =
            apply {
                checkpoints =
                    postTrainingJobArtifactsResponse.checkpoints.map { it.toMutableList() }
                jobUuid = postTrainingJobArtifactsResponse.jobUuid
                additionalProperties =
                    postTrainingJobArtifactsResponse.additionalProperties.toMutableMap()
            }

        fun checkpoints(checkpoints: List<Checkpoint>) = checkpoints(JsonField.of(checkpoints))

        /**
         * Sets [Builder.checkpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkpoints] with a well-typed `List<Checkpoint>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun checkpoints(checkpoints: JsonField<List<Checkpoint>>) = apply {
            this.checkpoints = checkpoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [Checkpoint] to [checkpoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCheckpoint(checkpoint: Checkpoint) = apply {
            checkpoints =
                (checkpoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("checkpoints", it).add(checkpoint)
                }
        }

        fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

        /**
         * Sets [Builder.jobUuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobUuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

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
         * Returns an immutable instance of [PostTrainingJobArtifactsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .checkpoints()
         * .jobUuid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PostTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse(
                checkRequired("checkpoints", checkpoints).map { it.toImmutable() },
                checkRequired("jobUuid", jobUuid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PostTrainingJobArtifactsResponse = apply {
        if (validated) {
            return@apply
        }

        checkpoints().forEach { it.validate() }
        jobUuid()
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
        (checkpoints.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (jobUuid.asKnown() == null) 0 else 1)

    /** Checkpoint created during training runs */
    class Checkpoint
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val epoch: JsonField<Long>,
        private val identifier: JsonField<String>,
        private val path: JsonField<String>,
        private val postTrainingJobId: JsonField<String>,
        private val trainingMetrics: JsonField<TrainingMetrics>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("epoch") @ExcludeMissing epoch: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("identifier")
            @ExcludeMissing
            identifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("post_training_job_id")
            @ExcludeMissing
            postTrainingJobId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("training_metrics")
            @ExcludeMissing
            trainingMetrics: JsonField<TrainingMetrics> = JsonMissing.of(),
        ) : this(
            createdAt,
            epoch,
            identifier,
            path,
            postTrainingJobId,
            trainingMetrics,
            mutableMapOf(),
        )

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun epoch(): Long = epoch.getRequired("epoch")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun identifier(): String = identifier.getRequired("identifier")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun path(): String = path.getRequired("path")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun postTrainingJobId(): String = postTrainingJobId.getRequired("post_training_job_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trainingMetrics(): TrainingMetrics? = trainingMetrics.getNullable("training_metrics")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [epoch].
         *
         * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<Long> = epoch

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [postTrainingJobId].
         *
         * Unlike [postTrainingJobId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("post_training_job_id")
        @ExcludeMissing
        fun _postTrainingJobId(): JsonField<String> = postTrainingJobId

        /**
         * Returns the raw JSON value of [trainingMetrics].
         *
         * Unlike [trainingMetrics], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("training_metrics")
        @ExcludeMissing
        fun _trainingMetrics(): JsonField<TrainingMetrics> = trainingMetrics

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
             * Returns a mutable builder for constructing an instance of [Checkpoint].
             *
             * The following fields are required:
             * ```kotlin
             * .createdAt()
             * .epoch()
             * .identifier()
             * .path()
             * .postTrainingJobId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Checkpoint]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var epoch: JsonField<Long>? = null
            private var identifier: JsonField<String>? = null
            private var path: JsonField<String>? = null
            private var postTrainingJobId: JsonField<String>? = null
            private var trainingMetrics: JsonField<TrainingMetrics> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(checkpoint: Checkpoint) = apply {
                createdAt = checkpoint.createdAt
                epoch = checkpoint.epoch
                identifier = checkpoint.identifier
                path = checkpoint.path
                postTrainingJobId = checkpoint.postTrainingJobId
                trainingMetrics = checkpoint.trainingMetrics
                additionalProperties = checkpoint.additionalProperties.toMutableMap()
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun epoch(epoch: Long) = epoch(JsonField.of(epoch))

            /**
             * Sets [Builder.epoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.epoch] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun epoch(epoch: JsonField<Long>) = apply { this.epoch = epoch }

            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            fun postTrainingJobId(postTrainingJobId: String) =
                postTrainingJobId(JsonField.of(postTrainingJobId))

            /**
             * Sets [Builder.postTrainingJobId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postTrainingJobId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postTrainingJobId(postTrainingJobId: JsonField<String>) = apply {
                this.postTrainingJobId = postTrainingJobId
            }

            fun trainingMetrics(trainingMetrics: TrainingMetrics) =
                trainingMetrics(JsonField.of(trainingMetrics))

            /**
             * Sets [Builder.trainingMetrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trainingMetrics] with a well-typed [TrainingMetrics]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun trainingMetrics(trainingMetrics: JsonField<TrainingMetrics>) = apply {
                this.trainingMetrics = trainingMetrics
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

            /**
             * Returns an immutable instance of [Checkpoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .createdAt()
             * .epoch()
             * .identifier()
             * .path()
             * .postTrainingJobId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Checkpoint =
                Checkpoint(
                    checkRequired("createdAt", createdAt),
                    checkRequired("epoch", epoch),
                    checkRequired("identifier", identifier),
                    checkRequired("path", path),
                    checkRequired("postTrainingJobId", postTrainingJobId),
                    trainingMetrics,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Checkpoint = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            epoch()
            identifier()
            path()
            postTrainingJobId()
            trainingMetrics()?.validate()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
                (if (epoch.asKnown() == null) 0 else 1) +
                (if (identifier.asKnown() == null) 0 else 1) +
                (if (path.asKnown() == null) 0 else 1) +
                (if (postTrainingJobId.asKnown() == null) 0 else 1) +
                (trainingMetrics.asKnown()?.validity() ?: 0)

        class TrainingMetrics
        private constructor(
            private val epoch: JsonField<Long>,
            private val perplexity: JsonField<Double>,
            private val trainLoss: JsonField<Double>,
            private val validationLoss: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("epoch") @ExcludeMissing epoch: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("perplexity")
                @ExcludeMissing
                perplexity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("train_loss")
                @ExcludeMissing
                trainLoss: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("validation_loss")
                @ExcludeMissing
                validationLoss: JsonField<Double> = JsonMissing.of(),
            ) : this(epoch, perplexity, trainLoss, validationLoss, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun epoch(): Long = epoch.getRequired("epoch")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun perplexity(): Double = perplexity.getRequired("perplexity")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun trainLoss(): Double = trainLoss.getRequired("train_loss")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun validationLoss(): Double = validationLoss.getRequired("validation_loss")

            /**
             * Returns the raw JSON value of [epoch].
             *
             * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<Long> = epoch

            /**
             * Returns the raw JSON value of [perplexity].
             *
             * Unlike [perplexity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("perplexity")
            @ExcludeMissing
            fun _perplexity(): JsonField<Double> = perplexity

            /**
             * Returns the raw JSON value of [trainLoss].
             *
             * Unlike [trainLoss], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("train_loss")
            @ExcludeMissing
            fun _trainLoss(): JsonField<Double> = trainLoss

            /**
             * Returns the raw JSON value of [validationLoss].
             *
             * Unlike [validationLoss], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("validation_loss")
            @ExcludeMissing
            fun _validationLoss(): JsonField<Double> = validationLoss

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
                 * Returns a mutable builder for constructing an instance of [TrainingMetrics].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .epoch()
                 * .perplexity()
                 * .trainLoss()
                 * .validationLoss()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TrainingMetrics]. */
            class Builder internal constructor() {

                private var epoch: JsonField<Long>? = null
                private var perplexity: JsonField<Double>? = null
                private var trainLoss: JsonField<Double>? = null
                private var validationLoss: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(trainingMetrics: TrainingMetrics) = apply {
                    epoch = trainingMetrics.epoch
                    perplexity = trainingMetrics.perplexity
                    trainLoss = trainingMetrics.trainLoss
                    validationLoss = trainingMetrics.validationLoss
                    additionalProperties = trainingMetrics.additionalProperties.toMutableMap()
                }

                fun epoch(epoch: Long) = epoch(JsonField.of(epoch))

                /**
                 * Sets [Builder.epoch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.epoch] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun epoch(epoch: JsonField<Long>) = apply { this.epoch = epoch }

                fun perplexity(perplexity: Double) = perplexity(JsonField.of(perplexity))

                /**
                 * Sets [Builder.perplexity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perplexity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun perplexity(perplexity: JsonField<Double>) = apply {
                    this.perplexity = perplexity
                }

                fun trainLoss(trainLoss: Double) = trainLoss(JsonField.of(trainLoss))

                /**
                 * Sets [Builder.trainLoss] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trainLoss] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trainLoss(trainLoss: JsonField<Double>) = apply { this.trainLoss = trainLoss }

                fun validationLoss(validationLoss: Double) =
                    validationLoss(JsonField.of(validationLoss))

                /**
                 * Sets [Builder.validationLoss] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.validationLoss] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun validationLoss(validationLoss: JsonField<Double>) = apply {
                    this.validationLoss = validationLoss
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
                 * Returns an immutable instance of [TrainingMetrics].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .epoch()
                 * .perplexity()
                 * .trainLoss()
                 * .validationLoss()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TrainingMetrics =
                    TrainingMetrics(
                        checkRequired("epoch", epoch),
                        checkRequired("perplexity", perplexity),
                        checkRequired("trainLoss", trainLoss),
                        checkRequired("validationLoss", validationLoss),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TrainingMetrics = apply {
                if (validated) {
                    return@apply
                }

                epoch()
                perplexity()
                trainLoss()
                validationLoss()
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
                (if (epoch.asKnown() == null) 0 else 1) +
                    (if (perplexity.asKnown() == null) 0 else 1) +
                    (if (trainLoss.asKnown() == null) 0 else 1) +
                    (if (validationLoss.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TrainingMetrics && epoch == other.epoch && perplexity == other.perplexity && trainLoss == other.trainLoss && validationLoss == other.validationLoss && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(epoch, perplexity, trainLoss, validationLoss, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TrainingMetrics{epoch=$epoch, perplexity=$perplexity, trainLoss=$trainLoss, validationLoss=$validationLoss, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Checkpoint && createdAt == other.createdAt && epoch == other.epoch && identifier == other.identifier && path == other.path && postTrainingJobId == other.postTrainingJobId && trainingMetrics == other.trainingMetrics && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, epoch, identifier, path, postTrainingJobId, trainingMetrics, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Checkpoint{createdAt=$createdAt, epoch=$epoch, identifier=$identifier, path=$path, postTrainingJobId=$postTrainingJobId, trainingMetrics=$trainingMetrics, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingJobArtifactsResponse && checkpoints == other.checkpoints && jobUuid == other.jobUuid && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(checkpoints, jobUuid, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostTrainingJobArtifactsResponse{checkpoints=$checkpoints, jobUuid=$jobUuid, additionalProperties=$additionalProperties}"
}
