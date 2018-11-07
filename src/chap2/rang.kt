package chap2

/**
 * Created by Donething on 2018/10/25
 */

fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }

    mapFor()

    myMap["d"] = "dd"
    println(myMap)
}

fun fizzBuzz(i: Int) =
        when {
            i % 15 == 0 -> "fizzBuzz"
            i % 3 == 0 -> "fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i "
        }

fun mapFor() {
    val m = mapOf("a" to "A", "b" to "B")
    for ((key, value) in m) {
        println("$key: $value")
    }
}

val mySet = hashSetOf(3, 1, 6)
val myMap = hashMapOf("a" to "A", "b" to "B")
