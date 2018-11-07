package chap3

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Donething on 2018/10/26
 */

fun main(args: Array<String>) {
    println(now())
}

fun now(format: String = "yyyy-MM-dd HH:mm:ss"): String {
    val sft = SimpleDateFormat(format)
    return sft.format(Date())
}