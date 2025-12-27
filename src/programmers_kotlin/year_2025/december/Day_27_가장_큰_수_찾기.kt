package programmers_kotlin.year_2025.december

private class Day_27_가장_큰_수_찾기 {
    fun solution(array: IntArray): IntArray {
        var maxValue = array[0]
        var maxIndex = 0

        for (i in array.indices) {
            if (array[i] > maxValue) {
                maxValue = array[i]
                maxIndex = i
            }
        }

        return intArrayOf(maxValue, maxIndex)
    }
}

fun main() {
    println(Day_27_가장_큰_수_찾기().solution(intArrayOf(1, 8, 3)).toList())
}
