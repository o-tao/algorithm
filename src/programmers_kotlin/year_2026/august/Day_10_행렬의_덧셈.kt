package programmers_kotlin.year_2026.august

private class Day_10_행렬의_덧셈 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>) = Array(arr1.size) { i -> IntArray(arr1[i].size) { j -> arr1[i][j] + arr2[i][j] } }
}

fun main() {
    println(Day_10_행렬의_덧셈().solution(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)), arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))).contentDeepToString())
}
