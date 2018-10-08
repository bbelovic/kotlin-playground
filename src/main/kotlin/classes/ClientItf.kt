package classes

interface ClientItf {
    companion object {
        fun simpleClient(id: Int) = Client(id)
        fun improvedClient(id: Int) = ClientImproved(id)
        fun internalClient(id: Int) = InternalClient()
    }
}

class InternalClient : ClientItf