package classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertTrue

internal class ClientTest {
    @Test
    fun should_print_message_on_id_access() {
        val client = Client(10)
        client.id = 100
        assertEquals(100, client.id)
    }
    @Test
    fun should_return_string_representation_of_class() {
        val client = Client(10)
        assertEquals("Client[id=10]", client.toString())
    }
    @Test
    fun should_return_false_for_reference_comparison() {
        val client1 = Client(5)
        val client2 = Client(5)
        assertNotSame(client1, client2)
        assertEquals(client1, client2)
    }
    @Test
    fun should_provide_hashCode_implementation() {
        val set = hashSetOf(Client(5))
        assertTrue(set.contains(Client(5)))
    }
}