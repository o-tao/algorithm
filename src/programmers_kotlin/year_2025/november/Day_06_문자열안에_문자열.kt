package programmers_kotlin.year_2025.november

private class Day_06_문자열안에_문자열 {
    fun solution(str1: String, str2: String): Int {
        return if (str1.contains(str2)) 1 else 2
    }
}

fun main() {
    println(Day_06_문자열안에_문자열().solution("ab6CDE443fgh22iJKlmn1o", "6CD"))
}
