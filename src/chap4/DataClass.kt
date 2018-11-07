package chap4

/**
 * Created by Donething on 2018/10/28
 */

fun main(args: Array<String>) {
    val user = User2("LiMing", "China")
    println(user)
    val user2 = user.copy(name = "WangWei")
    println(user2)
}

data class User2(val name: String, val address: String)