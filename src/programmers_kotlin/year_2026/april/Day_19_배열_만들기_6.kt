package programmers_kotlin.year_2026.april

private class Day_19_배열_만들기_6 {
    fun solution(arr: IntArray): IntArray {
        val answer = ArrayDeque<Int>()

        for (num in arr) {
            if (answer.isNotEmpty() && answer.last() == num) answer.removeLast() else answer.addLast(num)
        }

        return if (answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}
