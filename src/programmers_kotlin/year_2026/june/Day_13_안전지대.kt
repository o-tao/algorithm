package programmers_kotlin.year_2026.june

private class Day_13_안전지대 {
    fun solution(board: Array<IntArray>): Int {
        val n = board.size
        val danger = Array(n) { BooleanArray(n) }

        val dx = intArrayOf(-1, -1, -1, 0, 0, 0, 1, 1, 1)
        val dy = intArrayOf(-1, 0, 1, -1, 0, 1, -1, 0, 1)

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (board[i][j] == 1) {
                    for (k in 0 until 9) {
                        val nx = i + dx[k]
                        val ny = j + dy[k]

                        if (nx in 0 until n && ny in 0 until n) {
                            danger[nx][ny] = true
                        }
                    }
                }
            }
        }

        var answer = 0

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (!danger[i][j]) {
                    answer++
                }
            }
        }

        return answer
    }
}

fun main() {
    println(Day_13_안전지대().solution(arrayOf(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 0, 0), intArrayOf(0, 0, 0, 0, 0))))
}
