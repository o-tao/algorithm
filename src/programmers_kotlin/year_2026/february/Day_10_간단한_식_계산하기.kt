package programmers_kotlin.year_2026.february

private class Day_10_간단한_식_계산하기 {
    fun solution(binomial: String): Int {
        val parts = binomial.split(" ")
        val a = parts[0].toInt()
        val op = parts[1]
        val b = parts[2].toInt()

        return when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            else -> 0
        }
    }
}

fun main() {
    println(Day_10_간단한_식_계산하기().solution("43 + 12"))
}
