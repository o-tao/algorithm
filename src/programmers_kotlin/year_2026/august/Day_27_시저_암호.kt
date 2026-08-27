package programmers_kotlin.year_2026.august

private class Day_27_시저_암호 {
    fun solution(s: String, n: Int): String = s.map { c ->
        when (c) {
            in 'a'..'z' -> 'a' + (c - 'a' + n) % 26
            in 'A'..'Z' -> 'A' + (c - 'A' + n) % 26
            else -> c
        }
    }.joinToString("")
}

fun main() {
    println(Day_27_시저_암호().solution("AB", 1))
}
