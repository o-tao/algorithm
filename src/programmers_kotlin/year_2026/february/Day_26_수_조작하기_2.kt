package programmers_kotlin.year_2026.february

private class Day_26_수_조작하기_2 {
    fun solution(numLog: IntArray): String {
        val result = StringBuilder()

        for (i in 1 until numLog.size) {
            val diff = numLog[i] - numLog[i - 1]

            when (diff) {
                1 -> result.append("w")
                -1 -> result.append("s")
                10 -> result.append("d")
                -10 -> result.append("a")
            }
        }

        return result.toString()
    }
}

fun main() {
    println(Day_26_수_조작하기_2().solution(intArrayOf(0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1)))
}
