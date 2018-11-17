package conventions.ranges

class Person(val login: String, val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return age.compareTo(other.age)
    }

    operator fun component1() = this.login
    operator fun component2(): Int {
        return this.age
    }
}