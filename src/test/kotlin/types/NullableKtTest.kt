package types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NullableKtTest {
    @Test
    fun test() {
        val s: String? = null
        val s2 = "abc"
        length(s2)

        assertEquals(3, lengthNullable(s2))
        assertEquals(null, lengthNullable(s))
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
}