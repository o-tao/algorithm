package programmers_kotlin.year_2026.nobemver

import java.util.*

private class Day_10_디펜스_게임 {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        val heap = PriorityQueue<Int>()
        var soldiers = n.toLong()

        for (i in enemy.indices) {
            heap.add(enemy[i])
            if (heap.size > k) {
                soldiers -= heap.poll()
                if (soldiers < 0) return i
            }
        }
        return enemy.size
    }
}

fun main() {
    println(
        Day_10_디펜스_게임().solution(
            n = 7,
            k = 3,
            enemy = intArrayOf(4, 2, 4, 5, 3, 3, 1)
        )
    )
}
