package types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class NullableKtTest {
    @Test
    fun test() {
        val s: String? = null
        val s2 = "abc"
        length(s2)

        assertEquals(3, lengthNullable(s2))
        assertEquals(null, lengthNullable(s))
        assertEquals(0, lengthNullableElvis(s))
        assertEquals("abc", lengthNullableElvis(s2))
    }

    @ParameterizedTest
    @MethodSource("testData")
    fun test2(input: String?, expectedLength: Int) {
        val actualLength = try {
            lengthNotNullAssertions(input)
        } catch (ex: NullPointerException) {
            0
        }
        assertEquals(expectedLength, actualLength)
    }

    companion object {
        @JvmStatic
        fun testData() = listOf<Arguments>(
                Arguments.of(null, 0), Arguments.of("abc", 3))
    }

    @Test
    fun test_dereference_operator() {
        val ceo = Employee("boris")
        val employee = Employee("jdoe", ceo)

        assertEquals("boris", employee.boss?.name)
        assertNull(ceo.boss?.name)

        assertEquals("", ceo.boss?.name ?: "")
        assertNotNull(ceo.boss?: Employee("unknown"))

        println(employee)
    }

    @Test
    fun test_not_null_assertion() {
        val s = null
        try {
            s!!
        } catch (e : NullPointerException) {}

    }
}