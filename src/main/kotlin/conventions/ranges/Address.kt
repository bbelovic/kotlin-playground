package conventions.ranges

class Address(val street: String) : Comparable<Address> {
    override fun compareTo(other: Address): Int {
        return street.compareTo(other.street)
    }
}