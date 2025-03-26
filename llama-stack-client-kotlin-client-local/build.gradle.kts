plugins {
    id("llama-stack-client.kotlin")
    id("llama-stack-client.publish")
    id("org.jetbrains.kotlin.jvm") // or org.jetbrains.kotlin.jvm for Kotlin projects.
    id("io.objectbox") // Apply last.
}

dependencies {
    api(project(":llama-stack-client-kotlin-core"))
    testImplementation(kotlin("test"))
    implementation(fileTree("libs") { include("*.jar") })
    implementation(files("jni/**/*.so"))
    implementation("ai.djl.huggingface:tokenizers:0.32.0")
}

kapt {
    arguments {
        arg(
            "objectbox.modelPath",
            "$projectDir/src/main/kotlin/com/llama/llamastack/client/local/services/vectordb/objectbox/objectbox.json"
        )
    }
}

apply(plugin = "io.objectbox")