package programmers_kotlin.year_2026.june

private class Day_07_최빈값_구하기 {
    fun solution(array: IntArray): Int {
        val countMap = mutableMapOf<Int, Int>()

        for (num in array) {
            countMap[num] = countMap.getOrDefault(num, 0) + 1
        }

        val maxCount = countMap.values.maxOrNull()!!

        return if (countMap.values.count { it == maxCount } > 1) {
            -1
        } else {
            countMap.entries.first { it.value == maxCount }.key
        }
    }
}

fun main() {
    println(Day_07_최빈값_구하기().solution(intArrayOf(1, 2, 3, 3, 3, 4)))
}
