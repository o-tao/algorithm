package programmers_kotlin.year_2025.december

private class Day_06_중복된_숫자_개수 {
    fun solution(array: IntArray, n: Int) = array.count { it == n }
}

fun main() {
    println(Day_06_중복된_숫자_개수().solution(intArrayOf(1, 1, 2, 3, 4, 5), 1))
}
