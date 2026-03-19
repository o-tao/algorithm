package programmers_kotlin.year_2026.march

private class Day_19_1로_만들기 {
    fun solution(num_list: IntArray): Int {
        return num_list.sumOf { num ->
            var n = num
            var answer = 0

            while (n > 1) {
                n = if (n % 2 == 0) n / 2 else (n - 1) / 2
                answer++
            }

            answer
        }
    }
}

fun main() {
    println(Day_19_1로_만들기().solution(intArrayOf(12, 4, 15, 1, 14)))
}
