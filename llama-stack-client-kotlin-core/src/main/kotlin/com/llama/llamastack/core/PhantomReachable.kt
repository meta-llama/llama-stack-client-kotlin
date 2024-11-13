@file:JvmName("PhantomReachable")

package com.llama.llamastack.core

import com.llama.llamastack.errors.LlamaStackClientException
import java.lang.reflect.InvocationTargetException

/**
 * Closes [closeable] when [observed] becomes only phantom reachable.
 *
 * This is a wrapper around a Java 9+ [java.lang.ref.Cleaner], or a no-op in older Java versions.
 */
internal fun closeWhenPhantomReachable(observed: Any, closeable: AutoCloseable) {
    check(observed !== closeable) {
        "`observed` cannot be the same object as `closeable` because it would never become phantom reachable"
    }
    closeWhenPhantomReachable?.let { it(observed, closeable::close) }
}

private val closeWhenPhantomReachable: ((Any, AutoCloseable) -> Unit)? by lazy {
    try {
        val cleanerClass = Class.forName("java.lang.ref.Cleaner")
        val cleanerCreate = cleanerClass.getMethod("create")
        val cleanerRegister =
            cleanerClass.getMethod("register", Any::class.java, Runnable::class.java)
        val cleanerObject = cleanerCreate.invoke(null);

        { observed, closeable ->
            try {
                cleanerRegister.invoke(cleanerObject, observed, Runnable { closeable.close() })
            } catch (e: ReflectiveOperationException) {
                if (e is InvocationTargetException) {
                    when (val cause = e.cause) {
                        is RuntimeException,
                        is Error -> throw cause
                    }
                }
                throw LlamaStackClientException("Unexpected reflective invocation failure", e)
            }
        }
    } catch (e: ReflectiveOperationException) {
        // We're running Java 8, which has no Cleaner.
        null
    }
}
