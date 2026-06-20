package programmers_kotlin.year_2026.june

private class Day_20_겹치는_선분의_길이 {
    fun solution(lines: Array<IntArray>): Int {
        val answer = IntArray(201)
        lines.forEach { (start, end) -> (start until end).forEach { answer[it + 100]++ } }
        return answer.count { it >= 2 }
    }
}

fun main() {
    println(Day_20_겹치는_선분의_길이().solution(arrayOf(intArrayOf(0, 1), intArrayOf(2, 5), intArrayOf(3, 9))))
}
