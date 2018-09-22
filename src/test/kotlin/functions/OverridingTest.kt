package functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OverridingTest {
    @Test
    fun extension_function_does_not_support_override() {
        val view: View = Button()
        val actual = view.getName()
        Assertions.assertEquals("button", actual)
        Assertions.assertEquals("i am view", view.showOff())
        Assertions.assertEquals("i am button", Button().showOff())


        val view2 = View()
        Assertions.assertEquals("view", view2.getName())
        Assertions.assertEquals("i am view", view2.showOff())


    }
}