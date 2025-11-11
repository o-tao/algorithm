package programmers_kotlin.year_2025.november

private class Day_11_짝수_홀수_개수 {
    fun solution(num_list: IntArray) = intArrayOf(num_list.count { it % 2 == 0 }, num_list.count { it % 2 != 0 })
}

fun main() {
    println(Day_11_짝수_홀수_개수().solution(intArrayOf(1, 2, 3, 4, 5)).toList())
}
