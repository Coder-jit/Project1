buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
//        classpath(libs.google.services)
        classpath("com.google.gms:google-services:4.3.14")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    id("com.android.application") apply false
    id("com.android.library") apply false
//    id("com.android.application" version "7.3.0") apply false
//    id ("com.android.library" version "7.3.0") apply false

}

