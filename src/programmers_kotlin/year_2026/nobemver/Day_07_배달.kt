package programmers_kotlin.year_2026.nobemver

import java.util.*

private class Day_07_배달 {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val graph = Array(N + 1) { mutableListOf<Pair<Int, Int>>() }
        for ((a, b, c) in road) {
            graph[a].add(b to c)
            graph[b].add(a to c)
        }

        val dist = IntArray(N + 1) { Int.MAX_VALUE }
        dist[1] = 0

        val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })
        pq.add(0 to 1)

        while (pq.isNotEmpty()) {
            val (d, cur) = pq.poll()
            if (d > dist[cur]) continue

            for ((next, cost) in graph[cur]) {
                val nd = d + cost
                if (nd < dist[next]) {
                    dist[next] = nd
                    pq.add(nd to next)
                }
            }
        }

        return (1..N).count { dist[it] <= k }
    }
}

fun main() {
    println(
        Day_07_배달().solution(
            N = 5,
            road = arrayOf(
                intArrayOf(1, 2, 1),
                intArrayOf(2, 3, 3),
                intArrayOf(5, 2, 2),
                intArrayOf(1, 4, 2),
                intArrayOf(5, 3, 1),
                intArrayOf(5, 4, 2)
            ),
            k = 3
        )
    )
}
