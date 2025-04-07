plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.mylibrary"
    compileSdk = 35

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    // Jetpack Compose 활성화 !!!
    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        // 사용하는 Compose 버전과 호환되는 Kotlin Compiler Extension 버전 설정
        // 최신 버전은 공식 문서를 참고하세요. (https://developer.android.com/jetpack/androidx/releases/compose-kotlin)
        kotlinCompilerExtensionVersion = "1.5.3" // 예시 버전, 프로젝트에 맞게 수정
    }
    packagingOptions { // 리소스 충돌 방지 (필요한 경우)
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.runtime.android)
    implementation(libs.androidx.ui.tooling.preview.android)
    implementation(libs.ui.tooling.preview.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}