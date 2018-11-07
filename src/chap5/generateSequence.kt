package chap5

import java.io.File

/**
 * Created by Donething on 2018/10/30
 */

fun main(args: Array<String>) {
    sum100()

    val file = File("D:/Temp/xiaoyu.html")
    println(file.isInsideHiddenDirectory())


}

fun sum100() {
    val numbers = generateSequence(1) { it + 1 }
    val numbersTo100 = numbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}

fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }