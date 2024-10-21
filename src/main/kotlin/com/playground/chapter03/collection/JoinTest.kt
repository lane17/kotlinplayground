package strings

fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)
fun main() {
//    val list = arrayListOf(1,2,3)
//    println(list.joinToString(separator = ";",
//        prefix = "(", postfix = ")"))
    println(listOf("one", "two", "eight").join(" "))
}

