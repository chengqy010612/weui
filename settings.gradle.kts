pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven {
            url = uri(
                "https://maven.aliyun.com/repository/jcenter"
            )
        }
        maven { url = uri("https://www.jitpack.io" )}

        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven {
            url = uri(
                "https://maven.aliyun.com/repository/jcenter"
            )
        }
        maven { url = uri("https://www.jitpack.io" )}

        google()
        mavenCentral()
    }
}



rootProject.name = "WeUI"
include(":app")
include(":core:ui:theme")
include(":core:ui:components")
include(":core:data:model")
include(":core:data:repository")
include(":core:utils")

include(":feature:basic")
include(":feature:form")
include(":feature:feedback")
include(":feature:media")
include(":feature:network")
include(":feature:charts")
include(":feature:hardware")
include(":feature:location")
include(":feature:qrcode")
include(":feature:system")
include(":feature:samples")
include(":feature:samples:file-browser")
include(":feature:samples:paint")
include(":feature:samples:video-channel")
include(":publish-test")
