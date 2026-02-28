package programmers_kotlin.year_2026.february

private class Day_28_특별한_이차원_배열_2 {
    fun solution(arr: Array<IntArray>): Int {
        for (i in 0 until arr.size) {
            for (j in i + 1 until arr.size) {
                if (arr[i][j] != arr[j][i]) return 0
            }
        }
        return 1
    }
}

fun main() {
    println(Day_28_특별한_이차원_배열_2().solution(arrayOf(intArrayOf(5, 192, 33), intArrayOf(192, 72, 95), intArrayOf(33, 95, 999))))
}
