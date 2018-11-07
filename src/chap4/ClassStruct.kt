package chap4

/**
 * Created by Donething on 2018/10/27
 */

fun main(args: Array<String>) {
    val button = Button()
    button.click()
    button.showOff()
}

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable.")   // Kotlin接口的方法可以有默认实现
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable.")
}

open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {}
    override fun click() {}
    final override fun showOff() {}
}

class Button : Clickable, Focusable {
    override fun click() = println("I'm clicked.")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}