package classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
}