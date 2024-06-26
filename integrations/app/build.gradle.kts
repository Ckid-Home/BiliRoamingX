import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
}

android {
    compileSdk = 34
    namespace = "app.revanced.bilibili.integrations"

    defaultConfig {
        applicationId = "app.revanced.bilibili.integrations"
        minSdk = 24
        targetSdk = 34
        multiDexEnabled = false
        val verName = project.version as String
        versionName = verName
        versionCode = verName.split('.').let { (m, s, f) ->
            m.toInt() * 1000000 + s.toInt() * 1000 + f.toInt()
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        applicationVariants.all {
            outputs.all {
                this as com.android.build.gradle.internal.api.ApkVariantOutputImpl

                outputFileName = "${rootProject.name}-${parent!!.name}-$versionName.apk"
            }
        }
    }
    buildFeatures {
        buildConfig = true
        resValues = false
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_17)
        targetCompatibility(JavaVersion.VERSION_17)
    }
    packaging.resources.excludes += setOf(
        "kotlin/**",
        "META-INF/**",
        "kotlin-tooling-metadata.json",
    )
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    implementation(projects.integrations.extend)
    implementation(libs.hiddenapibypass)
    implementation(libs.truetypeparser)
    implementation(libs.androidx.documentfile) {
        exclude(libs.androidx.annotation.get().group)
    }
    implementation(libs.kotlinx.serialization.json)
    ksp(projects.integrations.ksp)
    compileOnly(projects.integrations.dummy)
}
