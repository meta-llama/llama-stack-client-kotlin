package com.llama.llamastack.client.local.services.vectordb.objectbox

import io.objectbox.annotation.Entity
import io.objectbox.annotation.HnswIndex
import io.objectbox.annotation.Id
import io.objectbox.annotation.VectorDistanceType

@Entity
data class RagVectorDb(
    @Id var id: Long = 0,
    var rawSentence: String = "",
    @HnswIndex(dimensions = 2, distanceType = VectorDistanceType.COSINE)
    var embeddedSentence: FloatArray? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RagVectorDb

        if (id != other.id) return false
        if (rawSentence != other.rawSentence) return false
        if (embeddedSentence != null) {
            if (other.embeddedSentence == null) return false
            if (!embeddedSentence.contentEquals(other.embeddedSentence)) return false
        } else if (other.embeddedSentence != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + rawSentence.hashCode()
        result = 31 * result + (embeddedSentence?.contentHashCode() ?: 0)
        return result
    }
}
