package chap3

/**
 * Created by Donething on 2018/10/26
 */

fun main(args: Array<String>) {
    val str = "Hello"
    println(str.lastChar())
    println(str.lastChar2())
}

fun String.lastChar(): Char = this[(this.length - 1)]   // this表示前面的类型的对象
fun String.lastChar2(): Char = get(length - 1)  // this可以省略