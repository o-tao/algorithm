package programmers_kotlin.year_2025.october

import kotlin.math.ceil

private class Day_29_피자_나눠_먹기_3 {
    fun solution(slice: Int, n: Int) = ceil(n.toDouble() / slice).toInt()
}

fun main() {
    println(Day_29_피자_나눠_먹기_3().solution(7, 10))
}
