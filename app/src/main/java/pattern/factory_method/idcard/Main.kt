package pattern.factory_method.idcard

    fun main() {
        val factory: Factory = IDCardFactory()
        val card1 = factory.create("alice")
        val card2 = factory.create("bob")
        val card3 = factory.create("charlie")
        card1.use()
        card2.use()
        card3.use()
    }
