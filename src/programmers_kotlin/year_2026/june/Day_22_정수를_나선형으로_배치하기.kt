package programmers_kotlin.year_2026.june

private class Day_22_정수를_나선형으로_배치하기 {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) }

        var row = 0
        var col = 0
        var direction = 0

        val dr = intArrayOf(0, 1, 0, -1)
        val dc = intArrayOf(1, 0, -1, 0)

        for (num in 1..n * n) {
            answer[row][col] = num

            val nextRow = row + dr[direction]
            val nextCol = col + dc[direction]

            if (
                nextRow !in 0 until n ||
                nextCol !in 0 until n ||
                answer[nextRow][nextCol] != 0
            ) {
                direction = (direction + 1) % 4
            }

            row += dr[direction]
            col += dc[direction]
        }

        return answer
    }
}

fun main() {
    println(Day_22_정수를_나선형으로_배치하기().solution(4).contentDeepToString())
}
