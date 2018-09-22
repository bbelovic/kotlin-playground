package functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class JointostringKtTest {

    @Test
    fun joinToString() {
        val actual = emptyList<String>().joinToString(separator = ",", prefix = "[", postfix = "]")
        val expected = "[]"
        Assertions.assertEquals(expected, actual)
    }
}