plugins {
    kotlin("js") version "1.4.30"
}

group = "me.yt8492"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
}

kotlin {
    js(IR) {
        browser()
        nodejs()
        binaries.executable()
    }
}