package programmers_kotlin.year_2026.january

private class Day_05_정수_찾기 {
    fun solution(num_list: IntArray, n: Int) = if (num_list.contains(n)) 1 else 0
}

fun main() {
    println(Day_05_정수_찾기().solution(intArrayOf(1, 2, 3, 4, 5), 3))
}
