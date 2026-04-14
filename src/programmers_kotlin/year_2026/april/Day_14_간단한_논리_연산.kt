package programmers_kotlin.year_2026.april

private class Day_14_간단한_논리_연산 {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean) = (x1 || x2) && (x3 || x4)
}

fun main() {
    println(Day_14_간단한_논리_연산().solution(x1 = false, x2 = true, x3 = true, x4 = true))
}
