package some.plugin

import org.gradle.api.provider.Property

abstract class SomeExtension {
    abstract val myMessage : Property<String>

    fun printMyMessage(){
        val msg = myMessage.getOrElse("default message")
        println("myMessage=$msg")
    }
}