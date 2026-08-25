package programmers_kotlin.year_2026.august

private class Day_25_최소직사각형 {
    fun solution(sizes: Array<IntArray>): Int = sizes.maxOf { maxOf(it[0], it[1]) } * sizes.maxOf { minOf(it[0], it[1]) }
}

fun main() {
    println(
        Day_25_최소직사각형().solution(
            arrayOf(
                intArrayOf(50, 60),
                intArrayOf(30, 70),
                intArrayOf(60, 30),
                intArrayOf(80, 40)
            )
        )
    )
}
