import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.get

plugins {
    `maven-publish`
    `signing`
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("[DRAFT] Llama Stack Specification")
                description.set("This is the specification of the llama stack that provides a set of endpoints\nand their corresponding interfaces that are tailored to best leverage Llama\nModels. The specification is still in draft and subject to change. Generated at\n2024-11-12 11:16:58.657871")
                url.set("https://llama-stack.readthedocs.io/en/latest/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Llama Stack Client")
                        email.set("llamastack@meta.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/llama-stack-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/llama-stack-kotlin.git")
                    url.set("https://github.com/stainless-sdks/llama-stack-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
