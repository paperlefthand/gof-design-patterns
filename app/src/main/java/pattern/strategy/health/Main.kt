package pattern.strategy.health

fun main() {
        val alice = Person("Alice", 18, 150.0f, 45.0f)
        val bob = Person("Bob", 20, 170.0f, 60.0f)
        val ac: Comparator = BMIComparator()
        println(ac.compare(alice, bob))
    }

