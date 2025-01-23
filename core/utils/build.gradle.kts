plugins {
    alias(libs.plugins.weui.android.compose.library)
    id("maven-publish")
//    id("com.android.library")
}

android {
    namespace = "top.chengdongqing.weui.core.utils"
}

dependencies {
    implementation(libs.accompanist.permissions)
    implementation(libs.pinyin)
    implementation(libs.amap)

    implementation(project(":core:data:model"))
    implementation(project(":core:ui:theme"))
}

//publishing {
//    publications {
//        create<MavenPublication>("mylibrary") {
////            from(components["release"])
//            groupId = "org.example" // 请填入你的组件名
//            artifactId = "hello" // 请填入你的工件名
//            version = "0.0.1" // 请填入工件的版本名
//            from(components["release"]) // 打包源码到工件中
//        }
//
//    }
//
//    repositories{
//        mavenLocal()
//    }
//}

