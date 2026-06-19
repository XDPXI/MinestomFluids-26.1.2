plugins {
    java
    `maven-publish`
}

group = "io.github.togar2"

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("net.minestom:minestom:2026.06.05-26.1.2")
    implementation("net.minestom:minestom:2026.06.05-26.1.2")
    implementation("it.unimi.dsi:fastutil:8.5.13")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
