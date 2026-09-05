package programmers_kotlin.year_2026.september

private class Day_05_콜라_문제 {
    fun solution(a: Int, b: Int, n: Int): Int = (n - b) / (a - b) * b
}

fun main() {
    println(Day_05_콜라_문제().solution(2, 1, 20))
}
