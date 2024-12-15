package com.playground.chapter04.c431

class Client(
    val name: String,
    val postalCode: Int,
) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) {
            return false
        }
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {
    val processed = hashSetOf(Client("오현석", 4122))

    val result = processed.contains(Client("오현석", 4122))
    println(result)
}
