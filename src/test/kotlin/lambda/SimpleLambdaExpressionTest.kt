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

        val getLogin = Person::login

        val actualChars = people.map(Person::login).flatMap { it.toList() }
        val expectedChars = arrayListOf('j', 'd', 'o', 'e', 'j', 'a', 'n','e', 'd', 'o', 'e')
        assertEquals(expectedChars, actualChars)

    }
}