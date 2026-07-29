package programmers_kotlin.year_2026.july

private class Day_29_수박수박수박수박수박수 {
    fun solution(n: Int) = "수박".repeat((n + 1) / 2).take(n)
}

fun main() {
    println(Day_29_수박수박수박수박수박수().solution(3))
}
