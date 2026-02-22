package programmers_kotlin.year_2026.february

private class Day_22_배열_만들기_1 {
    fun solution(n: Int, k: Int) = (k..n step k).toList().toIntArray()
}

fun main() {
    println(Day_22_배열_만들기_1().solution(10, 3).toList())
}
