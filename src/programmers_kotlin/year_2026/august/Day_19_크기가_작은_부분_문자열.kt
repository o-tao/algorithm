package programmers_kotlin.year_2026.august

class Day_19_크기가_작은_부분_문자열 {
    fun solution(t: String, p: String) = t.windowed(p.length).count { it.toLong() <= p.toLong() }
}

fun main() {
    println(Day_19_크기가_작은_부분_문자열().solution("3141592", "271"))
}
