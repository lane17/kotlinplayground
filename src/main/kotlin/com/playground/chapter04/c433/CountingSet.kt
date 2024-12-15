package com.playground.chapter04.c433

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>(),
) : MutableCollection<T> by innerSet { // MutableCollection의 구현을 innerSet에게 위임한다.
    var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectAdded += c.size
        return innerSet.addAll(c)
    }
}
