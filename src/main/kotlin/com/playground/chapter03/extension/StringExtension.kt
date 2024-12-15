package strings

// fun String.lastChar(): Char = this.get(this.length -1)
// fun String.lastChar(): Char = this[this.length -1]

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1) // property getter
    set(value: Char) {
        this.setCharAt(length - 1, value) // property setter
    }

fun main() {
//    println("Kotlin".lastChar())
//    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
