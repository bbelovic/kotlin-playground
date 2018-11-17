package conventions.ranges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ComparisonsTest {
    @Test
    fun should_compare_persons() {
        val p1 = Person(18)
        val p2 = Person(40)
        val p3 = Person(40)
        val p4 = Person(99)
        Assertions.assertTrue(p1 < p2)
        Assertions.assertTrue(p3 <= p2)
        Assertions.assertTrue(p4 > p2)
    }
}