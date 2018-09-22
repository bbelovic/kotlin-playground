package functions

fun <T> Collection<T>.joinToString(separator: String = "; ", prefix: String = "{", postfix: String = "}"): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = get(length - 1);
fun String.firstChar(): Char = get(0);

fun main(args: Array<String>) {
    val c = listOf("one", "two", "three")
    println(c.joinToString(";", "[", "]"))
    val empty: List<String> = emptyList()
    println(empty.joinToString(";", prefix = "[", postfix = "]"))
    println(c.joinToString(prefix = "[", postfix = "]", separator =  "# "))

    println("Boris".lastChar())
    println("Boris".firstChar())
}