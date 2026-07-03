package programmers_kotlin.year_2026.july

class Day_03_짝수와_홀수 {
    fun solution(num: Int) = if (num % 2 == 0) "Even" else "Odd"
}

fun main() {
    println(Day_03_짝수와_홀수().solution(3))
}
