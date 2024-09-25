plugins {
    id("llama-stack-client.kotlin")
    id("llama-stack-client.publish")
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:2.14.3")
    api("com.fasterxml.jackson.core:jackson-databind:2.14.3")
    api("com.google.guava:guava:33.0.0-jre")

    implementation("com.fasterxml.jackson.core:jackson-annotations:2.14.3")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.3")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.3")
    implementation("org.apache.httpcomponents.core5:httpcore5:5.2.4")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

    testImplementation(kotlin("test"))
    testImplementation(project(":llama-stack-client-kotlin-client-okhttp"))
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.assertj:assertj-guava:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.12")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
}
