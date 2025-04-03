package com.example.llamastackandroiddemo

fun localRagSystemPrompt(): String{
    return "You are a helpful assistant. You will be provided with retrieved context. " +
            "Your answer to the user request should be based on the retrieved context." +
            "Make sure you ONLY use the retrieve context to answer the question. " +
            "Retrieved context: _RETRIEVED_CONTEXT_"
}