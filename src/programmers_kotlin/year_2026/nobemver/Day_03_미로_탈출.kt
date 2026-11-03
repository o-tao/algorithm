package programmers_kotlin.year_2026.nobemver

import java.util.*

class Day_03_미로_탈출 {
    fun solution(maps: Array<String>): Int {
        val n = maps.size
        val m = maps[0].length
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)

        val dist = Array(2) { Array(n) { IntArray(m) { -1 } } }
        val queue = ArrayDeque<IntArray>()

        for (r in 0 until n) for (c in 0 until m) {
            if (maps[r][c] == 'S') {
                dist[0][r][c] = 0
                queue.add(intArrayOf(r, c, 0))
            }
        }

        while (queue.isNotEmpty()) {
            val (r, c, k) = queue.poll()
            if (k == 1 && maps[r][c] == 'E') return dist[k][r][c]

            for (d in 0 until 4) {
                val nr = r + dr[d]
                val nc = c + dc[d]
                if (nr !in 0 until n || nc !in 0 until m || maps[nr][nc] == 'X') continue
                val nk = if (maps[nr][nc] == 'L') 1 else k
                if (dist[nk][nr][nc] != -1) continue
                dist[nk][nr][nc] = dist[k][r][c] + 1
                queue.add(intArrayOf(nr, nc, nk))
            }
        }
        return -1
    }
}

fun main() {
    println(Day_03_미로_탈출().solution(arrayOf("SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE")))
}
