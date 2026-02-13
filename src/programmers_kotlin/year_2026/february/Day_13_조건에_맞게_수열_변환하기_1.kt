package programmers_kotlin.year_2026.february

private class Day_13_조건에_맞게_수열_변환하기_1 {
    fun solution(arr: IntArray): IntArray {
        return arr.map { value ->
            when {
                value >= 50 && value % 2 == 0 -> value / 2
                value < 50 && value % 2 == 1 -> value * 2
                else -> value
            }
        }.toIntArray()
    }
}

fun main() {
    println(Day_13_조건에_맞게_수열_변환하기_1().solution(intArrayOf(1, 2, 3, 100, 99, 98)).toList())
}
