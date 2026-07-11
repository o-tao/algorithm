package programmers_kotlin.year_2026.july

private class Day_11_없는_숫자_더하기 {
    fun solution(numbers: IntArray) = 45 - numbers.sum()
}

fun main() {
    println(Day_11_없는_숫자_더하기().solution(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0)))
}
