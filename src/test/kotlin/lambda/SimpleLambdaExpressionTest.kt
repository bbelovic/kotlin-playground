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

    @Test
    fun test_method_reference() {
        val createPerson = ::Person
        val jdoe = createPerson(1, "jdoe")
        val add = {x: Long, y: Long -> x + y}
        assertEquals(2, add(1, 1))
        assertTrue(Person(1, "jdoe") == jdoe)
        kotlin.run(::sayHello)
    }
    @Test
    fun test_infix() {
        val start = Point()
        val end = start moveLeft 2 moveRight 10
        assertEquals(Point(x = 12, y = 12), end)
    }
}

fun sayHello() = println("hello")

data class Point (val x: Int = 0, val y: Int = 0) {
    infix fun moveLeft(steps: Int) = Point(x + steps, y + steps)
    infix fun moveRight(steps: Int) = Point(x + steps, y + steps)
}