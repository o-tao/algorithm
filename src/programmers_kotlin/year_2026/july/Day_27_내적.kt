package programmers_kotlin.year_2026.july

private class Day_27_내적 {
    fun solution(a: IntArray, b: IntArray) = a.indices.sumOf { i -> a[i] * b[i] }
}

fun main() {
    println(Day_27_내적().solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2)))
}
