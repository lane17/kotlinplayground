package com.playground.chapter04.c442

import com.playground.chapter04.getFacebookName

// class User {
//    val nickname: String
//
//    constructor(email: String) {
//        nickname = email.substringBefore('@')
//    }
//
//    constructor(facebookAccountId: Int) {
//        nickname = getFacebookName(facebookAccountId)
//    }
// }

class User private constructor(
    val nickname: String,
) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}
