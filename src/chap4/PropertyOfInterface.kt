package chap4

/**
 * Created by Donething on 2018/10/28
 */

fun main(args: Array<String>) {

}

fun getFacebookName(id: Int): String {
    return "nickname"
}

interface IUser {
    val nickname: String
}

class PrivateUser(override val nickname: String) : IUser

class SubscribingUser(val email: String) : IUser {
    override val nickname: String
        get() = email.substringBefore("@")
}

class FacebookUser(val accountId: Int) : IUser {
    override val nickname = getFacebookName(accountId)
}