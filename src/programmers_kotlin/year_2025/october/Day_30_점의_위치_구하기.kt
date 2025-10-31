package programmers_kotlin.year_2025.october

private class Day_점의_위치_구하기 {
    fun solution(dot: IntArray): Int {
        val (x, y) = dot

        return when {
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
    }
}

fun main() {
    println(Day_점의_위치_구하기().solution(intArrayOf(2, 4)))
}
