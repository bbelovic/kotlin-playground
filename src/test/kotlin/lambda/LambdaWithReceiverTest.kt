package lambda

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LambdaWithReceiverTest {
    @Test
    fun test_lambda_with_receiver() {
        val sb = StringBuilder()
        for (s in 'A'..'Z') {
            sb.append(s)
        }
        println(sb.toString())

        val result = with(StringBuilder() ) {
            for (s in 'A'..'Z') {
                append(s)
            }
            toString()
        }

        println(result)
    }

    @Test
    fun test_sum_even_numbers() {
        val actual = sumEvenNumbers()
        assertEquals(20, actual)
    }

    @Test
    fun test_lambda_with_receiver_apply() {
        val actual = buildItem()
        val expected = Item()
        expected.id = 1L
        expected.name = "dummy item"

        Assertions.assertEquals(expected.id, actual.id)
        Assertions.assertEquals(expected.name, actual.name)

    }

    private fun buildItem() = Item().apply {
        id = 1L
        name = "dummy item"
    }
}

