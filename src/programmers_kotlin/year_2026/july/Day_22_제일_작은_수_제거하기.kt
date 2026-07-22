package programmers_kotlin.year_2026.july

private class Day_22_제일_작은_수_제거하기 {
    fun solution(arr: IntArray): IntArray {
        val answer = arr.filter { it != arr.min() }.toIntArray()
        return if (answer.isEmpty()) intArrayOf(-1) else answer
    }
}

fun main() {
    println(Day_22_제일_작은_수_제거하기().solution(intArrayOf(4, 3, 2, 1)).contentToString())
}
