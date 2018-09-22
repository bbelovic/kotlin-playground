package smartcast

fun eval(expression: Expression): Int =
    if (expression is Num) {
        expression.value
    } else if (expression is Sum) {
        eval(expression.right) + eval(expression.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun evalWithWhen(expression: Expression): Int =
        when (expression) {
            is Num -> expression.value
            is Sum -> evalWithWhen(expression.left) + evalWithWhen(expression.right)
            else -> throw IllegalArgumentException("unknown expression")
        }

fun evalWithLogging(expression: Expression): Int =
        when (expression) {
            is Num -> {
                println("num: ${expression.value}")
                expression.value
            }
            is Sum -> {
                val left = evalWithLogging(expression.left)
                val right = evalWithLogging(expression.right)
                println("sum $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("unknown expression")

        }

fun main(array: Array<String>) {
    val result = eval(Sum(Num(2), Sum(Num(1), Num(4))))
    println("Result: $result")
}