package programmers_kotlin.year_2026.march

private class Day_13_날짜_비교하기 {
    fun solution(date1: IntArray, date2: IntArray): Int {
        if (date1[0] < date2[0]) return 1
        if (date1[0] > date2[0]) return 0

        if (date1[1] < date2[1]) return 1
        if (date1[1] > date2[1]) return 0

        if (date1[2] < date2[2]) return 1
        return 0
    }
}

fun main() {
    println(Day_13_날짜_비교하기().solution(intArrayOf(2021, 12, 28), intArrayOf(2021, 12, 29)))
}
