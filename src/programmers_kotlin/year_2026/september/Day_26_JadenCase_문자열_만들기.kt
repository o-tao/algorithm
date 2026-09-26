package programmers_kotlin.year_2026.september

private class Day_26_JadenCase_문자열_만들기 {
    fun solution(s: String) =
        s.split(" ").joinToString(" ") { word ->
            word.lowercase().replaceFirstChar { it.uppercase() }
        }
}

fun main() {
    println(Day_26_JadenCase_문자열_만들기().solution("3people unFollowed me"))
}
