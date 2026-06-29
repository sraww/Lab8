fun main() {
    try {
        println("Начало работы")
        val value = 100 / 5
        println(value)
    } catch (e: Exception) {
        println("Произошла ошибка")
    } finally {
        println("Завершение блока обработки")
    }
}