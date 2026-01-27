package programmers_kotlin.year_2026.january

class Day_27_길이에_따른_연산 {
    fun solution(numList: IntArray): Int =
        if (numList.size >= 11) {
            numList.sum()
        } else {
            numList.reduce(Int::times)
        }
}

fun main() {
    println(Day_27_길이에_따른_연산().solution(intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)))
}
