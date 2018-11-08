package conventions.delegation

import org.junit.jupiter.api.Test

internal class PersonTest {
    @Test
    fun should_trigger_listener_on_property_change() {
        val person = Person("boris", 33, 80_000)

        person.age = 18
        person.salary = 10_000
    }
}