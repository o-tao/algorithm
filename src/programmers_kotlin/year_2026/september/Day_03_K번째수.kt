package programmers_kotlin.year_2026.september

private class Day_03_K번째수 {
    fun solution(array: IntArray, commands: Array<IntArray>) = commands.map { (i, j, k) -> array.copyOfRange(i - 1, j).sorted()[k - 1] }.toIntArray()
}

fun main() {
    println(Day_03_K번째수().solution(intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))).contentToString())
}
