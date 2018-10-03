package classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class WhenWithSealedClassKtTest {
    @Test
    fun should_return_name_of_the_operation() {
        assertEquals("Sum", expressionToString(Expression.Sum()))
        assertEquals("multiply", expressionToString(Expression.Multiply()))
        assertEquals("sqrt", expressionToString(Expression.Sqrt()))

    }
}