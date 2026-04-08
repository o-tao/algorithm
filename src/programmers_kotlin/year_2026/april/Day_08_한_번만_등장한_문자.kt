package programmers_kotlin.year_2026.april

private class Day_08_한_번만_등장한_문자 {
    fun solution(s: String) = s.groupingBy { it }.eachCount().filter { it.value == 1 }.keys.sorted().joinToString("")
}

fun main() {
    println(Day_08_한_번만_등장한_문자().solution("abcabcadc"))
}
