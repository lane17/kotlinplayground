package com.playground.chapter02.loop

import java.util.TreeMap

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main() {
    //2.4.2
//    for (i in 100 downTo 1 step 2) {
//        print(fizzBuzz(i))
//    }

    //2.4.3
//    binaryMapIteration()
    collectionMapTest()
}

fun collectionMapTest() {
    val list = arrayListOf("10", "11", "1001")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun binaryMapIteration() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
       val binary = Integer.toBinaryString(c.code)
       binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}
