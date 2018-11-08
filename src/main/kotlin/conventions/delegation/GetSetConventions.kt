package conventions.delegation

class GetSetConventions(val values: MutableList<String>) {
    operator fun get(index: Int) = values.get(index)
    operator fun get(element: String) = values.find { it -> it == element }
    operator fun set(index: Int, value: String) {values[index] = value}
}