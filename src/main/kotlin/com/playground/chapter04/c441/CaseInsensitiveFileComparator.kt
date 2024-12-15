package com.playground.chapter04.c441

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(
        file1: File,
        file2: File,
    ): Int = file1.path.compareTo(file2.path, ignoreCase = true)
}

fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}
