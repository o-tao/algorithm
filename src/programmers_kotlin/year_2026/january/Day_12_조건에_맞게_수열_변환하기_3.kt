package programmers_kotlin.year_2026.january

class Day_12_조건에_맞게_수열_변환하기_3 {
    fun solution(arr: IntArray, k: Int) = arr.map { if (k % 2 == 0) it + k else it * k }.toIntArray()
}

fun main() {
    println(Day_12_조건에_맞게_수열_변환하기_3().solution(intArrayOf(1, 2, 3, 100, 99, 98), 3).toList())
}
