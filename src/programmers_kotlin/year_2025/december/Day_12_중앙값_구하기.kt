package programmers_kotlin.year_2025.december

private class Day_12_중앙값_구하기 {
    fun solution(array: IntArray): Int {
        val sortedArray = array.sorted()
        return sortedArray[sortedArray.size / 2]
    }
}

fun main() {
    println(Day_12_중앙값_구하기().solution(intArrayOf(1, 2, 7, 10, 11)))
}
