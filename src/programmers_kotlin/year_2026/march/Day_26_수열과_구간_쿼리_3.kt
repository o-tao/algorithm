package programmers_kotlin.year_2026.march

private class Day_26_수열과_구간_쿼리_3 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { (i, j) -> arr[i] = arr[j].also { arr[j] = arr[i] } }
        return arr
    }
}

fun main() {
    println(Day_26_수열과_구간_쿼리_3().solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 4))).contentToString())
}