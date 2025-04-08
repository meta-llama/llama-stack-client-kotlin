package com.llama.llamastack.client.local.util

import com.llama.llamastack.client.local.services.vectordb.objectbox.RagVectorDb
import com.llama.llamastack.client.local.services.vectordb.objectbox.RagVectorDb_
import io.objectbox.Box

fun getNeighborSentences(
    box: Box<RagVectorDb>?,
    userPromptEmbedding: FloatArray?,
    maxNeighborCount: Int,
): String {
    if (userPromptEmbedding == null) {
        println("getNeighborSentences: userPromptEmbedding is null")
        return ""
    }

    if (box == null) {
        println("getNeighborSentences: box is null")
        return ""
    }

    val neighbors =
        box.query(
                RagVectorDb_.embeddedChunk.nearestNeighbors(userPromptEmbedding, maxNeighborCount)
            )
            .build()
            .findWithScores()
    return neighbors.joinToString(" ") { it.get().rawChunk }
}
