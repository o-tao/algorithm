package programmers_kotlin.year_2026.april

private class Day_15_수열과_구간_쿼리_4 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (query in queries) {
            val s = query[0]
            val e = query[1]
            val k = query[2]

            for (i in s..e) {
                if (k == 0) {
                    if (i == 0) arr[i]++
                } else {
                    if (i % k == 0) arr[i]++
                }
            }
        }
        return arr
    }
}

fun main() {
    println(Day_15_수열과_구간_쿼리_4().solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 1), intArrayOf(0, 3, 2), intArrayOf(0, 3, 3))).toList())
}
