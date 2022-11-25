package some.plugin

import org.gradle.api.Action
import org.gradle.api.initialization.Settings

/**
 * Kotlin DSL extension for type-safe accesor for configuring plugins.
 * @see https://discuss.gradle.org/t/using-type-safe-accesors-on-a-settings-plugin/44316/3?u=evantill
 * @see https://github.com/gradle/gradle/issues/11210
 */
fun Settings.something(configuration: Action<SomeExtension>) =
    extensions.configure(SomeExtension::class.java, configuration)

/**
 * Kotlin DSL extension for type-safe accesor for calling plugins.
 * @see https://discuss.gradle.org/t/using-type-safe-accesors-on-a-settings-plugin/44316/3?u=evantill
 * @see https://github.com/gradle/gradle/issues/11210
 */
val Settings.something
    get() = extensions.findByType(SomeExtension::class.java)!!