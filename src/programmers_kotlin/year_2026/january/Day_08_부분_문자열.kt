package programmers_kotlin.year_2026.january

private class Day_08_부분_문자열 {
    fun solution(str1: String, str2: String) = if (str2.contains(str1)) 1 else 0
}

fun main() {
    println(Day_08_부분_문자열().solution("abc", "aabcc"))
}
