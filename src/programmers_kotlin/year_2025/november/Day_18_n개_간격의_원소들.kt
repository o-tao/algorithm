package programmers_kotlin.year_2025.november

private class Day_18_n개_간격의_원소들 {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val answer = mutableListOf<Int>()
        for (i in num_list.indices step n) {
            answer.add(num_list[i])
        }
        return answer.toIntArray()
    }
}

fun main() {
    println(Day_18_n개_간격의_원소들().solution(intArrayOf(4, 2, 6, 1, 7, 6), 2).toList())
}
