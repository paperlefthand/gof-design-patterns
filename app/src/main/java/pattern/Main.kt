package pattern

import java.util.Scanner


    fun main() {
        val scanner = Scanner(System.`in`)

        println("Choose number:")
        println("1. Observer Pattern")
        println("2. Factory Method Pattern")
        println("3. Strategy Pattern")

        try {
            val choice = scanner.nextInt()

            if (choice in 1..3) {
                when (choice) {
                    1 -> pattern.observer.study.main()
                    2 -> pattern.factory_method.idcard.main()
                    3 -> pattern.strategy.health.main()
                }
            } else {
                println("Input value must be an integer between 1 and 3")
            }
        } catch (e: Exception) {
            println("Invalid input")
        } finally {
            scanner.close()
        }
    }
