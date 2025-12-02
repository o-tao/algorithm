package programmers_kotlin.year_2025.december

private class Day_02_n_번째_원소까지 {
    fun solution(num_list: IntArray, n: Int) = num_list.sliceArray(0 until n)
}

fun main() {
    println(Day_02_n_번째_원소까지().solution(intArrayOf(2, 1, 6), 1).toList())
}
