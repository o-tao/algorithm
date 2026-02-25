package programmers_kotlin.year_2026.february

private class Day_25_접미사_배열 {
    fun solution(my_string: String) =
        my_string.indices
            .map { my_string.substring(it) }
            .sorted()
            .toTypedArray()
}

fun main() {
    println(Day_25_접미사_배열().solution("banana").toList())
}
