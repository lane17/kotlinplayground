package com.playground.chapter04.c433

class DelegatingCollection2<T>(
    innerList: Collection<T> = ArrayList<T>(),
) : Collection<T> by innerList
