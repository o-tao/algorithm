package programmers_kotlin.year_2025.november

private class Day_26_문자열의_앞의_n글자 {
    fun solution(my_string: String, n: Int) = my_string.substring(0, n)
}

fun main() {
    println(Day_26_문자열의_앞의_n글자().solution("ProgrammerS123", 11))
}
