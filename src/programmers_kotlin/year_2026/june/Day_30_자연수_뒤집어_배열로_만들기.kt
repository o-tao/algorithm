package programmers_kotlin.year_2026.june

private class Day_30_자연수_뒤집어_배열로_만들기 {
    fun solution(n: Long) = n.toString().reversed().map { it.digitToInt() }.toIntArray()
}

fun main() {
    println(Day_30_자연수_뒤집어_배열로_만들기().solution(12345).contentToString())
}
