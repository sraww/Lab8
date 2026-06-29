fun main() {
    // Запрос года рождения
    println("Введите ваш год рождения:")
    val input = readLine()

    // Преобразование ввода в число
    val birthYear = input?.toIntOrNull()

    if (birthYear == null) {
        println("Некорректный ввод. Пожалуйста, введите числовое значение.")
        return
    }

    // Получение текущего года
    val currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)

    // Вычисление возраста
    val age = currentYear - birthYear

    if (age < 0) {
        println("Возраст не может быть отрицательным. Проверьте правильность ввода.")
        return
    }

    println("Ваш возраст: $age лет.")
}