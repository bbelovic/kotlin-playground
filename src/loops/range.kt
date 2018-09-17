package loops

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    val range = 1..10
    for (i in range) {
        print(fizzBuzz(i))
    }

    println()

    for (i in 50 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}