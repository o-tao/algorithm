package programmers_kotlin.year_2026.june

private class Day_02_배열_만들기_2 {
    fun solution(l: Int, r: Int): IntArray {
        val answer = mutableListOf<Int>()

        for (num in l..r) {
            if (num.toString().all { it == '0' || it == '5' }) {
                answer.add(num)
            }
        }

        return if (answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}

fun main() {
    println(Day_02_배열_만들기_2().solution(5, 555).contentToString())
}
