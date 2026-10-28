package programmers_kotlin.year_2026.october

private class Day_28_연속된_부분_수열의_합 {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var left = 0
        var sum = 0L
        var bestStart = 0
        var bestEnd = Int.MAX_VALUE / 2

        for (right in sequence.indices) {
            sum += sequence[right]

            while (sum > k) {
                sum -= sequence[left]
                left++
            }

            if (sum == k.toLong() && right - left < bestEnd - bestStart) {
                bestStart = left
                bestEnd = right
            }
        }

        return intArrayOf(bestStart, bestEnd)
    }
}

fun main() {
    println(Day_28_연속된_부분_수열의_합().solution(intArrayOf(1, 2, 3, 4, 5), 7).contentToString())
}
