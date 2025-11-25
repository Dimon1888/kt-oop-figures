package mate.academy.service

import mate.academy.abstrac.Figure
import mate.academy.model.Color

class Rectangle(color: Color, val width: Double, val height: Double) : Figure(color) {
    override fun getArea(): Double = width * height
    override fun getDetails(): String =
        "Figure: rectangle, area: %.2f sq. units, width: %.2f units, height: %.2f units, color: %s"
            .format(getArea(), width, height, color.name.lowercase())
}
