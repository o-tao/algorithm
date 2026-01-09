package programmers_kotlin.year_2026.january

private class Day_09_뒤에서_5등_위로 {
    fun solution(num_list: IntArray) = num_list.sorted().drop(5).toIntArray()
}

fun main() {
    println(Day_09_뒤에서_5등_위로().solution(intArrayOf(12, 4, 15, 46, 38, 1, 14, 56, 32, 10)).toList())
}
