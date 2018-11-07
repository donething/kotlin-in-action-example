package chap3

/**
 * Created by Donething on 2018/10/26
 */

fun main(args: Array<String>) {
    val lists = listOf("args:", *args)  // "*"为展开运算符
    println(m)

    printlnCol(*args)

    println(3 add 4)
    println(3.add(4))

    val (a, b) = 1 to "one"

    for ((index, elem) in list.withIndex()) {
        println("$index: $elem")
    }

    parsePath("D:/Temp/waitForKeyElements.js")

    println(str)

    println(dollor)
}

fun printlnCol(vararg args: Any) {
    args.forEach {
        println(it)
    }
}

val m = mapOf(
        2.to("two"),    // 一般调用
        1 to "one"          // 中缀调用
)

infix fun Int.add(num: Int): Int = this + num

val list = listOf("a", "b", "c")

fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchReuslt = regex.matchEntire(path)
    if (matchReuslt != null) {
        val (directory, filename, extension) = matchReuslt.destructured // 解构声明
        println("dir: $directory, filename: $filename, extension: $extension")
    }
}

val str = """| \/
    .| //
    .| //
""".trimMargin(".")
val dollor = """${"$"}9.99"""