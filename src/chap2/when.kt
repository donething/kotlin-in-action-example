package chap2

/**
 * Created by Donething on 2018/10/25
 */

fun main(args: Array<String>) {

}

fun getMnemonic(color: Color): String {
    return when (color) {
        Color.Red -> "Richard"
        Color.Orange -> "Of"
        Color.Yellow -> "York"
    }
}