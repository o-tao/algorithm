package programmers_kotlin.year_2026.may

private class Day_13_문자열_겹쳐쓰기 {
    fun solution(my_string: String, overwrite_string: String, s: Int) = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length)
}

fun main() {
    println(Day_13_문자열_겹쳐쓰기().solution("He11oWor1d", "lloWorl", 2))
}
