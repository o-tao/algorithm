package programmers_kotlin.year_2026.october

private class Day_23_가장_큰_수 {
    fun solution(numbers: IntArray): String {
        val answer = numbers
            .map { it.toString() }
            .sortedWith { a, b -> (b + a).compareTo(a + b) }
            .joinToString("")

        return if (answer[0] == '0') "0" else answer
    }
}

fun main() {
    println(Day_23_가장_큰_수().solution(intArrayOf(6, 10, 2)))
}
