package classes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggingCollectionTest {
    @Test
    void should_tell_whether_element_is_present() {
        var items = new LoggingCollection<>(List.of(new Item(0)));
        assertTrue(items.contains(new Item(0)));
        assertFalse(items.contains(new Item(10)));
    }
}
