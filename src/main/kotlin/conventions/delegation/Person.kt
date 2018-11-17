package conventions.delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person(val username: String, age: Int, salary: Int) : PropertyChangeAware() {
    val emails: List<Email> by lazy { loadEmails() }

    private fun loadEmails(): List<Email> {
        println("Loading emails lazily..")
        return listOf(Email("subj1", "text1"), Email("subj2", "text2"))
    }

    val delegate = {prop: KProperty<*>, oldValue: Int, newValue: Int ->
        println("'${prop.name}' changed from [$oldValue] to [$newValue]")}
    var age: Int by Delegates.observable(age, delegate)
    var salary: Int by Delegates.observable(salary, delegate)
}