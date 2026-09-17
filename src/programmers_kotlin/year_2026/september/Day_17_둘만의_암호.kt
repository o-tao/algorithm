package programmers_kotlin.year_2026.september

private class Day_17_둘만의_암호 {
    fun solution(s: String, skip: String, index: Int): String {
        val alphabet = ('a'..'z').filter { it !in skip }
        return s.map { c -> alphabet[(alphabet.indexOf(c) + index) % alphabet.size] }.joinToString("")
    }
}

fun main() {
    println(
        Day_17_둘만의_암호().solution(
            s = "aukks",
            skip = "wbqd",
            index = 5
        )
    )
}
