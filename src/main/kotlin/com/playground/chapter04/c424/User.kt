package com.playground.chapter04.c424

class User(
    val name: String,
) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name:
                "$field" -> "$value".
                """.trimIndent(),
            )
            field = value
        }
}

fun main() {
    val user = User("Alice")
    user.address = "Elseheimerstrasse 47, 80687 Muechen"
}
