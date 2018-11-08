package conventions.delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person(val username: String, age: Int, salary: Int) : PropertyChangeAware() {
    val delegate = {prop: KProperty<*>, oldValue: Int, newValue: Int ->
        println("'${prop.name}' changed from [$oldValue] to [$newValue]")}
    var age: Int by Delegates.observable(age, delegate)
    var salary: Int by Delegates.observable(salary, delegate)
}