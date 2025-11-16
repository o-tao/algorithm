package programmers_kotlin.year_2025.november

private class Day_16_문자열_곱하기 {
    fun solution(my_string: String, k: Int) = my_string.repeat(k)
}

fun main() {
    println(Day_16_문자열_곱하기().solution("string", 3))
}
