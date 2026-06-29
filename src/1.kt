fun main() {
    try {
        val number = "abc".toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("Ошибка: введено не число")
    }
}
