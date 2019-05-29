package functions

val square: (Int) -> Int = {it * it}
val square2 = {x: Int -> x * x}

fun main() {
    println(square(5))
    println(square2(5))
}