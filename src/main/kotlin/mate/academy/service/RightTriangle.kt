package mate.academy.service

import mate.academy.abstrac.Figure
import mate.academy.model.Color

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun getArea(): Double = 0.5 * firstLeg * secondLeg
    override fun getDetails(): String =
        "Figure: triangle, area: %.2f sq. units, firstLeg: %.2f units, secondLeg: %.2f units, color: %s"
            .format(getArea(), firstLeg, secondLeg, color.name.lowercase())
}
