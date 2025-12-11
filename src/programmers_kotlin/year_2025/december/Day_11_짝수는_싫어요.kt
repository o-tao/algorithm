package programmers_kotlin.year_2025.december

private class Day_11_짝수는_싫어요 {
    fun solution(n: Int) = (1..n).filter { it % 2 == 1 }.toIntArray()
}

fun main() {
    println(Day_11_짝수는_싫어요().solution(10).toList())
}
