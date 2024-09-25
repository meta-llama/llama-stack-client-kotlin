plugins {
    id("llama-stack-client.kotlin")
    id("llama-stack-client.publish")
}

dependencies {
    api(project(":llama-stack-client-kotlin-client-okhttp"))
}
