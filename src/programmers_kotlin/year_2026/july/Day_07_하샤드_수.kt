package programmers_kotlin.year_2026.july

private class Day_07_하샤드_수 {
    fun solution(x: Int) = x % x.toString().map { it - '0' }.sum() == 0
}

fun main() {
    println(Day_07_하샤드_수().solution(10))
}
