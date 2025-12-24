package programmers_kotlin.year_2025.december

private class Day_24_문자열_정렬하기_2 {
    fun solution(my_string: String) = my_string.lowercase().toCharArray().sorted().joinToString("")
}

fun main() {
    println(Day_24_문자열_정렬하기_2().solution("Bcad"))
}
