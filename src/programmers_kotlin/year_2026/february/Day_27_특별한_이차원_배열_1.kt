package programmers_kotlin.year_2026.february

private class Day_27_특별한_이차원_배열_1 {
    fun solution(n: Int) = Array(n) { i -> IntArray(n) { j -> if (i == j) 1 else 0 } }
}

fun main() {
    println(Day_27_특별한_이차원_배열_1().solution(3).contentDeepToString())
}
