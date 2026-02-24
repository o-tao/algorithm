package programmers_kotlin.year_2026.february

private class Day_24_카운트_다운 {
    fun solution(start_num: Int, end_num: Int) = (start_num downTo end_num).toList()
}

fun main() {
    println(Day_24_카운트_다운().solution(10, 3))
}
