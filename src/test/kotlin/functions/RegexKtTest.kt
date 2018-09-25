package functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RegexKtTest {

    @Test
    fun should_parse_file_details() {
        val pathToFile = "/home/bbelovic/experiment.kt"
        val expected = FileDetails("/home/bbelovic", "experiment", "kt")
        val actual = parseFileDetails(pathToFile)
        Assertions.assertEquals(expected, actual)
        val actual2 = parseFileDetailsWithRegex(pathToFile)
        Assertions.assertEquals(expected, actual2)
    }
}