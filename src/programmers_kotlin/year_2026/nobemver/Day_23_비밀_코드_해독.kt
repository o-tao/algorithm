package programmers_kotlin.year_2026.nobemver

private class Day_23_비밀_코드_해독 {
    fun solution(n: Int, q: Array<IntArray>, ans: IntArray): Int {
        val masks = IntArray(q.size) { i ->
            q[i].fold(0) { acc, x -> acc or (1 shl x) }
        }

        var count = 0

        fun dfs(start: Int, depth: Int, code: Int) {
            if (depth == 5) {
                for (i in masks.indices) {
                    if (Integer.bitCount(code and masks[i]) != ans[i]) return
                }
                count++
                return
            }
            for (x in start..n - (4 - depth)) {
                dfs(x + 1, depth + 1, code or (1 shl x))
            }
        }

        dfs(1, 0, 0)
        return count
    }
}

fun main() {
    println(
        Day_23_비밀_코드_해독().solution(
            n = 10,
            q = arrayOf(
                intArrayOf(1, 2, 3, 4, 5),
                intArrayOf(6, 7, 8, 9, 10),
                intArrayOf(3, 7, 8, 9, 10),
                intArrayOf(2, 5, 7, 9, 10),
                intArrayOf(3, 4, 5, 6, 7),
            ),
            ans = intArrayOf(2, 3, 4, 3, 3)
        )
    )
}
