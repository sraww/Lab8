fun main() {
    val words = listOf("cat", "elephant", "dog", "kotlin")
    val result = words.count { it.length > 3 }
    println(result)
}