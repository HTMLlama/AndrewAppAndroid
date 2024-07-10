
plugins {

    id("kotlin-android")
    id("kotlin-android-extensions")
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")

    id("com.google.devtools.ksp").version("1.7.20-1.0.7")
}

android {
    compileSdk = 33
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.hugheswd.andrewapp"
        minSdk = 28
        targetSdk = 33
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
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
    }
    namespace = "com.hugheswd.andrewapp"
}

dependencies {

//    implementation fileTree(dir: "libs", include: ["*.jar"])

    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    // Android
    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.appcompat:appcompat:1.5.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation ("com.google.android.material:material:1.7.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    implementation("androidx.multidex:multidex:2.0.1")

    // Compose
    implementation("androidx.navigation:navigation-compose:2.5.3")
    implementation("androidx.compose.ui:ui:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.material:material:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.ui:ui-tooling:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.runtime:runtime:${rootProject.extra["compose_runtime_version"]}")
    implementation("androidx.compose.runtime:runtime-livedata:${rootProject.extra["compose_runtime_version"]}")
    implementation("androidx.compose.runtime:runtime-rxjava2:${rootProject.extra["compose_runtime_version"]}")
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.compose.material3:material3:1.1.0-alpha01")
    implementation("androidx.compose.material3:material3-window-size-class:1.1.0-alpha01")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${rootProject.extra["compose_version"]}")

    // Coil
    implementation("io.coil-kt:coil-compose:${rootProject.extra["coil_version"]}")
    implementation("io.coil-kt:coil-gif:${rootProject.extra["coil_version"]}")

    // Kotlin
    implementation ("androidx.navigation:navigation-fragment-ktx:${rootProject.extra["nav_version"]}")
    implementation ("androidx.navigation:navigation-ui-ktx:${rootProject.extra["nav_version"]}")

    // Hilt
    implementation("com.google.dagger:hilt-android:${rootProject.extra["hilt_version"]}")
    kapt("com.google.dagger:hilt-android-compiler:${rootProject.extra["hilt_version"]}")

    // Feature module Support
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:${rootProject.extra["nav_version"]}")

    // Testing Navigation
    androidTestImplementation ("androidx.navigation:navigation-testing:${rootProject.extra["nav_version"]}")

    // Jetpack Compose Integration
    implementation ("androidx.navigation:navigation-compose:${rootProject.extra["nav_version"]}")
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.17.0")

    // Swipe to refresh
    implementation ("com.google.accompanist:accompanist-swiperefresh:0.20.2")

    // Square
    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
    implementation ("ru.gildor.coroutines:kotlin-coroutines-okhttp:1.0")

    // XML
//    implementation ("com.github.smart-fun:XmlToJson:1.5.1")

}
