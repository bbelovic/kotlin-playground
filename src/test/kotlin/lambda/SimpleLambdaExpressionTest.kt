package lambda

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SimpleLambdaExpressionTest {
    @Test
    fun test() {
        val people = arrayListOf(Person(1L, "jdoe"), Person(2L, "janedoe"))
        val actual = people.maxBy { it.id }
        val expected = Person(2L, "janedoe")
        assertEquals(expected, actual)
        assertTrue(expected == actual)
        assertFalse(expected === actual)
    }
}