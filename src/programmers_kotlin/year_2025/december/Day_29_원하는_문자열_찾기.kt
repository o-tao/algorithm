package programmers_kotlin.year_2025.december

private class Day_29_원하는_문자열_찾기 {
    fun solution(myString: String, pat: String) = if (myString.lowercase().contains(pat.lowercase())) 1 else 0
}

fun main() {
    println(Day_29_원하는_문자열_찾기().solution("AbCdEfG", "aBc"))
}
