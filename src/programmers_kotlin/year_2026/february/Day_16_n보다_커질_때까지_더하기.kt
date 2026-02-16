package programmers_kotlin.year_2026.february

private class Day_16_n보다_커질_때까지_더하기 {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer = 0

        for (num in numbers) {
            answer += num
            if (answer > n) return answer
        }

        return answer
    }
}

fun main() {
    println(Day_16_n보다_커질_때까지_더하기().solution(intArrayOf(34, 5, 71, 29, 100, 34), 123))
}
