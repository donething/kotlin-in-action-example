package chap4

/**
 * Created by Donething on 2018/10/27
 */

fun main(args: Array<String>) {

}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer // 内部类访问外部类的引用的方式
    }
}