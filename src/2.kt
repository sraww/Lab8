fun main() {
    try {
        val numbers = listOf(10, 20, 30)
        val index = readln().toInt()
        println(numbers[index])
    } catch (e: NumberFormatException) {
        println("Ошибка: индекс должен быть целым числом")
    } catch (e: IndexOutOfBoundsException) {
        println("Ошибка: индекс вне диапазона")
    }
}