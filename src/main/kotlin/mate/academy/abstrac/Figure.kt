package mate.academy.abstrac

import mate.academy.model.Color

abstract class Figure(val color: Color) {

    abstract fun getArea(): Double

    abstract fun getDetails(): String

    fun draw() {
        println(getDetails())
    }
}
