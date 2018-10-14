package lambda

fun sumEvenNumbers(limit: Long = 10) =
    generateSequence(0) { it + 1 }
            .filter { it % 2 == 0 }
            .takeWhile { it < limit }
            .sum()
