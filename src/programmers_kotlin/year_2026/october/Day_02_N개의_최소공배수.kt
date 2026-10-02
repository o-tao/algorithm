package programmers_kotlin.year_2026.october

private class Day_02_N개의_최소공배수 {
    fun solution(arr: IntArray): Int {
        var answer = 1L

        for (n in arr) {
            var a = answer
            var b = n.toLong()
            while (b != 0L) {
                val temp = a % b
                a = b
                b = temp
            }

            answer = answer / a * n
        }

        return answer.toInt()
    }
}

fun main() {
    println(Day_02_N개의_최소공배수().solution(intArrayOf(2, 6, 8, 14)))
}
