@file:JvmName("JsonHandler")

package com.llama.llamastack.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.enhanceJacksonException
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw enhanceJacksonException("Error reading response", e)
            }
        }
    }
