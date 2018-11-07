package chap2

/**
 * Created by Donething on 2018/10/25
 */

fun main(args: Array<String>) {
    val first = "Wang"
    val last = "Dachui"
    println("名字：$last")
    println("姓名：${first + last}")
    println("姓名：${if (args.isNotEmpty()) args[0] else "nothing"}")
    println("名字：\$last")    // 转义
}
