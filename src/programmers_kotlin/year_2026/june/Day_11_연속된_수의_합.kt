package programmers_kotlin.year_2026.june

private class Day_11_연속된_수의_합 {
    fun solution(num: Int, total: Int) = IntArray(num) { (total - num * (num - 1) / 2) / num + it }
}

fun main() {
    println(Day_11_연속된_수의_합().solution(3, 12).contentToString())
}
