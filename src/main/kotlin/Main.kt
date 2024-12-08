package org.example


fun main() {
    val array = intArrayOf(1, 4, 5, 15, 19, 32, 58)
    val item = 15
    val foundedIndex = binarySearch(array, item) ?: throw Exception("Item not found in array")
    println("Founded index: $foundedIndex")
}

/**
 * Реализация бинарного поиска. Возвращает индекс найденного элемента, иначе возвращает null.
 * Если массив пустой, метод также вернет null.
 *
 * @param array Массив, в котором ведется поиска элемент.
 * @param searchItem Искомый элемент
 */
private fun binarySearch(array: IntArray, searchItem: Int): Int? {
    if (array.isEmpty()) {
        return null
    }
    var lowIndex = 0
    var highIndex = array.size - 1
    while (lowIndex <= highIndex) {
        val middleIndex = (lowIndex + highIndex) / 2
        val guess = array[middleIndex]
        if (guess == searchItem) {
            return middleIndex
        }

        if (guess > searchItem) {
            highIndex = middleIndex - 1
        } else {
            lowIndex = middleIndex + 1
        }
    }
    return null
}