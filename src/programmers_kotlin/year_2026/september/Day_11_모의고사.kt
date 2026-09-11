package programmers_kotlin.year_2026.september

private class Day_11_모의고사 {
    fun solution(answers: IntArray): IntArray {
        val patterns = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )

        val scores = IntArray(3)
        for (i in answers.indices) {
            for (p in 0..2) {
                if (patterns[p][i % patterns[p].size] == answers[i]) {
                    scores[p]++
                }
            }
        }

        return (0..2).filter { scores[it] == scores.max() }.map { it + 1 }.toIntArray()
    }
}

fun main() {
    println(Day_11_모의고사().solution(intArrayOf(1, 2, 3, 4, 5)).toList())
}
