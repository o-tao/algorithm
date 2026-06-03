package programmers_kotlin.year_2026.june

private class Day_03_배열_조각하기 {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var left = 0
        var right = arr.lastIndex

        query.forEachIndexed { index, q ->
            if (index % 2 == 0) {
                right = left + q
            } else {
                left += q
            }
        }

        return arr.sliceArray(left..right)
    }
}

fun main() {
    println(Day_03_배열_조각하기().solution(intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(4, 1, 2)).contentToString())
}
