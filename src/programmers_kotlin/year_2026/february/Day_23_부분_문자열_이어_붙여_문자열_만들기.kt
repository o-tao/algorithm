package programmers_kotlin.year_2026.february

private class Day_23_부분_문자열_이어_붙여_문자열_만들기 {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>) =
        my_strings.indices
            .map { i ->
                val (s, e) = parts[i]
                my_strings[i].substring(s, e + 1)
            }
            .joinToString("")
}

fun main() {
    println(
        Day_23_부분_문자열_이어_붙여_문자열_만들기().solution(
            arrayOf("progressive", "hamburger", "hammer", "ahocorasick"),
            arrayOf(intArrayOf(0, 4), intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(7, 7))
        )
    )
}
