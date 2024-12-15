package com.playground.chapter04

fun getFacebookName(accountId: Int) = "fb:$accountId"

class PrivateUser(
    override val nickname: String,
) : User

class SubscribingUser(
    val email: String,
) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}
