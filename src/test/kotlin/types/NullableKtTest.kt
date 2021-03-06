package types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.*

internal class NullableKtTest {

    val numberSource = "1 2 x 3 y 4 z 5"

    @Test
    fun test_kotlin_collection() {
        val actual: List<Long?> = numberSource.split(" ")
                .asSequence()
                .map { s -> convert(s) }
                .filterNotNull()
                .toList()
        assertEquals(5, actual.size)

    }

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

    @Test
    fun test_let() {
        for (i in 0..10) {
            getValue()?.let { printSafe(it) }
        }
    }

    private fun getValue(): String? {
        val r = Random()
        return if (r.nextBoolean()) "not-null" else null
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

    @Test
    fun test_array_creation() {
        val expected = intArrayOf(1, 3, 5, 7, 9)
        val actual = IntArray(5) { i -> (1 + 2*i)}
        Arrays.equals(expected, actual)
    }

}