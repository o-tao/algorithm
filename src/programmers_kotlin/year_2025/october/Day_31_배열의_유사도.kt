package programmers_kotlin.year_2025.october

private class Day_31_배열의_유사도 {
    fun solution(s1: Array<String>, s2: Array<String>) = s1.intersect(s2.toSet()).size
}

fun main() {
    println(Day_31_배열의_유사도().solution(arrayOf("a", "b", "c"), arrayOf("com", "b", "d", "p", "c")))
}
