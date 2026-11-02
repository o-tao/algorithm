package programmers_kotlin.year_2026.nobemver

import kotlin.math.abs

private class Day_02_전력망을_둘로_나누기 {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        val graph = Array(n + 1) { mutableListOf<Int>() }
        for ((a, b) in wires) {
            graph[a].add(b)
            graph[b].add(a)
        }

        var answer = n

        fun dfs(node: Int, parent: Int): Int {
            var size = 1
            for (next in graph[node]) {
                if (next != parent) size += dfs(next, node)
            }
            answer = minOf(answer, abs(n - 2 * size))
            return size
        }

        dfs(1, 0)
        return answer
    }
}

fun main() {
    println(
        Day_02_전력망을_둘로_나누기().solution(
            n = 9,
            wires = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(4, 6),
                intArrayOf(4, 7),
                intArrayOf(7, 8),
                intArrayOf(7, 9)
            )
        )
    )
}
