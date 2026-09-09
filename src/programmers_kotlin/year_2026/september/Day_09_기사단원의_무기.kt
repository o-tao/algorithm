package programmers_kotlin.year_2026.september

private class Day_09_기사단원의_무기 {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val answer = IntArray(number + 1)
        for (d in 1..number) {
            var m = d
            while (m <= number) {
                answer[m]++
                m += d
            }
        }
        return (1..number).sumOf { if (answer[it] > limit) power else answer[it] }
    }
}

fun main() {
    println(Day_09_기사단원의_무기().solution(5, 3, 2))
}
