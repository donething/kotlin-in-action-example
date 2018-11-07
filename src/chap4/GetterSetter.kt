package chap4

/**
 * Created by Donething on 2018/10/28
 */

fun main(args: Array<String>) {

}

class User1(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("address was changed for $name:$field -> $value")
            field = value   // 特殊标示field：代表当前属性
        }

    var age: Int = 0
        private set // 私有访问器，类外无法直接访问
    fun setTheAge(age: Int) {
        this.age = age
    }
}