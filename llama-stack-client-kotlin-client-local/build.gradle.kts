plugins {
    id("llama-stack-client.kotlin")
    id("llama-stack-client.publish")
}

dependencies {
    api(project(":llama-stack-client-kotlin-core"))
    testImplementation(kotlin("test"))
    implementation(fileTree("libs") { include("*.jar") })
    implementation(files("jni/**/*.so"))
}
