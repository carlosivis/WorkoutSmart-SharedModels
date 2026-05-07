plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
    `maven-publish`
}

group = "com.github.carlosivis"
version = "1.0.1"

kotlin {
    jvm()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets{
        commonMain.dependencies{
            implementation(libs.kotlinx.serialization.json)
        }
    }
}