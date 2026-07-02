package programmers_kotlin.year_2026.july

import kotlin.math.sqrt

class Day_02_정수_제곱근_판별 {
    fun solution(n: Long): Long {
        val answer = sqrt(n.toDouble()).toLong()

        return if (answer * answer == n) (answer + 1) * (answer + 1) else -1
    }
}

fun main() {
    println(Day_02_정수_제곱근_판별().solution(121))
}
