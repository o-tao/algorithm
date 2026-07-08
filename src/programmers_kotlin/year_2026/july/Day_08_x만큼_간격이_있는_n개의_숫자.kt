package programmers_kotlin.year_2026.july

private class Day_08_x만큼_간격이_있는_n개의_숫자 {
    fun solution(x: Int, n: Int) = LongArray(n) { (x.toLong() * (it + 1)) }
}

fun main() {
    println(Day_08_x만큼_간격이_있는_n개의_숫자().solution(2, 5).contentToString())
}
