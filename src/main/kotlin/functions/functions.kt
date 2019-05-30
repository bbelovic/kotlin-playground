package functions

val square: (Int) -> Int = {it * it}
val square2 = {x: Int -> x * x}

val printSquare5: ((Int) -> Int) -> Unit = { println(it(5)) }

fun main() {
    println(square(5))
    println(square2(5))

    printSquare5 {it * it}
    printSquare5 {it + it}
}