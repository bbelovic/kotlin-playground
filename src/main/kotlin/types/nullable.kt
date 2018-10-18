package types

fun length(s: String) = s.length

fun lengthNullable(s: String?) = s?.length

fun lengthNullableElvis(s: String?) = s?:0

fun lengthNotNullAssertions(s: String?) = s!!.length

fun printSafe(s: String) = println(s)

fun String?.isEmpty() = this == null || this.isBlank()