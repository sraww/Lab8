fun main() {
    // список с разными значениями
    val list: List<String?> = listOf("Apple", null, "Banana", "", null, "Cherry", " ")

    // Подсчет элементов, которые содержат реальные строки (не null и не пустая)
    val nonNullCount = list.count { it != null && it.isNotBlank() }

    // Подсчет элементов, равных null
    val nullCount = list.count { it == null }

    // Подсчет пустых строк
    val emptyStringCount = list.count { it != null && it.isBlank() }

    println("Количество элементов с реальными значениями: $nonNullCount")
    println("Количество элементов, равных null: $nullCount")
}