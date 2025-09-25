package programmers_kotlin.year_2025.september

private class Day_25_두_수의_나눗셈 {
    fun solution(num1: Int, num2: Int): Int = ((num1.toDouble() / num2.toDouble()) * 1000).toInt()
}

fun main() {
    println(Day_25_두_수의_나눗셈().solution(3, 2))
}
