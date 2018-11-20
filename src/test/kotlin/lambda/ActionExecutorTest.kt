package lambda

import net.bbelovic.playground.Action
import net.bbelovic.playground.JavaActionExecutor
import org.junit.jupiter.api.Test

internal class ActionExecutorTest {
    @Test
    fun should_execute_action() {
        val executor = ActionExecutor()
        val act = Action { println("aaa")}
        executor.executeAction(Action { println("hello from action") })
        executor.executeAction(act)
        val a: () -> Unit = { print("bbb") }

        val javaActionExecutor = JavaActionExecutor()
        javaActionExecutor.executeAction { act.execute() }
        javaActionExecutor.executeAction { println("xxx") }
        javaActionExecutor.executeAction { println("kotlin") }
    }
}