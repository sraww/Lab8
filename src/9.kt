fun main() {
    val name: String? = null
    val length = name?.length ?: 0
    println(length)
}