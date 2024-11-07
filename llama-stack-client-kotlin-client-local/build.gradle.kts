plugins {
    id("llama-stack-client.kotlin")
    id("llama-stack-client.publish")
}

dependencies {
    api(project(":llama-stack-client-kotlin-core"))
    implementation(fileTree(mapOf(
        "dir" to "libs",
        "include" to listOf("*.aar", "*.jar"),
    )))
}
