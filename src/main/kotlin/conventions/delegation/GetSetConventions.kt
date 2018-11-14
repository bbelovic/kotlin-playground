package conventions.delegation

import java.util.*
import kotlin.collections.ArrayList

class GetSetConventions<T>(val values: MutableList<T>) {
    operator fun get(index: Int) = values.get(index)
    operator fun get(element: T) = values.find { it -> it == element }
    operator fun set(index: Int, value: T) {values[index] = value}
    operator fun plus(other: List<T>):GetSetConventions<T> {
        values.addAll(other)
        return this
    }

    operator fun minus(other: List<T>): GetSetConventions<T> {
        values.removeAll(other)
        return this
    }

    operator fun times(scale: Int): GetSetConventions<T> {
        val dest = ArrayList<T>()
        for (i in 0..(scale-1)) {
            dest.addAll(values)
        }
        return GetSetConventions(dest)
    }

    fun size() = values.size
}