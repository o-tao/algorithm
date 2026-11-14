package programmers_kotlin.year_2026.nobemver

import kotlin.math.min

private class Day_14_행렬_테두리_회전하기 {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        val matrix = Array(rows) { r ->
            IntArray(columns) { c -> r * columns + c + 1 }
        }

        val answer = IntArray(queries.size)

        for (i in queries.indices) {
            val x1 = queries[i][0] - 1
            val y1 = queries[i][1] - 1
            val x2 = queries[i][2] - 1
            val y2 = queries[i][3] - 1

            val temp = matrix[x1][y1]
            var minVal = temp

            for (r in x1 until x2) {
                matrix[r][y1] = matrix[r + 1][y1]
                minVal = min(minVal, matrix[r][y1])
            }

            for (c in y1 until y2) {
                matrix[x2][c] = matrix[x2][c + 1]
                minVal = min(minVal, matrix[x2][c])
            }

            for (r in x2 downTo x1 + 1) {
                matrix[r][y2] = matrix[r - 1][y2]
                minVal = min(minVal, matrix[r][y2])
            }

            for (c in y2 downTo y1 + 1) {
                matrix[x1][c] = matrix[x1][c - 1]
                minVal = min(minVal, matrix[x1][c])
            }

            matrix[x1][y1 + 1] = temp

            answer[i] = minVal
        }

        return answer
    }
}

fun main() {
    println(
        Day_14_행렬_테두리_회전하기().solution(
            rows = 6,
            columns = 6,
            queries = arrayOf(
                intArrayOf(2, 2, 5, 4),
                intArrayOf(3, 3, 6, 6),
                intArrayOf(5, 1, 6, 3)
            )
        ).contentToString()
    )
}
