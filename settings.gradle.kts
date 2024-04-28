import java.util.Locale

rootProject.name = "CoinCoffer"

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
for (name in listOf("coincoffer", "coincoffer-api")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}