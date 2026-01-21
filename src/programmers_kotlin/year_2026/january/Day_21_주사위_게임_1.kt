package programmers_kotlin.year_2026.january

private class Day_21_주사위_게임_1 {
    fun solution(a: Int, b: Int): Int {
        val isAOdd = a % 2 == 1
        val isBOdd = b % 2 == 1
        return when {
            isAOdd && isBOdd -> a * a + b * b
            isAOdd || isBOdd -> 2 * (a + b)
            else -> kotlin.math.abs(a - b)
        }
    }
}

fun main() {
    println(Day_21_주사위_게임_1().solution(3, 5))
}
