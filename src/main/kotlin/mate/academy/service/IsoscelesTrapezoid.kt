package mate.academy.service

import mate.academy.abstract.Figure
import mate.academy.model.Color

private const val NUMBER_OF_FIGURE_TYPES = 0.5

class IsoscelesTrapezoid(
    color: Color,
    val baseA: Double,
    val baseB: Double,
    val height: Double
) : Figure(color) {
    override fun getArea(): Double = NUMBER_OF_FIGURE_TYPES  * (baseA + baseB) * height
    override fun getDetails(): String =
        "Figure: trapezoid, area: %.2f sq. units, baseA: %.2f units, baseB: %.2f units, height: %.2f units, color: %s"
            .format(getArea(), baseA, baseB, height, color.name.lowercase())
}
