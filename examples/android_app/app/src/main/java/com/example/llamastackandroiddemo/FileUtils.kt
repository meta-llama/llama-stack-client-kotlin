package com.example.llamastackandroiddemo

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.OpenableColumns
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader
import com.tom_roush.pdfbox.pdmodel.PDDocument
import com.tom_roush.pdfbox.text.PDFTextStripper
import java.io.InputStream
import java.nio.charset.StandardCharsets

object FileUtils {
    fun readFileFromURI(uri: Uri, context: Context): String {
        AppLogging.getInstance().log("Reading file from URI")
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
            }
            return ""
        } catch (e: Exception) {
            e.printStackTrace()
            return ""
        }
    }

    fun pdfToText(inputStream: InputStream?, context: Context): String {
        // Initialize PDFBoxResourceLoader if not already done
        AppLogging.getInstance().log("Converting PDF to Text")
        if (!PDFBoxResourceLoader.isReady()) {
            PDFBoxResourceLoader.init(context)
        }
        val document = PDDocument.load(inputStream)
        val pdfStripper = PDFTextStripper()
        val parsedText = pdfStripper.getText(document)
        document.close()

        return parsedText
    }

    fun txtToText(inputStream: InputStream?): String {
        AppLogging.getInstance().log("Reading TXT to text")
        var text = ""
        try {
            if (inputStream != null) {
                val size = inputStream.available()
                val buffer = ByteArray(size)
                inputStream.read(buffer)
                inputStream.close()
                text = String(buffer, StandardCharsets.UTF_8)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return text
    }

    fun getDocumentName(uri: Uri, context: Context): String? {
        var result: String? = null
        if (uri.scheme == "content") {
            val cursor: Cursor? = context.contentResolver.query(uri, null, null, null, null)
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
}
