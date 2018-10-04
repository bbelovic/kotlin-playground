package classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

internal class ClientImprovedTest {
    @Test
    fun should_copy_instance() {
        val client1 = ClientImproved(10)
        val clientCopy = client1.copy()
        assertNotSame(client1, clientCopy)
        assertEquals(client1, clientCopy)
    }
}
