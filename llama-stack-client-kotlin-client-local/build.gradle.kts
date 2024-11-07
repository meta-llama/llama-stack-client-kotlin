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
tasks {
    jar {
        from("jni/arm64-v8a") {
            into("jni/arm64-v8a")
        }
        from("jni/x86_64") {
            into("jni/x86_64")
        }
        from("libs") {
            into("libs")
        }
    }
}
