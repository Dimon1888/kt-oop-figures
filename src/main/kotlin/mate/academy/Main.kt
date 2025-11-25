package mate.academy

import mate.academy.abstrac.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val totalFigures = 6
    val figures = mutableListOf<Figure>()

    println("--- Випадкові Фігури ---")
    val randomCount = totalFigures / 2
    repeat(randomCount) {
        val figure = figureSupplier.getRandomFigure()
        figures.add(figure)
        figure.draw()
    }

    println("\n--- Фігури за Замовчуванням (Біле Коло з R=10) ---")
    val defaultCount = totalFigures - randomCount
    repeat(defaultCount) {
        val figure = figureSupplier.getDefaultFigure()
        figures.add(figure)
        figure.draw()
    }
}
