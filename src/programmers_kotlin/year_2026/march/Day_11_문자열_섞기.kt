package programmers_kotlin.year_2026.march

private class Day_11_문자열_섞기 {
    fun solution(str1: String, str2: String) = str1.indices.joinToString("") { "${str1[it]}${str2[it]}" }
}

fun main() {
    println(Day_11_문자열_섞기().solution("aaaa", "bbbb"))
}
