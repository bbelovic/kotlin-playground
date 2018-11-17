package conventions.ranges

class Person(val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return age.compareTo(other.age)
    }
}