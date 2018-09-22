package functions

fun <T> joinToString(c: Collection<T>, separator: String = "; ", prefix: String = "{", postfix: String = "}"): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in c.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val c = listOf("one", "two", "three")
    println(joinToString(c, ";", "[", "]"))
    val empty: List<String> = emptyList()
    println(joinToString(empty, ";", prefix = "[", postfix = "]"))
    println(joinToString(c,  prefix = "[", postfix = "]", separator =  "# "))
}