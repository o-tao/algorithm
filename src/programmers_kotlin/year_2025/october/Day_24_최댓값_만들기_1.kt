package programmers_kotlin.year_2025.october

private class Day_24_최댓값_만들기_1 {
    fun solution(numbers: IntArray) = numbers.sorted().let { it[it.lastIndex] * it[it.lastIndex - 1] }
}

fun main() {
    println(Day_24_최댓값_만들기_1().solution(intArrayOf(1, 2, 3, 4, 5)))
}
