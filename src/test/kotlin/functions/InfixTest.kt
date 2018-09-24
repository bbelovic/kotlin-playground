package functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InfixTest {
    @Test
    fun test_infix() {
        var actual = "1" to "many"
        Assertions.assertEquals(Pair("1", "many"), actual)

        actual = "1".with("many")
        Assertions.assertEquals(Pair("1", "many"), actual)
    }
}