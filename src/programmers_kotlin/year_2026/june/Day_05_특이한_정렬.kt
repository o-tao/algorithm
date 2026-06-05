package programmers_kotlin.year_2026.june

private class Day_05_특이한_정렬 {
    fun solution(numlist: IntArray, n: Int) = numlist.sortedWith(compareBy<Int> { kotlin.math.abs(it - n) }.thenByDescending { it }).toIntArray()
}

fun main() {
    println(Day_05_특이한_정렬().solution(intArrayOf(1, 2, 3, 4, 5, 6), 4).contentToString())
}
