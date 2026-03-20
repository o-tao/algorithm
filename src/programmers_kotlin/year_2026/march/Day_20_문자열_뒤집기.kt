package programmers_kotlin.year_2026.march

private class Day_20_문자열_뒤집기 {
    fun solution(my_string: String, s: Int, e: Int) = my_string.substring(0, s) + my_string.substring(s, e + 1).reversed() + my_string.substring(e + 1)
}

fun main() {
    println(Day_20_문자열_뒤집기().solution("Progra21Sremm3", 6, 12))
}
