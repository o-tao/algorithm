package programmers_kotlin.year_2026.march

private class Day_12_등차수열의_특정한_항만_더하기 {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer = 0
        for (i in included.indices) {
            if (included[i]) answer += a + (i * d)
        }
        return answer
    }
}

fun main() {
    println(Day_12_등차수열의_특정한_항만_더하기().solution(3, 4, booleanArrayOf(true, false, false, true, true)))
}
