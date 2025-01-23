plugins {
    alias(libs.plugins.weui.android.compose.library)
    id("maven-publish")
}
//apply(from = "maven_pub.gradle.kts")
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
}


//publishing {
//    publications {
//        create<MavenPublication>("mylibrary") {
////            from(components["release"])
//            groupId = "org.example" // 请填入你的组件名
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

    implementation(project(":core:ui:theme"))
    implementation(project(":core:data:model"))
    implementation(project(":core:data:repository"))
    implementation(project(":core:utils"))
}


