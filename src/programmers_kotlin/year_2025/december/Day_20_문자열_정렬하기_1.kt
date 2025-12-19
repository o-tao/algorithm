package programmers_kotlin.year_2025.december

private class Day_20_문자열_정렬하기 {
    fun solution(my_string: String) =
        my_string
            .filter { it.isDigit() }
            .map { it - '0' }
            .sorted()
}

fun main() {
    println(Day_20_문자열_정렬하기().solution("hi12392"))
}
