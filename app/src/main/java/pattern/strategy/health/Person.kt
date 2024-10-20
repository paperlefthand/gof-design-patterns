package pattern.strategy.health


import kotlin.math.pow


class Person(val name:String, val age: Int, val height:Float, val weight:Float) {


    fun getBMI() : Float {
        return weight * (height / 100).pow(2)

    }
}


