package programmers_kotlin.year_2025.november

private class Day_19_n_번째_원소부터 {
    fun solution(num_list: IntArray, n: Int) = num_list.sliceArray(n - 1 until num_list.size)
}

fun main() {
    println(Day_19_n_번째_원소부터().solution(intArrayOf(2, 1, 6), 3).toList())
}
