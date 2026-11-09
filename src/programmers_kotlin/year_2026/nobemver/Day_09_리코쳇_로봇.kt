package programmers_kotlin.year_2026.nobemver

private class Day_09_리코쳇_로봇 {
    fun solution(board: Array<String>): Int {
        val n = board.size
        val w = board[0].length
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)

        val dist = Array(n) { IntArray(w) { -1 } }
        val queue = ArrayDeque<IntArray>()

        for (r in 0 until n) for (c in 0 until w) {
            if (board[r][c] == 'R') {
                dist[r][c] = 0
                queue.addLast(intArrayOf(r, c))
            }
        }

        while (queue.isNotEmpty()) {
            val (r, c) = queue.removeFirst()
            if (board[r][c] == 'G') return dist[r][c]

            for (d in 0 until 4) {
                var nr = r
                var nc = c
                while (true) {
                    val tr = nr + dr[d]
                    val tc = nc + dc[d]
                    if (tr !in 0 until n || tc !in 0 until w || board[tr][tc] == 'D') break
                    nr = tr
                    nc = tc
                }
                if (dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1
                    queue.addLast(intArrayOf(nr, nc))
                }
            }
        }
        return -1
    }
}

fun main() {
    println(Day_09_리코쳇_로봇().solution(arrayOf("...D..R", ".D.G...", "....D.D", "D....D.", "..D....")))
}
