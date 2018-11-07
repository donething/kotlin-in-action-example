package chap4

/**
 * Created by Donething on 2018/10/28
 */

fun main(args: Array<String>) {

}

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(narne=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other !is Client) return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}