plugins {
    alias(libs.plugins.weui.android.compose.library)
    id("maven-publish")
//    id("com.kezong.fat-aar") version "1.3.8"
}

group = "om.example.chengqingyuan"
version = "1.0.0"

afterEvaluate {
    publishing {
        publications {
            // Creates a Maven publication called "release".
            create<MavenPublication>("release") {
                // Applies the component for the release build variant.\
                // from(components["release"])
                // You can then customize attributes of the publication as shown below.
                groupId = (group.toString())
                artifactId = "chengqingyuansdk-kts"
                version = version
            }
        }
    }
}




//apply(from = "maven_pub.gradle.kts")

//buildscript {
//    repositories {
//        maven { url = uri("https://www.jitpack.io" )}
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath(files("libs/fat-aar-1.3.9.jar"))
//    }
//}

android {
    namespace = "top.chengdongqing.weui.core.ui.components"
//
//    compileSdk = 33
//
//    defaultConfig {
//        minSdk = 21
//        targetSdk = 33
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//        }
//    }

    buildTypes {
        release {
            isMinifyEnabled = false
            //isDebuggable = false
//            signingConfig = signingConfigs.getByName("release")
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
        }
    }

}


//publishing {
//    publications {
//        create<MavenPublication>("mylibrary") {
////            from(components["release"])
//            groupId = "org.example.chengqingyuan" // 请填入你的组件名
//            artifactId = "hello" // 请填入你的工件名
//            version = "0.0.3" // 请填入工件的版本名
//            from(components.findByName("release")) // 打包源码到工件中
//        }
//
//    }
//
//    repositories{
//        mavenLocal()
//    }
//}




dependencies {
    implementation(libs.coil.compose)
    implementation(libs.bundles.camerax)
    implementation(libs.accompanist.permissions)

//    implementation(project(":core:ui:theme"))
//    implementation(project(":core:data:model"))
//    implementation(project(":core:data:repository"))
//    implementation(project(":core:utils"))

    api(project(":core:ui:theme"))
    api(project(":core:data:model"))
    api(project(":core:utils"))
    api(project(":core:data:repository"))



//    embed project(path: ':core:ui:theme', configuration: 'default')
}


