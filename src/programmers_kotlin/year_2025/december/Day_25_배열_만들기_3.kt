package programmers_kotlin.year_2025.december

private class Day_25_배열_만들기_3 {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val (a1, b1) = intervals[0]
        val (a2, b2) = intervals[1]

        return arr.sliceArray(a1..b1) + arr.sliceArray(a2..b2)
    }
}

fun main() {
    println(Day_25_배열_만들기_3().solution(intArrayOf(1, 2, 3, 4, 5), arrayOf(intArrayOf(1, 3), intArrayOf(0, 4))).toList())
}
