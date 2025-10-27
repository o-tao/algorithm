package programmers_kotlin.year_2025.october

private class Day_27_삼각형의_완성조건 {
    fun solution(sides: IntArray): Int {
        val sorted = sides.sorted()
        return if (sorted[2] < sorted[0] + sorted[1]) 1 else 2
    }
}

fun main() {
    println(Day_27_삼각형의_완성조건().solution(intArrayOf(1, 2, 3)))
}
