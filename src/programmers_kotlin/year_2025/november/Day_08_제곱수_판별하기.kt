package programmers_kotlin.year_2025.november

import kotlin.math.sqrt

private class Day_08_제곱수_판별하기 {
    fun solution(n: Int) = if (sqrt(n.toDouble()) % 1 == 0.0) 1 else 2
}

fun main() {
    println(Day_08_제곱수_판별하기().solution(144))
}
