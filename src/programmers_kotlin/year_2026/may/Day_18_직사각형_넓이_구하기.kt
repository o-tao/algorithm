package programmers_kotlin.year_2026.may

private class Day_18_직사각형_넓이_구하기 {
    fun solution(dots: Array<IntArray>): Int {
        val width = dots.maxOf { it[0] } - dots.minOf { it[0] }
        val height = dots.maxOf { it[1] } - dots.minOf { it[1] }

        return width * height
    }
}

fun main() {
    println(Day_18_직사각형_넓이_구하기().solution(arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))))
}
