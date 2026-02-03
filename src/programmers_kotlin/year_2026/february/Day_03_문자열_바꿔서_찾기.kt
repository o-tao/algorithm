package programmers_kotlin.year_2026.february

private class Day_03_문자열_바꿔서_찾기 {
    fun solution(myString: String, pat: String) = if (myString.map { if (it == 'A') 'B' else 'A' }.joinToString("").contains(pat)) 1 else 0
}

fun main() {
    println(Day_03_문자열_바꿔서_찾기().solution("ABBAA", "AABB"))
}
