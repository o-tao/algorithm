package programmers_kotlin.year_2025.december

private class Day_17_개미_군단 {
    fun solution(hp: Int): Int {
        var answer = 0
        var remaining = hp

        val powers = listOf(5, 3, 1)
        for (power in powers) {
            answer += remaining / power
            remaining %= power
        }

        return answer
    }
}

fun main() {
    println(Day_17_개미_군단().solution(23))
}
