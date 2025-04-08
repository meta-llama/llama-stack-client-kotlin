plugins {
//    id("org.jetbrains.dokka") version "2.0.0"
}

allprojects {
    group = "com.llama.llamastack"
    version = "0.2.1"
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