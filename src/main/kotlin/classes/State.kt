package classes

interface State : java.io.Serializable {
    fun persist()
    fun restore() : State {
        return EmptyState()
    }
}