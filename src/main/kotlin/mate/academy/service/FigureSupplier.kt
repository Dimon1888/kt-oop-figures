package mate.academy.service

import mate.academy.abstract.Figure
import mate.academy.model.Color

private const val MIN_SIZE = 1.0
private const val MAX_SIZE = 20.0
private const val DEFAULT_RADIUS = 10.0
private const val NUMBER_OF_FIGURE_TYPES = 5
private const val CIRCLE_TYPE_INDEX = 3
private const val RACTANGLE_TYPE_INDEX = 1
private const val SQUARE_TYPE_INDEX = 0
private const val RIGHT_TRIANGLE_TYPE_INDEX = 2

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    private val random = java.util.Random()

    private fun getRandomSize(): Double =
        MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (random.nextInt(NUMBER_OF_FIGURE_TYPES)) { // Вибираємо випадковий тип фігури
            SQUARE_TYPE_INDEX -> Square(color, getRandomSize())
            RACTANGLE_TYPE_INDEX  -> Rectangle(color, getRandomSize(), getRandomSize())
            RIGHT_TRIANGLE_TYPE_INDEX-> RightTriangle(color, getRandomSize(), getRandomSize())
            CIRCLE_TYPE_INDEX -> Circle(color, getRandomSize())
            else -> IsoscelesTrapezoid(color, getRandomSize(), getRandomSize(), getRandomSize())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
