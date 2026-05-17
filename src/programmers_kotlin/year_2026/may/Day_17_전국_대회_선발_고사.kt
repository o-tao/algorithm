package programmers_kotlin.year_2026.may

private class Day_17_전국_대회_선발_고사 {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val students = mutableListOf<Pair<Int, Int>>()

        for (i in rank.indices) {
            if (attendance[i]) {
                students.add(Pair(rank[i], i))
            }
        }

        students.sortBy { it.first }

        val a = students[0].second
        val b = students[1].second
        val c = students[2].second

        return 10000 * a + 100 * b + c
    }
}

fun main() {
    println(Day_17_전국_대회_선발_고사().solution(intArrayOf(3, 7, 2, 5, 4, 6, 1), booleanArrayOf(false, true, true, true, true, false, false)))
}
