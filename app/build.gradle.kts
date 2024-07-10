
plugins {
    id("kotlin-android")
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")

    id("com.google.devtools.ksp").version("1.7.20-1.0.7")
}

android {
    compileSdk = 34
    buildToolsVersion = "34.0.0"

    defaultConfig {
        applicationId = "com.hugheswd.andrewapp"
        minSdk = 28
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
//    composeOptions {
//        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
//    }
    namespace = "com.hugheswd.andrewapp"
}

dependencies {

//    implementation fileTree(dir: "libs", include: ["*.jar"])

    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    // Android
    implementation ("androidx.core:core-ktx:1.13.1")
    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.3")
    implementation ("com.google.android.material:material:1.12.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.2.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.1")
    implementation("androidx.multidex:multidex:2.0.1")

    // Compose
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.compose.ui:ui:1.6.8")
    implementation("androidx.compose.material:material:1.6.8")
    implementation("androidx.compose.ui:ui-tooling:1.6.8")
    implementation("androidx.compose.runtime:runtime:1.6.8")
    implementation("androidx.compose.runtime:runtime-livedata:1.6.8")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.6.8")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.material3:material3-window-size-class:1.2.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.6.8")

    // Coil
    implementation("io.coil-kt:coil-compose:2.2.1")
    implementation("io.coil-kt:coil-gif:2.2.1")

    // Kotlin
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.43.2")
    kapt("com.google.dagger:hilt-android-compiler:2.43.2")

    // Feature module Support
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:2.7.7")

    // Testing Navigation
    androidTestImplementation ("androidx.navigation:navigation-testing:2.7.7")

    // Jetpack Compose Integration
    implementation ("androidx.navigation:navigation-compose:2.7.7")
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.17.0")

    // Swipe to refresh
    implementation ("com.google.accompanist:accompanist-swiperefresh:0.20.2")

    // Square
    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
    implementation ("ru.gildor.coroutines:kotlin-coroutines-okhttp:1.0")

}
