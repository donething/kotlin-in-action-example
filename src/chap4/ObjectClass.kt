package chap4

/**
 * Created by Donething on 2018/10/29
 */

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("Li"))
    Payroll.calculateSalary()
}

object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        for (person in allEmployees) {
            // 计算工资
        }
    }
}

data class Person(val name: String, val age: Int = 0)

class User4 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User4(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) = User4(getFacebookName(accountId))
    }
}

class User5 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(facebookId: Int) {
        nickname = getFacebookName(facebookId)
    }
}
