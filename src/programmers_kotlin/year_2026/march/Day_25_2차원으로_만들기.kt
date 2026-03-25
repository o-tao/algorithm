package programmers_kotlin.year_2026.march

class Day_25_2차원으로_만들기 {
    fun solution(num_list: IntArray, n: Int) = num_list.toList().chunked(n)
}

fun main() {
    println(Day_25_2차원으로_만들기().solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 2).toList())
}
