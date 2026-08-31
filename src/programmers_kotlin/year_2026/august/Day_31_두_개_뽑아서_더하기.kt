package programmers_kotlin.year_2026.august

private class Day_31_두_개_뽑아서_더하기 {
    fun solution(numbers: IntArray) =
        numbers.indices
            .flatMap { i -> (i + 1 until numbers.size).map { j -> numbers[i] + numbers[j] } }
            .distinct()
            .sorted()
            .toIntArray()
}

fun main() {
    println(Day_31_두_개_뽑아서_더하기().solution(intArrayOf(2, 1, 3, 4, 1)).contentToString())
}
