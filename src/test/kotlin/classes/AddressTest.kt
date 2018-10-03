package classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class AddressTest {
    @Test
    fun should_return_zip_code() {
        val address = Address("92701")
        assertEquals("92701", address.zipCode)
    }
}
