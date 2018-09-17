package smartcast

fun eval(expression: Expression): Int {
    if (expression is Num) {
        return expression.value;
    }
    if (expression is Sum) {
        return eval(expression.right) + (expression.left)
    }
    throw IllegalArgumentException("Unknown expression");
}