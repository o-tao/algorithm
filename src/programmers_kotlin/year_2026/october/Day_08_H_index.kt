package programmers_kotlin.year_2026.october

private class Day_08_H_index {
    fun solution(citations: IntArray): Int {
        val sorted = citations.sortedDescending()
        var answer = 0
        for (i in sorted.indices) {
            if (sorted[i] >= i + 1) answer = i + 1
            else break
        }
        return answer
    }
}

fun main() {
    println(Day_08_H_index().solution(intArrayOf(3, 0, 6, 1, 5)))
}
