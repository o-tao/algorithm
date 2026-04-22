package programmers_kotlin.year_2026.april

private class Day_22_조건에_맞게_수열_변환하기_2 {
    fun solution(arr: IntArray): Int {
        var current = arr.copyOf()
        var count = 0

        while (true) {
            val next = IntArray(current.size)

            for (i in current.indices) {
                val value = current[i]

                next[i] = when {
                    value >= 50 && value % 2 == 0 -> value / 2
                    value < 50 && value % 2 == 1 -> value * 2 + 1
                    else -> value
                }
            }

            if (current.contentEquals(next)) {
                return count
            }

            current = next
            count++
        }
    }
}

fun main() {
    println(Day_22_조건에_맞게_수열_변환하기_2().solution(intArrayOf(1, 2, 3, 100, 99, 98)))
}
