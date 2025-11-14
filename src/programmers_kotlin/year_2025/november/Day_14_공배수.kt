package programmers_kotlin.year_2025.november

private class Day_14_공배수 {
    fun solution(number: Int, n: Int, m: Int) = if (number % n == 0 && number % m == 0) 1 else 0
}

fun main() {
    println(Day_14_공배수().solution(60, 2, 3))
}
