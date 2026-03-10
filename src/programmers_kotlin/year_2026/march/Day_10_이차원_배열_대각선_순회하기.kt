package programmers_kotlin.year_2026.march

private class Day_10_이차원_배열_대각선_순회하기 {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer = 0
        for (i in board.indices) {
            for (j in 0..minOf(board[i].lastIndex, k - i)) {
                answer += board[i][j]
            }
        }
        return answer
    }
}

fun main() {
    println(Day_10_이차원_배열_대각선_순회하기().solution(arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 3), intArrayOf(2, 3, 4), intArrayOf(3, 4, 5)), 2))
}
