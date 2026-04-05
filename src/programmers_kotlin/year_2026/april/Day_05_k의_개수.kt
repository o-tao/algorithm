package programmers_kotlin.year_2026.april

private class Day_05_k의_개수 {
    fun solution(i: Int, j: Int, k: Int) = (i..j).joinToString("").count { it == k.digitToChar() }
}

fun main() {
    println(Day_05_k의_개수().solution(1, 13, 1))
}
