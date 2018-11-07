package chap5

import chap4.Person

/**
 * Created by Donething on 2018/10/30
 */

fun main(args: Array<String>) {
    val people = listOf(Person("Li", 10), Person("Wang", 24))

    println(people.map { it.age }.filter { it > 15 })
    println(people)
    println(people.asSequence().map { it.age }.filter { it > 15 }.toList())
    println(people)
}
