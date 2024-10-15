package com.playground.chapter02.exception

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    //2.5.1
//    val reader = BufferedReader(StringReader("239"))
//    println(readNumber(reader))

    //2.5.2
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
//        return //return 문으로 인해서 예외가 발생한 경우 catch 블록의 다음의 코드는 실행되지 않는다.
        null
    }

    println(number)
}