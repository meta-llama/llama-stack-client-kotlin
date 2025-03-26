plugins {
//    id("org.jetbrains.dokka") version "2.0.0"
}
buildscript {
    val objectboxVersion by extra("4.2.0")

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("io.objectbox:objectbox-gradle-plugin:$objectboxVersion")
    }
}

allprojects {
    group = "com.llama.llamastack"
    version = "0.1.7-localrag"
}

subprojects {
//    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaHtmlCollector` and `dokkaJavadocJar` tasks
//tasks.named("dokkaHtmlCollector").configure {
//    subprojects.flatMap { it.tasks }
//        .filter { it.project.name != "llama-stack-client-kotlin" && it.name == "dokkaJavadocJar" }
//        .forEach { mustRunAfter(it) }
//}
