package chap2

/**
 * Created by Donething on 2018/10/25
 */

fun main(args: Array<String>) {
    val r1 = Rectangle(1, 2)
    val r2 = Rectangle(1, 1)
    println("r1: ${r1.isSquare}, r2: ${r2.isSquare}")
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}