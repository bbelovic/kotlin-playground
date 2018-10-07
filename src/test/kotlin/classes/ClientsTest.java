package classes;

import org.junit.jupiter.api.Test;

import static classes.Clients.Companion;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClientsTest {
    @Test
    void should_create_client_instances() {
        final int testId = 42;
        AbstractClient client = Companion.simpleClient(testId);
        assertTrue(client instanceof Client);
        client = Companion.improvedClient(testId);
        assertTrue(client instanceof ClientImproved);
    }

}
