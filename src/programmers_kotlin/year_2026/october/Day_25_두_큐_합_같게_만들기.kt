package programmers_kotlin.year_2026.october

private class Day_25_두_큐_합_같게_만들기 {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val n = queue1.size
        val arr = queue1 + queue2
        val size = 2 * n

        var sum1 = queue1.sumOf { it.toLong() }
        val total = sum1 + queue2.sumOf { it.toLong() }
        if (total % 2L != 0L) return -1
        val target = total / 2

        var left = 0
        var right = n
        var count = 0
        val limit = size * 2

        while (count <= limit) {
            when {
                sum1 == target -> return count
                sum1 > target -> {
                    sum1 -= arr[left % size]
                    left++
                }

                else -> {
                    sum1 += arr[right % size]
                    right++
                }
            }
            count++
        }
        return -1
    }
}

fun main() {
    println(
        Day_25_두_큐_합_같게_만들기().solution(
            queue1 = intArrayOf(3, 2, 7, 2),
            queue2 = intArrayOf(4, 6, 5, 1),
        )
    )
}
