package chap4

/**
 * Created by Donething on 2018/10/28
 */

fun main(args: Array<String>) {
    val set = CountingSet<String>()
    set.add("hello")
    set.add("world")
    println(set.remove("hello"))
    println(set.objectAdded)
}

class CountingSet<T>(
        private val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    var objectAdded = 0
    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }
}