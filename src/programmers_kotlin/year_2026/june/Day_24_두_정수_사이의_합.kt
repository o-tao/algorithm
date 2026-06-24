package programmers_kotlin.year_2026.june

private class Day_24_두_정수_사이의_합 {
    fun solution(a: Int, b: Int): Long = (minOf(a, b)..maxOf(a, b)).sumOf { it.toLong() }
}

fun main() {
    println(Day_24_두_정수_사이의_합().solution(3, 5))
}
