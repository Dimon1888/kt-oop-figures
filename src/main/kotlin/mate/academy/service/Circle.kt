package mate.academy.service

import mate.academy.abstract.Figure
import mate.academy.model.Color

class Circle(color: Color, val radius: Double) : Figure(color) {
    // Для математичної константи Pi
    override fun getArea(): Double = Math.PI * radius * radius
    override fun getDetails(): String =
        "Figure: circle, area: %.2f sq. units, radius: %.2f units, color: %s"
            .format(getArea(), radius, color.name.lowercase())
}
