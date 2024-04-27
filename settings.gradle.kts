import java.util.Locale

rootProject.name = "Box"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/") {
            mavenContent {
                includeGroup("codechicken")
            }
        }
    }
}
for (name in listOf("CoinCoffer")) {
    val projName = name.lowercase(Locale.ENGLISH)
    includeBuild(projName)
}