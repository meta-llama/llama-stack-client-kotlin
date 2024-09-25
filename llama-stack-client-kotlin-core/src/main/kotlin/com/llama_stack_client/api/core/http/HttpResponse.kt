package com.llama_stack_client.api.core.http

import com.google.common.collect.ListMultimap
import java.io.InputStream
import java.lang.AutoCloseable

interface HttpResponse : AutoCloseable {

    fun statusCode(): Int

    fun headers(): ListMultimap<String, String>

    fun body(): InputStream

    interface Handler<T> {

        fun handle(response: HttpResponse): T
    }
}
