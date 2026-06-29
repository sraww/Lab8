fun main() {
    val text: String? = "Kotlin"
    text?.let {
        println("Длина строки: ${it.length}")
    }
}