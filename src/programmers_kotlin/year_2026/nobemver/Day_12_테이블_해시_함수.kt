package programmers_kotlin.year_2026.nobemver

private class Day_12_테이블_해시_함수 {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        val sorted = data.sortedWith(
            compareBy<IntArray> { it[col - 1] }
                .thenByDescending { it[0] }
        )

        var answer = 0
        for (i in row_begin..row_end) {
            val s = sorted[i - 1].sumOf { it % i }
            answer = answer xor s
        }
        return answer
    }
}

fun main() {
    println(
        Day_12_테이블_해시_함수().solution(
            data = arrayOf(intArrayOf(2, 2, 6), intArrayOf(1, 5, 10), intArrayOf(4, 2, 9), intArrayOf(3, 8, 3)),
            col = 2,
            row_begin = 2,
            row_end = 3
        )
    )
}
