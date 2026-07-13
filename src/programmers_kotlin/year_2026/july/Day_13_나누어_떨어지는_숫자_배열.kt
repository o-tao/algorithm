package programmers_kotlin.year_2026.july

private class Day_13_나누어_떨어지는_숫자_배열 {
    fun solution(arr: IntArray, divisor: Int) = arr.filter { it % divisor == 0 }.sorted().ifEmpty { listOf(-1) }.toIntArray()
}

fun main() {
    println(Day_13_나누어_떨어지는_숫자_배열().solution(intArrayOf(5, 9, 7, 10), 5).contentToString())
}
