plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.looptalk"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.looptalk"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    //room
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
//  implementation("androidx.room:room-coroutines:2.1.0-alpha04") // Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.6.1")
    implementation("androidx.room:room-paging:2.6.1")


    //degger_hilt
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
    //LifeCycle SavedStates :


    val lifecycle_version = "2.6.2"
    implementation("androidx.lifecycle:lifecycle-runtime-compose:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")

    implementation("androidx.hilt:hilt-navigation-fragment:1.2.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    //live data
    implementation("androidx.compose.runtime:runtime-livedata:<1.8.2>")
    implementation("androidx.compose.runtime:runtime-livedata:1.7.5")
    //navigation
    implementation("androidx.navigation:navigation-compose:2.8.4")
    //coil
    implementation("io.coil-kt:coil-compose:2.6.0")
    implementation("io.coil-kt:coil-gif:2.1.0")
    // Glide core library
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Glide annotation processor for generating API
    kapt("com.github.bumptech.glide:compiler:4.16.0")


    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.7.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.2")
    //sdp

    implementation("network.chaintech:sdp-ssp-compose-multiplatform:1.0.4")
    implementation ("androidx.paging:paging-runtime-ktx:3.2.1")
    implementation ("androidx.paging:paging-compose:3.3.0-alpha02")
    implementation("androidx.paging:paging-runtime:3.x.x")
    implementation("androidx.paging:paging-compose:1.x.x") // For Jetpack Compose support
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.x.x")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation("io.coil-kt:coil-compose:2.7.0")
    implementation("io.coil-kt:coil-gif:2.7.0")
    implementation("io.coil-kt:coil-svg:2.2.2")
    implementation("com.google.accompanist:accompanist-pager:0.22.0-rc")
    implementation("androidx.paging:paging-runtime-ktx:3.2.1")
    implementation("androidx.paging:paging-compose:1.0.0-alpha17")
    implementation("androidx.paging:paging-runtime:3.1.1") // For Paging functionality
    implementation("androidx.paging:paging-compose:1.0.0-alpha20") // For Compose integration
}
kapt {
    correctErrorTypes=true
}
