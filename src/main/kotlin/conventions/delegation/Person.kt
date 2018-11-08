package conventions.delegation

class Person(val username: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int by ObservableProperty(age, propertyChangeSupport)
    var salary: Int by ObservableProperty(salary, propertyChangeSupport)
}