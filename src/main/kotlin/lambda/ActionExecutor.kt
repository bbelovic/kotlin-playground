package lambda

import net.bbelovic.playground.Action
import net.bbelovic.playground.Fn

class ActionExecutor {
    fun executeAction(action: Action) {
        action.execute()
    }

    fun applyFunction(input: String, fn: Fn<String, String>) {
        fn.apply(input)
    }
}