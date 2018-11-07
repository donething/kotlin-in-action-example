package chap5

/**
 * Created by Donething on 2018/10/30
 */

fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet2())
}

fun alphabet(): String = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know aphabet.")
    toString()
}

fun alphabet2(): String = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know aphabet.")
}.toString()
