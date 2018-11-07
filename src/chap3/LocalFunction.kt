package chap3

/**
 * Created by Donething on 2018/10/26
 */

fun main(args: Array<String>) {
    val user = User(1, "David", "")
    saveUser(user)
}

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, field: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $field")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}