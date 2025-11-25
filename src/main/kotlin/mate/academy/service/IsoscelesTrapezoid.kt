package mate.academy.service

import mate.academy.abstrac.Figure
import mate.academy.model.Color

class IsoscelesTrapezoid(
    color: Color,
    val baseA: Double,
    val baseB: Double,
    val height: Double
) : Figure(color) {
    override fun getArea(): Double = 0.5 * (baseA + baseB) * height
    override fun getDetails(): String =
        "Figure: trapezoid, area: %.2f sq. units, baseA: %.2f units, baseB: %.2f units, height: %.2f units, color: %s"
            .format(getArea(), baseA, baseB, height, color.name.lowercase())
}
