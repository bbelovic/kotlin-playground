package classes

class DefaultState : State {
    override fun persist() {
        println("Persisting default state..")
    }
}