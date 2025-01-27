@file:JvmName("JsonlHandler")

package com.llama.llamastack.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.errors.LlamaStackClientException

internal inline fun <reified T> jsonlHandler(jsonMapper: JsonMapper): Handler<StreamResponse<T>> =
    streamHandler { lines ->
        for (line in lines) {
            val value =
                try {
                    jsonMapper.readValue(line, jacksonTypeRef<T>())
                } catch (e: Exception) {
                    throw LlamaStackClientException("Error reading response", e)
                }
            yield(value)
        }
    }
