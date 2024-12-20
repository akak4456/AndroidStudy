pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidLab"
include(":app")
include(":ch6_view")
include(":ch07_layout")
include(":ch08_event")
include(":ch09_resource")
include(":ch10_notification")
include(":ch11_jetpack")
include(":ch12_material")
include(":ch13_activity")
include(":ch14_receiver")
include(":ch15_service")
include(":ch15_outer")
include(":ch16_provider")
include(":ch17_database")
include(":ch18_network")
include(":ch19_map")
