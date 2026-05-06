package programmers_kotlin.year_2026.may

private class Day_06_수열과_구간_쿼리_2 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        return queries.map { (s, e, k) ->
            arr.slice(s..e)
                .filter { it > k }
                .minOrNull() ?: -1
        }.toIntArray()
    }
}

fun main() {
    println(Day_06_수열과_구간_쿼리_2().solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 2), intArrayOf(0, 3, 2), intArrayOf(0, 2, 2))).contentToString())
}
