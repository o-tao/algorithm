package programmers_kotlin.year_2026.april

private class Day_13_리스트_자르기 {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a, b, c) = slicer

        return when (n) {
            1 -> num_list.sliceArray(0..b)
            2 -> num_list.sliceArray(a until num_list.size)
            3 -> num_list.sliceArray(a..b)
            4 -> (a..b step c).map { num_list[it] }.toIntArray()
            else -> intArrayOf()
        }
    }
}

fun main() {
    println(Day_13_리스트_자르기().solution(3, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString())
}
