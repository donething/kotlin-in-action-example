package chap2

/**
 * Created by Donething on 2018/10/25
 */

enum class Color(
        val r: Int,
        val g: Int,
        val b: Int
) {
    Red(255, 0, 0),
    Orange(255, 165, 0),
    Yellow(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}