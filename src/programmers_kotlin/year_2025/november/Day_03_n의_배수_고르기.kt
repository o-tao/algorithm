package programmers_kotlin.year_2025.november

private class Day_03_n의_배수_고르기 {
    fun solution(n: Int, numlist: IntArray) = numlist.filter { it % n == 0 }.toIntArray()
}

fun main() {
    println(Day_03_n의_배수_고르기().solution(3, intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12)).toList())
}
