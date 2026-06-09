package programmers_kotlin.year_2026.june

private class Day_09_다음에_올_숫자 {
    fun solution(common: IntArray) =
        common.run {
            if (this[2] - this[1] == this[1] - this[0]) {
                last() + (this[1] - this[0])
            } else {
                last() * (this[1] / this[0])
            }
        }
}

fun main() {
    println(Day_09_다음에_올_숫자().solution(intArrayOf(1, 2, 3, 4)))
}
