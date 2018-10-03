package classes

fun expressionToString(expr: Expression): String =
     when (expr) {
        is Expression.Sum -> "Sum"
        is Expression.Multiply -> "multiply"
        is Expression.Sqrt -> "sqrt"
    }

