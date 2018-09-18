package loops

fun isDigit(c: Char) = c in '0'..'9'
fun isLetter(c: Char) = c in 'A'..'F'
fun isNotLetter(c: Char) = c !in 'A'..'F'

fun classify(c: Char) = when (c) {
    in '0'..'9' -> CharClass.DIGIT
    in 'A'..'Z' -> CharClass.LETTER
    in 'a'..'z' -> CharClass.LETTER
    else -> CharClass.UNKNOWN
}

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

    println()
    println ("isDigit: " + isDigit('0') )
    println ("isLetter: " + isLetter('0') )
    println ("isNotLetter: " + isNotLetter('0') )

    println("Result: " + classify('0'))
    println("Result: " + classify('d'))
    println("Result: " + classify('D'))
    println("Result: " + classify('.'))

    println("java" in setOf("java", "scala"))
}