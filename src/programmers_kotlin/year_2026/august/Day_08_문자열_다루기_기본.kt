package programmers_kotlin.year_2026.august

private class Day_08_문자열_다루기_기본 {
    fun solution(s: String) = (s.length == 4 || s.length == 6) && s.all { it.isDigit() }
}

fun main() {
    println(Day_08_문자열_다루기_기본().solution("a234"))
}
