package programmers_kotlin.year_2026.february

private class Day_17_순서_바꾸기 {
    fun solution(num_list: IntArray, n: Int) = (num_list.drop(n) + num_list.take(n)).toIntArray()
}

fun main() {
    println(Day_17_순서_바꾸기().solution(intArrayOf(2, 1, 6), 1).toList())
}
