package functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

internal class LocalfunctionKtTest {
    @Test
    fun test_local_function() {
        val user = User(1, "", "some address")
        ex: IllegalArgumentException = assertThrows(IllegalArgumentException.class, sa)
    }
}