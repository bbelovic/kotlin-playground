package functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExtensionPropertyTest {
    @Test
    fun test_extension_properties() {
        val actual = "Kotlin?".last
        Assertions.assertEquals('?', actual)

        val sb = StringBuilder("Kotlin?")
        val last = sb.lastChar
        Assertions.assertEquals('?', last)
        sb.lastChar = '!'
        Assertions.assertEquals("Kotlin!", sb.toString())

    }
}