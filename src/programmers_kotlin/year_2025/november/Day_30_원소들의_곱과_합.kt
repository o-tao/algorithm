package programmers_kotlin.year_2025.november

private class Day_30_원소들의_곱과_합 {
    fun solution(num_list: IntArray): Int {
        val sum = num_list.sum()
        val product = num_list.fold(1) { acc, n -> acc * n }
        return if (product < sum * sum) 1 else 0
    }
}

fun main() {
    println(Day_30_원소들의_곱과_합().solution(intArrayOf(3, 4, 5, 2, 1)))
}
