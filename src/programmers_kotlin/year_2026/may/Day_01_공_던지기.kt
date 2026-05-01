package programmers_kotlin.year_2026.may

private class Day_01_공_던지기 {
    fun solution(numbers: IntArray, k: Int) = numbers[(k - 1) * 2 % numbers.size]
}

fun main() {
    println(Day_01_공_던지기().solution(intArrayOf(1, 2, 3, 4), 2))
}
