package functions

val square: (Int) -> Int = {x -> x * x}
val square2 = {x: Int -> x * x}

val printSquare5: ((Int) -> Int) -> Unit = { println(it(5)) }

fun twoAndThree(operation: (Int, Int)-> Int) {
    val result = operation(2, 3)
    println("Result: $result")
}

val twoAndThreeHOF: ((Int, Int)-> Int) -> Unit = {println("Result HOF: "+ it(2,3))}

fun main() {
    println(square(5))
    println(square2(5))

    twoAndThree { x, y -> x * y }
    twoAndThree { x, y -> x + y }

    twoAndThreeHOF {x,y -> x*y}

    printSquare5 {it * it}
    printSquare5 {it + it}
}