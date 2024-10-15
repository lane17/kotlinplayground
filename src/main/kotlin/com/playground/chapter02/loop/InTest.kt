package com.playground.chapter02.loop

fun main() {
    //2.4.4
//    println(isLetter('q'))
//    println(isNotDigit('x'))

//    println(recognize('8'))

    println("Kotlin" in "Java".."Scala") // "Java" <= "Kotlin" && "Kotlin" <= "Scala"
    println("Kotlin" in setOf("Java", "Scala"))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'0'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."

}