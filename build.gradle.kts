buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
        classpath("com.android.tools.build:gradle:4.2.0-beta06")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.4.31")
        classpath("com.squareup.sqldelight:gradle-plugin:1.4.4")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { setUrl("https://kotlin.bintray.com/kotlinx") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}