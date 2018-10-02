package classes

open class DefaultComponent(name: String) : AbstractComponent(name) {
    final override fun persist() {
        println("Persisting default component")
    }
}