package chap2

/**
 * Created by Donething on 2018/10/25
 */

fun main(args: Array<String>) {
    val sum1 = Expr.Sum(Expr.Num(3), Expr.Num(9))
    println(eval(sum1))
}

sealed class Expr { // 定义密封类
    // 添加所有可能的子类
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.left) + eval(e.right)
        }
