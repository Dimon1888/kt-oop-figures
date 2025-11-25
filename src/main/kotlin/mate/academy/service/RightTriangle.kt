package mate.academy.service

import mate.academy.abstract.Figure
import mate.academy.model.Color

private const val TRIANGLE_FACTOR = 0.5

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun getArea(): Double = TRIANGLE_FACTOR * firstLeg * secondLeg
    override fun getDetails(): String =
        "Figure: triangle, area: %.2f sq. units, firstLeg: %.2f units, secondLeg: %.2f units, color: %s"
            .format(getArea(), firstLeg, secondLeg, color.name.lowercase())
}
