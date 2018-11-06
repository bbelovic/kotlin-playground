package conventions.delegation

class Person(val username: String, age: Int, salary: Int) : PropertyChangeAware( ){
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            propertyChangeSupport.firePropertyChange("age", oldValue, newValue)
        }
    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            propertyChangeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}