package functions

open class View {
    open fun getName() = "view"
}

class Button : View() {
    override fun getName(): String {
        return "button"
    }
}

fun View.showOff() = "i am view"
fun Button.showOff() = "i am button"