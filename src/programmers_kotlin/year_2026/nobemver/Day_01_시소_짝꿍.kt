package programmers_kotlin.year_2026.nobemver

private class Day_01_시소_짝꿍 {
    fun solution(weights: IntArray): Long {
        val cnt = LongArray(1001)
        var answer = 0L

        for (w in weights.sorted()) {
            answer += cnt[w]
            if (w * 2 % 3 == 0) answer += cnt[w * 2 / 3]
            if (w % 2 == 0) answer += cnt[w / 2]
            if (w * 3 % 4 == 0) answer += cnt[w * 3 / 4]

            cnt[w]++
        }
        return answer
    }
}

fun main() {
    println(Day_01_시소_짝꿍().solution(intArrayOf(100, 180, 360, 100, 270)))
}
