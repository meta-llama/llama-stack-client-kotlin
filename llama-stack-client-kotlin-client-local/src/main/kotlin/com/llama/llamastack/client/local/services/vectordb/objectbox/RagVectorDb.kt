package com.llama.llamastack.client.local.services.vectordb.objectbox

import io.objectbox.annotation.Entity
import io.objectbox.annotation.HnswIndex
import io.objectbox.annotation.Id
import io.objectbox.annotation.VectorDistanceType

@Entity
data class RagVectorDb(
    @Id var id: Long = 0,
    var rawChunk: String = "",
    @HnswIndex(dimensions = 384, distanceType = VectorDistanceType.COSINE)
    var embeddedChunk: FloatArray = floatArrayOf(),
)
