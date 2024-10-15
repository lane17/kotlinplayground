package com.playground.chapter02.exception

fun main() {
//    val percentage = 1
//
//    if (percentage !in 0..100) {
//        throw IllegalArgumentException("A percentage value must be between 0 and 100: $percentage")
//    }

    //------------------------------
    val number = 101

    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $number"
            )
}