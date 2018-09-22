package exceptions

import java.io.BufferedReader
import java.io.Reader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader): Int?  =
     try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    }

fun main(args: Array<String>) {
    val result = readNumber2(BufferedReader(StringReader("4")))
    println(result)
}