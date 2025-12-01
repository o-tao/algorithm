package programmers_kotlin.year_2025.december

private class Day_01_마지막_두_원소 {
    fun solution(num_list: IntArray): IntArray =
        num_list + with(num_list) {
            val last = last()
            val prev = this[size - 2]
            if (last > prev) last - prev else last * 2
        }
}

fun main() {
    println(Day_01_마지막_두_원소().solution(intArrayOf(2, 1, 6)).toList())
}
