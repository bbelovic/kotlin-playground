package types

class ServiceB {
    private lateinit var serviceA: ServiceA

    fun init() {
        serviceA = DefaultServiceA()
    }
}