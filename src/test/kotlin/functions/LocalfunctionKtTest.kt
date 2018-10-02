package functions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class LocalfunctionKtTest {
    @Test
    fun test_local_function() {
        var user = User(1, "", "some address")
        var ex: IllegalArgumentException = assertThrows {saveUser(user)}
        user = User(1, "john doe", "")
        ex = assertThrows {saveUser(user)}
    }
}