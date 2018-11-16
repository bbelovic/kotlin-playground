package conventions.ranges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate

class ClosedRangesTest {
    @Test
    fun should_tell_whether_it_is_in_range() {
        val dateRange =
                LocalDate.of(2018, 1, 1)..LocalDate.of(2018, 1, 1)
        val notInRange = LocalDate.of(2019, 1, 1)
        Assertions.assertFalse(notInRange in dateRange)

    }
}