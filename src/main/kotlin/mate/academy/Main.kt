package mate.academy

import mate.academy.abstract.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val totalFigures = 6
    val figures = mutableListOf<Figure>()


    val randomCount = totalFigures / 2
    repeat(randomCount) {
        figures.add(figureSupplier.getRandomFigure())
    }

    val defaultCount = totalFigures - randomCount
    repeat(defaultCount) {
        figures.add(figureSupplier.getDefaultFigure())
    }

       println("--- Повний Список Згенерованих Фігур (${figures.size} шт.) ---")
    figures.forEach { figure ->
        figure.draw()
    }
}
