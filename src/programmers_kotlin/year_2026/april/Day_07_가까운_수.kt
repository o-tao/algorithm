package programmers_kotlin.year_2026.april

private class Day_07_가까운_수 {
    fun solution(array: IntArray, n: Int) = array.sortedWith(compareBy({ kotlin.math.abs(it - n) }, { it })).first()
}

fun main() {
    println(Day_07_가까운_수().solution(intArrayOf(3, 10, 28), 20))
}
