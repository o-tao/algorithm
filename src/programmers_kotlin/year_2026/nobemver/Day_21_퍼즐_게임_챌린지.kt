package programmers_kotlin.year_2026.nobemver

private class Day_21_퍼즐_게임_챌린지 {
    fun solution(diffs: IntArray, times: IntArray, limit: Long): Int {
        fun canSolve(level: Int): Boolean {
            var total = 0L
            for (i in diffs.indices) {
                if (diffs[i] <= level) {
                    total += times[i]
                } else {
                    val wrong = (diffs[i] - level).toLong()
                    total += wrong * (times[i] + times[i - 1]) + times[i]
                }
                if (total > limit) return false
            }
            return true
        }

        var lo = 1
        var hi = diffs.max()
        while (lo < hi) {
            val mid = (lo + hi) / 2
            if (canSolve(mid)) hi = mid else lo = mid + 1
        }
        return lo
    }
}

fun main() {
    println(
        Day_21_퍼즐_게임_챌린지().solution(
            diffs = intArrayOf(1, 5, 3),
            times = intArrayOf(2, 4, 7),
            limit = 30
        )
    )
}
