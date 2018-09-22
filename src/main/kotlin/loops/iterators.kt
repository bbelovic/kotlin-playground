package loops

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun fillMap() {
    for (c in 'A'..'F') {
        val binaryString = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binaryString
    }
}

fun printMap() {
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun printList() {
    val list = arrayListOf("a", "b", "c")
    for (s in list) {
        println(s)
    }
}

fun printListWithIndex() {
    val list = arrayListOf("a", "b", "c")
    for ((index, s) in list.withIndex()) {
        println("$index -> $s")
    }
}

fun main(args: Array<String>) {
    fillMap()
    printMap()
    printList()
    printListWithIndex()
}