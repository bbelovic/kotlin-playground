package conventions.delegation

class GetSetConventions<T>(val values: MutableList<T>) {
    operator fun get(index: Int) = values.get(index)
    operator fun get(element: T) = values.find { it -> it == element }
    operator fun set(index: Int, value: T) {values[index] = value}
    operator fun plus(other: List<T>):GetSetConventions<T> {
        values.addAll(other)
        return this
    }

    fun size() = values.size
}