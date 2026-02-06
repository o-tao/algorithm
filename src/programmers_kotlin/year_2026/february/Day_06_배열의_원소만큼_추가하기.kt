package programmers_kotlin.year_2026.february

private class Day_06_배열의_원소만큼_추가하기 {
    fun solution(arr: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        for (a in arr) {
            repeat(a) {
                answer.add(a)
            }
        }

        return answer.toIntArray()
    }
}

fun main() {
    println(Day_06_배열의_원소만큼_추가하기().solution(intArrayOf(5, 1, 4)).toList())
}
