package functions

val String.last: Char
    get() = get(length -1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(c) = setCharAt(length - 1, c)