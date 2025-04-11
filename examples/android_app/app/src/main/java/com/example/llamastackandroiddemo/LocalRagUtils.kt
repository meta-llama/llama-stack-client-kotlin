package com.example.llamastackandroiddemo

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.OpenableColumns
import android.util.Log
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.local.services.toolruntime.RagToolServiceLocalImpl
import com.llama.llamastack.models.Document
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader
import com.tom_roush.pdfbox.pdmodel.PDDocument
import com.tom_roush.pdfbox.text.PDFTextStripper
import java.io.InputStream
import java.nio.charset.StandardCharsets
import java.util.UUID

fun localRagSystemPrompt(): String {
    // It is important to keep _RETRIEVED_CONTEXT_ placeholder. This is what will be used in SDK to
    // replace it with similar neighbors
    return "You are a helpful assistant. You will be provided with retrieved context. " +
            "Your answer to the user request should be based on the retrieved context." +
            "Make sure you ONLY use the retrieve context to answer the question. " +
            "Retrieved context: _RETRIEVED_CONTEXT_"
}


fun readFileFromURI(uri: Uri, context: Context): String {
    try {
        val inputStream = context.contentResolver.openInputStream(uri)
        val fileName = getDocumentName(uri, context)
        if (fileName != null) {
            val fileExtension = fileName.substringAfterLast(".", "")
            return when (fileExtension) {
                "pdf" -> pdfToText(inputStream, context)
                "txt" -> txtToText(inputStream)
                else -> ""
            }
        } else {
            return ""
        }
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
        return ""
    }
}

 fun storeAndEmbedDocument(client: LlamaStackClientClient?, sentenceEmbeddingModel: SentenceEmbeddingModel, text: String, chunkSizeInWords: Long): String {
    // Currently just supporting single documents
    val document = Document.builder()
        .documentId("1")
        .content(text)
        .metadata(Document.Metadata.builder().build())
        .build()

    val vectorDbId = UUID.randomUUID().toString()
    // Create Vector DB
    client!!.vectorDbs().register(
        VectorDbRegisterParams.builder()
            .vectorDbId(vectorDbId)
            .embeddingModel("placeholder")
            .build()
    )

    // unique to local
    val tagToolParams = ToolRuntimeRagToolInsertParams.builder()
        .vectorDbId(vectorDbId)
        .chunkSizeInTokens(chunkSizeInWords)
        .documents(listOf(document))
        .build();
    val ragtool = client!!.toolRuntime().ragTool() as RagToolServiceLocalImpl
    val chunks = ragtool.createChunks(tagToolParams)

    val embeddings = mutableListOf<FloatArray>()
    for(chunk in chunks) {
        embeddings.add(sentenceEmbeddingModel.createEmbedding(chunk))
    }

    // Add document content into vector DB (tokenizer, chunking, and insert)
    ragtool.insert(vectorDbId, embeddings, chunks)

    return vectorDbId
}

fun pdfToText(inputStream: InputStream?, context: Context): String {
    // Initialize PDFBoxResourceLoader if not already done
    if (!PDFBoxResourceLoader.isReady()) {
        PDFBoxResourceLoader.init(context)
    }
    val document = PDDocument.load(inputStream);
    val pdfStripper = PDFTextStripper()
    val parsedText = pdfStripper.getText(document);
    document.close()

    return parsedText
}

fun txtToText(inputStream: InputStream?): String {
    var text = ""
    try {
        if (inputStream != null) {
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            text = String(buffer, StandardCharsets.UTF_8)
        }
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return text
}

fun getDocumentName(uri: Uri, context: Context): String? {
    var result: String? = null
    if (uri.scheme == "content") {
        val cursor: Cursor? = context.getContentResolver().query(uri, null, null, null, null)
        try {
            if (cursor != null && cursor.moveToFirst()) {
                val displayNameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                if (displayNameIndex != -1) {
                    result = cursor.getString(displayNameIndex)
                }
            }
        } finally {
            cursor?.close()
        }
    }
    if (result == null) {
        result = uri.lastPathSegment
    }
    return result
}
