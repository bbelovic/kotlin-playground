package types

import java.util.*

class Employee(val name: String, val boss: Employee? = null) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        val o  = other as? Employee ?: return false
        return o.name == name && o.boss == boss
    }

    override fun hashCode(): Int {
        return Objects.hash(name, boss)
    }

    override fun toString(): String {
        return "Employee[name=$name, boss="+ (boss ?: "n/a") +"]"
    }
}