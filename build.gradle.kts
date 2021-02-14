// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }

    repositories {
        jcenter()
        google()
        maven("https://jitpack.io")
        maven("https://maven.fabric.io/public")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.0.2")
        classpath("com.google.gms:google-services:4.3.5")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.31.2-alpha")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
        google()
        maven("https://jitpack.io")
        maven("https://maven.google.com/")
    }
}
