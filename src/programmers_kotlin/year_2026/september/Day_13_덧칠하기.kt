package programmers_kotlin.year_2026.september

private class Day_13_덧칠하기 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        var painted = 0

        for (s in section) {
            if (s > painted) {
                answer++
                painted = s + m - 1
            }
        }

        return answer
    }
}

fun main() {
    println(
        Day_13_덧칠하기().solution(
            n = 8,
            m = 4,
            section = intArrayOf(2, 3, 6)
        )
    )
}
