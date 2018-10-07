package classes

class Clients {
    companion object {
        fun simpleClient(id: Int): AbstractClient = Client(id)
        fun improvedClient(id: Int): AbstractClient = ClientImproved(id)
    }
}