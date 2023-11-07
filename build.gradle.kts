plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "pl.poznachowski"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.asciidoctor:asciidoctorj:2.5.10")
    implementation("org.asciidoctor:asciidoctorj-pdf:2.3.9")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
