package mate.academy.service

import mate.academy.abstrac.Figure
import mate.academy.model.Color

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    private val random = java.util.Random()
    private val MIN_SIZE = 1.0 // Мінімальний розмір для випадкових генерацій
    private val MAX_SIZE = 20.0 // Максимальний розмір

    private fun getRandomSize(): Double =
        MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (random.nextInt(5)) { // Вибираємо випадковий тип фігури
            0 -> Square(color, getRandomSize())
            1 -> Rectangle(color, getRandomSize(), getRandomSize())
            2 -> RightTriangle(color, getRandomSize(), getRandomSize())
            3 -> Circle(color, getRandomSize())
            else -> IsoscelesTrapezoid(color, getRandomSize(), getRandomSize(), getRandomSize())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, 10.0)
    }
}
