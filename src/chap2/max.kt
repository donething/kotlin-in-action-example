package chap2

/**
 * Created by Donething on 2018/10/25
 */

fun main(args: Array<String>) {
    println(max1(4, 9))
    println(max2(4, 9))
}

fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int) = if (a > b) a else b