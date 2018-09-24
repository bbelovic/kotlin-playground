package functions

infix fun <A, B> A.to(b: B) = Pair(this, b)

fun <A, B> A.with(b: B) = Pair(this, b)