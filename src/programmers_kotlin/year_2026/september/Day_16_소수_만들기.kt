package programmers_kotlin.year_2026.september

private class Day_16_소수_만들기 {
    fun solution(nums: IntArray): Int {
        val max = 3000
        val isPrime = BooleanArray(max + 1) { true }
        isPrime[0] = false
        isPrime[1] = false
        var p = 2
        while (p * p <= max) {
            if (isPrime[p]) {
                for (q in p * p..max step p) isPrime[q] = false
            }
            p++
        }

        var answer = 0
        for (i in 0 until nums.size - 2)
            for (j in i + 1 until nums.size - 1)
                for (l in j + 1 until nums.size)
                    if (isPrime[nums[i] + nums[j] + nums[l]]) answer++
        return answer
    }
}

fun main() {
    println(Day_16_소수_만들기().solution(intArrayOf(1, 2, 3, 4)))
}
