// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AttachmentTest {

    @Test
    fun createAttachment() {
        val attachment =
            Attachment.builder()
                .content(Attachment.Content.ofString("string"))
                .mimeType("mime_type")
                .build()
        assertThat(attachment).isNotNull
        assertThat(attachment.content()).isEqualTo(Attachment.Content.ofString("string"))
        assertThat(attachment.mimeType()).isEqualTo("mime_type")
    }
}
