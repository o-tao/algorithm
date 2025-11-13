package programmers_kotlin.year_2025.november

private class Day_13_n의_배수 {
    fun solution(num: Int, n: Int) = if (num % n == 0) 1 else 0
}

fun main() {
    println(Day_13_n의_배수().solution(98, 2))
}
