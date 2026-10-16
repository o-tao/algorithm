package programmers_kotlin.year_2026.october

private class Day_16_모음사전 {
    fun solution(word: String): Int {
        val vowels = "AEIOU"
        val weights = intArrayOf(781, 156, 31, 6, 1)
        var answer = 0
        for (i in word.indices) {
            answer += vowels.indexOf(word[i]) * weights[i] + 1
        }
        return answer
    }
}

fun main() {
    println(Day_16_모음사전().solution("AAAAE"))
}
