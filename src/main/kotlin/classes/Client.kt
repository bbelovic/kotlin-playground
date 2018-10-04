package classes

import java.util.*

class Client(id: Int) {
    var id: Int = id
    set(value) {
        println("Setting id with value [$field] to [$value]")
        field = value
    }

    override fun toString() = "Client[id=$id]"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Client) {
            return false
        } else {
            return other.id == id
        }
    }

    override fun hashCode(): Int = Objects.hashCode(id)
}