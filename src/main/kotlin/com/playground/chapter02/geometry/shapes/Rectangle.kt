package com.playground.chapter02.geometry.shapes // 패키지 선언

import java.util.Random

class Rectangle(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}