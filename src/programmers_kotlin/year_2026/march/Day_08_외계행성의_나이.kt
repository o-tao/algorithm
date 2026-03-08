package programmers_kotlin.year_2026.march

private class Day_08_외계행성의_나이 {
    fun solution(age: Int) = age.toString().map { "abcdefghij"[it - '0'] }.joinToString("")
}

fun main() {
    println(Day_08_외계행성의_나이().solution(23))
}
