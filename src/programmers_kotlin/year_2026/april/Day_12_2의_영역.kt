package programmers_kotlin.year_2026.april

private class Day_12_2의_영역 {
    fun solution(arr: IntArray): IntArray {
        var first = -1
        var last = -1

        for (i in arr.indices) {
            if (arr[i] == 2) {
                if (first == -1) {
                    first = i
                }
                last = i
            }
        }

        if (first == -1) {
            return intArrayOf(-1)
        }

        return arr.sliceArray(first..last)
    }
}

fun main() {
    println(Day_12_2의_영역().solution(intArrayOf(1, 2, 1, 4, 5, 2, 9)).contentToString())
}
