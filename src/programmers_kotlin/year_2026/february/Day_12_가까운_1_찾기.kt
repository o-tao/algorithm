package programmers_kotlin.year_2026.february

private class Day_12_가까운_1_찾기 {
    fun solution(arr: IntArray, idx: Int): Int {
        for (i in idx until arr.size) {
            if (arr[i] == 1) return i
        }
        return -1
    }
}

fun main() {
    println(Day_12_가까운_1_찾기().solution(intArrayOf(0, 0, 0, 1), 1))
}
