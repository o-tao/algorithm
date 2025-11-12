package programmers_kotlin.year_2025.november

private class Day_12_자릿수_더하기 {
    fun solution(n: Int) = n.toString().map { it.digitToInt() }.sum()
}

fun main() {
    println(Day_12_자릿수_더하기().solution(1234))
}
