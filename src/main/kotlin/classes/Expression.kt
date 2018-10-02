package classes

sealed class Expression : AItf() {
    class Sum : Expression() {
        override fun noOp() {
            println("Sum - noOp")
        }
    }
    class Multiply : Expression() {
        override fun noOp() {
            println("Multiply - noOp")
        }

    }
}