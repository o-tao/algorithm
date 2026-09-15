package programmers_kotlin.year_2026.september

private class Day_15_과일_장수 {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val sorted = score.sortedDescending()
        var answer = 0
        for (i in m - 1 until sorted.size step m) {
            answer += sorted[i] * m
        }
        return answer
    }
}

fun main() {
    println(
        Day_15_과일_장수().solution(
            k = 3,
            m = 4,
            score = intArrayOf(1, 2, 3, 1, 2, 3, 1)
        )
    )
}
