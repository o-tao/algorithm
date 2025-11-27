package programmers_kotlin.year_2025.november

private class Day_27_문자열_뒤_n글자 {
    fun solution(my_string: String, n: Int) = my_string.takeLast(n)
}

fun main() {
    println(Day_27_문자열_뒤_n글자().solution("ProgrammerS123", 11))
}
