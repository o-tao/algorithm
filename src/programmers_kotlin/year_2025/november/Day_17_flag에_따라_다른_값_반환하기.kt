package programmers_kotlin.year_2025.november

private class Day_17_flag에_따라_다른_값_반환하기 {
    fun solution(a: Int, b: Int, flag: Boolean) = if (flag) a + b else a - b
}

fun main() {
    println(Day_17_flag에_따라_다른_값_반환하기().solution(-4, 7, true))
}
