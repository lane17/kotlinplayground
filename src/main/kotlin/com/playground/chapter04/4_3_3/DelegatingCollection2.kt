package com.playground.chapter04.`4_3_3`

class DelegatingCollection2<T> (
    innerList: Collection<T> = ArrayList<T>()
): Collection<T> by innerList {
}