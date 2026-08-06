package programmers_kotlin.year_2026.august

private class Day_06_문자열_내림차순으로_배치하기 {
    fun solution(s: String): String = String(s.toCharArray().apply { sort() }).reversed()
}

fun main() {
    println(Day_06_문자열_내림차순으로_배치하기().solution("Zbcdefg"))
}
