package programmers_kotlin.year_2025.december

private class Day_04_이어_붙인_수 {
    fun solution(num_list: IntArray) =
        num_list.filter { it % 2 == 1 }.joinToString("").toInt() + num_list.filter { it % 2 == 0 }.joinToString("").toInt()
}

fun main() {
    println(Day_04_이어_붙인_수().solution(intArrayOf(3, 4, 5, 2, 1)))
}
