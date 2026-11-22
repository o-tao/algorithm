package programmers_kotlin.year_2026.nobemver

private class Day_22_지게차와_크레인 {
    fun solution(storage: Array<String>, requests: Array<String>): Int {
        val n = storage.size
        val m = storage[0].length
        val grid = Array(n + 2) { CharArray(m + 2) { '.' } }
        for (i in 0 until n) for (j in 0 until m) grid[i + 1][j + 1] = storage[i][j]

        val dx = intArrayOf(1, -1, 0, 0)
        val dy = intArrayOf(0, 0, 1, -1)
        val H = n + 2
        val W = m + 2

        for (req in requests) {
            val c = req[0]
            if (req.length == 2) {
                for (i in 0 until H) for (j in 0 until W)
                    if (grid[i][j] == c) grid[i][j] = '.'
            } else {
                val visited = Array(H) { BooleanArray(W) }
                val toRemove = mutableListOf<Int>()
                val queue = ArrayDeque<Int>()
                queue.add(0)
                visited[0][0] = true
                while (queue.isNotEmpty()) {
                    val cur = queue.removeFirst()
                    val x = cur / W
                    val y = cur % W
                    for (d in 0 until 4) {
                        val nx = x + dx[d]
                        val ny = y + dy[d]
                        if (nx !in 0 until H || ny !in 0 until W || visited[nx][ny]) continue
                        visited[nx][ny] = true
                        when (grid[nx][ny]) {
                            '.' -> queue.add(nx * W + ny)
                            c -> toRemove.add(nx * W + ny)
                        }
                    }
                }
                for (p in toRemove) grid[p / W][p % W] = '.'
            }
        }

        var count = 0
        for (i in 0 until H) for (j in 0 until W) if (grid[i][j] != '.') count++
        return count
    }
}

fun main() {
    println(
        Day_22_지게차와_크레인().solution(
            storage = arrayOf("AZWQY", "CAABX", "BBDDA", "ACACA"),
            requests = arrayOf("A", "BB", "A")
        )
    )
}
