package conventions.ranges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class ComparisonsTest {
    @Test
    fun should_compare_persons() {
        val p1 = Person("john.doe", 18)
        val p2 = Person("jane.doe", 40)
        val p3 = Person("pepa", 40)
        val p4 = Person("franta", 99)
        Assertions.assertTrue(p1 < p2)
        Assertions.assertTrue(p3 <= p2)
        Assertions.assertTrue(p4 > p2)
    }

    @Test
    fun should_parse_person_from_string() {
        val (login, age) = parsePerson("jdoe:19")
    }

    fun parsePerson(input: String?): Person {
        val split = input?.split(":") ?: listOf("", "-1")
        return Person(split[0], split[1].toInt())
    }
}