package programmers_kotlin.year_2026.nobemver

import java.util.*

private class Day_13_무인도_여행 {
    fun solution(maps: Array<String>): IntArray {
        val n = maps.size
        val m = maps[0].length
        val visited = Array(n) { BooleanArray(m) }
        val dx = intArrayOf(-1, 1, 0, 0)
        val dy = intArrayOf(0, 0, -1, 1)
        val answer = mutableListOf<Int>()

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (maps[i][j] == 'X' || visited[i][j]) continue

                var sum = 0
                val queue = ArrayDeque<IntArray>()
                queue.add(intArrayOf(i, j))
                visited[i][j] = true

                while (queue.isNotEmpty()) {
                    val (x, y) = queue.poll()
                    sum += maps[x][y] - '0'

                    for (d in 0 until 4) {
                        val nx = x + dx[d]
                        val ny = y + dy[d]
                        if (nx !in 0 until n || ny !in 0 until m) continue
                        if (visited[nx][ny] || maps[nx][ny] == 'X') continue
                        visited[nx][ny] = true
                        queue.add(intArrayOf(nx, ny))
                    }
                }
                answer.add(sum)
            }
        }

        return if (answer.isEmpty()) intArrayOf(-1) else answer.sorted().toIntArray()
    }
}

fun main() {
    println(Day_13_무인도_여행().solution(arrayOf("X591X", "X1X5X", "X231X", "1XXX1")).contentToString())
}
