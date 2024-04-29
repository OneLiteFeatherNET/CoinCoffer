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
	    maven("https://eldonexus.de/repository/maven-releases/")
    }
}
for (name in listOf("coincoffer", "coincoffer-api")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
