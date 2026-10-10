package programmers_kotlin.year_2026.october

private class Day_10_행렬의_곱셈 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val n = arr1.size
        val m = arr2[0].size
        val k = arr2.size

        return Array(n) { i ->
            IntArray(m) { j ->
                var sum = 0
                for (t in 0 until k) {
                    sum += arr1[i][t] * arr2[t][j]
                }
                sum
            }
        }
    }
}

fun main() {
    println(
        Day_10_행렬의_곱셈().solution(
            arr1 = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(3, 2),
                intArrayOf(4, 1)
            ),
            arr2 = arrayOf(
                intArrayOf(3, 3),
                intArrayOf(3, 3)
            )
        ).contentDeepToString()
    )
}
