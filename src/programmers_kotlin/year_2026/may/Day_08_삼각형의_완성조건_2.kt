package programmers_kotlin.year_2026.may

private class Day_08_삼각형의_완성조건_2 {
    fun solution(sides: IntArray) = minOf(sides[0], sides[1]) * 2 - 1
}

fun main() {
    println(Day_08_삼각형의_완성조건_2().solution(intArrayOf(1, 2)))
}
