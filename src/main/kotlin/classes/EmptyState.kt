package classes

open class EmptyState : State {
    override fun persist() {
        println("Persisting empty state")
    }

    override fun restore(): State {
        return DefaultState()
    }
}
