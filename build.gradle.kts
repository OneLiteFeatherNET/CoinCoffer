plugins {
    id("net.onelitefeather.gitpatcher") version "1.0.0-SNAPSHOT"
}


group = "dev.onelitefeather.plugin"
version = "1.0.0-SNAPSHOT"
gitpatcher {
    upstreams {
        useStandardUpstream("CoinCoffer") {
            url.set(github("milkbowl", "vault"))
            ref = "460cb21c6215433da526192720de40b6662f5f99"
            patchDir =  layout.projectDirectory.dir("patches")
            upstreamDir = layout.projectDirectory.dir("vault")
            outputDir = layout.projectDirectory.dir("CoinCoffer")
        }
    }
}