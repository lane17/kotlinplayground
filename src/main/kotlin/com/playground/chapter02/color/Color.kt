package com.playground.chapter02.color

enum class Color(
    val r: Int,
    val g: Int,
    val b: Int,
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238),
    ;

    fun rgb() = (r * 256 + g) * 256 + b // enum class 안에서 메소드 정의하기
}
