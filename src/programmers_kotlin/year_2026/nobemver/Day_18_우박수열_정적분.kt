package programmers_kotlin.year_2026.nobemver

private class Day_18_우박수열_정적분 {
    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        val sequence = mutableListOf(k)
        var current = k
        while (current > 1) {
            current = if (current % 2 == 0) current / 2 else current * 3 + 1
            sequence.add(current)
        }
        val n = sequence.size - 1

        val area = DoubleArray(n + 1)
        for (i in 1..n) {
            area[i] = area[i - 1] + (sequence[i - 1] + sequence[i]) / 2.0
        }

        return ranges.map { (a, b) ->
            val end = n + b
            if (a > end) -1.0 else area[end] - area[a]
        }.toDoubleArray()
    }
}

fun main() {
    println(
        Day_18_우박수열_정적분().solution(
            k = 5,
            ranges = arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, -1),
                intArrayOf(2, -3),
                intArrayOf(3, -3),
            )
        ).contentToString()
    )
}
