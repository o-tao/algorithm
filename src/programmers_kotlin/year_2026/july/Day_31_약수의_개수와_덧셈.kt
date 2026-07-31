package programmers_kotlin.year_2026.july

import kotlin.math.sqrt

private class Day_31_약수의_개수와_덧셈 {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        for (n in left..right) {
            val root = sqrt(n.toDouble()).toInt()
            answer += if (root * root == n) -n else n
        }
        return answer
    }
}

fun main() {
    println(Day_31_약수의_개수와_덧셈().solution(13, 17))
}
