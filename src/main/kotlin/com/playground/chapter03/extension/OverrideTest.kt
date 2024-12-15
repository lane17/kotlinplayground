package com.playground.chapter03.extension

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun main() {
    // 상속
//    val view: View = Button()
//    view.click()

    // 확장함수는 오버라이드할 수 없다.
    val view: View = Button()
    view.showOff() // I'm a view!
}

fun View.showOff() = println("I'm a view!")

fun Button.showOff() = println("I'm a button!")
