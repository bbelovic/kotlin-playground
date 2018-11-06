package conventions.delegation

import org.junit.jupiter.api.Test
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

internal class PersonTest {
    @Test
    fun should_trigger_listener_on_property_change() {
        val person = Person("boris", 33, 80_000)
        person.addPropertyChangeListener(
                PropertyChangeListener { evt: PropertyChangeEvent? ->
                    println("Property [${evt?.propertyName}] changed from " +
                            "[${evt?.oldValue}] to [${evt?.newValue}]") }
        )

        person.salary = 10_000
    }
}