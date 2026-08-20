package programmers_kotlin.year_2026.august

private class Day_20_삼총사 {
    fun solution(number: IntArray): Int {
        var answer = 0
        for (i in number.indices) {
            for (j in i + 1 until number.size) {
                for (k in j + 1 until number.size) {
                    if (number[i] + number[j] + number[k] == 0) answer++
                }
            }
        }
        return answer
    }
}

fun main() {
    println(Day_20_삼총사().solution(intArrayOf(-2, 3, 0, 2, -5)))
}
