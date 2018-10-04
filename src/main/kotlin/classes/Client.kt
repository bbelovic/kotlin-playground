package classes

class Client(id: Int) {
    var id: Int = id
    set(value) {
        println("Setting id with value [$field] to [$value]")
        field = value
    }

    override fun toString() = "Client[id=$id]"
}