// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = ToolParamDefinition.Builder::class)
@NoAutoDetect
class ToolParamDefinition
private constructor(
    private val description: JsonField<String>,
    private val paramType: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun description(): String? = description.getNullable("description")

    fun paramType(): String = paramType.getRequired("param_type")

    fun required(): Boolean? = required.getNullable("required")

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("param_type") @ExcludeMissing fun _paramType() = paramType

    @JsonProperty("required") @ExcludeMissing fun _required() = required

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolParamDefinition = apply {
        if (!validated) {
            description()
            paramType()
            required()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolParamDefinition &&
            this.description == other.description &&
            this.paramType == other.paramType &&
            this.required == other.required &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    description,
                    paramType,
                    required,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ToolParamDefinition{description=$description, paramType=$paramType, required=$required, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var description: JsonField<String> = JsonMissing.of()
        private var paramType: JsonField<String> = JsonMissing.of()
        private var required: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolParamDefinition: ToolParamDefinition) = apply {
            this.description = toolParamDefinition.description
            this.paramType = toolParamDefinition.paramType
            this.required = toolParamDefinition.required
            additionalProperties(toolParamDefinition.additionalProperties)
        }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun paramType(paramType: String) = paramType(JsonField.of(paramType))

        @JsonProperty("param_type")
        @ExcludeMissing
        fun paramType(paramType: JsonField<String>) = apply { this.paramType = paramType }

        fun required(required: Boolean) = required(JsonField.of(required))

        @JsonProperty("required")
        @ExcludeMissing
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ToolParamDefinition =
            ToolParamDefinition(
                description,
                paramType,
                required,
                additionalProperties.toUnmodifiable(),
            )
    }
}
