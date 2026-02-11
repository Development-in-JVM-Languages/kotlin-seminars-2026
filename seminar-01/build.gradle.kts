plugins {
    kotlin("jvm") version "2.2.20"
    application
    id("io.gitlab.arturbosch.detekt") version "1.23.7"
    id("org.cqfn.diktat.diktat-gradle-plugin") version "1.2.5"
}

group = "edu.cub.jvm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

diktat {
    inputs {
        include("src/**/*.kt")
        exclude("src/test/**")
    }
    diktatConfigFile = file("$projectDir/config/diktat.yml")
}

detekt {
    buildUponDefaultConfig = true
    allRules = false
    config.setFrom("${rootProject.projectDir}/config/detekt.yml")
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain(21)
}