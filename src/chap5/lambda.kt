package chap5

import chap4.Person
import sun.text.normalizer.UCharacter.getAge

/**
 * Created by Donething on 2018/10/29
 */

fun main(args: Array<String>) {
    println(sum(1, 2))
    run { println("Hello.") }
    println(::getAge)

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    lambda()
}

fun lambda() {
    val people = listOf(Person("Li", 10), Person("Wang", 24))
    val newPeople = people.filter { it.age > 20 }
    println(people)
    println(newPeople)
    println(people.map { it.name })
    println(people.count { it.age > 12 })

    println(people.groupBy { it.age })

    people.maxBy({ p: Person -> p.age }) // 不用任何简写
    people.maxBy() { p: Person -> p.age }
    people.maxBy { p: Person -> p.age }
    people.maxBy { p -> p.age }
    people.maxBy { it.age }
}

val sum = { x: Int, y: Int -> x + y }

val getAge = { p: Person -> p.age }
val getAge2 = Person::age

