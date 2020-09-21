package main.kotlin.org.example
import jetbrains.buildServer.configs.kotlin.v2019_2.*

data class Language(val name: String, val hotness: Int)

open class MyLibrary: BuildType ({
    /**
     * @return data relating to the Kotlin {@code Language}.
     */
    fun kotlinLanguage() = Language("Kotlin", 10)

    name = "Build"

    params {
        param("env.someParam", "777")
        param("param1", "444")
    }
}
)