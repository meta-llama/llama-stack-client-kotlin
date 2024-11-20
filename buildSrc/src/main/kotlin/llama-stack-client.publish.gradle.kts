import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.get
import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    this.coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Llama Stack Specification")
        description.set("This is the specification of the llama stack that provides a set of endpoints\nand their corresponding interfaces that are tailored to best leverage Llama\nModels. The specification is still in draft and subject to change.")
        url.set("https://llama-stack.readthedocs.io/en/latest/")

        licenses {
            license {
                name.set("MIT")
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
    }
}