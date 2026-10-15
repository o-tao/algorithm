package programmers_kotlin.year_2026.october

private class Day_15_타겟_넘버 {
    fun solution(numbers: IntArray, target: Int): Int =
        numbers.fold(listOf(0)) { sums, n ->
            sums.flatMap { listOf(it + n, it - n) }
        }.count { it == target }
}

fun main() {
    println(
        Day_15_타겟_넘버().solution(
            numbers = intArrayOf(1, 1, 1, 1, 1),
            target = 3
        )
    )
}
