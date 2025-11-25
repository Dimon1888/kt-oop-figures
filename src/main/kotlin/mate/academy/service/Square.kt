package mate.academy.service

import mate.academy.abstract.Figure
import mate.academy.model.Color

class Square(color: Color, val side: Double) : Figure(color) {
    override fun getArea(): Double = side * side
    override fun getDetails(): String =
        "Figure: square, area: %.2f sq. units, side: %.2f units, color: %s"
            .format(getArea(), side, color.name.lowercase())

}
