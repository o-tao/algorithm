package programmers_kotlin.year_2026.february

private class Day_15_9로_나눈_나머지 {
    fun solution(number: String) = number.sumOf { it - '0' } % 9
}

fun main() {
    println(Day_15_9로_나눈_나머지().solution("123"))
}
