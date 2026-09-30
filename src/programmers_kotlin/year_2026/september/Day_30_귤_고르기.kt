package programmers_kotlin.year_2026.september

class Day_30_귤_고르기 {
    fun solution(k: Int, tangerine: IntArray) =
        tangerine.asIterable()
            .groupingBy { it }
            .eachCount()
            .values
            .sortedDescending()
            .runningReduce(Int::plus)
            .indexOfFirst { it >= k } + 1
}

fun main() {
    println(Day_30_귤_고르기().solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)))
}
