package programmers_kotlin.year_2026.may

private class Day_25_등수_매기기 {
    fun solution(score: Array<IntArray>): IntArray {
        val sums = score.map { it[0] + it[1] }
        return IntArray(sums.size) { i -> sums.count { it > sums[i] } + 1 }
    }
}

fun main() {
    println(Day_25_등수_매기기().solution(arrayOf(intArrayOf(80, 70), intArrayOf(90, 50), intArrayOf(40, 70), intArrayOf(50, 80))).contentToString())
}
