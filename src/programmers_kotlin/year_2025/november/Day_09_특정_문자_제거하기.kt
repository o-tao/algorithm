package programmers_kotlin.year_2025.november

private class Day_09_특정_문자_제거하기 {
    fun solution(my_string: String, letter: String) = my_string.replace(letter, "")
}

fun main() {
    println(Day_09_특정_문자_제거하기().solution("abcdef", "f"))
}
