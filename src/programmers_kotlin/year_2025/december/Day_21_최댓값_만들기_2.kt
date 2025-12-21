package programmers_kotlin.year_2025.december

private class Day_21_최댓값_만들기_2 {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        val maxProduct1 = numbers[numbers.size - 1] * numbers[numbers.size - 2]
        val maxProduct2 = numbers[0] * numbers[1]
        return maxOf(maxProduct1, maxProduct2)
    }
}

fun main() {
    println(Day_21_최댓값_만들기_2().solution(intArrayOf(1, 2, -3, 4, -5)))
}
