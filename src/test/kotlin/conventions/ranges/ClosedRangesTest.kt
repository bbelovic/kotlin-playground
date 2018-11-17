package conventions.ranges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate

class ClosedRangesTest {
    @Test
    fun should_tell_whether_it_is_in_range() {
        val dateRange =
                LocalDate.of(2018, 1, 1)..LocalDate.of(2018, 1, 3)
        val notInRange = LocalDate.of(2019, 1, 1)
        Assertions.assertFalse(notInRange in dateRange)
    }

    @Test
    fun should_iterate_over_range() {
        val dateRange =
                LocalDate.of(2018, 1, 1)..LocalDate.of(2018, 1, 3)
        var dayCount = 0
        for (date in dateRange) {
            dayCount++
        }
        Assertions.assertEquals(3, dayCount)
    }

    operator fun ClosedRange<LocalDate>.iterator() : Iterator<LocalDate> {
        return object : Iterator<LocalDate> {
            var current = start
            override fun hasNext(): Boolean {
                return current <= endInclusive
            }

            override fun next(): LocalDate {
                current = current.plusDays(1)
                return current
            }
        }
    }
}