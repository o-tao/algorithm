package programmers_kotlin.year_2026.october

private class `Day_06_n^2_배열_자르기` {
    fun solution(n: Int, left: Long, right: Long) = (left..right).map { maxOf(it / n, it % n).toInt() + 1 }.toIntArray()
}

fun main() {
    println(
        `Day_06_n^2_배열_자르기`().solution(
            n = 3,
            left = 2,
            right = 5
        ).contentToString()
    )
}
