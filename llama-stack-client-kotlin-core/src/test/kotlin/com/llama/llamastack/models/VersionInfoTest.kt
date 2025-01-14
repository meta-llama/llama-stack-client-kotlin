// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VersionInfoTest {

    @Test
    fun createVersionInfo() {
        val versionInfo = VersionInfo.builder().version("version").build()
        assertThat(versionInfo).isNotNull
        assertThat(versionInfo.version()).isEqualTo("version")
    }
}
