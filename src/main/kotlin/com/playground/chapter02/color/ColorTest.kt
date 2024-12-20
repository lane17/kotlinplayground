package com.playground.chapter02.color

fun main() {
//    println(BLUE.rgb())
    print(mix(Color.BLUE, Color.YELLOW))
}

fun mix(
    c1: Color,
    c2: Color,
) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty Color")
}

// setOf 일 때 순서 상관이 없다.
// 위는 불필요한 가비지 객체가 늘어날 수 있다.
// 다른 두 색이 같은지 비교하기 위해 여러 Set 인스턴스를 생성한다.

// fun mixOptimized(c1: Color, c2: Color) =
//    when {
//        (c1 == RED && c2 == YELLOW)
//    }
