package lambda

import org.junit.jupiter.api.Test

class KotlinSequencesTest {
    @Test
    fun test_sequence() {
        listOf("1", "2", "3")
                .asSequence()
                .map { print("map($it) "); Integer.parseInt(it)}
                .map { print("map($it) "); it * it }
                .filter { print("filter($it) "); it > 5 }
                .toList()
    }
}