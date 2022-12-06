plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
    id("com.squareup.anvil")
}

android {
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
}

dependencies {
    implementation(project(":common:api"))
    implementation(project(":common:entities"))
    implementation(project(":common:store"))

    implementation(libs.dagger.dagger)
    kapt(libs.dagger.compiler)
}
