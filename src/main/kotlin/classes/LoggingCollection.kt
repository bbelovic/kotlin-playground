package classes

class LoggingCollection<E>(private val innerList: Collection<E>) : Collection<E> by innerList {
    override fun contains(element: E): Boolean {
        println("Checking for element [$element]")
        return innerList.contains(element)
    }
}