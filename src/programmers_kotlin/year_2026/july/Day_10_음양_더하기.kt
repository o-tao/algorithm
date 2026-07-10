package programmers_kotlin.year_2026.july

private class Day_10_음양_더하기 {
    fun solution(absolutes: IntArray, signs: BooleanArray) = absolutes.indices.sumOf { if (signs[it]) absolutes[it] else -absolutes[it] }
}

fun main() {
    println(
        Day_10_음양_더하기().solution(
            absolutes = intArrayOf(4, 7, 12),
            signs = booleanArrayOf(true, false, true),
        )
    )
}
