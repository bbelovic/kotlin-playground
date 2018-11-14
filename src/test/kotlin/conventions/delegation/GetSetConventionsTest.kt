package conventions.delegation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

internal class GetSetConventionsTest {
    @Test
    fun should_use_get_set_convention() {
        val conventions = GetSetConventions(generateList())
        for (i in 0..9) {
            conventions[i] = "value-$i"
        }

        for (i in 0..9) {
            assertEquals("value-$i", conventions[i])
        }

        assertNull(conventions["blabol"])
        assertNotNull(conventions["value-1"])
    }

    @Test
    fun should_use_plus_convention() {
        val conventions = GetSetConventions(generateList(2))
        val otherList = generateList(3)
        val actual = conventions + otherList
        assertEquals(5, actual.size())

    }

    private fun generateList(takeItems: Int = 10) = generateSequence(0) { it + 1 }
            .take(takeItems)
            .map { num -> num.toString() }
            .toMutableList()

}