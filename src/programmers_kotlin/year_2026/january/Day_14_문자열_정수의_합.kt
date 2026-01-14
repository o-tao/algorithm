package programmers_kotlin.year_2026.january

private class Day_14_문자열_정수의_합 {
    fun solution(num_str: String) = num_str.sumOf { it - '0' }
}

fun main() {
    println(Day_14_문자열_정수의_합().solution("123456789"))
}
