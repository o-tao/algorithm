package programmers_kotlin.year_2026.may

private class Day_12_정사각형으로_만들기 {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val rows = arr.size
        val cols = arr[0].size
        val size = maxOf(rows, cols)

        return Array(size) { r -> IntArray(size) { c -> if (r < rows && c < cols) arr[r][c] else 0 } }
    }
}

fun main() {
    println(Day_12_정사각형으로_만들기().solution(arrayOf(intArrayOf(572, 22, 37), intArrayOf(287, 726, 384), intArrayOf(85, 137, 292), intArrayOf(487, 13, 876))).contentDeepToString())
}
