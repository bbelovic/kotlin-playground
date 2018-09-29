package functions

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("empty $fieldName")
        }
    }
    validate(user.name, "name")
    validate(user.address, "address")
}