package programmers_kotlin.year_2026.february

private class Day_05_홀수_vs_짝수 {
    fun solution(num_list: IntArray) = maxOf(num_list.filterIndexed { i, _ -> i % 2 == 0 }.sum(), num_list.filterIndexed { i, _ -> i % 2 == 1 }.sum())
}

fun main() {
    println(Day_05_홀수_vs_짝수().solution(intArrayOf(4, 2, 6, 1, 7, 6)))
}
