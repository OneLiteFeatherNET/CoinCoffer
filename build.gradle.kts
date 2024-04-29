plugins {
    id("dev.onelitefeather.glue") version "0.0.10"
}

val baseVersion = "1.0.0"
version = System.getenv("TAG_VERSION") ?: "$baseVersion-dev"
group = "dev.onelitefeather.plugin"
glue {
    upstreams {
        useStandardUpstream("coincoffer") {
            url.set(github("milkbowl", "vault"))
            ref = "460cb21c6215433da526192720de40b6662f5f99"
            patchDir =  layout.projectDirectory.dir("coincoffer-patches")
            upstreamDir = layout.projectDirectory.dir("vault")
            outputDir = layout.projectDirectory.dir("coincoffer")
        }

        useStandardUpstream("coincoffer-api") {
            url.set(github("milkbowl", "VaultAPI"))
            ref = "8bad2c479f531436b4b0694f5696b501d0afef3e"
            patchDir =  layout.projectDirectory.dir("coincoffer-api-patches")
            upstreamDir = layout.projectDirectory.dir("vault-api")
            outputDir = layout.projectDirectory.dir("coincoffer-api")
        }
    }
}
