package programmers_kotlin.year_2025.november

private class Day_28_첫_번째로_나오는_음수 {
    fun solution(num_list: IntArray) = num_list.indexOfFirst { it < 0 }
}

fun main() {
    println(Day_28_첫_번째로_나오는_음수().solution(intArrayOf(12, 4, 15, 46, 38, -2, 15)))
}
