package programmers_kotlin.year_2026.september

import java.util.*

private class Day_06_명예의_전당_1 {
    fun solution(k: Int, score: IntArray): IntArray {
        val heap = PriorityQueue<Int>()
        return score.map { s ->
            heap.offer(s)
            if (heap.size > k) heap.poll()
            heap.peek()
        }.toIntArray()
    }
}

fun main() {
    println(Day_06_명예의_전당_1().solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).contentToString())
}
