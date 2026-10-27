package programmers_kotlin.year_2026.october

private class Day_27_쿼드압축_후_개수_세기 {
    fun solution(arr: Array<IntArray>): IntArray {
        val answer: IntArray = intArrayOf(0, 0)

        fun isUniform(x: Int, y: Int, size: Int): Boolean {
            val v = arr[x][y]
            for (i in x until x + size) {
                for (j in y until y + size) {
                    if (arr[i][j] != v) return false
                }
            }
            return true
        }

        fun compress(x: Int, y: Int, size: Int) {
            if (isUniform(x, y, size)) {
                answer[arr[x][y]]++
                return
            }
            val half = size / 2
            compress(x, y, half)
            compress(x, y + half, half)
            compress(x + half, y, half)
            compress(x + half, y + half, half)
        }

        compress(0, 0, arr.size)
        return answer
    }
}

fun main() {
    println(
        Day_27_쿼드압축_후_개수_세기().solution(
            arrayOf(
                intArrayOf(1, 1, 0, 0),
                intArrayOf(1, 0, 0, 0),
                intArrayOf(1, 0, 0, 1),
                intArrayOf(1, 1, 1, 1)
            )
        ).contentToString()
    )
}
