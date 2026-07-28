package programmers_kotlin.year_2026.july

private class Day_28_가운데_글자_가져오기 {
    fun solution(s: String) = s.run { substring((length - 1) / 2, length / 2 + 1) }
}

fun main() {
    println(Day_28_가운데_글자_가져오기().solution("abcde"))
}
