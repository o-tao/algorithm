package programmers_kotlin.year_2026.june

private class Day_29_자릿수_더하기 {
    fun solution(n: Int) = n.toString().sumOf { it.digitToInt() }
}

fun main() {
    println(Day_29_자릿수_더하기().solution(123))
}
