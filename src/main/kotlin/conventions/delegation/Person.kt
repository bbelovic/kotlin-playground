package conventions.delegation

class Person(val username: String, age: Int, salary: Int) : PropertyChangeAware(){
    val _age = ObservableProperty("age", age, propertyChangeSupport)
    val _salary = ObservableProperty("salary", salary, propertyChangeSupport)
    var age: Int
        get() = _age.getValue()
        set(newValue) { _age.setValue(newValue) }
    var salary: Int
        get() = _salary.getValue()
        set(newValue) { _salary.setValue(newValue)}
}