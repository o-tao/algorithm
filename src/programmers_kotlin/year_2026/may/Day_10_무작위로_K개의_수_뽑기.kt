package programmers_kotlin.year_2026.may

private class Day_10_무작위로_K개의_수_뽑기 {
    fun solution(arr: IntArray, k: Int): IntArray {
        val list = mutableListOf<Int>()
        val set = mutableSetOf<Int>()

        for (num in arr) {
            if (num !in set) {
                set.add(num)
                list.add(num)
            }

            if (list.size == k) break
        }

        while (list.size < k) {
            list.add(-1)
        }

        return list.toIntArray()
    }
}

fun main() {
    println(Day_10_무작위로_K개의_수_뽑기().solution(intArrayOf(0, 1, 1, 2, 2, 3), 3).contentToString())
}
