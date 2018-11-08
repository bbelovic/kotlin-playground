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

    private fun generateList() = generateSequence(0) { it + 1 }
            .take(10)
            .map { num -> num.toString() }
            .toMutableList()

}