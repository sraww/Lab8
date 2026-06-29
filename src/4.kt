fun main() {
    val number = try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        0
    }
    println("Результат: $number")
}