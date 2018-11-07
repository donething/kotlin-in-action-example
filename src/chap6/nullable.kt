package chap6

/**
 * Created by Donething on 2018/10/30
 */

fun main(args: Array<String>) {
    println(strLen("a"))
    println(strLen(null))

    val email: String? = null
    email?.let { sendEmail(it) }

    println(age?.plus(1))
}

fun strLen(str: String?): String = str?.toUpperCase() ?: ""

fun sendEmail(email: String) {}

var age: Int? = null
