package mate.academy

import mate.academy.abstract.Figure
import mate.academy.service.FigureSupplier

private const val TOTAL_FIGURES = 6

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()

    val randomCount = TOTAL_FIGURES / 2
    repeat(randomCount) {
        figures.add(figureSupplier.getRandomFigure())
    }

    val defaultCount = TOTAL_FIGURES - randomCount
    repeat(defaultCount) {
        figures.add(figureSupplier.getDefaultFigure())
    }

       println("--- Повний Список Згенерованих Фігур (${figures.size} шт.) ---")
    figures.forEach { figure ->
        figure.draw()
    }
}
