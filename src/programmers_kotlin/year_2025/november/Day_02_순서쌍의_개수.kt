package programmers_kotlin.year_2025.november

import kotlin.math.sqrt

private class Day_02_순서쌍의_개수 {
    fun solution(n: Int): Int {
        var answer = 0
        val sqrt = sqrt(n.toDouble()).toInt()

        for (i in 1..sqrt) {
            if (n % i == 0) {
                answer += if (i * i == n) 1 else 2
            }
        }

        return answer
    }
}

fun main() {
    println(Day_02_순서쌍의_개수().solution(20))
}
